package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDTreatmentPage;
import auto.framework.selenium.pages.baxter_page.PlanningCarePage;
import io.cucumber.java.en.When;

public class PlanningCareSteps {

    @LazyAutowired

    private PlanningCarePage PlanningCarePage;




    @When("I check the module Planning Care appear correctly")
    public void iCheckTheModulePlanningCareAppearCorrectly() {
        PlanningCarePage.isDisplayedTheTittle();
    }













}
