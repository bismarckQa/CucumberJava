package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.DemographicsPage;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemographicsSteps {

    @LazyAutowired
    private DemographicsPage demographicsPage;

    // --- x_title & menu ---

    @Then("I verify the New patient x_title is visible with scroll")
    public void iVerifyTheNewPatientXTitleIsVisibleWithScroll() throws InterruptedException {
        demographicsPage.verifyXTitleIsVisibleWithScroll();
    }

    @And("I click the three points menu of New patient")
    public void iClickThreePointsMenuOfNewPatient() throws InterruptedException {
        demographicsPage.clickThreePointsMenu();
    }

    @And("I click {string} option in the three points menu of New patient")
    public void iClickOptionInThreePointsMenuOfNewPatient(String option) throws InterruptedException {
        demographicsPage.clickOptionInThreePointsMenu(option);
    }

    // ===================== NEW PATIENT steps =====================

    @And("I enter the name {string}")
    public void iEnterTheName(String name) throws InterruptedException {
        demographicsPage.enterName(name);
    }

    @And("I enter the nombre de uso {string}")
    public void iEnterTheNombreDeUso(String nombreDeUso) throws InterruptedException {
        demographicsPage.enterNombreDeUso(nombreDeUso);
    }

    @And("I enter the last name {string}")
    public void iEnterTheLastName(String lastName) throws InterruptedException {
        demographicsPage.enterLastName(lastName);
    }

    @And("I enter the surname 2 {string}")
    public void iEnterTheSurname2(String surname2) throws InterruptedException {
        demographicsPage.enterSurname2(surname2);
    }

    @And("I enter the ID patient {string}")
    public void iEnterTheIdPatient(String id) throws InterruptedException {
        demographicsPage.enterIdPatient(id);
    }

    @And("I enter the date of birth {string}")
    public void iEnterTheDateOfBirth(String date) throws InterruptedException {
        demographicsPage.enterDateOfBirth(date);
    }

    @And("I enter the date of 1st dialysis {string}")
    public void iEnterTheDateOf1stDialysis(String date) throws InterruptedException {
        demographicsPage.enterDate1stDialysis(date);
    }

    @And("I select the gender")
    public void iSelectTheGender() throws InterruptedException {
        demographicsPage.selectGender();
    }

    @And("I select the blood group")
    public void iSelectTheBloodGroup() throws InterruptedException {
        demographicsPage.selectBloodGroup();
    }

    @And("I select the referred by")
    public void iSelectTheReferredBy() throws InterruptedException {
        demographicsPage.selectReferredBy();
    }

    // ===================== ASSIGNMENTS steps =====================

    @And("I select the primary center")
    public void iSelectThePrimaryCenter() throws InterruptedException {
        demographicsPage.selectPrimaryCenter();
    }

    @And("I enter the date of admission {string}")
    public void iEnterTheDateOfAdmission(String date) throws InterruptedException {
        demographicsPage.enterDateAdmission(date);
    }

    @And("I select the patient group")
    public void iSelectThePatientGroup() throws InterruptedException {
        demographicsPage.selectPatientGroup();
    }

    // ===================== CLINICAL STATUS steps =====================

    @And("I select the clinical status")
    public void iSelectTheClinicalStatus() throws InterruptedException {
        demographicsPage.selectClinicalStatus();
    }

    @And("I select the method")
    public void iSelectTheMethod() throws InterruptedException {
        demographicsPage.selectMethod();
    }

    @And("I select the submethod")
    public void iSelectTheSubmethod() throws InterruptedException {
        demographicsPage.selectSubmethod();
    }

    @And("I select the location")
    public void iSelectTheLocation() throws InterruptedException {
        demographicsPage.selectLocation();
    }

    @And("I select the attendance")
    public void iSelectTheAttendance() throws InterruptedException {
        demographicsPage.selectAttendance();
    }

    @And("I select the monitor brand")
    public void iSelectTheMonitorBrand() throws InterruptedException {
        demographicsPage.selectMonitorBrand();
    }

    @And("I enter the start date {string}")
    public void iEnterTheStartDate(String date) throws InterruptedException {
        demographicsPage.enterStartDate(date);
    }

    @And("I select the modalidad referred by")
    public void iSelectTheModalidadReferredBy() throws InterruptedException {
        demographicsPage.selectModalidadReferredBy();
    }

    @And("I select the reason for start")
    public void iSelectTheReasonForStart() throws InterruptedException {
        demographicsPage.selectReasonForStart();
    }

    @And("I select the referred by clinical status")
    public void iSelectTheReferredByClinicalStatus()throws InterruptedException {
        demographicsPage.selectTheReferredByClinicalStatus();
    }

    @And("I click on the selected patient")
    public void iClickOnTheSelectedPatient()throws InterruptedException {
        demographicsPage.clickOnTheSelectedPatient();
    }

    @And("I verify that the demographic module opened correctly")
    public void iVerifyThatTheDemographicModuleOpenedCorrectly()throws InterruptedException {
        demographicsPage.verifyThatTheDemographicModuleOpenedCorrectly();
    }

    @And("I try to add a new center to the patient")
    public void iTryToAddANewCenterToThePatient()throws InterruptedException {
       demographicsPage.tryToAddANewCenterToThePatient();
    }
}