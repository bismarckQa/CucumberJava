package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.DiagnosesModulePage;
import auto.framework.selenium.pages.baxter_page.PhysicalAssessmentPage;
import io.cucumber.java.en.When;

public class PhysicalAssessmentSteps {

    @LazyAutowired

    private PhysicalAssessmentPage PhysicalAssessmentPage;




    @When("I check the module Physical Assessment appear correctly")
    public void iCheckTheModulePhysicalAssessmentCorrectly() {
        PhysicalAssessmentPage.isDisplayedTheTittle();

    }












}
