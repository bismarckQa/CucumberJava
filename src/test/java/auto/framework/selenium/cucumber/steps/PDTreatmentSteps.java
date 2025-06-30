package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.PDPrescriptionPage;
import auto.framework.selenium.pages.baxter_page.PDTreatmentPage;
import io.cucumber.java.en.When;

public class PDTreatmentSteps {

    @LazyAutowired

    private PDTreatmentPage PDTreatmentPage;




    @When("I check the module PD Treatment appear correctly")
    public void iCheckTheModuleAccessesAppearCorrectly() {
        PDTreatmentPage.isDisplayedTheTittle();
    }













}
