package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.InfectionsPage;
import auto.framework.selenium.pages.baxter_page.WaitingListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class WaitingListSteps {

    @LazyAutowired

    private WaitingListPage WaitingListPage;




    @When("I check the module Waiting List appear correctly")
    public void iCheckTheModuleWaitingListAppearCorrectly() {
        WaitingListPage.isDisplayedTheTittle();
    }


    @When("I open the menu and add new line of waiting List")
    public void iOpenTheMenuAndAddNewLineOfWaitingList() throws InterruptedException {
        WaitingListPage.clickThreeButtons();
        WaitingListPage.clickNewLineWaitingList();
    }

    @And("I add all data correctly for add the waiting list with this data: organ {string}, situation {string}, hospital list {string}, origin hospital {string} and level of urgency {string}")
    public void iAddAllDataCorrectlyForAddTheWaitingListWithThisDataOrganSituationHospitalListOriginHospitalAndLevelDeUrgency(String organ, String situation, String hospitalList, String originHospital, String levelUrgency) throws InterruptedException {
        WaitingListPage.selectOrgan(organ);
        WaitingListPage.selectSituation(situation);
        WaitingListPage.selectHospitalList(hospitalList);
        WaitingListPage.selectOriginHospital(originHospital);
        WaitingListPage.selectLevelOfUrgency(levelUrgency);
    }

    @And("I save the new waiting list")
    public void iSaveTheNewWaitingList() throws InterruptedException {
        WaitingListPage.clickThreeButtons();
        WaitingListPage.clickSave();
    }

    @And("I attached the additional study with the waiting list created")
    public void iAttachedTheAdditionalStudyWithTheWaitingListCreated() throws InterruptedException {
        WaitingListPage.clickThreeButtons();
        WaitingListPage.clickAssociateAdditionalExamination();
    }

    @And("I select the additional study created and associate with waiting list")
    public void iSelectTheAdditionalStudyCreatedAndAssociateWithWaitingList() throws InterruptedException {
        WaitingListPage.clickFirstOptionOfStudiesForAttached();
        WaitingListPage.clickAcceptAssociate();
    }


    @And("I open the menu and delete waiting list")
    public void iOpenTheMenuAndDeleteWaitingList() throws InterruptedException {
        WaitingListPage.clickThreeButtons();
        WaitingListPage.clickDelete();

    }


    @And("I accept delete access and accept information window of waiting list")
    public void iAcceptDeleteAccessAndAcceptInformationWindowOfWaitingList() throws InterruptedException {
        WaitingListPage.acceptDeleteRecord();

    }
}
