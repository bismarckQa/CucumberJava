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

    // --- Additional identifications ---

    @Then("I verify that Additional identifications section is displayed")
    public void iVerifyThatAdditionalIdentificationsSectionIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isAdditionalIdentificationsDisplayed());
    }

    @When("I click button new record in additional identifications")
    public void iClickButtonNewRecordInAdditionalIdentifications() throws InterruptedException {
        configurationUserPage.clickNewAdditionalIdentification();
    }

    @And("I select the identification type {string} in additional identifications row")
    public void iSelectTheIdentificationTypeInAdditionalIdentificationsRow(String identificationType) throws InterruptedException {
        configurationUserPage.selectAdditionalIdentificationTypeRow(identificationType);
    }

    @When("I click button edit additional identifications row")
    public void iClickButtonEditAdditionalIdentificationsRow() throws InterruptedException {
        configurationUserPage.clickEditAdditionalIdentificationRow();
    }

    @When("I accept delete additional identifications row")
    public void iAcceptDeleteAdditionalIdentificationsRow() throws InterruptedException {
        configurationUserPage.acceptDeleteAdditionalIdentificationRow();
    }

    @When("I cancel delete additional identifications row")
    public void iCancelDeleteAdditionalIdentificationsRow() throws InterruptedException {
        configurationUserPage.dismissDeleteAdditionalIdentificationRow();
    }

    @And("I enter the value in additional identifications row {string}")
    public void iEnterTheValueInAdditionalIdentificationsRow(String value) throws InterruptedException {
        configurationUserPage.enterAdditionalIdentificationValueRow(value);
    }

    @And("I enter the observations in additional identifications row {string}")
    public void iEnterTheObservationsInAdditionalIdentificationsRow(String observations) throws InterruptedException {
        configurationUserPage.enterAdditionalIdentificationObservationsRow(observations);
    }

    @Then("I save the additional identifications row")
    public void iSaveTheAdditionalIdentificationsRow() throws InterruptedException {
        configurationUserPage.saveAdditionalIdentificationRow();
    }

    @Then("I cancel the additional identifications row")
    public void iCancelTheAdditionalIdentificationsRow() throws InterruptedException {
        configurationUserPage.cancelAdditionalIdentificationRow();
    }

    // --- Contacts ---

    @Then("I verify that Contacts section is displayed")
    public void iVerifyThatContactsSectionIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isContactsDisplayed());
    }

    @When("I click button new record in contacts")
    public void iClickButtonNewRecordInContacts() throws InterruptedException {
        configurationUserPage.clickNewContact();
    }

    @And("I select the contact type {string} in contacts row")
    public void iSelectTheContactTypeInContactsRow(String contactType) throws InterruptedException {
        configurationUserPage.selectContactTypeRow(contactType);
    }

    @When("I click button edit contacts row")
    public void iClickButtonEditContactsRow() throws InterruptedException {
        configurationUserPage.clickEditContactRow();
    }

    @When("I accept delete contacts row")
    public void iAcceptDeleteContactsRow() throws InterruptedException {
        configurationUserPage.acceptDeleteContactRow();
    }

    @When("I cancel delete contacts row")
    public void iCancelDeleteContactsRow() throws InterruptedException {
        configurationUserPage.dismissDeleteContactRow();
    }

    @And("I enter the value in contacts row {string}")
    public void iEnterTheValueInContactsRow(String value) throws InterruptedException {
        configurationUserPage.enterContactValueRow(value);
    }

    @Then("I save the contacts row")
    public void iSaveTheContactsRow() throws InterruptedException {
        configurationUserPage.saveContactRow();
    }

    @Then("I cancel the contacts row")
    public void iCancelTheContactsRow() throws InterruptedException {
        configurationUserPage.cancelContactRow();
    }

    // --- Addresses ---

    @Then("I verify that Addresses section is displayed")
    public void iVerifyThatAddressesSectionIsDisplayed() throws InterruptedException {
        assertTrue(configurationUserPage.isAddressesDisplayed());
    }

    @When("I click button new record in addresses")
    public void iClickButtonNewRecordInAddresses() throws InterruptedException {
        configurationUserPage.clickNewAddress();
    }

    @When("I click button edit addresses row")
    public void iClickButtonEditAddressesRow() throws InterruptedException {
        configurationUserPage.clickEditAddressRow();
    }

    @When("I accept delete addresses row")
    public void iAcceptDeleteAddressesRow() throws InterruptedException {
        configurationUserPage.acceptDeleteAddressRow();
    }

    @When("I cancel delete addresses row")
    public void iCancelDeleteAddressesRow() throws InterruptedException {
        configurationUserPage.dismissDeleteAddressRow();
    }

    @And("I select the address type {string} in addresses row")
    public void iSelectTheAddressTypeInAddressesRow(String addressType) throws InterruptedException {
        configurationUserPage.selectAddressTypeRow(addressType);
    }

    @And("I enter the address in addresses row {string}")
    public void iEnterTheAddressInAddressesRow(String address) throws InterruptedException {
        configurationUserPage.enterAddressRow(address);
    }

    @And("I enter the number in addresses row {string}")
    public void iEnterTheNumberInAddressesRow(String number) throws InterruptedException {
        configurationUserPage.enterAddressNumberRow(number);
    }

    @And("I enter the ZIP code in addresses row {string}")
    public void iEnterTheZIPCodeInAddressesRow(String zipCode) throws InterruptedException {
        configurationUserPage.enterAddressZipCodeRow(zipCode);
    }

    @And("I select the country {string} in addresses row")
    public void iSelectTheCountryInAddressesRow(String country) throws InterruptedException {
        configurationUserPage.selectAddressCountryRow(country);
    }

    @And("I select the province {string} in addresses row")
    public void iSelectTheProvinceInAddressesRow(String province) throws InterruptedException {
        configurationUserPage.selectAddressProvinceRow(province);
    }

    @And("I enter the other field in addresses row {string}")
    public void iEnterTheOtherFieldInAddressesRow(String other) throws InterruptedException {
        configurationUserPage.enterAddressOtherRow(other);
    }

    @Then("I save the addresses row")
    public void iSaveTheAddressesRow() throws InterruptedException {
        configurationUserPage.saveAddressRow();
    }

    @Then("I cancel the addresses row")
    public void iCancelTheAddressesRow() throws InterruptedException {
        configurationUserPage.cancelAddressRow();
    }
}