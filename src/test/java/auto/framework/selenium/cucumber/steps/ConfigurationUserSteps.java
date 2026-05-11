package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ConfigurationUserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConfigurationUserSteps {

    @LazyAutowired
    private ConfigurationUserPage configurationUserPage;

    @And("I enter into Configuration User module")
    public void iEnterIntoConfigurationUserModule() throws InterruptedException {
        configurationUserPage.openConfigurationUserModule();
    }

    @And("I open Users module in configuration user")
    public void iOpenUsersModuleInConfigurationUser() throws InterruptedException {
        configurationUserPage.openUsersModule();
    }

    @Then("I verify that Users module opened correctly")
    public void iVerifyThatUsersModuleOpenedCorrectly() throws InterruptedException {
        assertTrue(configurationUserPage.isUsersModuleDisplayed());
    }

    @When("I click show inactive users")
    public void iClickShowInactiveUsers() throws InterruptedException {
        configurationUserPage.clickShowInactiveUsers();
    }

    @Then("I verify that inactive users filter is displayed correctly")
    public void iVerifyThatInactiveUsersFilterIsDisplayedCorrectly() throws InterruptedException {
        assertTrue(configurationUserPage.isInactiveUsersFilterDisplayed());
    }

    // --- Three points menu ---

    @When("I click the three points menu in users module")
    public void iClickThreePointsMenuInUsersModule() throws InterruptedException {
        configurationUserPage.clickThreePointsMenuInUsersModule();
    }

    @When("I click {string} option in users module menu")
    public void iClickOptionInUsersModuleMenu(String option) throws InterruptedException {
        configurationUserPage.clickOptionInUsersModuleMenu(option);
    }

    // --- Create new user form — Staff section ---

    @When("I enter the last name in the user form {string}")
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

    @Then("I verify the required fields validation is displayed")
    public void iVerifyTheRequiredFieldsValidationIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isRequiredFieldsValidationDisplayed());
    }

    @Then("I verify the duplicate username error is displayed")
    public void iVerifyTheDuplicateUsernameErrorIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isDuplicateUsernameErrorDisplayed());
    }

    @Then("I verify the passwords do not match error is displayed")
    public void iVerifyThePasswordsDoNotMatchErrorIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isPasswordMismatchErrorDisplayed());
    }

    // --- Modify user ---

    @When("I select the user {string} in users module")
    public void iSelectTheUserInUsersModule(String userName) throws InterruptedException {
        configurationUserPage.selectUserInUsersModule(userName);
    }

    @When("I enter the license number in the user form {string}")
    public void iEnterTheLicenseNumberInTheUserForm(String licenseNo) throws InterruptedException {
        configurationUserPage.enterLicenseNoInUserForm(licenseNo);
    }

    @And("I enter the second surname in the user form {string}")
    public void iEnterTheSecondSurnameInTheUserForm(String secondSurname) throws InterruptedException {
        configurationUserPage.enterSecondSurnameInUserForm(secondSurname);
    }

    @And("I enter the NID in the user form {string}")
    public void iEnterTheNIDInTheUserForm(String nid) throws InterruptedException {
        configurationUserPage.enterNIDInUserForm(nid);
    }

    @Then("I verify the password does not meet requirements error is displayed")
    public void iVerifyThePasswordDoesNotMeetRequirementsErrorIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isPasswordRequirementsErrorDisplayed());
    }

    // --- Center assignment ---

    @Then("I verify that Center assignment section is displayed")
    public void iVerifyThatCenterAssignmentSectionIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isCenterAssignmentDisplayed());
    }

    @When("I click button new record in center assignment")
    public void iClickButtonNewRecordInCenterAssignment() throws InterruptedException {
        configurationUserPage.clickNewCenterAssignment();
    }

    @And("I select the center in center assignment row")
    public void iSelectTheCenterInCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.selectCenterInCenterAssignmentRow();
    }

    @When("I click button edit center assignment row")
    public void iClickButtonEditCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.clickEditCenterAssignmentRow();
    }

    @When("I click button delete center assignment row")
    public void iClickButtonDeleteCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.clickDeleteCenterAssignmentRow();
    }

    @When("I accept delete center assignment row")
    public void iAcceptDeleteCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.acceptDeleteCenterAssignmentRow();
    }

    @When("I cancel delete center assignment row")
    public void iCancelDeleteCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.dismissDeleteCenterAssignmentRow();
    }

    @And("I enter the start date in center assignment row {string}")
    public void iEnterTheStartDateInCenterAssignmentRow(String date) throws InterruptedException {
        configurationUserPage.enterStartDateCenterAssignmentRow(date);
    }

    @And("I enter the end date in center assignment row {string}")
    public void iEnterTheEndDateInCenterAssignmentRow(String date) throws InterruptedException {
        configurationUserPage.enterEndDateCenterAssignmentRow(date);
    }

    @Then("I save the center assignment row")
    public void iSaveTheCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.saveCenterAssignmentRow();
    }

    @Then("I cancel the center assignment row")
    public void iCancelTheCenterAssignmentRow() throws InterruptedException {
        configurationUserPage.cancelCenterAssignmentRow();
    }
}