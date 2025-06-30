package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.DonorAssignmentPage;
import auto.framework.selenium.pages.baxter_page.DonorEvaluationPage;
import io.cucumber.java.en.When;

public class DonorEvaluationSteps {

    @LazyAutowired

    private DonorEvaluationPage DonorEvaluationPage;




    @When("I check the module Donor Evaluation appear correctly")
    public void iCheckTheModuleDonorAssignmentAppearCorrectly() {
        DonorEvaluationPage.isDisplayedTheTittle();
    }













}
