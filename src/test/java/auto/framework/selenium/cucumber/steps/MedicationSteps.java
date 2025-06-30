package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.annotations.TakeScreenshot;
import auto.framework.selenium.pages.baxter_page.LabTestsPage;
import auto.framework.selenium.pages.baxter_page.MedicationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MedicationSteps {

    @LazyAutowired

    private MedicationPage MedicationPage;




    @When("I check the module Medication appear correctly")
    public void iCheckTheModuleMedicationAppearCorrectly() {
        MedicationPage.isDisplayedTheTittle();
    }

    @And("I verify that the fields to add a new medication are empty")
    public void iVerifyThatTheFieldsToAddANewMedicationAreEmpty()throws InterruptedException{
        MedicationPage.verifyThatTheFieldsToAddANewMedicationAreEmpty();
    }

    @And("I try to Add new medication with category only")
    public void iTryToAddNewMedicationWithCategoryOnly() throws  InterruptedException{
        MedicationPage.tryToAddNewMedicationWithCategoryOnly();
    }

    @And("I try to create a new medication with empty data")
    public void iTryToCreateANewMedicationWithEmptyData()throws InterruptedException{
        MedicationPage.tryToCreateANewMedicationWithEmptyData();
    }

    @And("I try to Add new medication with frequency only")
    public void iTryToAddNewMedicationWithFrequencyOnly()throws InterruptedException{
        MedicationPage.tryToAddNewMedicationWithFrequencyOnly();
    }

    @And("I try to save if needed checked")
    public void iTryToSaveIfNeededChecked()throws InterruptedException{
        MedicationPage.tryToSaveIfNeededChecked();
    }

    @And("I try to Add new medication with medication only")
    public void iTryToAddNewMedicationWithMedicationOnly()throws InterruptedException{
        MedicationPage.tryToAddNewMedicationWithMedicationOnly();
    }


    @And("I try to save with overlapping date, distinct location and same location, parameters startDate {string}, dosage {string}, dosagePerDose {string}, dosageSession {string}, textArea {string}")
    public void iTryToSaveWithOverlappingDateDistinctLocationAndSameLocationParametersStartDe(String startData, String dosage, String dosagePerDose, String dosageSession, String textArea) throws InterruptedException{
        MedicationPage.tryToSaveWithOverlappingDateDistinctLocationAndSameLocationParametersStart(startData, dosage, dosagePerDose, dosageSession, textArea);
    }


    @And("I try to save with overlapping date, same location and same location, parameters startDate {string}, dosage {string}, dosagePerDose {string}, dosageSession {string}, textArea {string}")
    public void iTryToSaveWithOverlappingDateSameLocationAndSameLocationParametersStartDe(String startData, String dosage, String dosagePerDose, String dosageSession, String textArea) throws InterruptedException{
        MedicationPage.tryToSaveWithOverlappingDateSameLocationAndSameLocationParametersStart(startData, dosage, dosagePerDose, dosageSession, textArea);
    }
    @And("I try to Add new medication with route only")
    public void iTryToAddNewMedicationWithRouteOnly()throws InterruptedException{
        MedicationPage.tryToAddNewMedicationWithRouteOnly();
    }


    @Then("I verify that the new medication was added")
    public void iVerifyThatTheNewMedicationWasAdded()throws InterruptedException {
        MedicationPage.verifyThatTheNewMedicationWasAdded();
    }

    @And("I remove the added medication, confirm the reason {string}")
    public void iRemoveTheAddedMedicationConfirmTheReason(String reason)throws InterruptedException {
        MedicationPage.removeTheAddedMedicationConfirmTheReason(reason);
    }

    @And("I try to Add new medication with variable dosage, parameters startDate {string}, dosage {string}, dosageSession {string}, textArea {string}")
    public void iTryToAddNewMedicationWithVariableDosageParametersStartDateDosageDosagePerDoseDosageSessionTextArea(String startData, String dosage, String dosageSession, String textArea)throws InterruptedException {
    MedicationPage.tryToAddNewMedicationWithVariableDosageParametersStartDateDosageDosagePerDoseDosageSessionTextArea(startData, dosage, dosageSession, textArea);
    }

    @And("I try to copy the selected medication with the new parameters, dosage {string}, observations {string}")
    public void iTryToCopyTheSelectedMedicationWithTheNewParameters(String dosage, String observations) throws InterruptedException{
        MedicationPage.tryToCopyTheSelectedMedicationWithTheNewParameters(dosage,observations);
    }

    @And("I try to copy the selected medication with the new parameters and past start date, dosage {string}, observations {string}, startDate {string}")
    public void iTryToCopyTheSelectedMedicationWithTheNewParametersAndPastStartDateDosageObservationsStartDate(String dosage, String observations, String startDate)throws InterruptedException {
        MedicationPage.tryToCopyTheSelectedMedicationWithTheNewParametersAndPastStartDateDosageObservationsStartDate(dosage, observations, startDate);
    }

    @And("I try to Add new medication with, parameters startDate {string}, dosage {string}, dosageSession {string}, textArea {string}")
    public void iTryToAddNewMedicationWithParameters(String startDate, String dosage, String dosageSession, String textArea)throws InterruptedException{
        MedicationPage.tryToAddNewMedicationWithParameters(startDate, dosage, dosageSession, textArea);
    }
    @And("I remove the added medication, with wrong password {string} and the wrong reason {string}")
    public void iRemoveTheAddedMedicationWithWrongPasswordAndTheWrongReason(String pswd, String reason) throws InterruptedException{
        MedicationPage.removeTheAddedMedicationWithWrongPasswordAndTheWrongReason(pswd, reason);
    }

    @And("I check if the fields are editable: date stopped {string} and Observations {string}")
    public void iCheckIfTheFieldsAreEditableDateStoppedAndObservations(String dateSttoped, String observations) throws  InterruptedException{
        MedicationPage.checkIfTheFieldsAreEditableDateStoppedAndObservations(dateSttoped, observations);
    }

    @And("I modified the medication in the end date {string} and observations {string} and clicked show inactive")
    public void iModifiedTheMedicationInTheEndDateAndObservationsAndClickedShowInactive(String dateSttoped, String observations) throws InterruptedException {
        MedicationPage.modifiedTheMedicationInTheEndDateAndObservationsAndClickedShowInactive(dateSttoped, observations);
    }

    @And("I modify the medication in the end date {string} and observations {string}")
    public void iModifyTheMedicationInTheEndDateAndObservations(String dateSttoped, String observations) throws InterruptedException {
        MedicationPage.modifyTheMedicationInTheEndDateAndObservations(dateSttoped, observations);
    }

    @And("I uncheck all the categories at the top Categories of the medication module")
    public void iUncheckAllTheCategoriesAtTheTopCategoriesOfTheMedicationModule()throws InterruptedException {
        MedicationPage.uncheckAllTheCategoriesAtTheTopCategoriesOfTheMedicationModule();
    }

    @And("I Checked Show inactive checkbox")
    public void iCheckedShowInactiveCheckbox()throws InterruptedException {
        MedicationPage.checkedShowInactiveCheckbox();
    }

    @And("I Checked only one medication category in top combo box")
    public void iCheckedOnlyOneMedicationCategoryInTopCombobox()throws InterruptedException {
        MedicationPage.checkedOnlyOneMedicationCategoryInTopCombobox();
    }

    @And("I checked show only home check box")
    public void iCheckedShowOnlyHomeCheckBox()throws InterruptedException {
        MedicationPage.checkedShowOnlyHomeCheckBox();
    }

    @And("I click on the Allergies link, under Penicillin")
    public void iClickOnTheAllergiesLinkUnderPenicillin() throws InterruptedException {
        MedicationPage.clickOnTheAllergiesLinkUnderPenicillin();
    }
}
