package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.InfectionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InfectionsSteps {

    @LazyAutowired
    private InfectionsPage infectionsPage;

    @When("I check the module Infections appear correctly")
    public void iCheckTheModuleInfectionsAppearCorrectly() {
        infectionsPage.isDisplayedTheTittle();
    }

    @When("I click the three points menu in infections")
    public void iClickTheThreePointsMenuInInfections() throws InterruptedException {
        infectionsPage.clickThreePointsMenuInInfections();
    }

    @And("I click new infection option in infections menu")
    public void iClickNewInfectionOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickNewInfectionOptionInInfectionsMenu();
    }

    @And("I click save option in infections menu")
    public void iClickSaveOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickSaveOptionInInfectionsMenu();
    }

    @And("I click cancel option in infections menu")
    public void iClickCancelOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickCancelOptionInInfectionsMenu();
    }

    @And("I click assign signs symptoms option in infections menu")
    public void iClickAssignSignsSymptomsOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickAssignSignsSymptomsOptionInInfectionsMenu();
    }

    @Then("I verify new infection form is displayed")
    public void iVerifyNewInfectionFormIsDisplayed() {
        assertTrue(infectionsPage.isNewInfectionFormDisplayed());
    }

    @Then("I verify new infection form is closed")
    public void iVerifyNewInfectionFormIsClosed() {
        assertTrue(infectionsPage.isNewInfectionFormClosed());
    }

    @And("I click edit option in infections menu")
    public void iClickEditOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickEditOptionInInfectionsMenu();
    }

    @And("I click edit all option in infections menu")
    public void iClickEditAllOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickEditAllOptionInInfectionsMenu();
    }

    @And("I click delete option in infections menu")
    public void iClickDeleteOptionInInfectionsMenu() throws InterruptedException {
        infectionsPage.clickDeleteOptionInInfectionsMenu();
    }

    @Then("I verify delete infection modal is displayed")
    public void iVerifyDeleteInfectionModalIsDisplayed() {
        assertTrue(infectionsPage.isDeleteInfectionModalDisplayed());
    }

    @Then("I verify delete infection modal is closed")
    public void iVerifyDeleteInfectionModalIsClosed() {
        assertTrue(infectionsPage.isDeleteInfectionModalClosed());
    }

    @And("I enter password {string} in delete infection modal")
    public void iEnterPasswordInDeleteInfectionModal(String password) throws InterruptedException {
        infectionsPage.enterPasswordInDeleteInfectionModal(password);
    }

    @And("I enter reason {string} in delete infection modal")
    public void iEnterReasonInDeleteInfectionModal(String reason) throws InterruptedException {
        infectionsPage.enterReasonInDeleteInfectionModal(reason);
    }

    @And("I click OK button in delete infection modal")
    public void iClickOkButtonInDeleteInfectionModal() throws InterruptedException {
        infectionsPage.clickOkButtonInDeleteInfectionModal();
    }

    @And("I click cancel button in delete infection modal")
    public void iClickCancelButtonInDeleteInfectionModal() throws InterruptedException {
        infectionsPage.clickCancelButtonInDeleteInfectionModal();
    }

    @And("I enter presentation date {string} in infection form")
    public void iEnterPresentationDateInInfectionForm(String presentationDate) throws InterruptedException {
        infectionsPage.enterPresentationDateInInfectionForm(presentationDate);
    }

    @And("I enter resolution date {string} in infection form")
    public void iEnterResolutionDateInInfectionForm(String resolutionDate) throws InterruptedException {
        infectionsPage.enterResolutionDateInInfectionForm(resolutionDate);
    }

    @And("I select infection type {string} in infection form")
    public void iSelectInfectionTypeInInfectionForm(String infectionType) throws InterruptedException {
        infectionsPage.selectInfectionTypeInInfectionForm(infectionType);
    }

    @And("I select treatment location {string} in infection form")
    public void iSelectTreatmentLocationInInfectionForm(String treatmentLocation) throws InterruptedException {
        infectionsPage.selectTreatmentLocationInInfectionForm(treatmentLocation);
    }

    @And("I select evaluation {string} in infection form")
    public void iSelectEvaluationInInfectionForm(String evaluation) throws InterruptedException {
        infectionsPage.selectEvaluationInInfectionForm(evaluation);
    }

    @And("I enter observations {string} in infection form")
    public void iEnterObservationsInInfectionForm(String observations) throws InterruptedException {
        infectionsPage.enterObservationsInInfectionForm(observations);
    }

    @Then("I verify infection required fields validation is displayed")
    public void iVerifyInfectionRequiredFieldsValidationIsDisplayed() {
        assertTrue(infectionsPage.isInfectionRequiredFieldsValidationDisplayed());
    }

    @Then("I verify infection date validation is displayed")
    public void iVerifyInfectionDateValidationIsDisplayed() {
        assertTrue(infectionsPage.isInfectionDateValidationDisplayed());
    }

    @Then("I verify save option is not displayed in infections menu")
    public void iVerifySaveOptionIsNotDisplayedInInfectionsMenu() {
        assertTrue(infectionsPage.isSaveOptionInInfectionsMenuNotDisplayed());
    }

    @When("I click the three points menu in cultures")
    public void iClickTheThreePointsMenuInCultures() throws InterruptedException {
        infectionsPage.clickThreePointsMenuInCultures();
    }

    @And("I click new culture option in cultures menu")
    public void iClickNewCultureOptionInCulturesMenu() throws InterruptedException {
        infectionsPage.clickNewCultureOptionInCulturesMenu();
    }

    @And("I click edit culture option in cultures menu")
    public void iClickEditCultureOptionInCulturesMenu() throws InterruptedException {
        infectionsPage.clickEditCultureOptionInCulturesMenu();
    }

    @And("I click delete culture option in cultures menu")
    public void iClickDeleteCultureOptionInCulturesMenu() throws InterruptedException {
        infectionsPage.clickDeleteCultureOptionInCulturesMenu();
    }

    @And("I enter culture date {string} in culture form")
    public void iEnterCultureDateInCultureForm(String cultureDate) throws InterruptedException {
        infectionsPage.enterCultureDateInCultureForm(cultureDate);
    }

    @And("I select laboratory {string} in culture form")
    public void iSelectLaboratoryInCultureForm(String laboratory) throws InterruptedException {
        infectionsPage.selectLaboratoryInCultureForm(laboratory);
    }

    @And("I select culture type {string} in culture form")
    public void iSelectCultureTypeInCultureForm(String cultureType) throws InterruptedException {
        infectionsPage.selectCultureTypeInCultureForm(cultureType);
    }

    @And("I select result {string} in culture form")
    public void iSelectResultInCultureForm(String result) throws InterruptedException {
        infectionsPage.selectResultInCultureForm(result);
    }

    @And("I select sample method {string} in culture form")
    public void iSelectSampleMethodInCultureForm(String sampleMethod) throws InterruptedException {
        infectionsPage.selectSampleMethodInCultureForm(sampleMethod);
    }

    @And("I enter comments {string} in culture form")
    public void iEnterCommentsInCultureForm(String comments) throws InterruptedException {
        infectionsPage.enterCommentsInCultureForm(comments);
    }

    @Then("I click save option in cultures menu")
    public void iClickSaveOptionInCulturesMenu() throws InterruptedException {
        infectionsPage.clickSaveOptionInCulturesMenu();
    }

    @Then("I click cancel option in cultures menu")
    public void iClickCancelOptionInCulturesMenu() throws InterruptedException {
        infectionsPage.clickCancelOptionInCulturesMenu();
    }

    @Then("I verify save option is not displayed in cultures menu")
    public void iVerifySaveOptionIsNotDisplayedInCulturesMenu() {
        assertTrue(infectionsPage.isSaveOptionInCulturesMenuNotDisplayed());
    }

    @Then("I verify cultures panel is displayed")
    public void iVerifyCulturesPanelIsDisplayed() {
        assertTrue(infectionsPage.isCulturesPanelDisplayed());
    }

    @And("I click page {string} in cultures pagination")
    public void iClickPageInCulturesPagination(String page) throws InterruptedException {
        infectionsPage.clickPageInCulturesPagination(page);
    }

    @And("I click delete culture icon in edit all")
    public void iClickDeleteCultureIconInEditAll() throws InterruptedException {
        infectionsPage.clickDeleteCultureIconInEditAll();
    }

    @Then("I verify cultures panel is empty")
    public void iVerifyCulturesPanelIsEmpty() {
        assertTrue(infectionsPage.isCulturesPanelEmpty());
    }

    @When("I click the three points menu in interventions")
    public void iClickTheThreePointsMenuInInterventions() throws InterruptedException {
        infectionsPage.clickThreePointsMenuInInterventions();
    }

    @And("I click new intervention option in interventions menu")
    public void iClickNewInterventionOptionInInterventionsMenu() throws InterruptedException {
        infectionsPage.clickNewInterventionOptionInInterventionsMenu();
    }

    @And("I click edit intervention option in interventions menu")
    public void iClickEditInterventionOptionInInterventionsMenu() throws InterruptedException {
        infectionsPage.clickEditInterventionOptionInInterventionsMenu();
    }

    @And("I click delete intervention option in interventions menu")
    public void iClickDeleteInterventionOptionInInterventionsMenu() throws InterruptedException {
        infectionsPage.clickDeleteInterventionOptionInInterventionsMenu();
    }

    @And("I enter intervention date {string} in intervention form")
    public void iEnterInterventionDateInInterventionForm(String interventionDate) throws InterruptedException {
        infectionsPage.enterInterventionDateInInterventionForm(interventionDate);
    }

    @And("I select type of intervention {string} in intervention form")
    public void iSelectTypeOfInterventionInInterventionForm(String typeOfIntervention) throws InterruptedException {
        infectionsPage.selectTypeOfInterventionInInterventionForm(typeOfIntervention);
    }

    @And("I select result {string} in intervention form")
    public void iSelectResultInInterventionForm(String result) throws InterruptedException {
        infectionsPage.selectResultInInterventionForm(result);
    }

    @Then("I click save option in interventions menu")
    public void iClickSaveOptionInInterventionsMenu() throws InterruptedException {
        infectionsPage.clickSaveOptionInInterventionsMenu();
    }

    @Then("I click cancel option in interventions menu")
    public void iClickCancelOptionInInterventionsMenu() throws InterruptedException {
        infectionsPage.clickCancelOptionInInterventionsMenu();
    }

    @Then("I verify save option is not displayed in interventions menu")
    public void iVerifySaveOptionIsNotDisplayedInInterventionsMenu() {
        assertTrue(infectionsPage.isSaveOptionInInterventionsMenuNotDisplayed());
    }

    @Then("I verify interventions panel is displayed")
    public void iVerifyInterventionsPanelIsDisplayed() {
        assertTrue(infectionsPage.isInterventionsPanelDisplayed());
    }

    @And("I click page {string} in interventions pagination")
    public void iClickPageInInterventionsPagination(String page) throws InterruptedException {
        infectionsPage.clickPageInInterventionsPagination(page);
    }

    @And("I click delete intervention icon in edit all")
    public void iClickDeleteInterventionIconInEditAll() throws InterruptedException {
        infectionsPage.clickDeleteInterventionIconInEditAll();
    }

    @Then("I verify interventions panel is empty")
    public void iVerifyInterventionsPanelIsEmpty() {
        assertTrue(infectionsPage.isInterventionsPanelEmpty());
    }

    @Then("I verify intervention date validation is displayed")
    public void iVerifyInterventionDateValidationIsDisplayed() {
        assertTrue(infectionsPage.isInterventionDateValidationDisplayed());
    }

    @When("I click the three points menu in associated medication")
    public void iClickTheThreePointsMenuInAssociatedMedication() throws InterruptedException {
        infectionsPage.clickThreePointsMenuInAssociatedMedication();
    }

    @And("I click link option in associated medication menu")
    public void iClickLinkOptionInAssociatedMedicationMenu() throws InterruptedException {
        infectionsPage.clickLinkOptionInAssociatedMedicationMenu();
    }

    @And("I click delete option in associated medication menu")
    public void iClickDeleteOptionInAssociatedMedicationMenu() throws InterruptedException {
        infectionsPage.clickDeleteOptionInAssociatedMedicationMenu();
    }

    @And("I select first medication in assign medication modal")
    public void iSelectFirstMedicationInAssignMedicationModal() throws InterruptedException {
        infectionsPage.selectFirstMedicationInAssignMedicationModal();
    }

    @And("I click add button in assign medication modal")
    public void iClickAddButtonInAssignMedicationModal() throws InterruptedException {
        infectionsPage.clickAddButtonInAssignMedicationModal();
    }

    @And("I click cancel button in assign medication modal")
    public void iClickCancelButtonInAssignMedicationModal() throws InterruptedException {
        infectionsPage.clickCancelButtonInAssignMedicationModal();
    }

    @Then("I verify associated medication panel is displayed")
    public void iVerifyAssociatedMedicationPanelIsDisplayed() {
        assertTrue(infectionsPage.isAssociatedMedicationPanelDisplayed());
    }

    @When("I click the three points menu in associated hospitalization")
    public void iClickTheThreePointsMenuInAssociatedHospitalization() throws InterruptedException {
        infectionsPage.clickThreePointsMenuInAssociatedHospitalization();
    }

    @And("I click link option in associated hospitalization menu")
    public void iClickLinkOptionInAssociatedHospitalizationMenu() throws InterruptedException {
        infectionsPage.clickLinkOptionInAssociatedHospitalizationMenu();
    }

    @And("I click delete option in associated hospitalization menu")
    public void iClickDeleteOptionInAssociatedHospitalizationMenu() throws InterruptedException {
        infectionsPage.clickDeleteOptionInAssociatedHospitalizationMenu();
    }

    @And("I select first hospitalization in assign hospitalization modal")
    public void iSelectFirstHospitalizationInAssignHospitalizationModal() throws InterruptedException {
        infectionsPage.selectFirstHospitalizationInAssignHospitalizationModal();
    }

    @And("I click add button in assign hospitalization modal")
    public void iClickAddButtonInAssignHospitalizationModal() throws InterruptedException {
        infectionsPage.clickAddButtonInAssignHospitalizationModal();
    }

    @And("I click cancel button in assign hospitalization modal")
    public void iClickCancelButtonInAssignHospitalizationModal() throws InterruptedException {
        infectionsPage.clickCancelButtonInAssignHospitalizationModal();
    }

    @Then("I verify associated hospitalization panel is displayed")
    public void iVerifyAssociatedHospitalizationPanelIsDisplayed() {
        assertTrue(infectionsPage.isAssociatedHospitalizationPanelDisplayed());
    }

    @When("I click the three points menu in associated access")
    public void iClickTheThreePointsMenuInAssociatedAccess() throws InterruptedException {
        infectionsPage.clickThreePointsMenuInAssociatedAccess();
    }

    @And("I click link option in associated access menu")
    public void iClickLinkOptionInAssociatedAccessMenu() throws InterruptedException {
        infectionsPage.clickLinkOptionInAssociatedAccessMenu();
    }

    @And("I click delete option in associated access menu")
    public void iClickDeleteOptionInAssociatedAccessMenu() throws InterruptedException {
        infectionsPage.clickDeleteOptionInAssociatedAccessMenu();
    }

    @And("I select first access in assign access modal")
    public void iSelectFirstAccessInAssignAccessModal() throws InterruptedException {
        infectionsPage.selectFirstAccessInAssignAccessModal();
    }

    @And("I click add button in assign access modal")
    public void iClickAddButtonInAssignAccessModal() throws InterruptedException {
        infectionsPage.clickAddButtonInAssignAccessModal();
    }

    @And("I click cancel button in assign access modal")
    public void iClickCancelButtonInAssignAccessModal() throws InterruptedException {
        infectionsPage.clickCancelButtonInAssignAccessModal();
    }

    @Then("I verify associated access panel is displayed")
    public void iVerifyAssociatedAccessPanelIsDisplayed() {
        assertTrue(infectionsPage.isAssociatedAccessPanelDisplayed());
    }

    @And("I select signs symptoms {string} in assign signs symptoms modal")
    public void iSelectSignsSymptomsInAssignSignsSymptomsModal(String signsSymptoms) throws InterruptedException {
        infectionsPage.selectSignsSymptomsInAssignSignsSymptomsModal(signsSymptoms);
    }

    @And("I click add button in assign signs symptoms modal")
    public void iClickAddButtonInAssignSignsSymptomsModal() throws InterruptedException {
        infectionsPage.clickAddButtonInAssignSignsSymptomsModal();
    }

    @And("I click cancel button in assign signs symptoms modal")
    public void iClickCancelButtonInAssignSignsSymptomsModal() throws InterruptedException {
        infectionsPage.clickCancelButtonInAssignSignsSymptomsModal();
    }

    @And("I delete signs symptoms {string} in infection form")
    public void iDeleteSignsSymptomsInInfectionForm(String signsSymptoms) throws InterruptedException {
        infectionsPage.clickDeleteSignsSymptomsInInfectionForm(signsSymptoms);
    }
}