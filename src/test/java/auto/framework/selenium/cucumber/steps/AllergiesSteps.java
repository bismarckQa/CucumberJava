package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AllergiesModulePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllergiesSteps {

    @LazyAutowired

    private AllergiesModulePage AllergiesModulePage;




    @When("I check the module Allergies appear correctly")
    public void iCheckTheModuleAllergiesAppearCorrectly()throws InterruptedException {
        AllergiesModulePage.isDisplayedTheTittle();

    }


    @And("I open the menu and add new allergy")
    public void iOpenTheMenuAndAddNewAllergy() throws InterruptedException {
        AllergiesModulePage.openMenuNewAllergies();
    }

    @And("I fill in the new allergy data {string}")
    public void iFillTheNewAllergyData(String observation) throws InterruptedException {
        AllergiesModulePage.enterAllergyData(observation);
    }

    @And("I select allergy type {string} in allergy form")
    public void iSelectAllergyTypeInAllergyForm(String type) throws InterruptedException {
        AllergiesModulePage.selectAllergyType(type);
    }

    @And("I select allergy {string} in allergy form")
    public void iSelectAllergyInAllergyForm(String allergy) throws InterruptedException {
        AllergiesModulePage.selectAllergyName(allergy);
    }

    @And("I select severity {string} in allergy form")
    public void iSelectSeverityInAllergyForm(String severity) throws InterruptedException {
        AllergiesModulePage.selectAllergySeverity(severity);
    }

    @And("I select reaction {string} in allergy form")
    public void iSelectReactionInAllergyForm(String reaction) throws InterruptedException {
        AllergiesModulePage.selectAllergyReaction(reaction);
    }

    @And("I enter identification date {string} in allergy form")
    public void iEnterIdentificationDateInAllergyForm(String date) throws InterruptedException {
        AllergiesModulePage.enterAllergyIdentificationDate(date);
    }

    @And("I select active state {string} in allergy form")
    public void iSelectActiveStateInAllergyForm(String state) throws InterruptedException {
        AllergiesModulePage.selectAllergyActiveState(state);
    }

    @And("I enter observations {string} in allergy form")
    public void iEnterObservationsInAllergyForm(String observation) throws InterruptedException {
        AllergiesModulePage.enterAllergyObservations(observation);
    }

    @Then("I cancel the creation of a new allergy")
    public void iCancelTheCreationOfANewAllergy() throws InterruptedException {
        AllergiesModulePage.canceledCreateNewAllergy();
    }

    @Then("I save the new allergy entry")
    public void iSaveTheNewAllergyEntry() throws InterruptedException {
        AllergiesModulePage.successCreateNewAllergy();
    }


    @And("I check the new Allergies was created correctly")
    public void iCheckTheNewAllergiesWasCreatedCorrectly() throws InterruptedException {
        AllergiesModulePage.checkNewAllergyCreated();
    }

    @And("I delete the allergy created")
    public void iDeleteTheAllergyCreated() throws InterruptedException {
        AllergiesModulePage.deleteAllergy();
    }

    @When("I click delete allergy button")
    public void iClickDeleteAllergyButton() throws InterruptedException {
        AllergiesModulePage.clickDeleteAllergyButton();
    }

    @Then("I confirm delete allergy modal")
    public void iConfirmDeleteAllergyModal() throws InterruptedException {
        AllergiesModulePage.confirmDeleteAllergyModal();
    }

    @Then("I cancel delete allergy modal")
    public void iCancelDeleteAllergyModal() throws InterruptedException {
        AllergiesModulePage.cancelDeleteAllergyModal();
    }

    @When("I click edit allergy button")
    public void iClickEditAllergyButton() throws InterruptedException{
        AllergiesModulePage.clickEditAllergyButton();
    }

    @Then("I cancel allergy edition")
    public void iCancelAllergyEdition() throws InterruptedException{
        AllergiesModulePage.cancelAllergyEdition();
    }

    @Then("I save allergy edition")
    public void iSaveAllergyEdition() throws InterruptedException{
        AllergiesModulePage.saveAllergyEdition();
    }

    @And("I canceling check no known allergies")
    public void iCancelingCheckNoKnowAllergies() throws InterruptedException {
        AllergiesModulePage.cancelingCheckNoKnownAllergies();

    }

    @And("I checked successful no known allergies")
    public void  iCheckedSuccessfulNoKnownAllergies() throws InterruptedException{
        AllergiesModulePage.checkedSuccessfulNoKnownAllergies();
    }

    @And("I verified successfully, no known allergies")
    public void  iVerifiedSuccessfullyNoKnownAllergies() throws  InterruptedException{
        AllergiesModulePage.verifiedSuccessfullyNoKnownAllergies();
    }

    @And("I unchecked no known allergies")
    public void iUncheckedNoKnownAllergies() throws InterruptedException{
        AllergiesModulePage.uncheckedNoKnownAllergies();
    }


}