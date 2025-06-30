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

    @And("I successfully created a new special order")
    public void iSuccessfullyCreatedANewSpecialOrder() throws InterruptedException {
        HDPrescriptionPage.successfullyCreatedANewSpecialOrder();
    }


    @And("I create a special order by clicking on the add special order button")
    public void iCreateASpecialOrderByClickingOnTheAddSpecialOrderButton() throws InterruptedException {
        HDPrescriptionPage.createASpecialOrderByClickingOnTheAddSpecialOrderButton();
    }

    @And("I canceling to create a special order by clicking on the add special order button")
    public void iCancelingToCreateASpecialOrderByClickingOnTheAddSpecialOrderButton() throws InterruptedException{
        HDPrescriptionPage.cancelingToCreateASpecialOrderByClickingOnTheAddSpecialOrderButton();
    }

    @And("I verify that the save button does not appear")
    public void iVerifyThatTheSaveButtonDoesNotAppear() throws InterruptedException{
        HDPrescriptionPage.verifyThatTheSaveButtonDoesNotAppear();
    }

    @And("I check the current prescription, it is in green and the closed ones are in blue")
    public void iCheckTheCurrentPrescriptionItIsInGreenAndTheClosedOnesAreInBlue() throws InterruptedException {
        HDPrescriptionPage.checkTheCurrentPrescriptionItIsInGreenAndTheClosedOnesAreInBlue();
    }

    @And("I try to delete the prescription because it already has treatment records associated with it")
    public void iTryToDeleteThePrescriptionBecauseItAlreadyHasTreatmentRecordsAssociatedWithIt()throws InterruptedException {
        HDPrescriptionPage.tryToDeleteThePrescriptionBecauseItAlreadyHasTreatmentRecordsAssociatedWithIt();
    }

    @And("I tried to delete the active description but I canceled")
    public void iTriedToDeleteTheActiveDescriptionButICanceled() throws InterruptedException {
        HDPrescriptionPage.triedToDeleteTheActiveDescriptionButICanceled();
    }

    @And("I successfully delete the active prescription")
    public void iSuccessfullyDeleteTheActivePrescription()throws InterruptedException {
        HDPrescriptionPage.successfullyDeleteTheActivePrescription();
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
}
