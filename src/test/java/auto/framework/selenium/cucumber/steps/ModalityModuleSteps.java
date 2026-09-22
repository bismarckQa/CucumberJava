package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ModalityModulePage;
import io.cucumber.java.en.Then;

public class ModalityModuleSteps {

    @LazyAutowired
    private ModalityModulePage modalityModulePage;

    @Then("I check the module Modality appear correctly")
    public void iCheckTheModuleModalityAppearCorrectly() {
        modalityModulePage.verifyModalityModuleAppears();
    }
}
