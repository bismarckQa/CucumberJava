package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HospitalizationPage;
import auto.framework.selenium.pages.baxter_page.MedicationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HospitalizationSteps {

    @LazyAutowired

    private HospitalizationPage HospitalizationPage;




    @When("I check the module Hospitalization appear correctly")
    public void iCheckTheModuleHospitalizationAppearCorrectly() {
        HospitalizationPage.isDisplayedTheTittle();
    }


    @And("I open the menu and add new line of Hospitalization")
    public void iOpenTheMenuAndAddNewLineOfHospitalization() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickNewButton();
    }


    @And("I add all data correctly for add the Hospitalization with this data: Date of admission {string}, Type of admission {string}, Hospital {string}, Physician {string} and Reason for admission {string}")
    public void iAddAllDataCorrectlyForAddTheHospitalizationWithThisDataTypeOfAdmissionHospitalPhysicianAndReasonForAdmission(String date,String TypeAdmission, String Hospital, String Physician, String Reason) throws InterruptedException {
        HospitalizationPage.selectTypeOfAdmission(TypeAdmission);
        HospitalizationPage.selectHospital(Hospital);
        HospitalizationPage.selectPhysician(Physician);
        HospitalizationPage.writeReasonForAdmission(Reason);
        HospitalizationPage.resetReceptionDate();
        HospitalizationPage.writeDateOfAdmission(date);
    }

    @And("I save the new Hospitalization")
    public void iSaveTheNewHospitalization() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickSaveButton();

    }

    @And("I attached the additional study with the Hospitalization created")
    public void iAttachedTheAdditionalStudyWithTheHospitalizationCreated() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickAssociateAdditionalExaminationButton();
    }

    @And("I select the additional study created and associate with Hospitalization")
    public void iSelectTheAdditionalStudyCreatedAndAssociateWithHospitalization() throws InterruptedException {
        HospitalizationPage.selectAdditionalStudyFile();
        HospitalizationPage.clickSaveAttachedAdditionalStudy();


    }

    @And("I remove the additional study with the Hospitalization")
    public void iRemoveTheAdditionalStudyWithTheHospitalization() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickAssociateAdditionalExaminationButton();

    }

    @And("I select the additional study created and remove the associate with Hospitalization")
    public void iSelectTheAdditionalStudyCreatedAndRemoveTheAssociateWithHospitalization() throws InterruptedException {
        HospitalizationPage.selectAdditionalStudyFile();
        HospitalizationPage.clickSaveAttachedAdditionalStudy();

    }

    @Then("I remove the Hospitalization created")
    public void iRemoveTheHospitalizationCreated() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickDeleteButton();
        HospitalizationPage.clickYesDeleteButton();

    }
    @Then("I cancel remove the Hospitalization created")
    public void iCancelRemoveTheHospitalizationCreated() throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickDeleteButton();
        HospitalizationPage.clickNoDeleteButton();

    }

    @Then("I check the Hospitalization window with all the available information, filtering by admission date")
    public void iCheckTheHospitalizationWindowWithAllTheAvailableInformationFilteringByAdmissionDate()throws InterruptedException {
        HospitalizationPage.checkTheHospitalizationWindowWithAllTheAvailableInformationFilteringByAdmissionDate();
    }


    @Then("I enter all the necessary data to create a new hospitalization")
    public void iEnterAllTheNecessaryDataToCreateANewHospitalization()throws InterruptedException {
        HospitalizationPage.selectTypeOfAdmission2();
        HospitalizationPage.selectHospital2();
        HospitalizationPage.selectDoctorName();
        HospitalizationPage.writeReasonForAdmission2();
        HospitalizationPage.selectDischargeDate();
        HospitalizationPage.clickButtonUpArrow();
    }

    @And("I cancel saving the new hospitalization")
    public void iCancelSavingTheNewHospitalization()throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickCancelButton();
    }

    @And("I try to modify the created hospitalization, but cancel it")
    public void iTryToModifyTheCreatedHospitalizationButCancelIt()throws InterruptedException{
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickEditButton();
        HospitalizationPage.selectTodayCalendarDate();
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickCancelButton();
    }

    @And("I successfully modified the created hospitalization")
    public void iSuccessfullyModifiedTheCreatedHospitalization()throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickEditButton();
        HospitalizationPage.selectTodayCalendarDate();
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickSaveButton();
    }

    @And("I try to add progress data, but it gets cancelled")
    public void iTryToAddProgressDataButItGetsCancelled()throws InterruptedException{

        HospitalizationPage.clickButtonProgressDataSection();
        HospitalizationPage.clickButtonThreePointsProgressDataSection();
        HospitalizationPage.clickButtonNewProgressDataSection();
        HospitalizationPage.selectMadeByProgressDataSection();
        HospitalizationPage.writeTextAreaCommentsProgressData();
        HospitalizationPage.clickButtonCancelSaveProgressDataSection();
    }

    @And("I complete the progress data and it is added successfully")
    public void iCompleteTheProgressDataAndItIsAddedSuccessfully()throws InterruptedException {
        HospitalizationPage.clickButtonProgressDataSection();
        HospitalizationPage.clickButtonThreePointsProgressDataSection();
        HospitalizationPage.clickButtonNewProgressDataSection();
        HospitalizationPage.selectMadeByProgressDataSection();
        HospitalizationPage.writeTextAreaCommentsProgressData();
        HospitalizationPage.clickButtonSaveProgressDataSection();
    }

    @And("I try to create a new daily values but I cancel it")
    public void iTryToCreateANewDailyValuesButICancelIt()throws InterruptedException{
        HospitalizationPage.clickButtonDailyValuesSection();
        HospitalizationPage.clickButttonThreePointsDailyValuesSection();
        HospitalizationPage.clickButttonNewDailyValuesSection();
        HospitalizationPage.clickDropDownDateDailyValuesSection();
        HospitalizationPage.clickButtonCancelDailyValuesTaken();
    }

    @And("I create added values daily and successfully collect them")
    public void iCreateAddedValuesDailyAndSuccessfullyCollectThem()throws InterruptedException {
        HospitalizationPage.clickButtonDailyValuesSection();
        HospitalizationPage.clickButttonThreePointsDailyValuesSection();
        HospitalizationPage.clickButttonNewDailyValuesSection();
        HospitalizationPage.clickDropDownDateDailyValuesSection();
        HospitalizationPage.clickButtonSaveDailyValuesTaken();
    }

    @And("I trying to create an associated review, but it gets cancelled")
    public void iMTryingToCreateAnAssociatedReviewButItGetsCancelled() throws InterruptedException{
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickAssociateRevisionButton();
        HospitalizationPage.clickButtonCancelRevisions();
    }

    @And("I successfully create the associated review")
    public void iSuccessfullyCreateTheAssociatedReview()throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickAssociateRevisionButton();
        HospitalizationPage.clickButtonSaveRevisions();
    }

    @And("I try to create an additional associated test, but I cancel it")
    public void iTryToCreateAnAdditionalAssociatedTestButICancelIt()throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickButtonAssociateAdditionalExamination();
        HospitalizationPage.clickButtonCancelRevisions();

    }

    @And("I create an additional associated Test that was successfully completed")
    public void iCreateAnAdditionalAssociatedTestThatWasSuccessfullyCompleted()throws InterruptedException {
        HospitalizationPage.clickThreePointsButton();
        HospitalizationPage.clickButtonAssociateAdditionalExamination();
        HospitalizationPage.clickButtonSaveRevisions();
    }

    @And("I try to edit progress data, but it cancels")
    public void iTryToEditProgressDataButItCancels() throws InterruptedException{
        HospitalizationPage.clickButtonProgressDataSection();
        HospitalizationPage.clickButtonEditProgressData();
        HospitalizationPage.clickButtonCancelEditProgressData();
    }

    @And("I edited the Progress Data successfully")
    public void iEditedTheProgressDataSuccessfully()throws InterruptedException {
        HospitalizationPage.clickButtonProgressDataSection();
        HospitalizationPage.clickButtonEditProgressData();
        HospitalizationPage.modifyMadeByProgressDataSection();
        HospitalizationPage.modifyWriteTextAreaCommentsProgressData();
        HospitalizationPage.clickSaveButtonEditProgressData();
    }

    @And("I try to edit the daily values collected, but it cancels")
    public void iTryToEditTheDailyValuesCollectedButItCancels()throws InterruptedException {
        HospitalizationPage.clickButtonDailyValuesSection();
        HospitalizationPage.clickButtonEditDailyValues();
        HospitalizationPage.clickDropDownDateDailyValuesSection();
        HospitalizationPage.modifyInputWeightDailyValues();
        HospitalizationPage.clickButtonCancelEditProgressData();
    }

    @And("I edit the daily values collected successfully")
    public void iEditTheDailyValuesCollectedSuccessfully()throws InterruptedException {
        HospitalizationPage.clickButtonDailyValuesSection();
        HospitalizationPage.clickButtonEditDailyValues();
        HospitalizationPage.clickDropDownDateDailyValuesSection();
        HospitalizationPage.modifyInputWeightDailyValues();
        HospitalizationPage.clickSaveButtonEditProgressData();
    }

    @And("I try to delete progress data but it cancels")
    public void iTryToDeleteProgressDataButItCancels()throws InterruptedException {
        HospitalizationPage.clickButtonProgressDataSection();
        HospitalizationPage.clickButtonDeleteProgressData();
        HospitalizationPage.clickNoDeleteButton();
    }

    @And("I successfully deleted progress data")
    public void iSuccessfullyDeletedProgressData()throws InterruptedException{
        HospitalizationPage.clickButtonProgressDataSection();
        HospitalizationPage.clickButtonDeleteProgressData();
        HospitalizationPage.clickYesDeleteButton();
    }

    @And("I try to delete the collected daily values, but it cancels")
    public void iTryToDeleteTheCollectedDailyValuesButItCancels()throws InterruptedException {
        HospitalizationPage.clickButtonDailyValuesSection();
        HospitalizationPage.clickButtonDeleteDailyValuesCollected();
        HospitalizationPage.clickNoDeleteButton();
    }

    @And("I delete successfully collected daily values")
    public void iDeleteSuccessfullyCollectedDailyValues()throws InterruptedException {
        HospitalizationPage.clickButtonDailyValuesSection();
        HospitalizationPage.clickButtonDeleteDailyValuesCollected();
        HospitalizationPage.clickYesDeleteButton();
    }

}
