package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ConfigurationUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConfigurationUserSteps {

    @LazyAutowired
    private ConfigurationUserPage configurationUserPage;

    @Then("I enter into Configuration User module")
    public void iEnterIntoConfigurationUserModule() throws InterruptedException {
        configurationUserPage.openConfigurationUserModule();
    }



    @And("I open Users module in configuration user")
    public void iOpenUsersModuleInConfigurationUser() throws InterruptedException {
        configurationUserPage.openUsersModule();
    }

    @And("I verify that Users module opened correctly")
    public void iVerifyThatUsersModuleOpenedCorrectly() throws InterruptedException {
        assertTrue(configurationUserPage.isUsersModuleDisplayed());
    }

    @And("I click show inactive users")
    public void iClickShowInactiveUsers() throws InterruptedException {
        configurationUserPage.clickShowInactiveUsers();
    }

    @And("I verify that inactive users filter is displayed correctly")
    public void iVerifyThatInactiveUsersFilterIsDisplayedCorrectly() throws InterruptedException {
        assertTrue(configurationUserPage.isInactiveUsersFilterDisplayed());
    }

    // --- Three points menu ---

    @And("I click the three points menu in users module")
    public void iClickThreePointsMenuInUsersModule() throws InterruptedException {
        configurationUserPage.clickThreePointsMenuInUsersModule();
    }

    @And("I click {string} option in users module menu")
    public void iClickOptionInUsersModuleMenu(String option) throws InterruptedException {
        configurationUserPage.clickOptionInUsersModuleMenu(option);
    }

    // --- Create new user form — Staff section ---

    @And("I enter the last name in the user form {string}")
    public void iEnterTheLastNameInTheUserForm(String lastName) throws InterruptedException {
        configurationUserPage.enterLastNameInUserForm(lastName);
    }

    @And("I enter the first name in the user form {string}")
    public void iEnterTheFirstNameInTheUserForm(String firstName) throws InterruptedException {
        configurationUserPage.enterFirstNameInUserForm(firstName);
    }

    @And("I select the profession in the user form")
    public void iSelectTheProfessionInTheUserForm() throws InterruptedException {
        configurationUserPage.selectProfessionInUserForm();
    }

    @And("I select the user profile in the user form")
    public void iSelectTheUserProfileInTheUserForm() throws InterruptedException {
        configurationUserPage.selectUserProfileInUserForm();
    }

    @And("I select the treatment in the user form")
    public void iSelectTheTreatmentInTheUserForm() throws InterruptedException {
        configurationUserPage.selectTreatmentInUserForm();
    }

    @And("I select the center in the user form")
    public void iSelectTheCenterInTheUserForm() throws InterruptedException {
        configurationUserPage.selectCenterInUserForm();
    }

    // --- Create new user form — Security section ---

    @And("I enter the username in the user form {string}")
    public void iEnterTheUsernameInTheUserForm(String username) throws InterruptedException {
        configurationUserPage.enterUsernameInUserForm(username);
    }

    @And("I enter the password in the user form {string}")
    public void iEnterThePasswordInTheUserForm(String password) throws InterruptedException {
        configurationUserPage.enterPasswordInUserForm(password);
    }

    @And("I enter the confirm password in the user form {string}")
    public void iEnterTheConfirmPasswordInTheUserForm(String password) throws InterruptedException {
        configurationUserPage.enterConfirmPasswordInUserForm(password);
    }



    // --- Validations ---

    @And("I verify the required fields validation is displayed")
    public void iVerifyTheRequiredFieldsValidationIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isRequiredFieldsValidationDisplayed());
    }

    @And("I verify the duplicate username error is displayed")
    public void iVerifyTheDuplicateUsernameErrorIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isDuplicateUsernameErrorDisplayed());
    }

    @Then("I verify the passwords do not match error is displayed")
    public void iVerifyThePasswordsDoNotMatchErrorIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isPasswordMismatchErrorDisplayed());
    }
}