package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.MedicalAppointmentPage;
import auto.framework.selenium.pages.baxter_page.NursingCarePage;
import io.cucumber.java.en.When;

public class MedicalAppointmentSteps {

    @LazyAutowired

    private MedicalAppointmentPage MedicalAppointmentPage;




    @When("I check the module Medical Appointment appear correctly")
    public void iCheckTheModuleMedicalAppointmentAppearCorrectly() {
        MedicalAppointmentPage.isDisplayedTheTittle();
    }













}
