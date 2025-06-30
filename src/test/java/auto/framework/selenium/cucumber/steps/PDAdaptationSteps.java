package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.PDAdaptationPage;
import auto.framework.selenium.pages.baxter_page.PDTreatmentPage;
import io.cucumber.java.en.When;

public class PDAdaptationSteps {

    @LazyAutowired

    private PDAdaptationPage PDAdaptationPage;




    @When("I check the module PD Adaptation appear correctly")
    public void iCheckTheModuleAccessesAppearCorrectly() {
        PDAdaptationPage.isDisplayedTheTittle();
    }













}
