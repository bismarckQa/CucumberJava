package auto.framework.selenium.cucumber.steps;




import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ConfigurationOptionOfUserPage;
import auto.framework.selenium.pages.baxter_page.ReportsAndConsultationsPage;
import io.cucumber.java.en.When;

public class ConfigurationOptionOfUserSteps {

    @LazyAutowired

    private ConfigurationOptionOfUserPage ConfigurationOptionOfUserSteps;


    @When("Configuration menu open correctly with new patient option")
    public void ConfigurationMenuOpenCorrectly(){
        ConfigurationOptionOfUserSteps.isDisplayedNewPatientTittle();
    }



}
