package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class DemographicsPage extends BasePage<DemographicsPage> {


    // --- x_title & menu ---

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x_title')]")
    private WebElement xTitle;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'x_title')][.//h2[@translate-once='MasterPageAdmin_Label_Nuevo_Paciente']]//i[contains(@class,'icon-three-points')]")
    private WebElement menuThreePointsNewPatient;


    // ===================== NEW PATIENT - Basic inputs =====================

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.paciente.nombre']")
    private WebElement inputName;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.paciente.nombreDeUso']")
    private WebElement inputNombreDeUso;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.paciente.apellido1']")
    private WebElement inputLastName;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.paciente.apellido2']")
    private WebElement inputSurname2;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.paciente.numHistoria']")
    private WebElement inputIdPatient;


    // ===================== NEW PATIENT - Datepickers =====================

    @FindBy(how = How.XPATH, using = "//input[@kendo-date-picker='$ctrl.fechaNacimiento.kCtrl']")
    private WebElement inputDateOfBirth;

    @FindBy(how = How.XPATH, using = "//input[@data-role='datepicker'][@k-ng-model='$ctrl.paciente.fecha1Dialisis']")
    private WebElement inputDate1stDialysis;


    // ===================== NEW PATIENT - Kendo comboboxes =====================

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.sexo.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownGender;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.sexo.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputGender;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.grupoSanguineo.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownBloodGroup;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.grupoSanguineo.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputBloodGroup;

    @FindBy(how = How.XPATH, using = "//span[.//*[@k-ng-model='$ctrl.paciente.procedenciaId']]//button[@aria-label='expand combobox']")
    private WebElement dropDownReferredBy;

    @FindBy(how = How.XPATH, using = "//span[.//*[@k-ng-model='$ctrl.paciente.procedenciaId']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputReferredBy;

    @FindBy(how = How.XPATH, using = "//div[12]//span[1]//input[1]")
    private WebElement inputReferredByNewPatients;


    // ===================== ASSIGNMENTS =====================

    @FindBy(how = How.XPATH, using = "//selector-centros//span[@role='button'][@aria-label='select']")
    private WebElement dropDownPrimaryCenter;

    @FindBy(how = How.XPATH, using = "(//span[@class='k-input-value-text ng-scope'])[1]")
    private WebElement inputPrimaryCenter;

    @FindBy(how = How.XPATH, using = "//input[@data-role='datepicker'][@k-ng-model='$ctrl.centroPacienteTrabajo.fechaInicio']")
    private WebElement inputDateAdmission;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.grupoPacientes.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownPatientGroup;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.grupoPacientes.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputPatientGroup;


    // ===================== CLINICAL STATUS =====================

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.estadoClinico.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownClinicalStatus;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.estadoClinico.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputClinicalStatus;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.tipoModalidad.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownMethod;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.tipoModalidad.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputMethod;

    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[10]")
    private WebElement dropDownSubmethod;

    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[13]")
    private WebElement inputSubmethod;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.ubicacion.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownLocation;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.ubicacion.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputLocation;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.asistencia.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownAttendance;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.asistencia.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputAttendance;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.sistema.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownMonitorBrand;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.sistema.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputMonitorBrand;

    @FindBy(how = How.XPATH, using = "//input[@data-role='datepicker'][@k-ng-model='$ctrl.modalidad.fechaInicio']")
    private WebElement inputStartDate;

    @FindBy(how = How.XPATH, using = "//span[.//*[@k-ng-model='$ctrl.modalidad.procedencia.id']]//button[@aria-label='expand combobox']")
    private WebElement dropDownModalidadReferredBy;

    @FindBy(how = How.XPATH, using = "//span[.//*[@k-ng-model='$ctrl.modalidad.procedencia.id']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputModalidadReferredBy;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.motivoInicio.kCtrl']]//button[@aria-label='expand combobox']")
    private WebElement dropDownReasonForStart;

    @FindBy(how = How.XPATH, using = "//span[.//*[@kendo-combobox='$ctrl.motivoInicio.kCtrl']]//input[contains(@class,'k-input-inner')]")
    private WebElement inputReasonForStart;

    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[14]")
    private WebElement dropDownReferredByClinicalStatus;

    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[18]")
    private WebElement inputReferredByClinicalStatus;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Foianini, Pasquale']")
    private WebElement buttonPatientSelectedOnPrincipalMenu;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Demographics']")
    private WebElement titleDemographics;

    @FindBy(how = How.XPATH, using = "(//div[@ng-click=\"$ctrl.clickChevron('Demograficos_Label_Asignacion_Centro')\"])[1]")
    private WebElement dropDownCenterAssignmentDemographics;




    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********


    private void switchToContentFrame() {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
    }

    private void switchBack() {
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    private void selectKendoOption(WebElement expandBtn, WebElement inputRef) throws InterruptedException {
        scrollToElementMove(expandBtn);
        click(expandBtn);
        pause(500);
        clickBelowElementByOffset(inputRef, 40);
        pause(500);
    }


    // --- x_title & menu ---

    public void verifyXTitleIsVisibleWithScroll() throws InterruptedException {
        switchToContentFrame();
        waitElements(xTitle);
        pause(500);
        scrollToElementMove(xTitle);
        pause(500);
        xTitle.isDisplayed();
        switchBack();
    }

    public void clickThreePointsMenu() throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(menuThreePointsNewPatient);
        click(menuThreePointsNewPatient);
        pause(500);
        switchBack();
    }

    public void clickOptionInThreePointsMenu(String option) throws InterruptedException {
        switchToContentFrame();
        pause(500);
        click(By.xpath(
                "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                        "//a[not(contains(@class,'ng-hide'))]//span[normalize-space(.)='" + option + "']"
        ));
        pause(500);
        switchBack();
    }


    // ===================== NEW PATIENT methods =====================

    public void enterName(String name) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputName);
        inputName.clear();
        write(inputName, name);
        pause(500);
        switchBack();
    }

    public void enterNombreDeUso(String nombreDeUso) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputNombreDeUso);
        inputNombreDeUso.clear();
        write(inputNombreDeUso, nombreDeUso);
        pause(500);
        switchBack();
    }

    public void enterLastName(String lastName) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputLastName);
        inputLastName.clear();
        write(inputLastName, lastName);
        pause(500);
        switchBack();
    }

    public void enterSurname2(String surname2) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputSurname2);
        inputSurname2.clear();
        write(inputSurname2, surname2);
        pause(500);
        switchBack();
    }

    public void enterIdPatient(String id) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputIdPatient);
        inputIdPatient.clear();
        write(inputIdPatient, id);
        pause(500);
        switchBack();
    }

    public void enterDateOfBirth(String date) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputDateOfBirth);
        inputDateOfBirth.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputDateOfBirth.sendKeys(date);
        pause(500);
        switchBack();
    }

    public void enterDate1stDialysis(String date) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputDate1stDialysis);
        inputDate1stDialysis.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputDate1stDialysis.sendKeys(date);
        pause(500);
        switchBack();
    }

    public void selectGender() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownGender, inputGender);
        switchBack();
    }

    public void selectBloodGroup() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownBloodGroup, inputBloodGroup);
        switchBack();
    }

    public void selectReferredBy() throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(dropDownReferredBy);
        click(dropDownReferredBy);
        pause(500);
        clickBelowElementByOffset(inputReferredByNewPatients,40);
        //click(By.xpath("(//li[@tabindex='-1'])[1]"));
        pause(500);
        switchBack();
    }


    // ===================== ASSIGNMENTS methods =====================

    public void selectPrimaryCenter() throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(dropDownPrimaryCenter);
        click(dropDownPrimaryCenter);
        pause(500);
        //click(By.xpath("//ul[@role='listbox']//li[1]"));
        clickBelowElementByOffset(inputPrimaryCenter,100);
        pause(500);
        switchBack();
    }

    public void enterDateAdmission(String date) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputDateAdmission);
        inputDateAdmission.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputDateAdmission.sendKeys(date);
        pause(500);
        switchBack();
    }

    public void selectPatientGroup() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownPatientGroup, inputPatientGroup);
        switchBack();
    }


    // ===================== CLINICAL STATUS methods =====================

    public void selectClinicalStatus() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownClinicalStatus, inputClinicalStatus);
        switchBack();
    }

    public void selectMethod() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownMethod, inputMethod);
        switchBack();
    }

    public void selectSubmethod() throws InterruptedException {
        switchToContentFrame();
        pause(300);
        click(dropDownSubmethod);
        pause(500);
        clickBelowElementByOffset(inputSubmethod,80);
        pause(300);
        switchBack();
    }

    public void selectLocation() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownLocation, inputLocation);
        switchBack();
    }

    public void selectAttendance() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownAttendance, inputAttendance);
        switchBack();
    }

    public void selectMonitorBrand() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownMonitorBrand, inputMonitorBrand);
        switchBack();
    }

    public void enterStartDate(String date) throws InterruptedException {
        switchToContentFrame();
        scrollToElementMove(inputStartDate);
        inputStartDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputStartDate.sendKeys(date);
        pause(500);
        switchBack();
    }

    public void selectModalidadReferredBy() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownModalidadReferredBy, inputModalidadReferredBy);
        switchBack();
    }

    public void selectReasonForStart() throws InterruptedException {
        switchToContentFrame();
        selectKendoOption(dropDownReasonForStart, inputReasonForStart);
        switchBack();
    }

    public void selectTheReferredByClinicalStatus()throws InterruptedException {
        switchToContentFrame();
        pause(300);
        click(dropDownReferredByClinicalStatus);
        pause(300);
        clickBelowElementByOffset(inputReferredByClinicalStatus,100);
        switchBack();

    }

    public void clickOnTheSelectedPatient()throws InterruptedException {
        pause(300);
        click(buttonPatientSelectedOnPrincipalMenu);
        pause(500);
    }

    public void verifyThatTheDemographicModuleOpenedCorrectly()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(titleDemographics);
        pause(500);
        titleDemographics.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void tryToAddANewCenterToThePatient()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(titleDemographics);
        pause(500);
        titleDemographics.isDisplayed();
        driver.switchTo().parentFrame();

    }
}