package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AccessesPage;
import auto.framework.selenium.pages.baxter_page.HDTherapyConfigPage;
import auto.framework.selenium.pages.baxter_page.WaitingListPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.w3c.dom.Text;

public class AccessesSteps {

    @LazyAutowired

    private AccessesPage AccessesPage;

    @When("I check the module Accesses appear correctly")
    public void iCheckTheModuleAccessesAppearCorrectly() {
        AccessesPage.isDisplayedTheTittle();
    }

    @When("I click location accesses")
    public void iClickLocationAccesses() {
        AccessesPage.clickLocation1();
    }

    @When("I Add New Additional Test")
    public void iAddNewAdditionalTest() throws InterruptedException {
        AccessesPage.addAdditionalTestButton();
        AccessesPage.addAdditionalTestAnemia();

    }

    @When("I save the Access Data Implantation")
    public void iSaveTheAccessDataImplantation() throws InterruptedException {
        AccessesPage.clickSaveButton();

    }



    @And("The See Further Test showed")
    public void theSeeFurtherTestShowed() {
        AccessesPage.isDisplayedTheSeeFurtherTestsButton();
    }

    @And("I click See Further Test and then click attached test")
    public void iClickSeeFurtherTestAndThenClickAttachedTest() throws InterruptedException {
        AccessesPage.goToAttachedTestOfAccesses();
    }

    @Then("I check the test is correctly filtered")
    public void iCheckTheTestIsCorrectlyFiltered() {
        AccessesPage.isDisplayedTestCheckConditionAnemia();
    }

    @And("I open the menu and delete access")
    public void iOpenTheMenuAndDeleteAccess() throws InterruptedException {
        AccessesPage.clickThreeButtons();
        AccessesPage.clickDeleteButton();
    }

    @And("I accept delete access and accept information window")
    public void iAcceptDeleteAccess() throws InterruptedException {
        AccessesPage.clickOkDeleteAccess();
        AccessesPage.clickInformationDeleteAccess();

    }

    @When("I add all data correctly for add the Access Data with the access type {string} and comment {string}")
    public void iAddAllDataCorrectlyForAddTheAccessDataWithTheAccess(String AccessType, String Comment) throws InterruptedException {
        AccessesPage.selectAccessType(AccessType);
        AccessesPage.writeComment(Comment);
    }

    @And("I add all data correctly for add the Access: Access type {string}, Location {string}, Date of first use {string}, comment {string}, implantation date {string}, date of removal {string} and removal center {string}")
    public void iAddAllDataCorrectlyForAddTheAccessAccessTypeLocationDateOfFirstUseCommentImplantationDateAndDateOfRemoval(String AccessType, String Location, String FirstUse, String Comment, String ImplantationDate, String DateRemoval, String RemovalCenter) throws InterruptedException {
        AccessesPage.selectAccessType(AccessType);
        AccessesPage.selectAccessLocation(Location);
        AccessesPage.writeDateOfFirstUse(FirstUse);
        AccessesPage.writeComment(Comment);
        AccessesPage.writeImplantationDate(ImplantationDate);
        AccessesPage.writeDateOfRemoval(DateRemoval);
        AccessesPage.selectRemovalCenter(RemovalCenter);
        AccessesPage.clickOnUpArrow();


    }

    @And("I click in edit all")
    public void iClickInEditAll() throws InterruptedException {
        AccessesPage.clickEditAll();
    }

    @And("I can edit all parameters and change for example the Comment {string}")
    public void iCanEditAllParametersAndChangeForExampleTheComment(String Comment)throws InterruptedException {
        AccessesPage.writeComment(Comment);
    }

    @Then("I check the Comment changed")
    public void iCheckTheCommentChanged() {
        AccessesPage.newCommentEditIsVisible();
    }

    @And("I check the state of access is active with colour green")
    public void iCheckTheStateOfAccessIsActiveWithColourGreen()throws InterruptedException {
        AccessesPage.newAccessIsActiveColourGreen();
    }

