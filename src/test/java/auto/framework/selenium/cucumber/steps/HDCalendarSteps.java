package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDCalendarPage;
import auto.framework.selenium.pages.baxter_page.HDPrescriptionPage;
import io.cucumber.java.en.When;

public class HDCalendarSteps {

    @LazyAutowired

    private HDCalendarPage HDCalendarPage;




    @When("I check the module HD Calendar appear correctly")
    public void iCheckTheModuleAdequacyAppearCorrectly() {
        HDCalendarPage.isDisplayedTheTittle();
    }













}
