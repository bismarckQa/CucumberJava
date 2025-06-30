package auto.framework.selenium.utils;

import auto.framework.selenium.annotations.LazyComponent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.net.ssl.*;
import java.io.File;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.logging.Level;

@LazyComponent
public class BrowserOps {

    private final String download = "src"+ File.separator
            +"main"+File.separator
            +"resources"+File.separator
            +"download";

    public ChromeOptions getChromeOptions() throws NoSuchAlgorithmException, KeyManagementException {
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("download.default_directory", this.download);

        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
            public X509Certificate[] getAcceptedIssuers() { return null; }
            public void checkClientTrusted(X509Certificate[] certs, String authType) { }
            public void checkServerTrusted(X509Certificate[] certs, String authType) { }

        } };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) { return true; }
        };
        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        
        ChromeOptions co = new ChromeOptions();
        co.setAcceptInsecureCerts(true);
        co.setExperimentalOption("prefs", prefs);
        co.addArguments("--ignore-certificate-errors","disable-infobars","--disable-search-engine-choice-screen","-disable-notifications","--disable-extensions", "--start-maximized"/*, "--remote-allow-origins=*"*/);
        //chrome 111+ needs this
        //options.addArguments("--remote-allow-origins=*")
        //TODO HEADLESS SHORTCUT
        //co.addArguments("--headless=new", "--disable-gpu","--window-size=1920,1200", "--disable-dev-shm-usage", "--no-sandbox");
        return co;
    }

    public DesiredCapabilities getAndroidCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browsername", "chrome");
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.chrome");
        capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        //chrome 111+ needs this
        //options.addArguments("--remote-allow-origins=*")
        //TODO HEADLESS SHORTCUT
        //co.addArguments("--headless", "--disable-gpu","--window-size=1920,1200", "--disable-dev-shm-usage", "--no-sandbox");
        return capabilities;
    }

    public UiAutomator2Options getUiAutomator2Options(){
        UiAutomator2Options options = new UiAutomator2Options()
//                .setUdid("emulator-5554")
                .setAvd("pixel3-emulator")
                .withBrowserName("chrome");
                /*.setApp("/home/myapp.apk");*/
        return options;
    }

    public FirefoxOptions getFireFoxOptions() {
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("devtools.console.stdout.content", true);

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        logPrefs.enable(LogType.DRIVER, Level.ALL);

        firefoxOptions
            .setProfile(firefoxProfile)
            .setCapability("moz:loggingPrefs", logPrefs);
        return firefoxOptions;
    }
}
