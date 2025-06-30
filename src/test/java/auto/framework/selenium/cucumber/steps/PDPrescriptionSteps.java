package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.PDPrescriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class PDPrescriptionSteps {

    @LazyAutowired

    private PDPrescriptionPage PDPrescriptionPage;




    @When("I check the module PD Prescription appear correctly")
    public void iCheckTheModuleAccessesAppearCorrectly() {
        PDPrescriptionPage.isDisplayedTheTittle();
    }

    @And("I check if the system will display the questionnaire view with the fields: Questionnaire Name, Active \\(Yes, No), All Questions")
    public void iCheckIfTheSystemWillDisplayTheQuestionnaireViewWithTheFieldsQuestionnaireNameActiveYesNoAllQuestions()throws InterruptedException {
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonQuestionnaireProva();
        PDPrescriptionPage.clickButtonActiveQuestionnaireProva();
        PDPrescriptionPage.clickButtonCloseQuestionnaireProva();
    }


    @And("I modify the assigned questionnaire: Start date, End date, Frequency and Days of the week.")
    public void iModifyTheAssignedQuestionnaireStartDateEndDateFrequencyAndDaysOfTheWeek()throws InterruptedException {
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonEditQuestionnaire();
        PDPrescriptionPage.inputDataQuestionnaire();

    }

    @And("I try to save a new biometric marker with at least one required field empty")
    public void iTryToSaveANewBiometricMarkerWithAtLeastOneRequiredFieldEmpty()throws InterruptedException {
        PDPrescriptionPage.clickButtonThreePoints();
        PDPrescriptionPage.clickButtonNew();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();
        PDPrescriptionPage.clickButtonOkModal();
        PDPrescriptionPage.clickButtonCancelBiometricMarket();
        PDPrescriptionPage.clickButtonCancelPrescription();

    }

    @And("I successfully create and save the new Biometric Marker")
    public void iSuccessfullyCreateAndSaveTheNewBiometricMarker()throws InterruptedException {
        PDPrescriptionPage.clickButtonThreePoints();
        PDPrescriptionPage.clickButtonNew();
        PDPrescriptionPage.inputDataNewBiometricMarket();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();


    }

    @And("I save the changes in the Biometric Markers")
    public void iSaveTheChangesInTheBiometricMarkers()throws InterruptedException {
        PDPrescriptionPage.clickButtonEditBiometricMarker();
        PDPrescriptionPage.editDataBiometricMarket();
        PDPrescriptionPage.clickButtonSaveBiometricMarket();
    }

    @And("I create and save a new prescription")
    public void iCreateAndSaveANewPrescription()throws InterruptedException {
        PDPrescriptionPage.clickButtonThreePointsPrescription();
        PDPrescriptionPage.clickButtonNewPrescription();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();

    }

    @And("I check if in prescription history I can add")
    public void iCheckIfInPrescriptionHistoryICanAdd()throws InterruptedException {
    PDPrescriptionPage.clickButtonPrescriptionHistory();
    PDPrescriptionPage.clickButtonPrescriptionHistory();
    PDPrescriptionPage.clickButtonAddPrescriptionHistory();
    PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
    }

    @And("I try to save a recipe with at least one required field empty.")
    public void iTryToSaveARecipeWithAtLeastOneRequiredFieldEmpty()throws InterruptedException {
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.cleanInputDataTotalVolume();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I try to create a new prescription but I click the cancel button")
    public void iTryToCreateANewPrescriptionButIClickTheCancelButton()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I verify that Previous Recipes will be displayed on the left and Active Recipes on the right, with their respective date.")
    public void iVerifyThatPreviousRecipesWillBeDisplayedOnTheLeftAndActiveRecipesOnTheRightWithTheirRespectiveDate()throws InterruptedException {
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
    }

    @And("I create and add a new Exchange")
    public void iCreateAndAddANewExchange()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickSavePrescription();
    }

    @And("I check that the information for each solution and a delete button are displayed")
    public void iCheckThatTheInformationForEachSolutionAndADeleteButtonAreDisplayed()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.dragAndDrop1();
        PDPrescriptionPage.clickButtonRemoveSolution();
    }

    @And("I do Click on each label to drag and drop the desired solutions")
    public void iDoClickOnEachLabelToDragAndDropTheDesiredSolutions()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonSolutionE();
        PDPrescriptionPage.clickButtonSolutionN();
        PDPrescriptionPage.clickButtonSolutionP();
        PDPrescriptionPage.dragAndDrop1();
        PDPrescriptionPage.clickButtonRemoveSolution();
    }

    @And("I check The system hides details")
    public void iCheckTheSystemHidesDetails()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowDownParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowUpParameterAdjustments();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @And("I verify that the system assigned the Questionnaire")
    public void iVerifyThatTheSystemAssignedTheQuestionnaire()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonThreePointsQuestionnaire();
        PDPrescriptionPage.clickButtonAssignQuestionnaire();
        PDPrescriptionPage.inputsDataAssignQuestionnaire();
        PDPrescriptionPage.clickButtonSaveQuestionnaire();
    }

    @And("I create and save the new Questionnaire")
    public void iCreateAndSaveTheNewQuestionnaire()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.titleParameterAdjustments();
        PDPrescriptionPage.scrollToQuestionnaireTitle();
        PDPrescriptionPage.clickButtonThreePointsQuestionnaire();
        PDPrescriptionPage.clickButtonNewQuestionnaire();
        PDPrescriptionPage.clickDropDownQuestionnaireCopy();
        PDPrescriptionPage.inputDataQuestionnaireName();
        PDPrescriptionPage.clickButtonSaveNewQuestionnaire();
        PDPrescriptionPage.clickButtonArrowUp();
    }

    @And("I create a new CAPD prescription and verify that it is in history")
    public void iCreateANewCAPDPrescriptionAndVerifyThatItIsInHistory()throws InterruptedException {
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonCapd();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.inputsDataAddExchangeCapd();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePoints();
        PDPrescriptionPage.clickSavePrescription();

    }

    @And("I try to create a new Prescription, but the system cancels the prescription")
    public void iTryToCreateANewPrescriptionButTheSystemCancelsThePrescription() throws InterruptedException{
        PDPrescriptionPage.clickButtonThreePointsPrescription();
        PDPrescriptionPage.clickButtonNewPrescription();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickDropDownTypeOfInfusion();
        PDPrescriptionPage.clickButtonDropDownTreatment();
        PDPrescriptionPage.clickButtonDropDownWeekdays();
        PDPrescriptionPage.inputDataTotalVolume();
        PDPrescriptionPage.inputDataTherapyTime();
        PDPrescriptionPage.inputDataUrineVolume();
        PDPrescriptionPage.inputDataTargetUf();
        PDPrescriptionPage.inputDataDryWeight();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.clickButtonThreePointsPrescriptionLast();
        PDPrescriptionPage.clickButtonCancelPrescription();
    }

    @And("I verify that The system will delete the selected change line")
    public void iVerifyThatTheSystemWillDeleteTheSelectedChangeLine() throws InterruptedException{
        PDPrescriptionPage.clickButtonAddPrescriptionHistory();
        PDPrescriptionPage.clickButtonAPDOption();
        PDPrescriptionPage.clickButtonOkWarning();
        PDPrescriptionPage.clickButtonAddExchange();
        PDPrescriptionPage.dataAddExchange();
        PDPrescriptionPage.clickSaveAddExchange();
        PDPrescriptionPage.clickButtonDeleteManualExchanges();
        PDPrescriptionPage.clickButtonArrowUp();
        PDPrescriptionPage.dragAndDrop1();
    }
}
