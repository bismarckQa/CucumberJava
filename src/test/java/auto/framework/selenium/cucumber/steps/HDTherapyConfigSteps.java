package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.HDTherapyConfigPage;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;

public class HDTherapyConfigSteps {

    @LazyAutowired

    private HDTherapyConfigPage HDTherapyConfigPage;

    @And("I enter into user configuration options")
    public void iEnterIntoUserConfigurationOptions() throws InterruptedException {
        HDTherapyConfigPage.enterConfigurationUsers();
    }

    @And("I successfully opened the HD Therapy module")
    public void iSuccessfullyOpenedTheHDTherapyModule() throws InterruptedException {
        HDTherapyConfigPage.successfullyOpenedTheHDTherapyModule();
    }

    @Then("I try to add a new dialyzer with empty fields")
    public void iTryToAddANewDialyzerWithEmptyFields() throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewDialyzer();
    }

    @When("I click button new add dialyzer")
    public void iClickButtonNewAddDialyzer() throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewDialyzer();
    }

    @And("I insert data into the model field {string}")
    public void iInsertDataIntoTheModelField(String modelDialyzer) throws InterruptedException {
        HDTherapyConfigPage.inputDataModelDialyzer(modelDialyzer);
    }

    @And("I click button save new dialyzer")
    public void iClickButtonSaveNewDialyzer() throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveNewDialyzer();
    }

    @Then("I select a manufacturer option")
    public void iSelectAManufacturerOption() throws InterruptedException {
        HDTherapyConfigPage.selectOptionBaxterManufacturer();
    }

    @And("I select or unselect the dialyzer checkbox if it is {string}")
    public void iSelectOrUnselectTheDialyzerCheckboxIfItIs(String state) throws InterruptedException {
        HDTherapyConfigPage.checkOrUncheckChexboxStatus(state);
    }

    @Then("I click the checkbox to show all inactive dialyzers")
    public void iClickTheCheckboxToShowAllInactiveDialyzers() throws InterruptedException {
        HDTherapyConfigPage.clickCheckBoxShowAllDialyzer();
    }

    @And("I enter data in input KoA {string}")
    public void iEnterDataInInputKoA(String koa) throws InterruptedException {
        HDTherapyConfigPage.enterDataInInputKoA(koa);
    }

    @And("I enter data in input Surface {string}")
    public void iEnterDataInInputSurface(String surface) throws InterruptedException {
        HDTherapyConfigPage.enterDataInInputSurface(surface);
    }

    @And("I enter data in input Primer Volume {string}")
    public void iEnterDataInInputPrimerVolume(String volume) throws InterruptedException {
        HDTherapyConfigPage.enterDataInInputPrimerVolume(volume);
    }

    @And("I enter data in input Coefficient {string}")
    public void iEnterDataInInputCoefficient(String coefficient) throws InterruptedException {
        HDTherapyConfigPage.enterDataInInputCoefficient(coefficient);
    }

    @And("I enter data in maximum QB {string}")
    public void iEnterDataInMaximumQB(String maximum) throws InterruptedException {
        HDTherapyConfigPage.enterDataInMaximumQB(maximum);
    }

    @And("I select option type of membrane")
    public void iSelectOptionTypeOfMembrane() throws InterruptedException {
        HDTherapyConfigPage.selectOptionTypeOfMembraneDialyzer();
    }

    @When("I looking for the model to edit with the name: {string}")
    public void iLookingForTheModelToEditWithTheName(String model) throws InterruptedException {
        HDTherapyConfigPage.clickModelSelectedDialyzer(model);
    }

    @And("I clean the model field")
    public void iCleanTheModelField() throws InterruptedException {
        HDTherapyConfigPage.cleanInputDataModelDialyzer();
    }

    @And("I click button edit dialyzer")
    public void iClickButtonEditDialyzer() throws InterruptedException {
        HDTherapyConfigPage.clickButtonEditDialyzer();
    }

    @And("I clean the manufacturer field")
    public void iCleanTheManufacturerField() throws InterruptedException {
        HDTherapyConfigPage.cleanInputDataManufacturerDialyzer();
    }

    @Then("I edit the necessary data in Dialyzer {string}")
    public void iEditTheNecessaryDataInDialyzer(String module) throws InterruptedException {
        HDTherapyConfigPage.editTheNecessaryDataInDialyzer(module);
    }

    @Then("I try to delete dialyzer selected")
    public void iTryToDeleteDialyzerSelected() throws InterruptedException {
        HDTherapyConfigPage.clickButtonDeleteDialyzer();
    }

    @And("I click button dialyzer section")
    public void iClickButtonDialyzerSection() throws InterruptedException {
        HDTherapyConfigPage.clickButtonDialyzerSection();
    }

    @And("I click button three points dialyzer")
    public void iClickButtonThreePointsDialyzer()throws InterruptedException {
       HDTherapyConfigPage.clickButtonThreePointsDialyzer();
    }

    @And("I click button Ok in modal error")
    public void iClickButtonOkInModalError()throws InterruptedException {
        HDTherapyConfigPage.clickButtonOkInModalError();
    }

    @When("I click button New dialyzer")
    public void iClickButtonNewDialyzer()throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewDialyzer();
    }

    @Then("I click button cancel add new dialyzer")
    public void iClickButtonCancelAddNewDialyzer()throws InterruptedException {
       HDTherapyConfigPage.clickButtonCancelDialyzer();
    }

    @And("I click button Yes Confirmation delete dialyzer")
    public void iClickButtonYesConfirmationModal()throws InterruptedException {
        HDTherapyConfigPage.clickButtonYesConfirmationDelete();
    }

    @And("I click button Cancel Confirmation delete dialyzer")
    public void iClickButtonCancelConfirmationDeleteDialyzer()throws InterruptedException {
        HDTherapyConfigPage.clickButtonNoConfirmationDelete();
    }

    @And("I click button concentrates section")
    public void iClickButtonConcentratesSection()throws InterruptedException {
        HDTherapyConfigPage.clickButtonConcentratesSection();
    }

    @And("I click button three points concentrates")
    public void iClickButtonThreePointsConcentrates()throws InterruptedException {
       HDTherapyConfigPage.clickButtonThreePointsConcentrates();
    }

    @When("I click button new add concentrates")
    public void iClickButtonNewAddConcentrates()throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewDialyzer();
    }

    @And("I insert data into the name concentrates field {string}")
    public void iInsertDataIntoTheNameConcentratesField(String name)throws InterruptedException {
        HDTherapyConfigPage.inputDataNameConcentrates(name);
    }

    @And("I select the type of concentrates option")
    public void iSelectTheTypeOfConcentratesOption()throws InterruptedException {
        HDTherapyConfigPage.selectTheTypeOfConcentratesOption();
    }

    @And("I insert data into the input end sodium {string}")
    public void iInsertDataIntoTheInputEndSodium(String endSodium)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndSodium(endSodium);
    }

    @And("I insert data into the input end bicarbonate {string}")
    public void iInsertDataIntoTheInputEndBicarbonate(String endBicarbonate)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndBicarbonate(endBicarbonate);
    }

    @And("I insert data into the input end calcium {string}")
    public void iInsertDataIntoTheInputEndCalcium(String endCalcium)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndCalcium(endCalcium);
    }

    @And("I insert data into the input end potassium {string}")
    public void iInsertDataIntoTheInputEndPotassium(String endPotassium)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndPotassium(endPotassium);
    }

    @And("I insert data into the input end Magnesium {string}")
    public void iInsertDataIntoTheInputEndMagnesium(String endMagnesium)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndMagnesium(endMagnesium);
    }

    @And("I insert data into the input end chloride {string}")
    public void iInsertDataIntoTheInputEndChloride(String endChloride)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndChloride(endChloride);
    }

    @And("I insert data into the input end acetate {string}")
    public void iInsertDataIntoTheInputEndAcetate(String endAcetate)throws InterruptedException {
       HDTherapyConfigPage.insertDataIntoTheInputEndAcetate(endAcetate);
    }

    @And("I insert data into the input end dextrose {string}")
    public void iInsertDataIntoTheInputEndDextrose(String endDextrose)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputEndDextrose(endDextrose);
    }

    @Then("I insert data into the input sodium bicarbonate {string}")
    public void iInsertDataIntoTheInputSodiumBicarbonate(String sodiumBicarbonate)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputSodiumBicarbonate(sodiumBicarbonate);
    }

    @Then("I insert data into the input sodium chloride {string}")
    public void insertDataIntoTheInputSodiumChloride(String sodiumChloride)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheInputSodiumChloride(sodiumChloride);
    }

    @And("I insert data into the text Area description concentrate {string}")
    public void iInsertDataIntoTheTextAreaDescriptionConcentrate(String description)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheTextAreaDescriptionConcentrate(description);
    }

    @And("I click button save new concentrate")
    public void iClickButtonSaveNewConcentrate()throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveNewConcentrate();
    }

    @Then("I click button cancel add new concentrate")
    public void iClickButtonCancelAddNewConcentrate()throws InterruptedException {
        HDTherapyConfigPage.clickButtonCancelAddNewConcentrate();
    }

    @And("I select or unselect the concentrate checkbox if it is {string}")
    public void iSelectOrUnselectTheConcentrateCheckboxIfItIs(String state)throws InterruptedException {
        HDTherapyConfigPage.checkOrUncheckChexboxStatus(state);
    }

    @And("I click the checkbox to show all inactive concentrates")
    public void iClickTheCheckboxToShowAllInactiveConcentrates()throws InterruptedException {
       HDTherapyConfigPage.clickCheckBoxShowAllConcentrates();
    }

    @Then("I looking for the concentrate with the name: {string}")
    public void iLookingForTheConcentrateWithTheName(String name)throws InterruptedException {
        HDTherapyConfigPage.clickNameSelectedConcentrate(name);
    }

    @And("I click button edit concentrates")
    public void iClickButtonEditConcentrates()throws InterruptedException {
        HDTherapyConfigPage.clickButtonEditConcentrate();
    }

    @And("I click button delete concentrate")
    public void iClickButtonDeleteConcentrate()throws InterruptedException {
        HDTherapyConfigPage.clickButtonDeleteDialyzer();
    }

    @And("I click button yes Confirmation delete concentrate")
    public void iClickButtonYesConfirmationDeleteConcentrate()throws InterruptedException {
        HDTherapyConfigPage.clickButtonYesConfirmationDelete();
    }

    @And("I click button OK  modal error")
    public void iClickButtonOKModalError()throws InterruptedException {
        HDTherapyConfigPage.clickButtonOkInModalError();
    }

    @When("I click button three points needles")
    public void iClickButtonThreePointsNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonThreePointsConcentrates();
    }

    @And("I click button needles section")
    public void iClickButtonNeedlesSection()throws InterruptedException {
        HDTherapyConfigPage.clickButtonNeedlesSection();
    }

    @And("I click button new add needles")
    public void iClickButtonNewAddNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewDialyzer();
    }

    @And("I click button cancel add new needles")
    public void iClickButtonCancelAddNewNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonCancelAddNewConcentrate();
    }

    @And("I insert data at name needles {string}")
    public void iInsertDataAtNameNeedles(String name)throws InterruptedException {
        HDTherapyConfigPage.insertDataAtNameNeedles(name);
    }

    @And("I insert data at Caliber needles {string}")
    public void iInsertDataAtCaliberNeedles(String caliber)throws InterruptedException {
        HDTherapyConfigPage.insertDataAtCaliberNeedles(caliber);
    }

    @And("I looking for the needles with the name: {string}")
    public void iLookingForTheNeedlesWithTheName(String name)throws InterruptedException {
        HDTherapyConfigPage.clickNameSelectedConcentrate(name);
    }

    @And("I click button save add new needles")
    public void iClickButtonSaveAddNewNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveNewConcentrate();
    }

    @And("I select or unselect needles checkbox if it is {string}")
    public void iSelectOrUnselectNeedlesCheckboxIfItIs(String state)throws InterruptedException {
        HDTherapyConfigPage.checkOrUncheckChexboxStatus(state);
    }

    @Then("I click the checkbox to show all inactive needles")
    public void iClickTheCheckboxToShowAllInactiveNeedles()throws InterruptedException {
       HDTherapyConfigPage.clickTheCheckboxToShowAllInactiveNeedles();
    }

    @And("I click button edit needles")
    public void iClickButtonEditNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonEditConcentrate();
    }

    @And("I click button delete needles")
    public void iClickButtonDeleteNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonDeleteDialyzer();
    }

    @And("I click button Yes Confirmation delete needles")
    public void iClickButtonYesConfirmationDeleteNeedles()throws InterruptedException {
        HDTherapyConfigPage.clickButtonYesConfirmationDelete();
    }

    @And("I click button Add New Laterality")
    public void iClickButtonAddNewLaterality()throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewLaterality();
    }

    @When("I click input position lateralities and select option")
    public void iClickInputPositionLateralitiesAndSelectOption()throws InterruptedException {
        HDTherapyConfigPage.clickInputPositionLateralitiesAndSelectOption();
    }

    @And("I looking for the position lateralities with the name: {string}")
    public void iLookingForThePositionLateralitiesWithTheName(String name)throws InterruptedException {
        HDTherapyConfigPage.clickNameSelectedConcentrate(name);
    }

    @And("I click input lateralities and select option")
    public void iClickInputLateralitiesAndSelectOption()throws InterruptedException {
        HDTherapyConfigPage.clickInputLateralitiesAndSelectOption();
    }

    @Then("I click button save new Lateralities")
    public void iClickButtonSaveNewLateralities()throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveNewLateralities();
    }

    @Then("I click cancel save new Lateralities")
    public void iClickCancelSaveNewLateralities()throws InterruptedException {
        HDTherapyConfigPage.clickCancelSaveNewLateralities();
    }

    @And("I click button delete Laterality")
    public void iClickButtonDeleteLaterality()throws InterruptedException {
        HDTherapyConfigPage.clickButtonDeleteLaterality();
    }

    @When("I click button Cancel Confirmation delete Laterality")
    public void iClickButtonCancelConfirmationDeleteLaterality()throws InterruptedException {
       HDTherapyConfigPage.clickButtonNoConfirmationDelete();
    }

    @Then("I click button yes Confirmation delete Laterality")
    public void iClickButtonYesConfirmationDeleteLaterality()throws InterruptedException {
        HDTherapyConfigPage.clickButtonYesConfirmationDelete();
    }

    @When("I click button anticlottings section")
    public void iClickButtonAnticlottingsSection()throws InterruptedException {
      HDTherapyConfigPage.clickButtonAnticlottingsSection();
    }

    @And("I click buton Anticlotting Type and select option")
    public void iClickButonAnticlottingTypeAndSelectOption()throws InterruptedException {
        HDTherapyConfigPage.clickButonAnticlottingTypeAndSelectOption();
    }

    @And("I try to do a drag drop to insert a medication into the anticoagulant area")
    public void iTryToDoADragDropToInsertAMedicationIntoTheAnticoagulantArea()throws InterruptedException {
        HDTherapyConfigPage.dragAndDropAllMedication();
    }

    @And("I try to delete the added anticoagulant")
    public void iTryToDeleteTheAddedAnticoagulant() throws InterruptedException{
        HDTherapyConfigPage.deleteTheAntiCoagulantAdded();
    }

    @And("I click button Yes Confirmation delete")
    public void iClickButtonYesConfirmationDelete()throws InterruptedException {
        HDTherapyConfigPage.clickButtonYesConfirmationDelete();
    }

    @When("I click button drugs section")
    public void iClickButtonDrugsSection()throws InterruptedException {
        HDTherapyConfigPage.clickButtonDrugsSection();
    }

    @And("I insert data into the name drugs types field {string}")
    public void iInsertDataIntoTheNameDrugsTypesField(String name)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheNameDrugsTypesField(name);
    }

    @And("I insert data into the description drugs types field {string}")
    public void iInsertDataIntoTheDescriptionDrugsTypesField(String description)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheDescriptionDrugsTypesField(description);
    }

    @And("I click button Add New drug types")
    public void iClickButtonAddNewDrugTypes() throws InterruptedException{
        HDTherapyConfigPage.clickButtonAddNewDrugTypes();
    }

    @Then("I click button save add new drug types")
    public void iClickButtonSaveAddNewDrugTypes()throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveAddNewDrugTypes();
    }

    @And("I looking for the new drug created with the name: {string}")
    public void iLookingForTheNewDrugCreatedWithTheName(String name)throws InterruptedException {
        HDTherapyConfigPage.clickNameSelectedConcentrate(name);
    }

    @Then("I click button cancel add new drug types")
    public void iClickButtonCancelAddNewDrugTypes()throws InterruptedException {
        HDTherapyConfigPage.clickButtonCancelAddNewDrugTypes();
    }

    @And("I click button Add New drug result")
    public void iClickButtonAddNewDrugResult()throws InterruptedException {
        HDTherapyConfigPage.clickButtonAddNewDrugResult();
    }

    @And("I insert data into the name drugs result field {string}")
    public void iInsertDataIntoTheNameDrugsResultField(String name)throws InterruptedException {
        HDTherapyConfigPage.insertDataIntoTheNameDrugsResultsField(name);
    }

    @Then("I click button save new result")
    public void iClickButtonSave()throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveAddNewDrugResult();
    }

    @When("I click button edit drugs")
    public void iClickButtonEditDrugs()throws InterruptedException {
        HDTherapyConfigPage.clickButtonEditDrugs();
    }

    @Then("I click button cancel edit drug types")
    public void iClickButtonCancelEditDrugTypes()throws InterruptedException {
        HDTherapyConfigPage.clickButtonCancelEditDrugTypes();
    }

    @Then("I click button save edit drug types")
    public void iClickButtonSaveEditDrugTypes()throws InterruptedException {
        HDTherapyConfigPage.clickButtonSaveEditDrugTypes();
    }

    @And("I click button delete drug type selected")
    public void iClickButtonDeleteDrugTypeSelected()throws InterruptedException {
        HDTherapyConfigPage.clickButtonDeleteDrugTypeSelected1();
    }
}
