package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.MedicalHistoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class MedicalHistorySteps {

    @LazyAutowired
    private MedicalHistoryPage MedicalHistoryPage;


    @When("I check the module Medical History appear correctly")
    public void iCheckTheModuleMedicalHistoryAppearCorrectly() {
        MedicalHistoryPage.isDisplayedTheTittleMedicalHistory();
    }

    @When("I click add new in Medical History")
    public void iClickAddNewInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickAddNew();
    }

    @When("I click edit row in Medical History")
    public void iClickEditRowInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickEditRow();
    }

    @When("I click delete row in Medical History")
    public void iClickDeleteRowInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickDeleteRow();
    }

    @And("I click Yes in delete confirmation modal in Medical History")
    public void iClickYesInDeleteConfirmationModalInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickYesDeleteModal();
    }

    @And("I click No in delete confirmation modal in Medical History")
    public void iClickNoInDeleteConfirmationModalInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickNoDeleteModal();
    }

    @And("I click button three points menu in Medical History")
    public void iClickButtonThreePointsMenuInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickThreePointsMenu();
    }

    @And("I click menu option {string} in Medical History")
    public void iClickMenuOptionInMedicalHistory(String option) throws InterruptedException {
        MedicalHistoryPage.clickMenuOption(option);
    }

    @And("I write history {string} in Medical History")
    public void iWriteHistoryInMedicalHistory(String text) throws InterruptedException {
        MedicalHistoryPage.writeHistory(text);
    }

    @And("I select history {string} in Medical History")
    public void iSelectHistoryInMedicalHistory(String history) throws InterruptedException {
        MedicalHistoryPage.selectHistory(history);
    }

    @And("I check father in Medical History")
    public void iCheckFatherInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.checkFather();
    }

    @And("I check mother in Medical History")
    public void iCheckMotherInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.checkMother();
    }

    @And("I click save row in Medical History")
    public void iClickSaveRowInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickSaveRow();
    }

    @And("I click cancel row in Medical History")
    public void iClickCancelRowInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickCancelRow();
    }

    @And("I click Ok in validation error modal in Medical History")
    public void iClickOkInValidationErrorModalInMedicalHistory() throws InterruptedException {
        MedicalHistoryPage.clickOkValidationErrorModal();
    }
}
