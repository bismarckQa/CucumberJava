package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.BiopsyPage;
import auto.framework.selenium.pages.baxter_page.DonorEvaluationPage;
import io.cucumber.java.en.When;

public class BiopsySteps {

    @LazyAutowired

    private BiopsyPage BiopsyPage;




    @When("I check the module Biopsy appear correctly")
    public void iCheckTheModuleDonorAssignmentAppearCorrectly() {
        BiopsyPage.isDisplayedTheTittle();
    }













}
