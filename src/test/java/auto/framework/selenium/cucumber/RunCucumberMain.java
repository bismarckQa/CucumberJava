package auto.framework.selenium.cucumber;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.TestPlan;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

import java.io.PrintWriter;

public final class RunCucumberMain {

    private RunCucumberMain() {
    }

    public static void main(String[] args) {
        CucumberSpringContextConfig.class.getName();

        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(DiscoverySelectors.selectDirectory(
                        "src/test/java/auto/framework/selenium/cucumber/features/TestSuites"))
                .configurationParameter(Constants.GLUE_PROPERTY_NAME, "auto.framework.selenium.cucumber")
                .configurationParameter(Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, "true")
                .configurationParameter(Constants.PLUGIN_PROPERTY_NAME,
                        "pretty,"
                                + "html:target/reports/cucumber-html-report.html,"
                                + "junit:target/reports/cucumber-report.xml,"
                                + "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
                .configurationParameter(Constants.FILTER_TAGS_PROPERTY_NAME, "@test")
                .configurationParameter(Constants.PLUGIN_PUBLISH_ENABLED_PROPERTY_NAME, "false")
                .build();

        Launcher launcher = LauncherFactory.create();
        TestPlan testPlan = launcher.discover(request);

        if (!testPlan.containsTests()) {
            System.err.println("No Cucumber tests were found by RunCucumberTest.");
            System.exit(1);
        }

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        summary.printTo(new PrintWriter(System.out));

        if (summary.getTotalFailureCount() > 0) {
            System.exit(1);
        }
    }
}