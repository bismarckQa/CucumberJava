package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDTreatmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HDTreatmentSteps {
    @LazyAutowired
    private HDTreatmentPage hdTreatmentPage;

    @When("I check the module HD Treatment appear correctly")
    public void iCheckTheModuleHDTreatmentAppearCorrectly() {
        hdTreatmentPage.isDisplayedTheTittle();
    }

    @And("I click button three points HD Treatment")
    public void iClickButtonThreePointsHDTreatment() {
        hdTreatmentPage.clickThreeDotsMenu();
    }

    @And("I click button {string} in HD Treatment")
    public void iClickButtonInHDTreatment(String option) {
        if ("New treatment".equalsIgnoreCase(option)) {
            hdTreatmentPage.clickTreatmentButton();
            return;
        }
        throw new IllegalArgumentException("Unsupported HD Treatment button: " + option);
    }

    @Then("I verify HD Treatment form is displayed")
    public void iVerifyHDTreatmentFormIsDisplayed() {
        hdTreatmentPage.isDisplayedPreparationTab();
        hdTreatmentPage.isDisplayedAdminDrugsOther();
    }

    @Then("I verify alert window is displayed in HD Treatment")
    public void iVerifyAlertWindowIsDisplayedInHDTreatment() {
        hdTreatmentPage.isDisplayedAlertWidows();
    }

    @And("I click button OK in HD Treatment alert")
    public void iClickButtonOkInHDTreatmentAlert() {
        hdTreatmentPage.clickOkButtonAlert();
    }

    @When("I select center {string} in HD Treatment location")
    public void iSelectCenterInHDTreatmentLocation(String center) throws InterruptedException {
        hdTreatmentPage.selectCenterInLocation(center);
    }

    @And("I select room {string} in HD Treatment location")
    public void iSelectRoomInHDTreatmentLocation(String room) throws InterruptedException {
        hdTreatmentPage.selectRoomInLocation(room);
    }

    @And("I select shift {string} in HD Treatment location")
    public void iSelectShiftInHDTreatmentLocation(String shift) throws InterruptedException {
        hdTreatmentPage.selectShiftInLocation(shift);
    }

    @And("I select location {string} in HD Treatment location")
    public void iSelectLocationInHDTreatmentLocation(String location) throws InterruptedException {
        hdTreatmentPage.selectLocationInLocation(location);
    }

    @Then("I select monitor {string} in HD Treatment location")
    public void iSelectMonitorInHDTreatmentLocation(String monitor) throws InterruptedException {
        hdTreatmentPage.selectMonitorInLocation(monitor);
    }

    @And("I open {string} section in HD Treatment")
    public void iOpenSectionInHDTreatment(String section) {
        if ("Preparation".equalsIgnoreCase(section)) {
            hdTreatmentPage.clickPreparationTabButton();
            return;
        }
        if ("Session".equalsIgnoreCase(section)) {
            hdTreatmentPage.clickSessionTabButton();
            return;
        }
        if ("Admin. drugs/other".equalsIgnoreCase(section)) {
            hdTreatmentPage.clickDrugsOtherTabButton();
            return;
        }
        if ("Final signature".equalsIgnoreCase(section)) {
            hdTreatmentPage.clickFinalSignatureTabButton();
            return;
        }
        throw new IllegalArgumentException("Unsupported HD Treatment section: " + section);
    }

    @And("I open Session tab")
    public void iOpenSessionTab() {
        hdTreatmentPage.clickSessionTabButton();
    }

    @When("I add new observation")
    public void iAddNewObservation() throws InterruptedException {
        hdTreatmentPage.clickNewObservation();
    }

    @Then("I save the new observation")
    public void iSaveTheNewObservation() throws InterruptedException {
        hdTreatmentPage.clickSaveNewObservation();
    }

    @Then("I open treatment history and check data")
    public void iOpenTreatmentHistoryAndCheckData() throws InterruptedException {
        hdTreatmentPage.clickThreeDotsMenu();
        hdTreatmentPage.clickTreatmentHistoryButton();
    }

    @Then("I click remove the last registry of new observations")
    public void iClickRemoveTheLastRegistryOfNewObservations() {
        hdTreatmentPage.clickRemoveNewObservation();
    }

    @When("I click remove the actual treatment")
    public void iClickRemoveTheActualTreatment() throws InterruptedException {
        hdTreatmentPage.clickDeleteTreatment();
    }

    @And("I accept the delete Alert windows, fill the data and the reason {string}")
    public void iAcceptTheDeleteAlertWindowsFillTheDataAndTheReason(String reason) throws InterruptedException {
        hdTreatmentPage.removeAlertWithFillDataAndAccept(reason);
    }

    @Then("I check the data new observations is empty")
    public void iCheckTheDataNewObservationsIsEmpty() {
        hdTreatmentPage.isDisplayedUnverifiedText();
    }
}
