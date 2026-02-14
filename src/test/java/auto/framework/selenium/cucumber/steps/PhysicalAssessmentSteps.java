package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.DiagnosesModulePage;
import auto.framework.selenium.pages.baxter_page.PhysicalAssessmentPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PhysicalAssessmentSteps {

    @LazyAutowired

    private PhysicalAssessmentPage PhysicalAssessmentPage;




    @When("I check the module Physical Assessment appear correctly")
    public void iCheckTheModulePhysicalAssessmentCorrectly() {
        PhysicalAssessmentPage.isDisplayedTheTittle();

    }


    @Then("I See Indicator section all available")
    public void iSeeIndicatorSectionAllAvailable()throws InterruptedException {
        PhysicalAssessmentPage.seeIndicatorSectionAllAvailable();
    }

    @And("I click in Assessment area and comments")
    public void iClickInAssessmentAreaAndComments()throws InterruptedException {
        PhysicalAssessmentPage.clickInAssessmentAreaAndComments();
    }

    @Then("I see observations window with all available information")
    public void iSeeObservationsWindowWithAllAvailableInformation()throws InterruptedException {
        PhysicalAssessmentPage.seeObservationsWindowWithAllAvailable();
    }

    @And("I click in vaccines area")
    public void iClickInVaccinesArea()throws InterruptedException {
        PhysicalAssessmentPage.clickInVaccinesArea();

    }

    @Then("I see vaccines window with all available information")
    public void iSeeVaccinesWindowWithAllAvailableInformation()throws  InterruptedException {
        PhysicalAssessmentPage.seeVaccinesWindowWithAllAvailable();
    }

    @And("I click in Physical assessment area")
    public void iClickInPhysicalAssessmentArea()throws InterruptedException{
      PhysicalAssessmentPage.clickInPhysicalAssessmentArea();
    }

    @Then("I see Physical assessment window with information about physical exam")
    public void iSeePhysicalAssessmentWindowWithInformationAboutPhysicalExam()throws InterruptedException {
        PhysicalAssessmentPage.seePhysicalAssessmentWindowWithInformationAboutPhysicalExam();
    }

    @And("I click button three points Physical Assessment")
    public void iClickButtonThreePointsPhysicalAssessment()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonThreePointsPhysicalAssessment();

    }

    @And("I click button option {string}")
    public void iClickButtonOption(String action)throws InterruptedException {
        PhysicalAssessmentPage.selectOptionButton(action);
    }

    @Then("I insert date into inputs Seated BP {string}, {string}")
    public void iInsertDateIntoInputsSeatedBP(String data1, String data2)throws InterruptedException {
        PhysicalAssessmentPage.insertDateIntoInputsSeatedBP(data1, data2);

    }

    @And("I click button three points vaccines")
    public void iClickButtonThreePointsVaccines()throws InterruptedException {
     PhysicalAssessmentPage.clickButtonThreePointsVaccines();
    }

    @And("I select option vaccine name")
    public void iSelectOptionVaccineName()throws InterruptedException {
    PhysicalAssessmentPage.selectOptionVaccineName();
    }

    @And("I insert data into observations vaccines {string}")
    public void iInsertDataIntoObservationsVaccines(String observations)throws InterruptedException {
        PhysicalAssessmentPage.insertDataIntoObservationsVaccines(observations);
    }

    @And("I click button three points dose")
    public void iClickButtonThreePointsDose()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonThreePointsDose();
    }

    @And("I insert data into input second dose {string}")
    public void iInsertDataIntoInputSecondDose(String date)throws InterruptedException {
        PhysicalAssessmentPage.insertDataIntoInputSecondDose(date);

    }

    @And("I click button three points Assessment Area")
    public void iClickButtonThreePointsAssessmentArea()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonThreePointsAssessmentArea();
    }

    @And("I insert data into observations Assessment area {string}")
    public void iInsertDataIntoObservationsAssessmentArea(String observations)throws InterruptedException {
        PhysicalAssessmentPage.insertDataIntoObservationsVaccines(observations);
    }

    @And("I insert data into value indicator {string}")
    public void iInsertDataIntoValueIndicator(String value)throws InterruptedException {
        PhysicalAssessmentPage.insertDataIntoValueIndicator(value);
    }

    @Then("I click button cancel indicators")
    public void iClickButtonCancelIndicators()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonCancelIndicators();
    }

    @Then("I click button save indicators")
    public void iClickButtonSaveIndicators()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonSaveIndicators();
    }

    @And("I click button delete indicators")
    public void iClickButtonDeleteIndicators()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonDeleteIndicators();
    }


    @Then("I filling in the data to delete the record, password: {string}, reason: {string} and option: {string}")
    public void iFillingInTheDataToDeleteTheRecordPasswordReasonAndOption(String password, String reason, String option)throws InterruptedException {
        PhysicalAssessmentPage.fillingInTheDataToDeleteTheRecord(password, reason, option);
    }

    @And("I click button delete extra dose")
    public void iClickButtonDeleteExtraDose()throws InterruptedException {
        PhysicalAssessmentPage.clickButtonDeleteExtraDose();
    }
}
