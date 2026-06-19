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
}