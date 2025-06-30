package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AccessesPage;
import auto.framework.selenium.pages.baxter_page.AdequacyPage;
import io.cucumber.java.en.When;

public class AdequacySteps {

    @LazyAutowired

    private AdequacyPage AdequacyPage;




    @When("I check the module Adequacy appear correctly")
    public void iCheckTheModuleAdequacyAppearCorrectly() {
        AdequacyPage.isDisplayedTheTittle();
    }













}
