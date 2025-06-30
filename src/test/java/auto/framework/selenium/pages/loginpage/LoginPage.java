package auto.framework.selenium.pages.loginpage;



import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;
import java.util.Map;

@LazyComponent
public class LoginPage extends BasePage<LoginPage> {

    @Value("${application.url}")
    private String baseURL;
    @Value("#{${application.users}}")
    private Map<String,String> users;

    @Value("#{${application.passwords}}")
    private Map<String,String> passwords;

    @FindBy(how = How.ID, using = "userTextBox")
    private WebElement userName;
    @FindBy(how = How.ID, using = "passTextBox")
    private WebElement password;

    @FindBy(how = How.XPATH, using = "(//input[@type='password'])[1]")
    private WebElement inputPasswordDeleteAccess;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl00_mainContent_TextContraseña']")
    private WebElement inputPasswordDeleteWaitingList;


    @FindBy(how = How.ID, using = "btnAceptarLogin")
    private WebElement AcceptLogin;

    @FindBy(how = How.ID, using = "LabelError")
    private WebElement WrongLogin;

    @FindBy(how = How.ID, using = "lblUsuario")
    private WebElement language;

    @FindBy(how = How.ID, using = "lnkEnglish")
    private WebElement englishUs;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='modal.items.delete.motivo'])[1]")
    private WebElement inputTextReason;
    @FindBy(how = How.XPATH, using = "(//textarea[@id='ctl00_mainContent_TextMotivo'])[1]")
    private WebElement inputTextReasonWaitingList;



    //*********Page Methods*********


    public LoginPage goToURL(){
        driver.get(baseURL);
        return this;
    }


    public LoginPage writeUser(String user_key){
        return write(this.userName, users.get(user_key));
    }

    public LoginPage writePass(String pass_key){
        return write(this.password,passwords.get(pass_key));
    }
    public void writePassAccess(String pass_key){
        write(this.inputPasswordDeleteAccess, passwords.get(pass_key));
    }
    public void writePassAccessAndReasonWaiting(String pass_key, String test){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame(0);
        write(inputPasswordDeleteWaitingList,passwords.get(pass_key));
        write(inputTextReasonWaitingList,test);
        driver.switchTo().parentFrame();


    }
    public void writeReason(String reason){
        write(inputTextReason,reason);
    }
    public void writeReasonWaitingList(String test){
        write(inputTextReason,test);

    }

    public void clickLogin(){
        click(this.AcceptLogin);
    }
    public void clickLanguage(){
        click(this.language);
    }
    public void clickEnglishUs(){
        click(this.englishUs);
    }
    @Override
    public boolean isAt() {
        return isDisplayed(userName);
    }

    public boolean isWrongCredentialsErrorPresent() {
        return isDisplayed(WrongLogin);
    }
}
