package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AdequacyPage;
import auto.framework.selenium.pages.baxter_page.HDPrescriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HDPrescriptionSteps {

    @LazyAutowired

    private HDPrescriptionPage HDPrescriptionPage;




    @And("I check the module HD Prescription appear correctly")
    public void iCheckTheModuleAdequacyAppearCorrectly() {
        HDPrescriptionPage.isDisplayedTheTittle();
    }

    @And("I check the information that in the field Prescribe by")
    public void iCheckTheInformationThatInTheFieldPrescribeBy() throws InterruptedException {
        HDPrescriptionPage.checkTheInformationThatInTheFieldPrescribeBy();
    }

    @When("I click add special order in HD Prescription")
    public void iClickAddSpecialOrderInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickAddSpecialOrder();
    }

    @When("I click edit special order in HD Prescription")
    public void iClickEditSpecialOrderInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickEditSpecialOrder();
    }

    @When("I click delete special order in HD Prescription")
    public void iClickDeleteSpecialOrderInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickDeleteSpecialOrder();
    }

    @When("I click prescription history in HD Prescription")
    public void iClickPrescriptionHistoryInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickPrescriptionHistory();
    }

    @And("I select prescription history date {string} in HD Prescription")
    public void iSelectPrescriptionHistoryDateInHDPrescription(String date) throws InterruptedException {
        HDPrescriptionPage.selectPrescriptionHistoryDate(date);
    }

    @And("I enter password {string} in delete prescription modal")
    public void iEnterPasswordInDeletePrescriptionModal(String password) throws InterruptedException {
        HDPrescriptionPage.enterPasswordInDeletePrescriptionModal(password);
    }

    @And("I enter reason {string} in delete prescription modal")
    public void iEnterReasonInDeletePrescriptionModal(String reason) throws InterruptedException {
        HDPrescriptionPage.enterReasonInDeletePrescriptionModal(reason);
    }

    @And("I click OK in delete prescription modal")
    public void iClickOkInDeletePrescriptionModal() throws InterruptedException {
        HDPrescriptionPage.clickOkInDeletePrescriptionModal();
    }

    @And("I click Cancel in delete prescription modal")
    public void iClickCancelInDeletePrescriptionModal() throws InterruptedException {
        HDPrescriptionPage.clickCancelInDeletePrescriptionModal();
    }

    @Then("I verify delete prescription error is displayed")
    public void iVerifyDeletePrescriptionErrorIsDisplayed() {
        HDPrescriptionPage.verifyDeletePrescriptionErrorIsDisplayed();
    }

    @And("I enter special order description {string} in HD Prescription")
    public void iEnterSpecialOrderDescriptionInHDPrescription(String description) throws InterruptedException {
        HDPrescriptionPage.enterSpecialOrderDescription(description);
    }

    @And("I clear special order description in HD Prescription")
    public void iClearSpecialOrderDescriptionInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clearSpecialOrderDescription();
    }

    @And("I enter special order start date {string} in HD Prescription")
    public void iEnterSpecialOrderStartDateInHDPrescription(String date) throws InterruptedException {
        HDPrescriptionPage.enterSpecialOrderStartDate(date);
    }

    @And("I enter special order end date {string} in HD Prescription")
    public void iEnterSpecialOrderEndDateInHDPrescription(String date) throws InterruptedException {
        HDPrescriptionPage.enterSpecialOrderEndDate(date);
    }

    @And("I click button {string} in special order")
    public void iClickButtonInSpecialOrder(String option) throws InterruptedException {
        if (option.equalsIgnoreCase("Save")) {
            HDPrescriptionPage.clickSaveSpecialOrder();
        } else if (option.equalsIgnoreCase("Cancel")) {
            HDPrescriptionPage.clickCancelSpecialOrder();
        }
    }

    @Then("I verify save special order button is not displayed in HD Prescription")
    public void iVerifySaveSpecialOrderButtonIsNotDisplayedInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.verifySaveSpecialOrderButtonIsNotDisplayed();
    }

    @And("I check the current prescription, it is in green and the closed ones are in blue")
    public void iCheckTheCurrentPrescriptionItIsInGreenAndTheClosedOnesAreInBlue() throws InterruptedException {
        HDPrescriptionPage.checkTheCurrentPrescriptionItIsInGreenAndTheClosedOnesAreInBlue();
    }

    @Then("I create a new simple prescription")
    public void iCreateANewSimplePrescription()throws InterruptedException {
        HDPrescriptionPage.createANewSimplePrescription();
    }

    @And("I check the bell symbol and its value increases by one")
    public void iCheckTheBellSymbolAndItsValueIncreasesByOne()throws InterruptedException {
        HDPrescriptionPage.checkTheBellSymbolAndItsValueIncreasesByOne();
    }

    @And("I configure the notification profile to generate it with new HD prescription")
    public void iConfigureTheNotificationProfileToGenerateItWithNewHDPrescription() throws InterruptedException {
        HDPrescriptionPage.configureTheNotificationProfileToGenerateItWithNewHDPrescription();
    }

    @And("I clean the notification profile settings to generate it with a new HD prescription")
    public void iCleanTheNotificationProfileSettingsToGenerateItWithANewHDPrescription()throws InterruptedException {
        HDPrescriptionPage.cleanTheNotificationProfileSettingsToGenerateItWithANewHDPrescription();
    }

    @And("I check the bell symbol and its value does not increase by one.")
    public void iCheckTheBellSymbolAndItsValueDoesNotIncreaseByOne() throws InterruptedException{
        HDPrescriptionPage.checkTheBellSymbolAndItsValueDoesNotIncreaseByOne();
    }

    @Then("I create a new modified simple prescription.")
    public void iCreateANewModifiedSimplePrescription()throws InterruptedException {
        HDPrescriptionPage.createANewModifiedSimplePrescription();
    }

    // ===================== GRANULAR STEPS =====================

    @When("I click new prescription in HD Prescription")
    public void iClickNewPrescriptionInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickNewPrescription();
    }

    @And("I select monitor {string} in HD Prescription")
    public void iSelectMonitorInHDPrescription(String monitor) throws InterruptedException {
        HDPrescriptionPage.selectMonitor(monitor);
    }

    @And("I click button {string} in HD Prescription")
    public void iClickButtonInHDPrescription(String option) throws InterruptedException {
        HDPrescriptionPage.clickMenuOption(option);
    }

    @And("I click button three points HD Prescription")
    public void iClickButtonThreePointsHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickThreePoints();
    }

    @Then("I verify see complication link is displayed in HD Prescription")
    public void iVerifyComplicationLinkIsDisplayedInHDPrescription() {
        HDPrescriptionPage.verifySeeComplicationLinkIsDisplayed();
    }

    @When("I click see complication link in HD Prescription")
    public void iClickSeeComplicationLinkInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickSeeComplicationLink();
    }

    @Then("I verify other infections link is displayed in HD Prescription")
    public void iVerifyOtherInfectionsLinkIsDisplayedInHDPrescription() {
        HDPrescriptionPage.verifyOtherInfectionsLinkIsDisplayed();
    }

    @When("I click other infections link in HD Prescription")
    public void iClickOtherInfectionsLinkInHDPrescription() throws InterruptedException {
        HDPrescriptionPage.clickOtherInfectionsLink();
    }

    @And("I select type of treatment {string} in HD Prescription")
    public void iSelectTypeOfTreatmentInHDPrescription(String type) throws InterruptedException {
        HDPrescriptionPage.selectTypeOfTreatment(type);
    }

    @And("I set hemocontrol {string} in HD Prescription")
    public void iSetHemocontrolInHDPrescription(String state) throws InterruptedException {
        HDPrescriptionPage.setHemocontrol(state);
    }

    @And("I enter ratio {string} in HD Prescription")
    public void iEnterRatioInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterRatio(value);
    }

    @And("I enter height {string} in HD Prescription")
    public void iEnterHeightInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterHeight(value);
    }

    @And("I enter perfusion volume {string} in HD Prescription")
    public void iEnterPerfusionVolumeInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterPerfusionVolume(value);
    }

    @And("I enter K constant {string} in HD Prescription")
    public void iEnterKConstantInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterKConstant(value);
    }

    @And("I enter K input {string} in HD Prescription")
    public void iEnterKInputInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterKInput(value);
    }

    @And("I enter K output {string} in HD Prescription")
    public void iEnterKOutputInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterKOutput(value);
    }

    @And("I enter K equivalent {string} in HD Prescription")
    public void iEnterKEquivalentInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterKEquivalent(value);
    }

    @And("I enter infusion volume {string} in HD Prescription")
    public void iEnterInfusionVolumeInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterInfusionVolume(value);
    }

    @And("I select dilution {string} in HD Prescription")
    public void iSelectDilutionInHDPrescription(String dilution) throws InterruptedException {
        HDPrescriptionPage.selectDilution(dilution);
    }

    @And("I enter PTM {string} in HD Prescription")
    public void iEnterPTMInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterPTM(value);
    }

    @And("I enter needle volume {string} in HD Prescription")
    public void iEnterNeedleVolumeInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterNeedleVolume(value);
    }

    @And("I enter AV pump ratio {string} in HD Prescription")
    public void iEnterAVPumpRatioInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterAVPumpRatio(value);
    }

    @And("I enter tidal {string} in HD Prescription")
    public void iEnterTidalInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterTidal(value);
    }

    @And("I select anticoagulant type {string} in HD Prescription")
    public void iSelectAnticoagulantTypeInHDPrescription(String type) throws InterruptedException {
        HDPrescriptionPage.selectAnticoagulantType(type);
    }

    @And("I enter initial bolus {string} in HD Prescription")
    public void iEnterInitialBolusInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterBolus(value);
    }

    @And("I enter continuous infusion {string} in HD Prescription")
    public void iEnterContinuousInfusionInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterContinuousInfusion(value);
    }

    @And("I enter disconnection time {string} in HD Prescription")
    public void iEnterDisconnectionTimeInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterDisconnectionTime(value);
    }

    @And("I enter blood flow rate {string} in HD Prescription")
    public void iEnterBloodFlowRateInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterBloodFlowRate(value);
    }

    @And("I enter maximum UF {string} in HD Prescription")
    public void iEnterMaximumUFInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterMaximumUF(value);
    }

    @And("I enter maximum UF rate {string} in HD Prescription")
    public void iEnterMaximumUFRateInHDPrescription(String value) throws InterruptedException {
        HDPrescriptionPage.enterMaximumUFRate(value);
    }

    @And("I select dialyzer {string} in HD Prescription")
    public void iSelectDialyzerInHDPrescription(String dialyzer) throws InterruptedException {
        HDPrescriptionPage.selectDialyzer(dialyzer);
    }
}
