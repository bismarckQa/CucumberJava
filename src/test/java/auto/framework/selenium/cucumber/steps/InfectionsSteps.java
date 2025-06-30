package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HospitalizationPage;
import auto.framework.selenium.pages.baxter_page.InfectionsPage;
import io.cucumber.java.en.When;

public class InfectionsSteps {

    @LazyAutowired

    private InfectionsPage InfectionsPage;




    @When("I check the module Infections appear correctly")
    public void iCheckTheModuleInfectionsAppearCorrectly() {
        InfectionsPage.isDisplayedTheTittle();
    }













}
