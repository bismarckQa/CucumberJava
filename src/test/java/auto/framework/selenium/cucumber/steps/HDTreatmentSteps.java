package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDTreatmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
    public void iClickButtonInHDTreatment(String option) throws InterruptedException {
        if ("New treatment".equalsIgnoreCase(option)) {
            hdTreatmentPage.clickTreatmentButton();
            return;
        }
        if ("Save".equalsIgnoreCase(option)) {
            hdTreatmentPage.clickSaveMenuOption();
            return;
        }
        if ("Cancel".equalsIgnoreCase(option)) {
            hdTreatmentPage.clickCancelMenuOption();
            return;
        }
        if ("Reopen treatment".equalsIgnoreCase(option)) {
            hdTreatmentPage.clickReopenTreatmentMenuOption();
            return;
        }
        if ("Delete".equalsIgnoreCase(option)) {
            hdTreatmentPage.clickDeleteMenuOption();
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

    @Then("I verify required fields signature warning is displayed in HD Treatment")
    public void iVerifyRequiredFieldsSignatureWarningIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyRequiredFieldsSignatureWarningIsDisplayed();
    }

    @And("I click OK in required fields signature warning in HD Treatment")
    public void iClickOkInRequiredFieldsSignatureWarningInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickOkRequiredFieldsSignatureWarning();
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


    @And("I select arterial needle size {string} in HD Treatment access data")
    public void iSelectArterialNeedleSizeInHDTreatmentAccessData(String needleSize) throws InterruptedException {
        hdTreatmentPage.selectArterialNeedleSizeInAccessData(needleSize);
    }

    @And("I select venous needle size {string} in HD Treatment access data")
    public void iSelectVenousNeedleSizeInHDTreatmentAccessData(String needleSize) throws InterruptedException {
        hdTreatmentPage.selectVenousNeedleSizeInAccessData(needleSize);
    }

    @And("I select the first access in HD Treatment access data")
    public void iSelectTheFirstAccessInHDTreatmentAccessData() throws InterruptedException {
        hdTreatmentPage.selectFirstAccessInAccessData();
    }

    @And("I select acid bath 1 {string} in HD Treatment fluids")
    public void iSelectAcidBath1InHDTreatmentFluids(String acidBath) throws InterruptedException {
        hdTreatmentPage.selectAcidBath1InFluids(acidBath);
    }

    @And("I select acid bath 2 {string} in HD Treatment fluids")
    public void iSelectAcidBath2InHDTreatmentFluids(String acidBath) throws InterruptedException {
        hdTreatmentPage.selectAcidBath2InFluids(acidBath);
    }

    @And("I click add other consumables in HD Treatment")
    public void iClickAddOtherConsumablesInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickAddOtherConsumables();
    }

    @Then("I verify other consumables modal is displayed in HD Treatment")
    public void iVerifyOtherConsumablesModalIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyOtherConsumablesModalIsDisplayed();
    }

    @And("I select other consumables name {string} in HD Treatment")
    public void iSelectOtherConsumablesNameInHDTreatment(String name) throws InterruptedException {
        hdTreatmentPage.selectOtherConsumablesName(name);
    }

    @And("I enter other consumables lot number {string} in HD Treatment")
    public void iEnterOtherConsumablesLotNumberInHDTreatment(String lotNumber) throws InterruptedException {
        hdTreatmentPage.enterOtherConsumablesLotNumber(lotNumber);
    }

    @And("I enter other consumables expiry date {string} in HD Treatment")
    public void iEnterOtherConsumablesExpiryDateInHDTreatment(String expiryDate) throws InterruptedException {
        hdTreatmentPage.enterOtherConsumablesExpiryDate(expiryDate);
    }

    @And("I click button {string} in other consumables modal in HD Treatment")
    public void iClickButtonInOtherConsumablesModalInHDTreatment(String button) throws InterruptedException {
        hdTreatmentPage.clickOtherConsumablesModalButton(button);
    }

    @When("I click edit other consumables {string} in HD Treatment")
    public void iClickEditOtherConsumablesInHDTreatment(String name) throws InterruptedException {
        hdTreatmentPage.clickEditOtherConsumablesByName(name);
    }

    @When("I click delete other consumables {string} in HD Treatment")
    public void iClickDeleteOtherConsumablesInHDTreatment(String name) throws InterruptedException {
        hdTreatmentPage.clickDeleteOtherConsumablesByName(name);
    }

    @Then("I verify other consumables row {string} is displayed in HD Treatment")
    public void iVerifyOtherConsumablesRowIsDisplayedInHDTreatment(String name) throws InterruptedException {
        hdTreatmentPage.verifyOtherConsumablesRowIsDisplayed(name);
    }

    @Then("I verify other consumables row {string} is not displayed in HD Treatment")
    public void iVerifyOtherConsumablesRowIsNotDisplayedInHDTreatment(String name) throws InterruptedException {
        hdTreatmentPage.verifyOtherConsumablesRowIsNotDisplayed(name);
    }

    @And("I enter notes {string} in HD Treatment final signature")
    public void iEnterNotesInHDTreatmentFinalSignature(String notes) throws InterruptedException {
        hdTreatmentPage.enterNotesInFinalSignature(notes);
    }

    @And("I set finalized checkbox to {string} in HD Treatment final signature")
    public void iSetFinalizedCheckboxToInHDTreatmentFinalSignature(String state) throws InterruptedException {
        hdTreatmentPage.setFinalizedCheckboxState(state);
    }

    @Then("I verify finalized checkbox is {string} in HD Treatment final signature")
    public void iVerifyFinalizedCheckboxIsInHDTreatmentFinalSignature(String state)throws InterruptedException {
        hdTreatmentPage.verifyFinalizedCheckboxState(state);
    }

    @And("I fill reason for value changed modal {string} and click {string} in HD Treatment")
    public void iFillReasonForValueChangedModalAndClickInHDTreatment(String reason, String button) throws InterruptedException {
        hdTreatmentPage.fillValueChangedReasonAndChooseButton(reason, button);
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
        if ("Extractions".equalsIgnoreCase(section)) {
            hdTreatmentPage.clickExtractionsTabButton();
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

    @And("I fill traceability consumable row {string} with lot number {string} and expiry date {string} in HD Treatment")
    public void iFillTraceabilityConsumableRowWithLotNumberAndExpiryDateInHDTreatment(String rowName, String lotNumber, String expiryDate) throws InterruptedException {
        hdTreatmentPage.fillTraceabilityConsumableRow(rowName, lotNumber, expiryDate);
    }

    @And("I click button arrow up in HD Treatment")
    public void iClickButtonArrowUpInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickTopArrowInHDTreatment();
    }

    @And("I click top action button {string} in HD Treatment")
    public void iClickTopActionButtonInHDTreatment(String action) throws InterruptedException {
        hdTreatmentPage.clickTopActionInHDTreatment(action);
    }

    @Then("I verify Action modal is displayed in HD Treatment")
    public void iVerifyActionModalIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyActionModalIsDisplayedInHDTreatment();
    }

    @And("I click button {string} in Action modal in HD Treatment")
    public void iClickButtonInActionModalInHDTreatment(String button) throws InterruptedException {
        hdTreatmentPage.clickButtonInActionModalInHDTreatment(button);
    }

    @And("I click Treatment history in HD Treatment")
    public void iClickTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickTreatmentHistoryBreadcrumb();
    }


    @And("I select treatment history date {string} in HD Treatment")
    public void iSelectTreatmentHistoryDateInHDTreatment(String date) throws InterruptedException {
        hdTreatmentPage.clickTreatmentHistoryDate(date);
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

    @And("I enter SBP {string} in HD Treatment session reading")
    public void iEnterSBPInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeSBP(value);
    }

    @And("I enter DBP {string} in HD Treatment session reading")
    public void iEnterDBPInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeDBP(value);
    }

    @And("I enter HR {string} in HD Treatment session reading")
    public void iEnterHRInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeHR(value);
    }

    @And("I enter blood flow rate {string} in HD Treatment session reading")
    public void iEnterBloodFlowRateInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeBloodFlowRate(value);
    }

    @And("I enter arterial pressure {string} in HD Treatment session reading")
    public void iEnterArterialPressureInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeArterialPressureReading(value);
    }

    @And("I enter venous pressure {string} in HD Treatment session reading")
    public void iEnterVenousPressureInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeVenousPressureReading(value);
    }

    @And("I enter TMP {string} in HD Treatment session reading")
    public void iEnterTMPInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeTMP(value);
    }

    @And("I enter cond plasma {string} in HD Treatment session reading")
    public void iEnterCondPlasmaInHDTreatmentSessionReading(String value) throws InterruptedException {
        hdTreatmentPage.writeCondPlasmaReading(value);
    }

    @Then("I verify session inputs are disabled in HD Treatment")
    public void iVerifySessionInputsAreDisabledInHDTreatment()throws InterruptedException {
        assertTrue(hdTreatmentPage.isSessionPreInputsDisabledInHDTreatment());
    }

    @Then("I verify new reading button is not available in HD Treatment session")
    public void iVerifyNewReadingButtonIsNotAvailableInHDTreatmentSession() {
        assertTrue(hdTreatmentPage.isNewReadingButtonNotAvailableInSession());
    }

    @Then("I verify reading row is saved in HD Treatment session")
    public void iVerifyReadingRowIsSavedInHDTreatmentSession() {
        assertTrue(hdTreatmentPage.isReadingRowSavedInSession());
    }

    @Then("I verify reading row is not saved in HD Treatment session")
    public void iVerifyReadingRowIsNotSavedInHDTreatmentSession() {
        assertTrue(hdTreatmentPage.isReadingRowNotSavedInSession());
    }

    @And("I cancel the new observation")
    public void iCancelTheNewObservation() {
        hdTreatmentPage.clickRemoveNewObservation();
    }

    @And("I scroll to session readings in HD Treatment")
    public void iScrollToSessionReadingsInHDTreatment() throws InterruptedException {
        hdTreatmentPage.scrollToSessionReadingsInHDTreatment();
    }

    @And("I enter password {string} in delete modal in HD Treatment")
    public void iEnterPasswordInDeleteModalInHDTreatment(String password) throws InterruptedException {
        hdTreatmentPage.enterPasswordInDeleteModal(password);
    }

    @And("I enter reason {string} in delete modal in HD Treatment")
    public void iEnterReasonInDeleteModalInHDTreatment(String reason) throws InterruptedException {
        hdTreatmentPage.enterReasonInDeleteModal(reason);
    }

    @And("I click cancel in delete modal in HD Treatment")
    public void iClickCancelInDeleteModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickCancelInDeleteModal();
    }

    @And("I click accept in delete modal in HD Treatment")
    public void iClickAcceptInDeleteModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickAcceptInDeleteModal();
    }

    @Then("I verify delete error message is displayed in HD Treatment")
    public void iVerifyDeleteErrorMessageIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyDeleteErrorMessageIsDisplayed();
    }

    @When("I click delete reading row in HD Treatment session")
    public void iClickDeleteReadingRowInHDTreatmentSession() throws InterruptedException {
        hdTreatmentPage.clickDeleteReadingRow();
    }

    @When("I click edit reading row in HD Treatment session")
    public void iClickEditReadingRowInHDTreatmentSession() throws InterruptedException {
        hdTreatmentPage.clickEditReadingRow();
    }

    @When("I drag administered medication to bin in HD Treatment")
    public void iDragAdministeredMedicationToBinInHDTreatment() throws InterruptedException {
        hdTreatmentPage.dragAdministeredMedicationToBin();
    }

    @Then("I verify administered medication is removed in HD Treatment")
    public void iVerifyAdministeredMedicationIsRemovedInHDTreatment() {
        assertTrue(hdTreatmentPage.isAdministeredMedicationRemoved());
    }

    @And("I drag prescribed medication to administered in HD Treatment")
    public void iDragPrescribedMedicationToAdministeredInHDTreatment() throws InterruptedException {
        hdTreatmentPage.dragPrescribedMedicationToAdministered();
    }

    @Then("I verify administer medication modal is displayed in HD Treatment")
    public void iVerifyAdministerMedicationModalIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyAdministerMedicationModalIsDisplayed();
    }

    @And("I check confirm lab results checkbox in administer medication modal in HD Treatment")
    public void iCheckConfirmLabResultsCheckboxInHDTreatment() throws InterruptedException {
        hdTreatmentPage.checkConfirmLabResultsInModal();
    }

    @And("I click add button in administer medication modal in HD Treatment")
    public void iClickAddButtonInAdministerMedicationModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickAddInAdministerMedicationModal();
    }

    @And("I click cancel button in administer medication modal in HD Treatment")
    public void iClickCancelButtonInAdministerMedicationModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickCancelInAdministerMedicationModal();
    }

    @Then("I verify prescribed medication block is displayed in HD Treatment")
    public void iVerifyPrescribedMedicationBlockIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyPrescribedBlockIsDisplayed();
    }

    @Then("I verify administered medication block is displayed in HD Treatment")
    public void iVerifyAdministeredMedicationBlockIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyAdministeredBlockIsDisplayed();
    }

    // Perfusion/Blood product steps
    @When("I drag prescribed perfusion to administered in HD Treatment")
    public void iDragPrescribedPerfusionToAdministeredInHDTreatment() throws InterruptedException {
        hdTreatmentPage.dragPrescribedPerfusionToAdministered();
    }

    @Then("I verify perfusion modal is displayed in HD Treatment")
    public void iVerifyPerfusionModalIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyPerfusionModalIsDisplayed();
    }

    @And("I enter quantity {string} in perfusion modal in HD Treatment")
    public void iEnterQuantityInPerfusionModalInHDTreatment(String quantity) throws InterruptedException {
        hdTreatmentPage.enterQuantityInPerfusionModal(quantity);
    }

    @And("I enter expiry date {string} in perfusion modal in HD Treatment")
    public void iEnterExpiryDateInPerfusionModalInHDTreatment(String date) throws InterruptedException {
        hdTreatmentPage.enterExpiryDateInPerfusionModal(date);
    }

    @And("I enter code {string} in perfusion modal in HD Treatment")
    public void iEnterCodeInPerfusionModalInHDTreatment(String code) throws InterruptedException {
        hdTreatmentPage.enterCodeInPerfusionModal(code);
    }

    @And("I enter comments {string} in perfusion modal in HD Treatment")
    public void iEnterCommentsInPerfusionModalInHDTreatment(String comments) throws InterruptedException {
        hdTreatmentPage.enterCommentsInPerfusionModal(comments);
    }

    @And("I click add button in perfusion modal in HD Treatment")
    public void iClickAddButtonInPerfusionModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickAddInPerfusionModal();
    }

    @And("I click cancel button in perfusion modal in HD Treatment")
    public void iClickCancelButtonInPerfusionModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickCancelInPerfusionModal();
    }

    @Then("I verify add button is disabled in perfusion modal in HD Treatment")
    public void iVerifyAddButtonIsDisabledInPerfusionModalInHDTreatment() {
        hdTreatmentPage.verifyAddButtonDisabledInPerfusionModal();
    }

    @Then("I verify perfusion block is read only in HD Treatment")
    public void iVerifyPerfusionBlockIsReadOnlyInHDTreatment() throws InterruptedException {
        hdTreatmentPage.verifyPerfusionBlockIsReadOnly();
    }

    @Then("I verify administered perfusion is displayed in HD Treatment")
    public void iVerifyAdministeredPerfusionIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyAdministeredPerfusionIsDisplayed();
    }

    @Then("I verify administered perfusion is not displayed in HD Treatment")
    public void iVerifyAdministeredPerfusionIsNotDisplayedInHDTreatment() {
        hdTreatmentPage.verifyAdministeredPerfusionIsNotDisplayed();
    }

    @When("I drag administered perfusion to bin in HD Treatment")
    public void iDragAdministeredPerfusionToBinInHDTreatment() throws InterruptedException {
        hdTreatmentPage.dragAdministeredPerfusionToBin();
    }

    // PRE section steps
    @And("I enter weight pre {string} in HD Treatment session")
    public void iEnterWeightPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterWeightPreInSession(value);
    }

    @And("I enter systolic BP pre {string} in HD Treatment session")
    public void iEnterSystolicBpPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterSystolicBpPreInSession(value);
    }

    @And("I enter diastolic BP pre {string} in HD Treatment session")
    public void iEnterDiastolicBpPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterDiastolicBpPreInSession(value);
    }

    @And("I enter pulse pre {string} in HD Treatment session")
    public void iEnterPulsePreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterPulsePreInSession(value);
    }

    @And("I enter temperature pre {string} in HD Treatment session")
    public void iEnterTemperaturePreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterTemperaturePreInSession(value);
    }

    @And("I enter glycemia pre {string} in HD Treatment session")
    public void iEnterGlycemiaPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterGlycemiaPreInSession(value);
    }

    @And("I enter programmed loss pre {string} in HD Treatment session")
    public void iEnterProgrammedLossPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterProgrammedLossPreInSession(value);
    }

    @And("I enter hematocrit pre {string} in HD Treatment session")
    public void iEnterHematocritPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterHematocritPreInSession(value);
    }

    @And("I enter BCM-OH pre {string} in HD Treatment session")
    public void iEnterBcmOhPreInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterBcmOhPreInSession(value);
    }

    // POST section steps
    @And("I enter fluid intake post {string} in HD Treatment session")
    public void iEnterFluidIntakePostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterFluidIntakePostInSession(value);
    }

    @And("I enter weight post {string} in HD Treatment session")
    public void iEnterWeightPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterWeightPostInSession(value);
    }

    @And("I enter systolic BP post {string} in HD Treatment session")
    public void iEnterSystolicBpPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterSystolicBpPostInSession(value);
    }

    @And("I enter diastolic BP post {string} in HD Treatment session")
    public void iEnterDiastolicBpPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterDiastolicBpPostInSession(value);
    }

    @And("I enter pulse post {string} in HD Treatment session")
    public void iEnterPulsePostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterPulsePostInSession(value);
    }

    @And("I enter temperature post {string} in HD Treatment session")
    public void iEnterTemperaturePostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterTemperaturePostInSession(value);
    }

    @And("I enter glycemia post {string} in HD Treatment session")
    public void iEnterGlycemiaPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterGlycemiaPostInSession(value);
    }

    @And("I enter real loss post {string} in HD Treatment session")
    public void iEnterRealLossPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterRealLossPostInSession(value);
    }

    @And("I enter hematocrit post {string} in HD Treatment session")
    public void iEnterHematocritPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterHematocritPostInSession(value);
    }

    @And("I enter blood remains post {string} in HD Treatment session")
    public void iEnterBloodRemainsPostInHDTreatmentSession(String value) throws InterruptedException {
        hdTreatmentPage.enterBloodRemainsPostInSession(value);
    }

    // Session readings view steps
    @When("I click show graph toggle in HD Treatment session")
    public void iClickShowGraphToggleInHDTreatmentSession() throws InterruptedException {
        hdTreatmentPage.clickShowGraphToggle();
    }

    @Then("I verify graph view is displayed in HD Treatment session")
    public void iVerifyGraphViewIsDisplayedInHDTreatmentSession() {
        hdTreatmentPage.verifyGraphViewIsDisplayed();
    }

    @When("I click select all variables in HD Treatment session graph")
    public void iClickSelectAllVariablesInHDTreatmentSessionGraph() throws InterruptedException {
        hdTreatmentPage.clickSelectAllVariablesInGraph();
    }

    @Then("I verify session chart is visible in HD Treatment")
    public void iVerifySessionChartIsVisibleInHDTreatment() {
        hdTreatmentPage.verifySessionChartIsVisible();
    }



    // Treatment History popup steps
    @And("I click Treatment history option in HD Treatment")
    public void iClickTreatmentHistoryOptionInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickTreatmentHistoryOption();
    }

    @Then("I verify treatment history popup is displayed in HD Treatment")
    public void iVerifyTreatmentHistoryPopupIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyTreatmentHistoryPopupIsDisplayed();
    }

    @Then("I verify treatment history filters are displayed in HD Treatment")
    public void iVerifyTreatmentHistoryFiltersAreDisplayedInHDTreatment() {
        hdTreatmentPage.verifyTreatmentHistoryFiltersAreDisplayed();
    }

    @Then("I verify treatment history grid is displayed in HD Treatment")
    public void iVerifyTreatmentHistoryGridIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyTreatmentHistoryGridIsDisplayed();
    }

    @When("I click graph button in treatment history in HD Treatment")
    public void iClickGraphButtonInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickGraphButtonInTreatmentHistory();
    }

    @Then("I verify treatment history graph view is displayed in HD Treatment")
    public void iVerifyTreatmentHistoryGraphViewIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyTreatmentHistoryGraphViewIsDisplayed();
    }

    @And("I click group charts checkbox in treatment history in HD Treatment")
    public void iClickGroupChartsCheckboxInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickGroupChartsCheckboxInTreatmentHistory();
    }

    @When("I click columns button in treatment history in HD Treatment")
    public void iClickColumnsButtonInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickColumnsButtonInTreatmentHistory();
    }

    @Then("I verify columns configuration is displayed in HD Treatment")
    public void iVerifyColumnsConfigurationIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyColumnsConfigurationIsDisplayed();
    }

    @And("I click back button in treatment history columns in HD Treatment")
    public void iClickBackButtonInTreatmentHistoryColumnsInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickBackButtonInTreatmentHistoryColumns();
    }

    @When("I click export button in treatment history in HD Treatment")
    public void iClickExportButtonInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickExportButtonInTreatmentHistory();
    }

    @And("I click close button in treatment history in HD Treatment")
    public void iClickCloseButtonInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickCloseButtonInTreatmentHistory();
    }

    @And("I click select all variables in treatment history in HD Treatment")
    public void iClickSelectAllVariablesInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickSelectAllVariablesInTreatmentHistory();
    }

    @When("I select last filter in treatment history in HD Treatment")
    public void iSelectLastFilterInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.selectLastFilterInTreatmentHistory();
    }

    @And("I select {string} in last filter combo in treatment history in HD Treatment")
    public void iSelectInLastFilterComboInTreatmentHistoryInHDTreatment(String option) throws InterruptedException {
        hdTreatmentPage.selectLastFilterComboOption(option);
    }

    @And("I check see treatments in columns in treatment history in HD Treatment")
    public void iCheckSeeTreatmentsInColumnsInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.checkSeeTreatmentsInColumns();
    }

    @And("I check see minimum maximum in treatment history in HD Treatment")
    public void iCheckSeeMinimumMaximumInTreatmentHistoryInHDTreatment() throws InterruptedException {
        hdTreatmentPage.checkSeeMinimumMaximum();
    }

    // Final Signature & Additional Signature steps
    @Then("I verify final signature block is read only in HD Treatment")
    public void iVerifyFinalSignatureBlockIsReadOnlyInHDTreatment() {
        hdTreatmentPage.verifyFinalSignatureBlockIsReadOnly();
    }


    @When("I select nephrologist in HD Treatment final signature")
    public void iSelectNephrologistInHDTreatmentFinalSignature() throws InterruptedException {
        hdTreatmentPage.selectNephrologist();
    }

    @And("I check finalized checkbox in HD Treatment final signature")
    public void iCheckFinalizedCheckboxInHDTreatmentFinalSignature() throws InterruptedException {
        hdTreatmentPage.checkFinalizedCheckbox();
    }

    @When("I click shift button in HD Treatment final signature")
    public void iClickShiftButtonInHDTreatmentFinalSignature() throws InterruptedException {
        hdTreatmentPage.clickShiftButton();
    }

    @Then("I verify additional signature is displayed in HD Treatment")
    public void iVerifyAdditionalSignatureIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyAdditionalSignatureIsDisplayed();
    }

    @Then("I verify additional signature is not created in HD Treatment")
    public void iVerifyAdditionalSignatureIsNotCreatedInHDTreatment() {
        hdTreatmentPage.verifyAdditionalSignatureIsNotCreated();
    }

    @When("I click edit additional signature in HD Treatment")
    public void iClickEditAdditionalSignatureInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickEditAdditionalSignature();
    }

    @When("I click delete additional signature in HD Treatment")
    public void iClickDeleteAdditionalSignatureInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickDeleteAdditionalSignature();
    }

    @Then("I verify additional signature modal is displayed in HD Treatment")
    public void iVerifyAdditionalSignatureModalIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyAdditionalSignatureModalIsDisplayed();
    }

    @And("I enter notes {string} in additional signature modal in HD Treatment")
    public void iEnterNotesInAdditionalSignatureModalInHDTreatment(String notes) throws InterruptedException {
        hdTreatmentPage.enterNotesInAdditionalSignatureModal(notes);
    }

    @And("I click save in additional signature modal in HD Treatment")
    public void iClickSaveInAdditionalSignatureModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickSaveInAdditionalSignatureModal();
    }

    @And("I click cancel in additional signature modal in HD Treatment")
    public void iClickCancelInAdditionalSignatureModalInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickCancelInAdditionalSignatureModal();
    }

    // Extraction steps

    @And("I click extractions three points menu in HD Treatment")
    public void iClickExtractionsThreePointsMenuInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickExtractionsThreePointsMenu();
    }

    @And("I click show extraction in HD Treatment")
    public void iClickShowExtractionInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickShowExtraction();
    }

    @Then("I verify extraction is displayed in HD Treatment")
    public void iVerifyExtractionIsDisplayedInHDTreatment() {
        hdTreatmentPage.verifyExtractionIsDisplayed();
    }

    @And("I verify edit extraction button is available in HD Treatment")
    public void iVerifyEditExtractionButtonIsAvailableInHDTreatment() {
        hdTreatmentPage.verifyEditExtractionButtonIsAvailable();
    }

    @Then("I verify extraction is read only in HD Treatment")
    public void iVerifyExtractionIsReadOnlyInHDTreatment() {
        hdTreatmentPage.verifyExtractionIsReadOnly();
    }

    @When("I click edit extraction in HD Treatment")
    public void iClickEditExtractionInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickEditExtraction();
    }

    @And("I enter extraction date {string} in HD Treatment")
    public void iEnterExtractionDateInHDTreatment(String date) throws InterruptedException {
        hdTreatmentPage.enterExtractionDate(date);
    }

    @And("I enter sample code {string} in HD Treatment")
    public void iEnterSampleCodeInHDTreatment(String code) throws InterruptedException {
        hdTreatmentPage.enterSampleCode(code);
    }

    @And("I enter observations {string} in HD Treatment extraction")
    public void iEnterObservationsInHDTreatmentExtraction(String observations) throws InterruptedException {
        hdTreatmentPage.enterExtractionObservations(observations);
    }

    @And("I click save extraction in HD Treatment")
    public void iClickSaveExtractionInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickSaveExtraction();
    }

    @And("I click cancel extraction in HD Treatment")
    public void iClickCancelExtractionInHDTreatment() throws InterruptedException {
        hdTreatmentPage.clickCancelExtraction();
    }
}