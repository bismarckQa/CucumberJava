package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDWaterQualityPage;
import auto.framework.selenium.pages.baxter_page.ReviewsModulePage;
import io.cucumber.java.en.When;

public class HDWaterQualitySteps {

    @LazyAutowired

    private HDWaterQualityPage HDWaterQualityPage;




    @When("I check the module HD Water Quality appear correctly")
    public void iCheckTheModuleHDWaterQualityAppearCorrectly() {
        HDWaterQualityPage.isDisplayedTheTittleHDWaterQuality();

    }












}
