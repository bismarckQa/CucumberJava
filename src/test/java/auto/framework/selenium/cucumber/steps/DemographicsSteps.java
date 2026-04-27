package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.DemographicsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemographicsSteps {

    @LazyAutowired
    private DemographicsPage demographicsPage;

    // --- x_title & menu ---

    @Then("I verify the New patient x_title is visible with scroll")
    public void iVerifyTheNewPatientXTitleIsVisibleWithScroll() throws InterruptedException {
        demographicsPage.verifyXTitleIsVisibleWithScroll();
    }

    @And("I click the three points menu of New patient")
    public void iClickThreePointsMenuOfNewPatient() throws InterruptedException {
        demographicsPage.clickThreePointsMenu();
    }

    @And("I click {string} option in the three points menu of New patient")
    public void iClickOptionInThreePointsMenuOfNewPatient(String option) throws InterruptedException {
        demographicsPage.clickOptionInThreePointsMenu(option);
    }

    // ===================== NEW PATIENT steps =====================

    @And("I enter the name {string}")
    public void iEnterTheName(String name) throws InterruptedException {
        demographicsPage.enterName(name);
    }

    @And("I enter the nombre de uso {string}")
    public void iEnterTheNombreDeUso(String nombreDeUso) throws InterruptedException {
        demographicsPage.enterNombreDeUso(nombreDeUso);
    }

    @And("I enter the last name {string}")
    public void iEnterTheLastName(String lastName) throws InterruptedException {
        demographicsPage.enterLastName(lastName);
    }

    @And("I enter the surname 2 {string}")
    public void iEnterTheSurname2(String surname2) throws InterruptedException {
        demographicsPage.enterSurname2(surname2);
    }

    @And("I enter the ID patient {string}")
    public void iEnterTheIdPatient(String id) throws InterruptedException {
        demographicsPage.enterIdPatient(id);
    }

    @And("I enter the date of birth {string}")
    public void iEnterTheDateOfBirth(String date) throws InterruptedException {
        demographicsPage.enterDateOfBirth(date);
    }

    @And("I enter the date of 1st dialysis {string}")
    public void iEnterTheDateOf1stDialysis(String date) throws InterruptedException {
        demographicsPage.enterDate1stDialysis(date);
    }

    @And("I select the gender")
    public void iSelectTheGender() throws InterruptedException {
        demographicsPage.selectGender();
    }

    @And("I select the blood group")
    public void iSelectTheBloodGroup() throws InterruptedException {
        demographicsPage.selectBloodGroup();
    }

    @And("I select the referred by")
    public void iSelectTheReferredBy() throws InterruptedException {
        demographicsPage.selectReferredBy();
    }

    // ===================== ASSIGNMENTS steps =====================

    @And("I select the primary center")
    public void iSelectThePrimaryCenter() throws InterruptedException {
        demographicsPage.selectPrimaryCenter();
    }

    @And("I enter the date of admission {string}")
    public void iEnterTheDateOfAdmission(String date) throws InterruptedException {
        demographicsPage.enterDateAdmission(date);
    }

    @And("I select the patient group")
    public void iSelectThePatientGroup() throws InterruptedException {
        demographicsPage.selectPatientGroup();
    }

    // ===================== CLINICAL STATUS steps =====================

    @And("I select the clinical status")
    public void iSelectTheClinicalStatus() throws InterruptedException {
        demographicsPage.selectClinicalStatus();
    }

    @And("I select the method")
    public void iSelectTheMethod() throws InterruptedException {
        demographicsPage.selectMethod();
    }

    @And("I select the submethod")
    public void iSelectTheSubmethod() throws InterruptedException {
        demographicsPage.selectSubmethod();
    }

    @And("I select the location")
    public void iSelectTheLocation() throws InterruptedException {
        demographicsPage.selectLocation();
    }

    @And("I select the attendance")
    public void iSelectTheAttendance() throws InterruptedException {
        demographicsPage.selectAttendance();
    }

    @And("I select the monitor brand")
    public void iSelectTheMonitorBrand() throws InterruptedException {
        demographicsPage.selectMonitorBrand();
    }

    @And("I enter the start date {string}")
    public void iEnterTheStartDate(String date) throws InterruptedException {
        demographicsPage.enterStartDate(date);
    }

    @And("I select the modalidad referred by")
    public void iSelectTheModalidadReferredBy() throws InterruptedException {
        demographicsPage.selectModalidadReferredBy();
    }

    @And("I select the reason for start")
    public void iSelectTheReasonForStart() throws InterruptedException {
        demographicsPage.selectReasonForStart();
    }

    @And("I select the referred by clinical status")
    public void iSelectTheReferredByClinicalStatus()throws InterruptedException {
        demographicsPage.selectTheReferredByClinicalStatus();
    }

    @And("I click on the selected patient")
    public void iClickOnTheSelectedPatient()throws InterruptedException {
        demographicsPage.clickOnTheSelectedPatient();
    }

    @And("I verify that the demographic module opened correctly")
    public void iVerifyThatTheDemographicModuleOpenedCorrectly()throws InterruptedException {
        demographicsPage.verifyThatTheDemographicModuleOpenedCorrectly();
    }

    @And("I try to add a new center to the patient")
    public void iTryToAddANewCenterToThePatient()throws InterruptedException {
        demographicsPage.tryToAddANewCenterToThePatient();
    }

    @And("I click the New button at position {int}")
    public void iClickTheNewButtonAtPosition(int index) throws InterruptedException {
        demographicsPage.clickNewButtonByIndex(index);
    }

    // ===================== ASSIGN CENTRE steps =====================

    @And("I select a centre in the new row")
    public void iSelectACentreInTheNewRow() throws InterruptedException {
        demographicsPage.selectCentreInNewRow();
    }

    @And("I enter the start date of the centre row {string}")
    public void iEnterTheStartDateOfTheCentreRow(String date) throws InterruptedException {
        demographicsPage.enterStartDateCentreRow(date);
    }

    @And("I enter the end date of the centre row {string}")
    public void iEnterTheEndDateOfTheCentreRow(String date) throws InterruptedException {
        demographicsPage.enterEndDateCentreRow(date);
    }

    @And("I save the centre row")
    public void iSaveTheCentreRow() throws InterruptedException {
        demographicsPage.saveCentreRow();
    }

    @And("I cancel the centre row")
    public void iCancelTheCentreRow() throws InterruptedException {
        demographicsPage.cancelCentreRow();
    }

    // ===================== SECONDARY CENTRE steps =====================

    @And("I select a secondary centre in the new row")
    public void iSelectASecondaryCentreInTheNewRow() throws InterruptedException {
        demographicsPage.selectSecondaryCentreInNewRow();
    }

    @And("I enter the start date of the secondary centre row {string}")
    public void iEnterTheStartDateOfTheSecondaryCentreRow(String date) throws InterruptedException {
        demographicsPage.enterStartDateSecondaryCentreRow(date);
    }

    @And("I enter the end date of the secondary centre row {string}")
    public void iEnterTheEndDateOfTheSecondaryCentreRow(String date) throws InterruptedException {
        demographicsPage.enterEndDateSecondaryCentreRow(date);
    }

    @And("I select a category in the secondary centre row")
    public void iSelectACategoryInTheSecondaryCentreRow() throws InterruptedException {
        demographicsPage.selectCategorySecondaryCentreRow();
    }

    @And("I save the secondary centre row")
    public void iSaveTheSecondaryCentreRow() throws InterruptedException {
        demographicsPage.saveSecondaryCentreRow();
    }

    @And("I cancel the secondary centre row")
    public void iCancelTheSecondaryCentreRow() throws InterruptedException {
        demographicsPage.cancelSecondaryCentreRow();
    }

    @And("I click button edit secondary centre")
    public void iClickButtonEditSecondaryCentre() throws InterruptedException {
        demographicsPage.clickEditSecondaryCentreButton();
    }

    @And("I click button delete secondary centre")
    public void iClickButtonDeleteSecondaryCentre() throws InterruptedException {
        demographicsPage.clickDeleteSecondaryCentreButton();
    }

    // ===================== STAFF MEMBER ASSIGNMENT steps =====================

    @And("I select a profession in the staff row")
    public void iSelectAProfessionInTheStaffRow() throws InterruptedException {
        demographicsPage.selectProfessionInNewRow();
    }

    @And("I select a staff name in the staff row")
    public void iSelectAStaffNameInTheStaffRow() throws InterruptedException {
        demographicsPage.selectStaffNameInNewRow();
    }

    @And("I enter the start date of the staff row {string}")
    public void iEnterTheStartDateOfTheStaffRow(String date) throws InterruptedException {
        demographicsPage.enterStartDateStaffRow(date);
    }

    @And("I check the primary staff checkbox")
    public void iCheckThePrimaryStaffCheckbox() throws InterruptedException {
        demographicsPage.checkPrimaryStaff();
    }

    @And("I save the staff row")
    public void iSaveTheStaffRow() throws InterruptedException {
        demographicsPage.saveStaffRow();
    }

    @And("I cancel the staff row")
    public void iCancelTheStaffRow() throws InterruptedException {
        demographicsPage.cancelStaffRow();
    }

    @And("I click button edit staff")
    public void iClickButtonEditStaff() throws InterruptedException {
        demographicsPage.clickEditStaffButton();
    }

    @And("I click button delete staff")
    public void iClickButtonDeleteStaff() throws InterruptedException {
        demographicsPage.clickDeleteStaffButton();
    }

    @And("I click the finalize button on the staff row")
    public void iClickTheFinalizeButtonOnTheStaffRow() throws InterruptedException {
        demographicsPage.clickDeleteStaffButton();
    }






    // ===================== CONTACT ADDRESSES steps =====================

    @And("I click button edit contact address")
    public void iClickButtonEditContactAddress() throws InterruptedException {
        demographicsPage.clickEditContactAddressButton();
    }

    @And("I select a contact address type in the new row")
    public void iSelectAContactAddressTypeInTheNewRow() throws InterruptedException {
        demographicsPage.selectContactAddressTypeInNewRow();
    }

    @And("I enter the address in the contact address row {string}")
    public void iEnterTheAddressInTheContactAddressRow(String address) throws InterruptedException {
        demographicsPage.enterAddressContactAddressRow(address);
    }

    @And("I select a country in the contact address row")
    public void iSelectACountryInTheContactAddressRow() throws InterruptedException {
        demographicsPage.selectCountryContactAddressRow();
    }

    @And("I select a province in the contact address row")
    public void iSelectAProvinceInTheContactAddressRow() throws InterruptedException {
        demographicsPage.selectProvinceContactAddressRow();
    }

    @And("I select a city in the contact address row")
    public void iSelectACityInTheContactAddressRow() throws InterruptedException {
        demographicsPage.selectCityContactAddressRow();
    }

    @And("I enter the ZIP code in the contact address row {string}")
    public void iEnterTheZipCodeInTheContactAddressRow(String zipCode) throws InterruptedException {
        demographicsPage.enterZipCodeContactAddressRow(zipCode);
    }

    @And("I select a health zone in the contact address row")
    public void iSelectAHealthZoneInTheContactAddressRow() throws InterruptedException {
        demographicsPage.selectHealthZoneContactAddressRow();
    }

    @And("I enter the start date of the contact address row {string}")
    public void iEnterTheStartDateOfTheContactAddressRow(String date) throws InterruptedException {
        demographicsPage.enterStartDateContactAddressRow(date);
    }

    @And("I enter the end date of the contact address row {string}")
    public void iEnterTheEndDateOfTheContactAddressRow(String date) throws InterruptedException {
        demographicsPage.enterEndDateContactAddressRow(date);
    }

    @And("I clear the dates of the contact address row")
    public void iClearTheDatesOfTheContactAddressRow() throws InterruptedException {
        demographicsPage.clearDatesContactAddressRow();
    }

    @And("I save the contact address row")
    public void iSaveTheContactAddressRow() throws InterruptedException {
        demographicsPage.saveContactAddressRow();
    }

    @And("I enter the other field in the contact address row {string}")
    public void iEnterTheOtherFieldInTheContactAddressRow(String other) throws InterruptedException {
        demographicsPage.enterOtherContactAddressRow(other);
    }

    @And("I cancel the contact address row")
    public void iCancelTheContactAddressRow() throws InterruptedException {
        demographicsPage.cancelContactAddressRow();
    }

    @And("I click button delete contact address")
    public void iClickButtonDeleteContactAddress() throws InterruptedException {
        demographicsPage.clickDeleteContactAddressButton();
    }


    // ===================== TRANSPORT METHOD steps =====================

    @And("I select a provided by in the transport method row")
    public void iSelectAProvidedByInTheTransportMethodRow() throws InterruptedException {
        demographicsPage.selectProvidedByTransportRow();
    }

    @And("I enter the telephone in the transport method row {string}")
    public void iEnterTheTelephoneInTheTransportMethodRow(String telephone) throws InterruptedException {
        demographicsPage.enterTelephoneTransportRow(telephone);
    }

    @And("I enter the contact in the transport method row {string}")
    public void iEnterTheContactInTheTransportMethodRow(String contact) throws InterruptedException {
        demographicsPage.enterContactTransportRow(contact);
    }

    @And("I enter the observations in the transport method row {string}")
    public void iEnterTheObservationsInTheTransportMethodRow(String observations) throws InterruptedException {
        demographicsPage.enterObservationsTransportRow(observations);
    }

    @And("I save the transport method row")
    public void iSaveTheTransportMethodRow() throws InterruptedException {
        demographicsPage.saveTransportRow();
    }

    @And("I cancel the transport method row")
    public void iCancelTheTransportMethodRow() throws InterruptedException {
        demographicsPage.cancelTransportRow();
    }

    @And("I click the edit button of the transport method row")
    public void iClickTheEditButtonOfTheTransportMethodRow() throws InterruptedException {
        demographicsPage.clickEditTransportButton();
    }

    @And("I click the delete button of the transport method row")
    public void iClickTheDeleteButtonOfTheTransportMethodRow() throws InterruptedException {
        demographicsPage.clickDeleteTransportButton();
    }


    // ===================== EMERGENCY CONTACTS steps =====================

    @And("I enter the name in the emergency contact row {string}")
    public void iEnterTheNameInTheEmergencyContactRow(String name) throws InterruptedException {
        demographicsPage.enterNameEmergencyContactRow(name);
    }

    @And("I enter the telephone in the emergency contact row {string}")
    public void iEnterTheTelephoneInTheEmergencyContactRow(String telephone) throws InterruptedException {
        demographicsPage.enterTelephoneEmergencyContactRow(telephone);
    }

    @And("I select a relationship in the emergency contact row")
    public void iSelectARelationshipInTheEmergencyContactRow() throws InterruptedException {
        demographicsPage.selectRelationshipEmergencyContactRow();
    }

    @And("I check the primary emergency contact checkbox")
    public void iCheckThePrimaryEmergencyContactCheckbox() throws InterruptedException {
        demographicsPage.checkPrimaryEmergencyContact();
    }

    @And("I save the emergency contact row")
    public void iSaveTheEmergencyContactRow() throws InterruptedException {
        demographicsPage.saveEmergencyContactRow();
    }

    @And("I cancel the emergency contact row")
    public void iCancelTheEmergencyContactRow() throws InterruptedException {
        demographicsPage.cancelEmergencyContactRow();
    }

    @And("I click the edit button of the emergency contact row")
    public void iClickTheEditButtonOfTheEmergencyContactRow() throws InterruptedException {
        demographicsPage.clickEditEmergencyContactButton();
    }

    @And("I click the delete button of the emergency contact row")
    public void iClickTheDeleteButtonOfTheEmergencyContactRow() throws InterruptedException {
        demographicsPage.clickDeleteEmergencyContactButton();
    }


    // ===================== CONTACT METHOD steps =====================

    @And("I select a contact type in the contact method row")
    public void iSelectAContactTypeInTheContactMethodRow() throws InterruptedException {
        demographicsPage.selectContactTypeInNewRow();
    }

    @And("I enter the value in the contact method row {string}")
    public void iEnterTheValueInTheContactMethodRow(String value) throws InterruptedException {
        demographicsPage.enterContactMethodValue(value);
    }

    @And("I save the contact method row")
    public void iSaveTheContactMethodRow() throws InterruptedException {
        demographicsPage.saveContactMethodRow();
    }

    @And("I cancel the contact method row")
    public void iCancelTheContactMethodRow() throws InterruptedException {
        demographicsPage.cancelContactMethodRow();
    }

    @And("I click the edit button of the contact method row")
    public void iClickTheEditButtonOfTheContactMethodRow() throws InterruptedException {
        demographicsPage.clickEditContactMethodButton();
    }

    @And("I click the delete button of the contact method row")
    public void iClickTheDeleteButtonOfTheContactMethodRow() throws InterruptedException {
        demographicsPage.clickDeleteContactMethodButton();
    }


    // ===================== IDENTIFICATION steps =====================

    @And("I select the identification type")
    public void iSelectTheIdentificationType() throws InterruptedException {
        demographicsPage.selectIdentificationType();
    }

    @And("I enter the identification value {string}")
    public void iEnterTheIdentificationValue(String value) throws InterruptedException {
        demographicsPage.enterIdentificationValue(value);
    }

    @And("I enter the identification observations {string}")
    public void iEnterTheIdentificationObservations(String observations) throws InterruptedException {
        demographicsPage.enterIdentificationObservations(observations);
    }

    @And("I save the identification row")
    public void iSaveTheIdentificationRow() throws InterruptedException {
        demographicsPage.saveIdentificationRow();
    }

    @And("I cancel the identification row")
    public void iCancelTheIdentificationRow() throws InterruptedException {
        demographicsPage.cancelIdentificationRow();
    }

    @And("I click button edit identifications")
    public void iClickButtonEditIdentifications()throws InterruptedException {
        demographicsPage.clickButtonEditIdentifications();
    }

    @And("I click button delete identifications")
    public void iClickButtonDeleteIdentifications()throws InterruptedException {
        demographicsPage.clickButtonDeleteIdentifications();
    }


    // ===================== MODIFY PATIENT DATA steps =====================

    @And("I click the three points menu of demographics")
    public void iClickThreePointsMenuOfDemographics() throws InterruptedException {
        demographicsPage.clickThreePointsMenuDemographics();
    }

    @And("I click {string} option in the three points menu of demographics")
    public void iClickOptionInThreePointsMenuOfDemographics(String option) throws InterruptedException {
        demographicsPage.clickOptionInThreePointsMenuDemographics(option);
    }

    @And("I select the sex at birth")
    public void iSelectTheSexAtBirth() throws InterruptedException {
        demographicsPage.selectSexAtBirth();
    }

    // ===================== VIEW PATIENT DATA steps =====================

    @And("I scroll to the secondary centers section of demographics")
    public void iScrollToTheSecondaryCentersSectionOfDemographics() throws InterruptedException {
        demographicsPage.scrollToSecondaryCentersSection();
    }

    @And("I scroll to the contact addresses section of demographics")
    public void iScrollToTheContactAddressesSectionOfDemographics() throws InterruptedException {
        demographicsPage.scrollToContactAddressesSection();
    }

    @And("I scroll to the transport method section of demographics")
    public void iScrollToTheTransportMethodSectionOfDemographics() throws InterruptedException {
        demographicsPage.scrollToTransportMethodSection();
    }
}