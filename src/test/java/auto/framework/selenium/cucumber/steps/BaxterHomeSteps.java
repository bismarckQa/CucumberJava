package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.annotations.TakeScreenshot;
import auto.framework.selenium.annotations.WebdriverScopeBean;
import auto.framework.selenium.pages.baxter_page.BaxterHomePage;
import io.cucumber.core.backend.Backend;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;
public class BaxterHomeSteps {
    @LazyAutowired
    private BaxterHomePage BaxterHomePage;



    @Then("I login successful")
    public void iVerifyLoginWasSuccessful() throws InterruptedException {
        assertTrue(BaxterHomePage.isAt());

    }

    @Given("I Select the Group of patients {string}")
    public void iSelectTheGroupPatient(String patient) throws InterruptedException {
        BaxterHomePage.clickGroupPatientsCombo();
        BaxterHomePage.selectGroupPatient(patient);

    }

    @Given("I select the patient {string}")
    public void iSelectThePatient(String patient) throws InterruptedException {
        BaxterHomePage.clickPatientsCombo();
        BaxterHomePage.selectPatient(patient);

    }

    @When("I open Modality module")
    public void iOpenModalityModule(){
        BaxterHomePage.clickModality();
    }
    @When("I logout of Baxter website")
    public void iLogoutOfBaxterWebsite(){
        BaxterHomePage.clickUserMenuOptionsAfter();
        BaxterHomePage.clickCloseSession();
    }

    @When("I open Complementary tests module")
    public void iOpenSupplementaryTests() {
        BaxterHomePage.clickSupplementaryTests();
    }

    @When("I open Reviews module")
    public void iOpenReviewsModule() {
        BaxterHomePage.clickReviews();
    }

    @When("I open HD Water Quality module")
    public void iOpenHDWaterQualityModule() {
        BaxterHomePage.clickHDWaterQuality();
    }

    @When("I open Physical Assessment module")
    public void iOpenPhysicalAssessmentModule() {
        BaxterHomePage.clickPhysicalAssessment();
    }

    @When("I open Allergies module")
    public void iOpenAllergiesModule() {
        BaxterHomePage.clickAllergies();
    }

    @When("I open Diagnoses module")
    public void iOpenDiagnosesModule() {
        BaxterHomePage.clickDiagnoses();
    }

    @When("I open Medical History module")
    public void iOpenMedicalHistoryModule() {
        BaxterHomePage.clickMedicalHistory();
    }

    @When("I open Lab Tests module")
    public void iOpenLabTestsModule() {
        BaxterHomePage.clickLabTests();
    }

    @When("I open Medication module")
    public void iOpenLabMedicationModule() {
        BaxterHomePage.clickMedication();
    }

    @When("I open Hospitalization module")
    public void iOpenLabHospitalizationModule()throws InterruptedException {
        BaxterHomePage.clickHospitalization();
    }

    @When("I open Infections module")
    public void iOpenLabInfectionsModule() {
        BaxterHomePage.clickInfections();
    }

    @When("I open Waiting List module")
    public void iOpenLabWaitingListModule() {
        BaxterHomePage.clickWaitingList();
    }

    @When("I open Accesses module")
    public void iOpenLabAccessesModule() throws InterruptedException {BaxterHomePage.clickAccesses();}

    @When("I open PD Prescription module")
    public void iOpenPDPrescriptionModule() throws InterruptedException {BaxterHomePage.clickPDDescription();}

    @When("I open PD Treatment module")
    public void iOpenPDTreatmentModule() throws InterruptedException {BaxterHomePage.clickPDTreatment();}

    @And("I open Biopsy module")
    public void iOpenBiopsyModule() throws InterruptedException {BaxterHomePage.clickBiopsy();}

    @When("I open Donor Evaluation module")
    public void iOpenDonorEvaluationModule() throws InterruptedException {BaxterHomePage.clickDonorEvaluation();}

    @When("I open Transplant module")
    public void iOpenTransplantModule() throws InterruptedException {BaxterHomePage.clickTransplant();}

    @When("I open PD Adaptation module")
    public void iOpenPDAdaptationModule() throws InterruptedException {BaxterHomePage.clickPDAdaptation();}

    @When("I open Donor Assignment module")
    public void iOpenDonorAssignmentModule() throws InterruptedException {BaxterHomePage.clickDonorAssignment();}

    @When("I open Adequacy module")
    public void iOpenAdequacyModule() throws InterruptedException {BaxterHomePage.clickAdequacy();}

    @When("I open HD Prescription module")
    public void iOpenHDPrescriptionModule() throws InterruptedException {BaxterHomePage.clickHDPrescription();}


    @When("I open HD Calendar module")
    public void iOpenHDCalendarModule() throws InterruptedException {BaxterHomePage.clickHDCalendar();}

    @When("I open HD Monitors module")
    public void iOpenHDMonitorsModule() throws InterruptedException {BaxterHomePage.clickHDMonitors();}

    @When("I open HD Treatment module")
    public void iOpenHDTreatmentModule() throws InterruptedException {BaxterHomePage.clickHDTreatment();}

    @When("I open the HD Treatment module with a nurse profile")
    public void iOpenHDTreatmentModuleWithANurseProfile() throws InterruptedException {BaxterHomePage.clickHDTreatmentNurseProfile();}


    @When("I open Planning Care module")
    public void iOpenPlanningCareModule() throws InterruptedException {BaxterHomePage.clickPlanningCare();}



    @When("I open Nursing Care module")
    public void iOpenNursingCareModule() throws InterruptedException {BaxterHomePage.clickNursingCare();}

    @When("I open Medical Appointment module")
    public void iOpenMedicalAppointmentModule() throws InterruptedException {BaxterHomePage.clickMedicalAppointment();}

    @When("I open RRT module")
    public void iOpenRRTModule() throws InterruptedException {BaxterHomePage.clickRRT();}

    @When("I open options of user")
    public void iOpenOptionsOfUser(){
        BaxterHomePage.clickUserMenuOptions();
    }

    @When("I open Reports and consultations")
    public void iOpenReportsAndConsultations(){
        BaxterHomePage.clickReportsAndConsultations();

    }

    @When("I open configuration option of user")
    public void iOpenConfigurationOptionOfUser(){
        BaxterHomePage.clickConfigurationOptionOfUser();

    }

    @When("I open configuration option module of user")
    public void iOpenConfigurationOptionModuleOfUser()throws InterruptedException{
        BaxterHomePage.clickConfigurationOptionModuleOfUser();

    }


    @And("I verify that the user configuration opened correctly")
    public void iVerifyThatTheUserConfigurationOpenedCorrectly()throws InterruptedException {
        BaxterHomePage.verifyThatTheUserConfigurationOpenedCorrectly();

    }
}
