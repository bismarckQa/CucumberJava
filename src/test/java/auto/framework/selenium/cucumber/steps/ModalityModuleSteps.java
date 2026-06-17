package auto.framework.selenium.cucumber.steps;




import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ModalityModulePage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class ModalityModuleSteps {

    @LazyAutowired

    private ModalityModulePage ModalityModuleSteps;




    @When("I open options and select edit")
    public void iOpenModalityModule() {

        ModalityModuleSteps.clickDotsButtonWithFrame();
        ModalityModuleSteps.clickEditButton();

    }
    @When("I edit sub-modality and change {string}")
    public void iEditSubModalityAndChange(String submodality) {
        ModalityModuleSteps.clickArrowSubmodality();
        ModalityModuleSteps.selectSubmodality(submodality);

    }

    @When("I save the changes in this patient")
    public void iSaveTheChangesInThisPatient() {
        ModalityModuleSteps.clickDotsButtonWithoutFrame();
        ModalityModuleSteps.clickSaveButton();

    }


    @And("I click button acceses module")
    public void iClickButtonAccesesModule()throws InterruptedException {
        ModalityModuleSteps.clickButtonAccesesModule();
    }

    @Then("I verify the modal search is displayed")
    public void iVerifyTheModalSearchIsDisplayed()throws InterruptedException {
        ModalityModuleSteps.verifyModalSearchIsDisplayed();

    }
}
