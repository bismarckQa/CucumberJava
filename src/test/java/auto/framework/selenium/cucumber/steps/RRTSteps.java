package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.MedicalAppointmentPage;
import auto.framework.selenium.pages.baxter_page.RRTPage;
import io.cucumber.java.en.When;

public class RRTSteps {

    @LazyAutowired

    private RRTPage RRTPage;




    @When("I check the module RRT appear correctly")
    public void iCheckTheModuleRRTAppearCorrectly() {
        RRTPage.isDisplayedTheTittle();
    }













}
