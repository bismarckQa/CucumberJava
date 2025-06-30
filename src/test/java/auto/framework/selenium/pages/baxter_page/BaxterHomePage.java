package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;
import java.util.Map;

@LazyComponent
public class BaxterHomePage extends BasePage<BaxterHomePage> {


    @FindBy(how = How.ID, using = "frmContenido")
    private WebElement welcomeLogo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"PatientsCombo\"]")
    private WebElement patientsCombo;
    @FindBy(how = How.XPATH, using = "//*[@id=\"GroupsCombo_Input\"]")
    private WebElement groupPatientsCombo;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[1]/a")
    private WebElement modality;
    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Additional Studies'])[1]")
    private WebElement SupplementaryTestsModule;

    @FindBy(how = How.XPATH, using = "//*[contains(@class,'nbs-flexisel-nav-right')]")
    private WebElement rightArrow;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[7]/a")
    private WebElement ReviewsModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[1]/nav/div[3]/ul/li/a/span[2]")
    private WebElement UserMenu;
    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[8]/a")
    private WebElement LabTestsModule;

    @FindBy(how = How.ID, using = "inicioInformes")
    private WebElement ReportsAndConsultations;

    @FindBy(how = How.ID, using = "lnkConfiguracion")
    private WebElement ConfigurationOptionOfUser;

    @FindBy(how = How.ID, using = "menuItem 1")
    private WebElement HDWaterQualityModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[3]/a")
    private WebElement MedicalHistoryModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[4]/a")
    private WebElement AllergiesModule;
    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[5]/a")
    private WebElement DiagnosesModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[6]/a")
    private WebElement PhysicalAssessmentModule;


    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[9]/a")
    private WebElement MedicationModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[11]/a")
    private WebElement HospitalizationModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[12]/a")
    private WebElement InfectionsModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[13]/a")
    private WebElement WaitingListModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[14]/a")
    private WebElement AccessesModule;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuItem 6\"]")
    private WebElement PDPrescription;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuItem 7\"]")
    private WebElement PDTreatment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuItem 9\"]")
    private WebElement PDAdaptation;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[21]/a")
    private WebElement DonorAssignment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuItem 16\"]")
    private WebElement DonorEvaluation;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[21]/a")
    private WebElement Biopsy;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuItem 17\"]")
    private WebElement Transplant;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[15]/a")
    private WebElement AdequacyModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[16]/a")
    private WebElement HDPrescriptionModule;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[17]/a")
    private WebElement HDCalendar;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[18]/a")
    private WebElement HDMonitors;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[19]/a")
    private WebElement HDTreatment;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'HD Treatment')]")
    private WebElement HDTreatmentNurse;


    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[20]/a")
    private WebElement PlanningCare;



    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[22]/a")
    private WebElement NursingCare;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[23]/a")
    private WebElement MedicalAppointment;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[8]/div/div[1]/div[3]/div/div/div/ul/li[24]/a")
    private WebElement RRT;

    @FindBy(how = How.ID, using = "cerrarSesion")
    private WebElement ButtonCloseSession;

    @FindBy(how = How.XPATH, using = "//span[@class='fa fa-angle-down']")
    private WebElement buttonDropDownProfile;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Configuration')]")
    private WebElement optionConfigurationMenu;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'New patient')]")
    private WebElement titleNewPatientConfigurationModule;



    //*********Page Methods*********



    public void selectPatient(String patient){
            By loc = By.xpath("//*[contains(text(),'"+patient+"')]");
            click(loc);
    }

    public void selectGroupPatient(String patient){
        By loc = By.xpath("//*[contains(text(),'"+patient+"')]");
        click(loc);
    }

    @Override
    public boolean isAt() throws InterruptedException {
        //return this.wait.until((d) -> this.welcomeLogo.isDisplayed());
        pause(7000);
        return isDisplayed(welcomeLogo);
    }

    public void clickPatientsCombo() throws InterruptedException {
        pause(1000);
        doubleClick(this.patientsCombo);
        pause(1000);
    }
    public void clickGroupPatientsCombo() throws InterruptedException {
        pause(500);
        doubleClick(this.groupPatientsCombo);
    }

    public void clickModality(){
        click(this.modality);
    }

    public void clickCloseSession(){
        click(this.ButtonCloseSession);
    }
    public void clickHDWaterQuality(){
        click(this.HDWaterQualityModule);
    }
    public void clickMedicalHistory(){
        click(this.MedicalHistoryModule);
    }

    public void clickSupplementaryTests() {
        do{
            click(rightArrow);
        }while (!isDisplayed(SupplementaryTestsModule));
        click(SupplementaryTestsModule);

    }

    public void clickReviews() {
        do{
            click(rightArrow);
        }while (!isDisplayed(ReviewsModule));

        click(this.ReviewsModule);
    }

    public void clickMedication() {
        do{
           click(rightArrow);
        }while (!isDisplayed(MedicationModule));

        click(this.MedicationModule);

    }

    public void clickHospitalization()throws InterruptedException {
        pause(500);
        do{
            click(rightArrow);
        }while (!isDisplayed(HospitalizationModule));
        pause(500);
        click(this.HospitalizationModule);

    }

    public void clickInfections() {
        do{
            click(rightArrow);
        }while (!isDisplayed(InfectionsModule));

        click(this.InfectionsModule);

    }

    public void clickWaitingList() {
        do{
            click(rightArrow);
        }while (!isDisplayed(WaitingListModule));

        click(this.WaitingListModule);

    }

    public void clickAccesses() throws InterruptedException {
        click(rightArrow);
        pause(1000);
        click(this.AccessesModule);
        pause(1000);
    }

    public void clickPDDescription() throws InterruptedException {
        pause(2000);
        click(this.PDPrescription);
    }

    public void clickPDTreatment() throws InterruptedException {
        pause(2000);
        click(this.PDTreatment);
    }

    public void clickPDAdaptation() throws InterruptedException {
        pause(2000);
        click(this.PDAdaptation);
    }

    public void clickDonorAssignment() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.DonorAssignment);
    }

    public void clickDonorEvaluation() throws InterruptedException {
        pause(5000);
        click(rightArrow);
        click(this.DonorEvaluation);
    }
    public void clickBiopsy() throws InterruptedException {
        pause(3000);
        click(rightArrow);
        pause(3000);
        click(this.Biopsy);
    }

    public void clickTransplant() throws InterruptedException {
        pause(5000);
        click(rightArrow);
        click(this.Transplant);
    }

    public void clickAdequacy() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.AdequacyModule);
    }
    public void clickHDPrescription() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.HDPrescriptionModule);
    }


    public void clickHDCalendar() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.HDCalendar);
    }

    public void clickHDMonitors() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.HDMonitors);
    }

    public void clickHDTreatment() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.HDTreatment);
    }

    public void clickHDTreatmentNurseProfile() throws InterruptedException {
        pause(2000);
        click(this.HDTreatmentNurse);
    }

    public void clickPlanningCare() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.PlanningCare);
    }


    public void clickNursingCare() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.NursingCare);
    }
    public void clickMedicalAppointment() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.MedicalAppointment);
    }
    public void clickRRT() throws InterruptedException {
        pause(2000);
        click(rightArrow);
        pause(2000);
        click(rightArrow);
        click(this.RRT);
    }



    public void clickLabTests() {

        do{
            click(rightArrow);
        }while(!isDisplayed(LabTestsModule));

        click(this.LabTestsModule);

    }



    public void clickAllergies(){
        click(this.AllergiesModule);
    }
    public void clickDiagnoses(){
        click(this.DiagnosesModule);
    }
    public void clickPhysicalAssessment(){
        click(this.PhysicalAssessmentModule);
    }
    public void clickUserMenuOptions(){
        click(this.UserMenu);
    }

    public void clickUserMenuOptionsAfter(){
        driver.switchTo().defaultContent();
        click(this.UserMenu);
    }

    public void clickReportsAndConsultations(){
        click(this.ReportsAndConsultations);
    }

    public void clickConfigurationOptionOfUser(){
        click(this.ConfigurationOptionOfUser);
    }
    public void clickConfigurationOptionModuleOfUser()throws InterruptedException{
        click(this.buttonDropDownProfile);
        pause(300);
        click(this.optionConfigurationMenu);
        pause(4000);
    }

    public void verifyThatTheUserConfigurationOpenedCorrectly()throws InterruptedException{
        pause(1000);
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(this.titleNewPatientConfigurationModule);
        isDisplayed(this.titleNewPatientConfigurationModule);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }


}
