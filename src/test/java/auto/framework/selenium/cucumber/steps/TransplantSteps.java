package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.DonorEvaluationPage;
import auto.framework.selenium.pages.baxter_page.TransplantPage;
import io.cucumber.java.en.When;

public class TransplantSteps {

    @LazyAutowired

    private TransplantPage TransplantPage;




    @When("I check the module Transplant appear correctly")
    public void iCheckTheModuleDonorAssignmentAppearCorrectly() {
        TransplantPage.isDisplayedTheTittle();
    }













}
