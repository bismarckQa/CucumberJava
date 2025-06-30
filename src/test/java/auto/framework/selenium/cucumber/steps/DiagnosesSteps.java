package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AllergiesModulePage;
import auto.framework.selenium.pages.baxter_page.DiagnosesModulePage;
import io.cucumber.java.en.When;

public class DiagnosesSteps {

    @LazyAutowired

    private DiagnosesModulePage DiagnosesModulePage;




    @When("I check the module Diagnoses appear correctly")
    public void iCheckTheModuleDiagnosesAppearCorrectly() {
        DiagnosesModulePage.isDisplayedTheTittle();

    }












}
