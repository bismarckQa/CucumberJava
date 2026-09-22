package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.PlanningCarePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class PlanningCareSteps {

    @LazyAutowired
    private PlanningCarePage PlanningCarePage;


    @When("I check the module Planning Care appear correctly")
    public void iCheckTheModulePlanningCareAppearCorrectly() {
        PlanningCarePage.isDisplayedTheTittle();
    }

    @When("I select period {string} in Planning Care")
    public void iSelectPeriodInPlanningCare(String period) throws InterruptedException {
        PlanningCarePage.selectPeriod(period);
    }

    @And("I click button three points Planning Care")
    public void iClickButtonThreePointsPlanningCare() throws InterruptedException {
        PlanningCarePage.clickThreePoints();
    }

    @And("I click new in Planning Care")
    public void iClickNewInPlanningCare() throws InterruptedException {
        PlanningCarePage.clickNew();
    }

    @And("I click edit in Planning Care")
    public void iClickEditInPlanningCare() throws InterruptedException {
        PlanningCarePage.clickEdit();
    }

    @And("I click delete in Planning Care")
    public void iClickDeleteInPlanningCare() throws InterruptedException {
        PlanningCarePage.clickDelete();
    }

    @And("I click save in Planning Care")
    public void iClickSaveInPlanningCare() throws InterruptedException {
        PlanningCarePage.clickSave();
    }

    @And("I click cancel in Planning Care")
    public void iClickCancelInPlanningCare() throws InterruptedException {
        PlanningCarePage.clickCancel();
    }

    @And("I select subject {string} in Planning Care")
    public void iSelectSubjectInPlanningCare(String subject) throws InterruptedException {
        PlanningCarePage.selectSubject(subject);
    }

    @And("I select position {string} in Planning Care")
    public void iSelectPositionInPlanningCare(String position) throws InterruptedException {
        PlanningCarePage.selectPosition(position);
    }

    @And("I enter date {string} in Planning Care")
    public void iEnterDateInPlanningCare(String date) throws InterruptedException {
        PlanningCarePage.enterDate(date);
    }

    @And("I clear subject in Planning Care")
    public void iClearSubjectInPlanningCare() throws InterruptedException {
        PlanningCarePage.clearSubject();
    }

    @Then("I accept alert in Planning Care")
    public void iAcceptAlertInPlanningCare() throws InterruptedException {
        PlanningCarePage.acceptAlert();
    }

    @Then("I dismiss alert in Planning Care")
    public void iDismissAlertInPlanningCare() throws InterruptedException {
        PlanningCarePage.dismissAlert();
    }

    @Then("I click button {string} in confirmation modal Planning Care")
    public void iClickButtonInConfirmationModalPlanningCare(String option) throws InterruptedException {
        PlanningCarePage.clickConfirmationButton(option);
    }
}
