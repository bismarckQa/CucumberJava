package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDWaterQualityPage;
import auto.framework.selenium.pages.baxter_page.MedicalHistoryPage;
import io.cucumber.java.en.When;

public class MedicalHistorySteps {

    @LazyAutowired

    private MedicalHistoryPage MedicalHistoryPage;




    @When("I check the module Medical History appear correctly")
    public void iCheckTheModuleHDWaterQualityAppearCorrectly() {
        MedicalHistoryPage.isDisplayedTheTittleMedicalHistory();

    }












}
