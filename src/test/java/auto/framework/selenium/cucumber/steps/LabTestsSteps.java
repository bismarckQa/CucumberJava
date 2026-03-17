package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.LabTestsPage;
import auto.framework.selenium.pages.baxter_page.ReviewsModulePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LabTestsSteps {

    @LazyAutowired

    private LabTestsPage LabTestsPage;




    @When("I check the module Lab Tests appear correctly")
    public void iCheckTheModuleLabTestsAppearCorrectly()throws InterruptedException {
        LabTestsPage.isDisplayedTheTittle();

    }


    @And("I click button lab test section")
    public void iClickButtonLabTestSection()throws InterruptedException {
        LabTestsPage.clickButtonLabTestSection();
    }

    @When("I click button three points lab test section")
    public void iClickButtonThreePointsLabTestSection()throws InterruptedException {
        LabTestsPage.clickButtonThreePointsLabTestSection();

    }

    @And("I click button {string} option")
    public void iClickButtonOption(String action)throws InterruptedException {
        LabTestsPage.selectOptionButton(action);

    }

    @And("I insert data into input date request {string}")
    public void iInsertDataIntoInputDateRequest(String date)throws InterruptedException {
        LabTestsPage.insertDataIntoInputDateRequest(date);
    }

    @And("I select profile option in lab test")
    public void iSelectProfileOptionInLabTest()throws InterruptedException {
        LabTestsPage.selectProfileOptionInLabTest();
    }

    @Then("I insert data into input date sample {string}")
    public void iInsertDataIntoInputDateSample(String date)throws InterruptedException {
        LabTestsPage.insertDataIntoInputDateSample(date);
    }

    @And("I select test option in lab tests")
    public void iSelectTestOptionInLabTests()throws InterruptedException {
        LabTestsPage.selectTestOptionInLabTests();
    }

    @And("I click on remove button on an existing result")
    public void iClickOnRemoveButtonOnAnExistingResult()throws InterruptedException {
        LabTestsPage.clickOnRemoveButtonOnAnExistingResult();
    }

    @And("I insert data into input result test {string}")
    public void iInsertDataIntoInputResultTest(String data)throws InterruptedException {
        LabTestsPage.insertDataIntoInputResultTest(data);
    }

    @When("I select a specific lab test listed: {string}")
    public void iSelectASpecificLabTestListed(String name)throws InterruptedException {
        LabTestsPage.clickNameSelectedRow(name);
    }

    @And("I insert data into unput value result selected: {string}")
    public void iInsertDataIntoUnputValueResultSelected(String data)throws InterruptedException {
       LabTestsPage.insertDataIntoUnputValueResultSelected(data);
    }

    @And("I insert data into input start date analytics {string}")
    public void iInsertDataIntoInputStartDateAnalytics(String date)throws InterruptedException {
       LabTestsPage.insertDataIntoInputStartDateAnalytics(date);
    }

    @And("I insert data into id request import laboratory results {string}")
    public void iInsertDataIntoIdRequestImportLaboratoryResults(String data)throws InterruptedException {
        LabTestsPage.insertDataIntoIdRequestImportLaboratoryResults(data);
    }

    @And("I select check box primary identification")
    public void iSelectCheckBoxPrimaryIdentification()throws InterruptedException  {
        LabTestsPage.selectCheckBoxPrimaryIdentification();
    }

    @And("I click button close modal import laboratory results")
    public void iClickButtonCloseModalImportLaboratoryResults()throws InterruptedException {
        LabTestsPage.clickButtonCloseModalImportLaboratoryResults();
    }

    @And("I click in drop down profiles analytics")
    public void iClickInDropDownProfilesAnalytics()throws InterruptedException {
        LabTestsPage.clickInDropDownProfilesAnalytics();
    }

    @And("I insert data into input end date analytics {string}")
    public void iInsertDataIntoInputEndDateAnalytics(String date)throws InterruptedException {
    LabTestsPage.insertDataIntoInputEndDateAnalytics(date);
    }

    @When("I click button laboratory request section")
    public void iClickButtonLaboratoryRequestSection()throws InterruptedException {
        LabTestsPage.clickButtonLaboratoryRequestSection();
    }

    @And("I click button three points laboratory request section")
    public void iClickButtonThreePointsLaboratoryRequestSection()throws InterruptedException{
        LabTestsPage.clickButtonThreePointsLaboratoryRequestSection();

    }

    @And("I insert data into input observations laboratory request {string}")
    public void iInsertDataIntoInputObservationsLaboratoryRequest(String data)throws InterruptedException {
        LabTestsPage.insertDataIntoInputObservationsLaboratoryRequest(data);
    }

    @When("I click button {string} option in Laboratory request")
    public void iClickButtonOptionInLaboratoryRequest(String action)throws InterruptedException {
        LabTestsPage.selectOptionButtonB(action);
    }

    @And("I click button {string} option in iframe laboratory request")
    public void iClickButtonOptionInIframeLaboratoryRequest(String action)throws InterruptedException {
        LabTestsPage.selectOptionButtonC(action);
    }

    @And("I select check box adecuacion in laboratory request")
    public void iSelectCheckBoxAdecuacionInLaboratoryRequest()throws InterruptedException {
        LabTestsPage.selectCheckBoxAdecuacionInLaboratoryRequest();
    }

    @When("I click button edit laboratory request")
    public void iClickButtonEditLaboratoryRequest()throws InterruptedException {
        LabTestsPage.clickButtonEditLaboratoryRequest();
    }


    @And("I insert data into input extraction date in edit laboratory request {string}")
    public void iInsertDataIntoInputExtractionDateInEditLaboratoryRequest(String date)throws InterruptedException {
        LabTestsPage.insertDataIntoInputExtractionDateInEditLaboratoryRequest(date);
    }

    @And("I insert data into input observations edit laboratory request {string}")
    public void iInsertDataIntoInputObservationsEditLaboratoryRequest(String data)throws InterruptedException {
        LabTestsPage.insertDataIntoInputObservationsEditLaboratoryRequest(data);
    }

    @Then("I click button cancel edit laboratory request")
    public void iClickButtonCancelEditLaboratoryRequest()throws InterruptedException {
        LabTestsPage.clickButtonCancelEditLaboratoryRequest();
    }

    @Then("I click button save edit laboratory request")
    public void iClickButtonSaveEditLaboratoryRequest()throws InterruptedException {
        LabTestsPage.clickButtonSaveEditLaboratoryRequest();
    }

    @And("I click button delete laboratory request")
    public void iClickButtonDeleteLaboratoryRequest()throws InterruptedException {
        LabTestsPage.clickButtonDeleteLaboratoryRequest();

    }

    @And("I click button delete laboratory request and cancel it")
    public void iClickButtonDeleteLaboratoryRequestAndCancelIt()throws InterruptedException {
    LabTestsPage.clickButtonDeleteLaboratoryRequestAndCancelIt();
    }

    @And("I click button delete laboratory request and accept it")
    public void iClickButtonDeleteLaboratoryRequestAndAcceptIt()throws InterruptedException {
        LabTestsPage.clickButtonDeleteLaboratoryRequestAndAcceptIt();
    }

    @And("I click button button print report")
    public void iClickButtonButtonPrintReport()throws InterruptedException {
        LabTestsPage.clickButtonButtonPrintReport();

    }


    @And("I select option in profiles in laboratory request")
    public void iSelectOptionInProfilesInLaboratoryRequest()throws InterruptedException {
        LabTestsPage.selectOptionInProfilesInLaboratoryRequest();

    }

    @And("I check a checkbox Show only unsent requests")
    public void iCheckACheckboxShowOnlyUnsentRequests()throws InterruptedException {
        LabTestsPage.checkACheckboxShowOnlyUnsentRequests();
    }

    @Then("I click button search laboratory request")
    public void iClickButtonSearchLaboratoryRequest()throws InterruptedException {
        LabTestsPage.clickButtonSearchLaboratoryRequest();
    }

    @And("I click button show the results graph window")
    public void iClickButtonShowTheResultsGraphWindow()throws InterruptedException {
        LabTestsPage.clickButtonShowTheResultsGraphWindow();
    }

    @And("I verify the information saved by id request {string}")
    public void iVerifyTheInformationSavedByIdRequest(String name)throws InterruptedException {
        LabTestsPage.verifyTheInformationSavedByIdRequest(name);
    }

    @And("I insert data into input request date {string} in laboratory request")
    public void iInsertDataIntoInputRequestDateInLaboratoryRequest(String date)throws InterruptedException {
       LabTestsPage.insertDataIntoInputRequestDateInLaboratoryRequest(date);
    }

    @And("I insert data into input end request date {string} in laboratory request")
    public void iInsertDataIntoInputEndRequestDateInLaboratoryRequest(String date)throws InterruptedException {
        LabTestsPage.insertDataIntoInputEndRequestDateInLaboratoryRequest(date);
    }


    @And("I check the title No record is shown")
    public void iCheckTheTitleNoRecordIsShown()throws InterruptedException {
        LabTestsPage.checkTheTitleNoRecordIsShown();
    }
}
