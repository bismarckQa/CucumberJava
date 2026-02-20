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
}
