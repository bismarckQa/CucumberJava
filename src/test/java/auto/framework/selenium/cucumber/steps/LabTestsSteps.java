package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.LabTestsPage;
import auto.framework.selenium.pages.baxter_page.ReviewsModulePage;
import io.cucumber.java.en.When;

public class LabTestsSteps {

    @LazyAutowired

    private LabTestsPage LabTestsPage;




    @When("I check the module Lab Tests appear correctly")
    public void iCheckTheModuleLabTestsAppearCorrectly() {
        LabTestsPage.isDisplayedTheTittle();

    }












}
