package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDMonitorsPage;
import auto.framework.selenium.pages.baxter_page.HDTreatmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HDTreatmentSteps {
    @LazyAutowired
    private HDTreatmentPage HDTreatmentPage;

    @When("I check the module HD Treatment appear correctly")
    public void iCheckTheModuleHDTreatmentAppearCorrectly() {
        HDTreatmentPage.isDisplayedTheTittle();
    }

    @And("I open three buttons menu and add new HD Treatment")
    public void iOpenThreeButtonsMenuAndAddNewHDTreatment() {
        HDTreatmentPage.clickThreeDotsMenu();
        HDTreatmentPage.clickTreatmentButton();
    }

    @Then("I Check Preparation and Admin drug other Tabs")
    public void iCheckPreparationAndAdminDrugOtherTabs() {
        HDTreatmentPage.isDisplayedPreparationTab();
        HDTreatmentPage.isDisplayedAdminDrugsOther();
    }

    @Then("I Check Alert window and close it")
    public void iCheckAlertWindowAndCloseIt() {
        HDTreatmentPage.isDisplayedAlertWidows();
        HDTreatmentPage.clickOkButtonAlert();
    }

    @And("I open Session tab")
    public void iOpenSessionTab() {
        HDTreatmentPage.clickSessionTabButton();
    }

    @When("I add two new observations and save it")
    public void iAddTwoNewObservationsAndSaveIt() throws InterruptedException {
        HDTreatmentPage.clickNewObservation();
        HDTreatmentPage.clickSaveNewObservation();
    }

    @Then("I open treatment history and check data")
    public void iOpenTreatmentHistoryAndCheckData() throws InterruptedException {
        HDTreatmentPage.clickThreeDotsMenu();
        HDTreatmentPage.clickTreatmentHistoryButton();
    }

    @And("I make the final signature with the nephrologist field")
    public void iMakeTheFinalSignatureWithTheNephrologistField()throws InterruptedException {
        HDTreatmentPage.makeTheFinalSignatureWithTheNephrologistField();
    }

    @And("I adapt the configuration to the required fields to complete the treatment")
    public void iAdaptTheConfigurationToTheRequiredFieldsToCompleteTheTreatment()throws InterruptedException {
        HDTreatmentPage.adaptTheConfigurationToTheRequiredFieldsToCompleteTheTreatment();
    }

    @And("I trying to finish the treatment but I must complete the required fields")
    public void iTryingToFinishTheTreatmentButIMustCompleteTheRequiredFields()throws InterruptedException {
        HDTreatmentPage.tryingToFinishTheTreatmentButIMustCompleteTheRequiredFields();
    }

    @And("I finish Final signature, the system must allow using read-only mode")
    public void iFinishFinalSignatureTheSystemMustAllowUsingReadOnlyMode()throws InterruptedException {
        HDTreatmentPage.finishFinalSignatureTheSystemMustAllowUsingReadOnlyMode();
    }

    @And("I make changes to the fields defined in the treatment prescription")
    public void iMakeChangesToTheFieldsDefinedInTheTreatmentPrescription()throws InterruptedException {
        HDTreatmentPage.makeChangesToTheFieldsDefinedInTheTreatmentPrescription();
    }

    @Then("I create a simple new treatment if it does not exist")
    public void iCreateASimpleNewTreatmentIfItDoesNotExist()throws InterruptedException {
        HDTreatmentPage.createASimpleNewTreatmentIfItDoesNotExist();
    }

    @And("I close the treatment with the nephrologist signature field not required")
    public void iCloseTheTreatmentWithTheNephrologistSignatureFieldNotRequired()throws InterruptedException {
        HDTreatmentPage.closeTheTreatmentWithTheNephrologistSignatureFieldNotRequired();
    }

    @And("I check if the “signed by” field in the “additional signatures” section is complete if the user is a nurse")
    public void iCheckIfTheSignedByFieldInTheAdditionalSignaturesSectionIsCompleteIfTheUserIsANurse()throws InterruptedException {
        HDTreatmentPage.checkIfTheSignedByFieldInTheAdditionalSignaturesSectionIsCompleteIfTheUserIsANurse();
    }

    @And("I check Final Signature and Additional Signatures, the system should allow using read-only mode")
    public void iCheckFinalSignatureAndAdditionalSignaturesTheSystemShouldAllowUsingReadOnlyMode()throws InterruptedException {
        HDTreatmentPage.checkFinalSignatureAndAdditionalSignaturesTheSystemShouldAllowUsingReadOnlyMode();
    }

    @And("I try to close the treatment without the nephrologist's signature and it shows me an alert")
    public void iTryToCloseTheTreatmentWithoutTheNephrologistSSignatureAndItShowsMeAnAlert()throws InterruptedException {
   HDTreatmentPage.tryToCloseTheTreatmentWithoutTheNephrologistSSignatureAndItShowsMeAnAlert();
    }

    @Then("I configure the latest lab results by time interval")
    public void iConfigureTheLatestLabResultsByTimeInterval()throws InterruptedException {
        HDTreatmentPage.configureTheLatestLabResultsByTimeInterval();
    }

    @And("I review the information displayed under drugs and other")
    public void iReviewTheInformationDisplayedUnderDrugsOther()throws InterruptedException {
        HDTreatmentPage.reviewTheInformationDisplayedUnderDrugsOther();
    }

    @And("I select laboratory results maximum date range")
    public void iSelectLaboratoryResultsMaximumDateRange()throws InterruptedException {
        HDTreatmentPage.selectLaboratoryResultsMaximumDateRange();
    }

    @Then("I select HD Therapy option in the configuration section")
    public void iSelectHDTherapyOptionInTheConfigurationSection()throws InterruptedException {
        HDTreatmentPage.selectHDTherapyOptionInTheConfigurationSection();
    }

    @Then("I select an active lab profile and date range and save them")
    public void iSelectAnActiveLabProfileAndDateRangeAndSaveThem()throws InterruptedException {
        HDTreatmentPage.selectAnActiveLabProfileAndDateRangeAndSaveThem();
    }

    @Then("I select in the middle section, check and confirm that the most recent laboratory")
    public void iSelectInTheMiddleSectionCheckAndConfirmThatTheMostRecentLaboratory()throws InterruptedException{
        HDTreatmentPage.selectInTheMiddleSectionCheckAndConfirmThatTheMostRecentLaboratory();
    }

    @Then("I select only one profile, from the list of all active laboratories")
    public void iSelectOnlyOneProfileFromTheListOfAllActiveLaboratories()throws InterruptedException {
        HDTreatmentPage.selectOnlyOneProfileFromTheListOfAllActiveLaboratories();
    }

    @Then("I select a range from the last months and run the query to get the data. It will show theMedication administration history.")
    public void iSelectARangeFromTheLastMonthsAndRunTheQueryToGetTheDataItWillShowTheMedicationAdministrationHistory()throws InterruptedException {
        HDTreatmentPage.selectARangeFromTheLastMonthsAndRunTheQueryToGetTheDataItWillShowTheMedicationAdministrationHistory();
    }

    @Then("I try in the pop-up window, administer the medication, confirm with the checkbox, review the lab results, and then add")
    public void iTryInThePopUpWindowAdministerTheMedicationConfirmWithTheCheckboxReviewTheLabResultsAndThenAdd()throws InterruptedException {
        HDTreatmentPage.clickDrugsAndOtherTab();
        HDTreatmentPage.clickShowAllMedicationsCheck();
        HDTreatmentPage.DragAndDropMedicationPrescribedToAdministered();
    }
    @And("I open three buttons")
    public void iOpenThreeButtons() {
        HDTreatmentPage.clickThreeDotsMenu();

    }
    @Then("I click remove the last registry of new observations")
    public void iRemoveTheLastRegistryOfNewObservations() {
        HDTreatmentPage.clickRemoveNewObservation();
    }

    @When("I click remove the actual treatment")
    public void iClickRemoveTheActualTreatment() throws InterruptedException {
        HDTreatmentPage.clickDeleteTreatment();
    }
    @And("I accept the delete Alert windows, fill the data and the reason {string}")
    public void iAcceptTheDeleteAlertFillTheDataAndTheReason(String Reason) throws InterruptedException {
        HDTreatmentPage.removeAlertWithFillDataAndAccept(Reason);
    }

    @And("I cancel remove in alert window")
    public void iCancelRemoveInAlertWindow() {

    }
    @When("I add new observation")
    public void iAddTwoNewObservation() throws InterruptedException {
        HDTreatmentPage.clickNewObservation();

    }
    @Then("I save the new observation")
    public void iSaveTheNewObservation() throws InterruptedException {
        HDTreatmentPage.clickSaveNewObservation();
    }

    @Then("I check the data new observations is empty")
    public void iCheckTheDataNewObservationsIsEmpty() {

        HDTreatmentPage.isDisplayedUnverifiedText();
    }

    @When("I add new observations and fill all the data, with {string}")
    public void iAddNewObservationsAndFillAllTheDataWith(String data) throws InterruptedException {

        HDTreatmentPage.clickCheckBoxPatientStatus();
        HDTreatmentPage.writeSBP(data);
        HDTreatmentPage.writeDBP(data);
        HDTreatmentPage.writePulse(data);
        HDTreatmentPage.writeCurrentVhPp(data);
        HDTreatmentPage.writeTheoreticalVhPp(data);
        HDTreatmentPage.writePumpVelocity(data);
        HDTreatmentPage.writeArterialPressure(data);
        HDTreatmentPage.writeVenousPressure(data);
        HDTreatmentPage.writeTMP(data);
        HDTreatmentPage.writeCondPlasma(data);
    }
    @Then("I check the new observation is filled")
    public void iCheckTheNewObservationIsFilled() {
        HDTreatmentPage.isDisplayedVerifiedText();
    }
}