    @And("I Change the date of removal to {string}")
    public void iChangeTheDateOfRemovalTo(String DateRemoval) throws InterruptedException {
        AccessesPage.writeDateOfRemoval(DateRemoval);
        AccessesPage.clickOnUpArrow();
    }

    @Then("I check the state of access is inactive with colour red")
    public void iCheckTheStateOfAccessIsInactiveWithColourRed() throws InterruptedException {
        AccessesPage.newAccessIsInActiveColourRed();
    }

    @And("I Cancel delete access and accept information window")
    public void iCancelDeleteAccessAndAcceptInformationWindow() throws InterruptedException {
        AccessesPage.clickCancelDeleteAccess();
    }

    @Then("The access not deleted")
    public void theAccessNotDeleted() {
        AccessesPage.newCommentEditIsVisible();
    }

    @Then("The access is deleted")
    public void theAccessIsDeleted() {
        AccessesPage.isDisplayedTheTittle();
    }

    @And("I check that the sections Location, Access Data and Swab Showed")
    public void iCheckThatTheSectionsLocationAccessDataAndSwabShowed() {
        AccessesPage.isDisplayedTheLocationTittle();
        AccessesPage.isDisplayedTheAccessDataTittle();
        AccessesPage.isDisplayedTheSwabTittle();
    }

    @And("I check that the main manu showed with Implantation, Evaluation and Complications")
    public void iCheckThatTheMainManuShowedWithImplantationEvaluationAndComplications() {
        AccessesPage.isDisplayedTheImplantationTittleMainMenu();
        AccessesPage.isDisplayedTheEvaluationTittleMainMenu();
        AccessesPage.isDisplayedTheComplicationsTittleMainMenu();
    }

    @When("I select the Evaluation in main menu")
    public void iSelectTheEvaluationInMainMenu() throws InterruptedException {
        AccessesPage.clickEvaluationMainMenuButton();
    }

    @Then("I check that the sections Location, Follow-Up, Evaluation and Historic Photographs of Accesses")
    public void iCheckThatTheSectionsLocationFollowUpEvaluationAndHistoricPhotographsOfAccesses() {
        AccessesPage.isDisplayedTheLocationTittle();
        AccessesPage.isDisplayedTheFollowUpTittle();
        AccessesPage.isDisplayedTheEvaluationSubmenuTittle();
        AccessesPage.isDisplayedTheHistoricPhotographsTittle();

    }

    @When("I select the Complications in main menu")
    public void iSelectTheComplicationsInMainMenu() throws InterruptedException {
        AccessesPage.clickComplicationMainMenuButton();
    }

    @Then("I check that the sections Location, Complications, Interventions, Observations, Medications and Hospitalisations")
    public void iCheckThatTheSectionsLocationComplicationsInterventionsObservationsMedicationsAndHospitalisations() {

        AccessesPage.isDisplayedTheLocationTittle();



    }


