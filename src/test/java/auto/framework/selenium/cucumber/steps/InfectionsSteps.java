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
}