package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDCalendarPage;
import auto.framework.selenium.pages.baxter_page.HDMonitorsPage;
import io.cucumber.java.en.When;

public class HDMonitorsSteps {

    @LazyAutowired

    private HDMonitorsPage HDMonitorsPage;




    @When("I check the module HD Monitors appear correctly")
    public void iCheckTheModuleAdequacyAppearCorrectly() {
        HDMonitorsPage.isDisplayedTheTittle();
    }













}