    @And("I click three dots and select Pre-Assessment")
    public void iClickThreeDotsAndSelectPreAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickNewPreAssessmentButton();

    }

    @When("I add all data correctly for add the Pre-Treatment: Date {string}, Text Field {string}, mark check box and mark select boxes")
    public void iAddAllDataCorrectlyForAddThePreTreatmentDateTextFieldMarkCheckBoxAndMarkSelectBoxes(String Date, String TextField) throws InterruptedException {

        AccessesPage.resetDatePreTreatment();
        AccessesPage.writeDatePreTreatment(Date);
        AccessesPage.writeTextFieldPreTreatment(TextField);
        AccessesPage.clickCheckboxPreTreatment();
        AccessesPage.clickSelectBoxes();


    }

    @When("I add all data correctly for add the Pre-Treatment: Date {string}, Text Field {string} and mark select boxes")
    public void iAddAllDataCorrectlyForAddThePreTreatmentDateTextFieldAndMarkSelectBoxes(String Date, String TextField) throws InterruptedException {
        AccessesPage.resetDatePreTreatment();
        AccessesPage.writeDatePreTreatment(Date);
        AccessesPage.writeTextFieldPreTreatment(TextField);
        AccessesPage.clickSelectBoxes();
    }
    @When("I add all data correctly for add the Pre-Treatment: Text Field {string} and unmark select boxes")
    public void iAddAllDataCorrectlyForAddThePreTreatmentDateTextFieldAndUnMarkSelectBoxes(String TextField) throws InterruptedException {
        AccessesPage.writeTextFieldPreTreatment(TextField);
        AccessesPage.clickSelectBoxes();
    }
    @When("I add all data correctly for add the Pre-Treatment: Text Field {string}")
    public void iAddAllDataCorrectlyForAddThePreTreatmentDateTextField(String TextField) throws InterruptedException {
        AccessesPage.writeTextFieldPreTreatment(TextField);

    }

    @And("I save Pre-Assessment")
    public void iSavePreAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickSaveButtonSecondThreeButtons();
    }

    @Then("I check the alert and accept")
    public void iCheckTheAlertAndAccept() {
        AccessesPage.isDisplayedTheAlertError();
        AccessesPage.clickOkAlertWindow();


    }

    @And("I cancel Pre-Assessment")
    public void iCancelPreAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickCancelButtonSecondThreeButtons();
    }

    @Then("I check the second Pre-Assessment is canceled")
    public void iCheckTheSecondPreAssessmentIsCanceled() {
        AccessesPage.isDisplayedTrueCheckBox();
    }


    @When("I click three dots and edit Pre-Assessment")
    public void iClickThreeDotsAndEditPreAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickEditButtonSecondThreeButtons();
    }

    @Then("I check Pre-Assessment is edited")
    public void iCheckPreAssessmentIsEdited() {
        AccessesPage.isDisplayedFalseSelectBoxes();

    }

    @Then("I check Pre-Assessment not edited")
    public void iCheckPreAssessmentNotEdited() {
        AccessesPage.isDisplayedFalseSelectBoxes();
    }

    @When("I click three dots and select Edit all")
    public void iClickThreeDotsAndSelectEditAll() throws InterruptedException {
        AccessesPage.clickThreeButtons();
        AccessesPage.clickEditAll();
    }

    @And("I change the Pre-Assessment page")
    public void iChangeThePreAssessmentPage() throws InterruptedException {
        AccessesPage.clickPage2OfPreAssessment();
    }
    @And("I change the Post-Assessment page")
    public void iChangeThePostAssessmentPage() throws InterruptedException {
        AccessesPage.clickPage2OfPreAssessment();
    }

    @When("I click save all Pre-Assessments")
    public void iClickSaveAllPreAssessments() throws InterruptedException {
        AccessesPage.clickThreeButtons();
        AccessesPage.clickSaveButton();
    }
    @When("I click save all Post-Assessments")
    public void iClickSaveAllPostAssessments() throws InterruptedException {
        AccessesPage.clickThreeButtons();
        AccessesPage.clickSaveButton();
    }

    @And("I check the changes is applied")
    public void iCheckTheChangesIsApplied() throws InterruptedException {
        AccessesPage.isDisplayedFalseSelectBoxes();
        AccessesPage.clickPage2OfPreAssessment();
        AccessesPage.isDisplayedTrueCheckBox();

    }

    @And("I click three dots and select cancel")
    public void iClickThreeDotsAndSelectCancel() throws InterruptedException {
        AccessesPage.clickCancel();
    }

    @Then("I check the changes not applied")
    public void iCheckTheChangesNotApplied() throws InterruptedException {
        AccessesPage.isDisplayedFalseSelectBoxes();
        AccessesPage.clickPage2OfPreAssessment();
        AccessesPage.isDisplayedTrueCheckBox();
    }

    @When("I click three dots and delete Pre-Assessments")
    public void iClickThreeDotsAndDeletePreAssessments() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickDelete();
    }
    @When("I click three dots and delete Post-Assessments")
    public void iClickThreeDotsAndDeletePostAssessments() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickDelete();
    }

    @And("I check the alert box appear and click yes")
    public void iCheckTheAlertBoxAppearAndClickYes() throws InterruptedException {
        AccessesPage.isDisplayedTheActionWindow();
        AccessesPage.clickYesButtonConfirmWindow();


    }

    @Then("I check the alert box appear and click No")
    public void iCheckTheAlertBoxAppearAndClickNo() throws InterruptedException {
        AccessesPage.isDisplayedTheActionWindow();
        AccessesPage.clickNoButtonConfirmWindow();
    }

    @Then("I check the last one not deleted")
    public void iCheckTheLastOneNotDeleted() {
        AccessesPage.isDisplayedFalseSelectBoxes();
    }

    @And("I click three dots and select Post-Assessment")
    public void iClickThreeDotsAndSelectPostAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickNewPostAssessmentButton();


    }

    @When("I add all data correctly for add the Post-Treatment: Date {string}, Text Area {string} Text Field {string} and number {string}")
    public void iAddAllDataCorrectlyForAddThePostTreatmentDateTextAreaTextFieldAndNumber(String Date, String TextArea, String TextField, String Number) throws InterruptedException {
        AccessesPage.resetDatePostTreatment();
        AccessesPage.writeDatePostTreatment(Date);
        AccessesPage.writeTextAreaPostTreatment(TextArea);
        AccessesPage.writeTextFieldPostTreatment(TextField);
        AccessesPage.writeNumberPostTreatment(Number);


    }

    @And("I save Post-Assessment")
    public void iSavePostAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickSaveButtonSecondThreeButtons();
    }

    @And("I cancel Post-Assessment")
    public void iCancelPostAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickCancelButtonSecondThreeButtons();
    }

    @Then("I check the second Post-Assessment is canceled")
    public void iCheckTheSecondPostAssessmentIsCanceled() {
        AccessesPage.isDisplayedPreTreatmentTabTittle();
    }

    @And("I select the Post-Treatment tab")
    public void iSelectThePostTreatmentTab() throws InterruptedException {
        AccessesPage.clickPostTreatmentTab();
    }

    @When("I click three dots and edit Post-Assessment")
    public void iClickThreeDotsAndEditPostAssessment() throws InterruptedException {
        AccessesPage.clickThreeButtonSecond();
        AccessesPage.clickEditButtonSecondThreeButtons();
    }

    @And("I add all data correctly for add the Post-Treatment: Text Area {string} Text Field {string}, number {string} and mark checkbox")
    public void iAddAllDataCorrectlyForAddThePostTreatmentTextAreaTextFieldAndNumber(String TextArea, String TextField, String Number) throws InterruptedException {
        AccessesPage.writeTextAreaPostTreatment(TextArea);
        AccessesPage.writeTextFieldPostTreatment(TextField);
        AccessesPage.writeNumberPostTreatment(Number);
        AccessesPage.clickCheckboxPreTreatment();
    }

    @And("I check the Post-Treatment was edited correctly")
    public void iCheckThePostTreatmentWasEditedCorrectly() {
        AccessesPage.isDisplayedTrueCheckBox();
    }

    @Then("I check the Post-Treatment wasn\u00b4t edited correctly")
    public void iCheckThePostTreatmentWasTEditedCorrectly() {
        AccessesPage.isDisplayedTrueCheckBox();
    }

    @And("I add all data correctly for add the Post-Treatment: Text Field {string} and mark select boxes")
    public void iAddAllDataCorrectlyForAddThePostTreatmentTextFieldAndUnmarkSelectBoxes(String TextField) throws InterruptedException {
        AccessesPage.writeTextFieldPostTreatment(TextField);
        AccessesPage.clickCheckboxPreTreatment();

    }

    @Then("I check Pre-Assessment is appear")
    public void iCheckPreAssessmentIsAppear() throws InterruptedException {
        AccessesPage.isDisplayedPreTreatmentTabTittle();
        AccessesPage.clickPreTreatmentTab();
        AccessesPage.isDisplayedPreTreatmentTextFieldTittle();
    }

    @Then("I check Post-Assessment is appear")
    public void iCheckPostAssessmentIsAppear() throws InterruptedException {
        AccessesPage.isDisplayedPostTreatmentTabTittle();
        AccessesPage.clickPostTreatmentTab();
        AccessesPage.isDisplayedPreTreatmentNumberTittle();


    }

    @When("I create a new jugular catheter type access: Access Type {string}, Location {string}, Comment {string}")
    public void iCreateANewJugularCatheterAccess(String AccessType, String Location, String Comment ) throws InterruptedException {
        AccessesPage.approvedForUse();
        AccessesPage.selectAccessType(AccessType);
        AccessesPage.selectAccessLocation(Location);
        AccessesPage.writeComment(Comment);
        AccessesPage.clickOnUpArrow();


    }

    @And("I click button implantation section")
    public void iClickButtonImplantationSection()throws InterruptedException {
        AccessesPage.clickButtonImplantationSection();
    }


    @Then("I click button three points Access")
    public void iClickButtonThreePointsAccess()throws InterruptedException {
        AccessesPage.clickButtonThreePointsAccess();
    }

    @And("I click button new access")
    public void iClickButtonNewAccess()throws InterruptedException {
        AccessesPage.clickButtonNewAccess();
    }

    @And("I select access type {string}")
    public void iSelectAccessType(String AccessType)throws InterruptedException {
        AccessesPage.selectAccessType(AccessType);
    }

    @When("I select location {string}")
    public void iSelectLocation(String Location)throws InterruptedException {
        AccessesPage.selectAccessLocation(Location);
    }

    @And("I select Date of first use {string}")
    public void iSelectDateOfFirstUse(String Date)throws InterruptedException {
        AccessesPage.writeDatePostTreatment(Date);
    }

    @And("I insert data into text area comments {string}")
    public void iInsertDataIntoTextAreaComments(String Comment)throws InterruptedException {
        AccessesPage.writeComment(Comment);
    }

    @And("I select implantation date {string}")
    public void iSelectImplantationDate(String ImplantationDate)throws InterruptedException {
        AccessesPage.writeImplantationDate(ImplantationDate);
    }

    @Then("I select date of removal {string}")
    public void iSelectDateOfRemoval(String DateRemoval)throws InterruptedException {
        AccessesPage.writeDateOfRemoval(DateRemoval);
    }

    @And("I select removal center {string}")
    public void iSelectRemovalCenter(String RemovalCenter)throws InterruptedException {
        AccessesPage.selectRemovalCenter(RemovalCenter);
    }

    @And("I click zone right location")
    public void iClickZoneRightLocation()throws InterruptedException {
        AccessesPage.clickZoneRightLocation();
    }

    @Then("I check the Comment changed {string}")
    public void iCheckTheCommentChanged(String comment)throws InterruptedException {
        AccessesPage.checkTheCommentChanged(comment);
    }

    @And("I verify section change of extension is displayed")
    public void iVerifySectionChangeOfExtensionIsDisplayed()throws InterruptedException {
        AccessesPage.titleChangeOfExtension();
    }

    @And("I verify Historic Photographs of Accesses")
    public void iVerifyHistoricPhotographsOfAccesses()throws InterruptedException {
        AccessesPage.verifyHistoricPhotographsOfAccessesDisplayed();
    }

    @Then("I click button three points change of extension")
    public void iClickButtonThreePointsChangeOfExtension()throws InterruptedException {
        AccessesPage.clickButtonThreePointsChangeOfExtension();
    }

    @And("I click button new extender change")
    public void iClickButtonNewExtenderChange()throws InterruptedException {
        AccessesPage.clickButtonNewExtenderChange();
    }

    @And("I insert data into date change of extension {string}")
    public void iInsertDataIntoDateChangeOfExtension(String date)throws InterruptedException {
        AccessesPage.insertDataIntoDateChangeOfExtension(date);
    }

    @When("I select option type of configuration for change extension")
    public void selectOptionTypeOfConfigurationForChangeExtension()throws InterruptedException {
        AccessesPage.selectOptionTypeOfConfigurationForChangeExtension();
    }

    @And("I click button save")
    public void iClickButtonSave()throws InterruptedException {
        AccessesPage.clickSaveButton();
    }

    @And("I click button cancel")
    public void iClickButtonCancel()throws InterruptedException {
        AccessesPage.clickCancelButton();

    }

    @And("I click button OK modal error")
    public void iClickButtonOKModalError()throws InterruptedException {
        AccessesPage.clickButtonOkModalError();
    }

    @And("I click button delete")
    public void iClickButtonDelete()throws InterruptedException {
        AccessesPage.clickDelete();
    }

    @Then("I click button OK  modal error in module")
    public void iClickButtonOKModalErrorInModule()throws InterruptedException{
        AccessesPage.clickButtonOkInModalErrorInModule();
    }


    @And("I click button image evaluation")
    public void iClickButtonImageEvaluation()throws InterruptedException {
        AccessesPage.clickImageEvaluationHistory();
    }

    @And("I click button delete image")
    public void iClickButtonDeleteImage()throws InterruptedException {
        AccessesPage.clickButtonDeleteImage();
    }

    @Then("I select option action in modal {string}")
    public void iSelectOptionActionInModal(String action)throws InterruptedException {
        AccessesPage.selectOptionActionInModalByText(action);

    }

    @Then("I click button three points Access Data")
    public void iClickButtonThreePointsAccessData()throws InterruptedException {
        AccessesPage.clickThreeButtonsAccessData();
    }

    @And("I select option new additional test")
    public void iSelectOptionNewAdditionalTest()throws  InterruptedException {
        AccessesPage.clickButtonNewAdditionalTest();
    }

    @And("I select associate additional study")
    public void iSelectAssociateAdditionalStudy()throws InterruptedException {
        AccessesPage.selectAssociateAdditionalStudy();

    }

    @Then("I click button {string} associate additional study")
    public void iClickButtonAssociateAdditionalStudy(String action)throws InterruptedException {
        AccessesPage.selectOptionActionInAssociateAdditionalStudy(action);
    }

    @And("I select option Edit")
    public void iSelectOptionEdit()throws InterruptedException {
        AccessesPage.clickButtonEdit();
    }

    @And("I click in edit extension")
    public void iClickInEditExtension()throws InterruptedException {
        AccessesPage.clickButtonEdit();

    }

    @Then("I click button three points swab")
    public void iClickButtonThreePointsSwab()throws InterruptedException {
        AccessesPage.clickThreeButtonSwab();
    }

    @And("I click button {string}")
    public void iClickButton(String action)throws InterruptedException {
        AccessesPage.selectOptionActionInAssociate(action);
    }

    @And("I select option location swab")
    public void iSelectOptionLocationSwab()throws InterruptedException {
        AccessesPage.selectOptionLocationSwab();
    }

    @And("I insert data into evaluation area {string}")
    public void iInsertDataIntoEvaluationArea(String evaluation)throws InterruptedException {
        AccessesPage.inputDataEvaluation(evaluation);
    }

    @And("I click button three points follow up")
    public void iClickButtonThreePointsFollowUp()throws InterruptedException {
        AccessesPage.clickButtonThreePointsFollowUp();
    }

    @Then("I select evaluation in follow up")
    public void iSelectEvaluationInFollowUp()throws InterruptedException {
        AccessesPage.selectEvaluationInFollowUp();
    }

    @And("I insert data into input date: {string}")
    public void iInsertDataIntoInputDate(String date)throws InterruptedException {
        AccessesPage.insertDataIntoInputDate(date);
    }

    @And("I click button image photo")
    public void iClickButtonImagePhoto()throws InterruptedException {
       AccessesPage.clickButtonImagePhoto();
    }

    @Then("I select Image to upload")
    public void iSelectImageToUpload()throws InterruptedException {
        AccessesPage.selectImageToUpload();

    }

    @And("I click button {string} upload photo")
    public void iClickButtonUploadPhoto(String action)throws InterruptedException {
        AccessesPage.selectOptionAction(action);
    }

    @Then("I insert data into date add photograph {string}")
    public void iInsertDataIntoDateAddPhotograph(String date)throws InterruptedException {
        AccessesPage.insertDataIntoDateAddPhotograph(date);
    }

    @And("I click button three points complications")
    public void iClickButtonThreePointsComplications()throws InterruptedException {
        AccessesPage.clickButtonThreePointsComplications();
    }
    @And("I click button three points interventions")
    public void iClickButtonThreePointsInterventions()throws InterruptedException {
        AccessesPage.clickButtonThreePointsInterventions();
    }

    @Then("I select Type of problem complication")
    public void iSelectTypeOfProblemComplication()throws InterruptedException {
        AccessesPage.selectTypeOfProblemComplication();
    }

    @And("I insert data into identification date {string}")
    public void iInsertDataIntoIdentificationDate(String date)throws InterruptedException {
        AccessesPage.inputDataIdentificationDate(date);
    }

    @Then("I select option in modal assign symptoms")
    public void iSelectOptionInModalAssignSymptoms()throws InterruptedException {
        AccessesPage.selectOptionInModalAssignSymptoms();
    }

    @And("I insert data into resolution date {string}")
    public void iInsertDataIntoResolutionDate(String date)throws InterruptedException {
        AccessesPage.inputDataResolutionDate(date);
    }

    @And("I delete type of problem selected")
    public void iDeleteTypeOfProblemSelected()throws InterruptedException {
        AccessesPage.deleteTypeOfProblemSelected();
    }

    @And("I click button {string} in action modal")
    public void iClickButtonInActionModal(String action)throws InterruptedException {
        AccessesPage.clickButtonInActionModal(action);
    }

    @And("I select type of intervention")
    public void iSelectTypeOfIntervention()throws InterruptedException {
        AccessesPage.selectTypeOfIntervention();
    }

    @Then("I select result of interventions")
    public void iSelectResultOfInterventions()throws InterruptedException {
        AccessesPage.selectResultOfInterventions();
    }

    @And("I click button three points interventions actions")
    public void iClickButtonThreePointsInterventionsActions()throws InterruptedException {
       AccessesPage.clickButtonThreePointsInterventionsActions();
    }

    @When("I insert data into date interventions {string}")
    public void iInsertDataIntoDateInterventions(String date)throws InterruptedException {
        AccessesPage.insertDataIntoDateInterventions(date);
    }

    @And("I delete type of intervention selected")
    public void iDeleteTypeOfInterventionSelected()throws InterruptedException {
        AccessesPage.deleteTypeOfInterventionSelected();
    }

    @And("I click button three points medications")
    public void iClickButtonThreePointsMedications()throws InterruptedException {
        AccessesPage.clickButtonThreePointsMedications();
    }

    @Then("I select medication to assign in complication")
    public void iSelectMedicationToAssignInComplication()throws InterruptedException {
        AccessesPage.selectMedicationToAssignInComplication();
    }

    @And("I click button three points hospitalizations")
    public void iClickButtonThreePointsHospitalizations()throws InterruptedException {
        AccessesPage.clickButtonThreePointsHospitalizations();
    }

    @And("I click button Link hospitalizations")
    public void iClickButtonLinkHospitalizations()throws InterruptedException {
        AccessesPage.clickButtonLinkHospitalizations();

    }

    @When("I select option hospitalizations in complications")
    public void iSelectOptionHospitalizationsInComplications()throws InterruptedException {
        AccessesPage.selectOptionHospitalizationsInComplications();
    }

    @And("I click button delete hospitalization")
    public void iClickButtonDeleteHospitalization()throws InterruptedException {
        AccessesPage.clickButtonDeleteHospitalization();

    }

    @And("I clear input data location swab")
    public void iClearInputDataLocationSwab()throws InterruptedException {
        AccessesPage.clearInputDataLocationSwab();
    }

    @And("I click button three points evaluation")
    public void iClickButtonThreePointsEvaluation()throws InterruptedException {
        AccessesPage.clickButtonThreePointsEvaluation();
    }
}
