package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.NursingCarePage;
import io.cucumber.java.en.When;

public class NursingCareSteps {

    @LazyAutowired

    private NursingCarePage NursingCarePage;




    @When("I check the module Nursing Care appear correctly")
    public void iCheckTheModuleNursingCareAppearCorrectly() {
        NursingCarePage.isDisplayedTheTittle();
    }













}
