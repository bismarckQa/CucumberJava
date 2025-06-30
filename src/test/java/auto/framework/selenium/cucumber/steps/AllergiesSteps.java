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
    public void iCheckTheModuleAllergiesAppearCorrectly() {
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

    @And("I canceling deleted allergy")
    public void icancelingDeletedAllergy() throws InterruptedException {
        AllergiesModulePage.cancelRemoveAllergy();
    }

    @And("I delete the allergy created")
    public void iDeleteTheAllergyCreated() throws InterruptedException {
        AllergiesModulePage.deleteAllergy();
    }

    @And("I fill in the new allergy data with empty required field {string}")
    public void iFillTheNewAllergyDataWithEmptyRequiredFiel(String observation) throws InterruptedException {
        AllergiesModulePage.enterAllergyDataFieldsEmpty(observation);
    }

    @And("I fill in the new allergy data with active field {string}")
    public void iFillTheNewAllergyDataWithActiveField(String observation) throws InterruptedException {
        AllergiesModulePage.enterAllergyDataActiveYes(observation);
    }

    @And("I verify filter allergy is active")
    public void iVerifyFilterAllergyIsActive() throws InterruptedException {
        AllergiesModulePage.verifyFilterActiveAllergy();
    }

    @And("I try edit allergy with blank required fields")
    public void itryEditAllergyWithBlankRequiredFields() throws InterruptedException{
        AllergiesModulePage.tryEditAllergyWithBlankRequiredFields();
    }

    @And("I try edit allergy but I cancel it {string}")
    public void iTryEditAllergyButICancelIt(String observation)throws InterruptedException{
        AllergiesModulePage.tryEditAllergyButICancelIt(observation);
    }
    @And("I edited the allergy successfully with the new data {string}")
    public void iEditTheAllergySuccessfully(String observation)throws InterruptedException{
        AllergiesModulePage.editTheAllergySuccessfully(observation);
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
