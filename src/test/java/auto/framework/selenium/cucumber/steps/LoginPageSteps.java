package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.annotations.TakeScreenshot;
import auto.framework.selenium.pages.loginpage.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Value;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageSteps {

    @Value("${browser}")
    private String browser;

    @LazyAutowired
    private LoginPage loginPage;

    @Given("I open the Baxter website")
    public void iOpenTheBaxterWebsite() {
        loginPage.goToURL();
        loginPage.isAt();
        loginPage.clickLanguage();
        loginPage.clickEnglishUs();

    }

    @When("I try to login with {string} credentials")
    public void iTryToLoginWithCredentials(String credentials) {
        loginPage.writeUser(credentials).writePass(credentials).clickLogin();
    }

    @When("I try to login with now {string} credentials")
    public void iTryToLoginWithNowCredentials(String credentials) {
        loginPage.writeUser(credentials).writePass(credentials).clickLogin();
    }


    @Then("Wrong credentials message appear")
    public void WrongCredentialsMessageAppear() {
        assertTrue(loginPage.isWrongCredentialsErrorPresent());
    }

    @When("The confirmation windows open, I write password of {string} credentials and {string}")
    public void theConfirmationWindowsOpenIWritePasswordOfCredentialsAndReasonAndClickOk(String credential,String test) {
        loginPage.writePassAccess(credential);
        loginPage.writeReason(test);

    }
    @When("The confirmation windows open, I write password of {string} credentials and {string} of waiting list")
    public void theConfirmationWindowsOpenIWritePasswordOfCredentialsAndOfWaitingList(String credential, String test) {
        loginPage.writePassAccessAndReasonWaiting(credential,test);

    }









}
