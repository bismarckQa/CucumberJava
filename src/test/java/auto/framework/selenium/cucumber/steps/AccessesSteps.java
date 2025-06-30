package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AccessesPage;
import auto.framework.selenium.pages.baxter_page.WaitingListPage;
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
        AccessesPage.clickThreeButtons();
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
        AccessesPage.clickThreeButtons();
        AccessesPage.clickEditAll();
    }

    @And("I can edit all parameters and change for example the Comment {string}")
    public void iCanEditAllParametersAndChangeForExampleTheComment(String Comment) {
        AccessesPage.writeComment(Comment);
    }

    @Then("I check the Comment changed")
    public void iCheckTheCommentChanged() {
        AccessesPage.newCommentEditIsVisible();
    }

    @And("I check the state of access is active with colour green")
    public void iCheckTheStateOfAccessIsActiveWithColourGreen() {
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
        AccessesPage.clickThreeButtons();
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

    @Then("I check the Post-Treatment wasn´t edited correctly")
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
}
