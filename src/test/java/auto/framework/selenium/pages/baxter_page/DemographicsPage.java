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


    // ===================== ASSIGN CENTRE - grid inline edit =====================

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//span[@aria-label='select']")
    private WebElement dropDownCentreInRow;

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//span[contains(@class,'k-input-value-text')]")
    private WebElement inputCentreInRow;

    @FindBy(how = How.XPATH, using = "(//tr[contains(@class,'k-grid-edit-row')]//input[@data-role='datepicker'])[1]")
    private WebElement inputStartDateCentreRow;

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//td[3]//input[@data-role='datepicker']")
    private WebElement inputEndDateCentreRow;

    @FindBy(how = How.XPATH, using = "(//td[contains(@class,'k-command-cell')]//button)[1]")
    private WebElement btnSaveCentreRow;

    @FindBy(how = How.XPATH, using = "(//td[contains(@class,'k-command-cell')]//button)[2]")
    private WebElement btnCancelCentreRow;


    // ===================== SECONDARY CENTRE - grid inline edit =====================

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[@data-container-for='centroId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownSecondaryCentreInRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[@data-container-for='centroId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputSecondaryCentreInRow;

    @FindBy(how = How.XPATH, using = "(//div[@id='rdAsignacionCentrosSecundarios']//tr[contains(@class,'k-grid-edit-row')]//input[@data-role='datepicker'])[1]")
    private WebElement inputStartDateSecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[@data-container-for='fechaFin']//input[@data-role='datepicker']")
    private WebElement inputEndDateSecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[@data-container-for='categoriaId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownCategorySecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[@data-container-for='categoriaId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputCategorySecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-update')]")
    private WebElement btnSaveSecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-cancel')]")
    private WebElement btnCancelSecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-edit')]")
    private WebElement btnEditSecondaryCentreRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionCentrosSecundarios']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-borrar')]")
    private WebElement btnDeleteSecondaryCentreRow;


    // ===================== STAFF MEMBER ASSIGNMENT - grid inline edit =====================

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[@data-container-for='profesionId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownProfessionInRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[@data-container-for='profesionId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputProfessionInRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[@data-container-for='personalId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownStaffNameInRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[@data-container-for='personalId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputStaffNameInRow;

    @FindBy(how = How.XPATH, using = "(//div[@id='rdAsignacionPersonal']//tr[contains(@class,'k-grid-edit-row')]//input[@data-role='datepicker'])[1]")
    private WebElement inputStartDateStaffRow;


    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//input[@name='primario']")
    private WebElement checkboxPrimaryStaff;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-update')]")
    private WebElement btnSaveStaffRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-cancel')]")
    private WebElement btnCancelStaffRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-edit')]")
    private WebElement btnEditStaffRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdAsignacionPersonal']//tbody//tr[2]//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-borrar')]")
    private WebElement btnDeleteStaffRow;


    // ===================== CONTACT ADDRESSES - grid inline edit =====================

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='tipoDireccionId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownContactAddressTypeInRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='tipoDireccionId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputContactAddressTypeInRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='direccion']//input")
    private WebElement inputAddressContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='paisId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownCountryContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='paisId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputCountryContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='provinciaId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownProvinceContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='provinciaId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputProvinceContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='ciudad']//span[contains(@class,'k-picker')]")
    private WebElement dropDownCityContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='ciudad']//span[contains(@class,'k-input-inner')]")
    private WebElement inputCityContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='codPostal']//input")
    private WebElement inputZipCodeContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='zonaSanitariaId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownHealthZoneContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='zonaSanitariaId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputHealthZoneContactAddressRow;

    @FindBy(how = How.XPATH, using = "(//div[@id='rdDireccionContacto']//tr[contains(@class,'k-grid-edit-row')]//input[@data-role='datepicker'])[1]")
    private WebElement inputStartDateContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='fechaFin']//input[@data-role='datepicker']")
    private WebElement inputEndDateContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[@data-container-for='otros']//input")
    private WebElement inputOtherContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-update')]")
    private WebElement btnSaveContactAddressRow;

    @FindBy(how = How.XPATH, using = "//div[@id='rdDireccionContacto']//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-cancel')]")
    private WebElement btnCancelContactAddressRow;


    // ===================== IDENTIFICATION - grid inline edit =====================

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='tipoIdentificacionId']//span[@aria-label='select']")
    private WebElement dropDownIdentificationType;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='tipoIdentificacionId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputIdentificationType;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='valor']//input")
    private WebElement inputIdentificationValue;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='observaciones']//input")
    private WebElement inputIdentificationObservations;

    @FindBy(how = How.XPATH, using = "(//td[contains(@class,'k-command-cell')]//button)[1]")
    private WebElement btnSaveIdentificationRow;

    @FindBy(how = How.XPATH, using = "(//td[contains(@class,'k-command-cell')]//button)[2]")
    private WebElement btnCancelIdentificationRow;

    @FindBy(how = How.XPATH, using = "(//button[@type='button'])[10]")
    private WebElement btnEditIdentificationRow;

    @FindBy(how = How.XPATH, using = "//tbody/tr[@role='row']/td[4]/button[2]")
    private WebElement btnDeleteIdentificationRow;




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
        pause(500);
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

    public void clickNewButtonByIndex(int index) throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement btn = driver.findElement(By.xpath("(//button[contains(@class,'k-grid-add')])[" + index + "]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block: 'center'});", btn);
        pause(500);
        javascriptExecutor.executeScript("arguments[0].click();", btn);
        pause(500);
        driver.switchTo().defaultContent();
    }


    // ===================== ASSIGN CENTRE methods =====================

    public void selectCentreInNewRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownCentreInRow);
        click(dropDownCentreInRow);
        pause(500);
        clickBelowElementByOffset(inputCentreInRow, 40);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterStartDateCentreRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputStartDateCentreRow);
        inputStartDateCentreRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputStartDateCentreRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterEndDateCentreRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputEndDateCentreRow);
        inputEndDateCentreRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputEndDateCentreRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void saveCentreRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnSaveCentreRow);
        click(btnSaveCentreRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void cancelCentreRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnCancelCentreRow);
        click(btnCancelCentreRow);
        pause(500);
        driver.switchTo().parentFrame();
    }


    // ===================== SECONDARY CENTRE methods =====================

    public void selectSecondaryCentreInNewRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownSecondaryCentreInRow);
        click(dropDownSecondaryCentreInRow);
        pause(500);
        clickBelowElementByOffset(inputSecondaryCentreInRow, 60);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterStartDateSecondaryCentreRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputStartDateSecondaryCentreRow);
        inputStartDateSecondaryCentreRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputStartDateSecondaryCentreRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterEndDateSecondaryCentreRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputEndDateSecondaryCentreRow);
        inputEndDateSecondaryCentreRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputEndDateSecondaryCentreRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectCategorySecondaryCentreRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownCategorySecondaryCentreRow);
        click(dropDownCategorySecondaryCentreRow);
        pause(500);
        clickBelowElementByOffset(inputCategorySecondaryCentreRow, 30);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void saveSecondaryCentreRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnSaveSecondaryCentreRow);
        click(btnSaveSecondaryCentreRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void cancelSecondaryCentreRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnCancelSecondaryCentreRow);
        click(btnCancelSecondaryCentreRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickEditSecondaryCentreButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(btnEditSecondaryCentreRow);
        scrollToElementMove(btnEditSecondaryCentreRow);
        click(btnEditSecondaryCentreRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteSecondaryCentreButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(btnDeleteSecondaryCentreRow);
        scrollToElementMove(btnDeleteSecondaryCentreRow);
        click(btnDeleteSecondaryCentreRow);
        pause(500);
        driver.switchTo().parentFrame();
    }


    // ===================== STAFF MEMBER ASSIGNMENT methods =====================

    public void selectProfessionInNewRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownProfessionInRow);
        click(dropDownProfessionInRow);
        pause(500);
        clickBelowElementByOffset(inputProfessionInRow, 120);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectStaffNameInNewRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownStaffNameInRow);
        click(dropDownStaffNameInRow);
        pause(500);
        clickBelowElementByOffset(inputStaffNameInRow, 80);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterStartDateStaffRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputStartDateStaffRow);
        inputStartDateStaffRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputStartDateStaffRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void checkPrimaryStaff() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(checkboxPrimaryStaff);
        click(checkboxPrimaryStaff);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void saveStaffRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnSaveStaffRow);
        click(btnSaveStaffRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void cancelStaffRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnCancelStaffRow);
        click(btnCancelStaffRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickEditStaffButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(btnEditStaffRow);
        scrollToElementMove(btnEditStaffRow);
        click(btnEditStaffRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteStaffButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(btnDeleteStaffRow);
        scrollToElementMove(btnDeleteStaffRow);
        click(btnDeleteStaffRow);
        pause(500);
        driver.switchTo().parentFrame();
    }


    // ===================== CONTACT ADDRESSES methods =====================

    public void selectContactAddressTypeInNewRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownContactAddressTypeInRow);
        click(dropDownContactAddressTypeInRow);
        pause(500);
        clickBelowElementByOffset(inputContactAddressTypeInRow, 40);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterAddressContactAddressRow(String address) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputAddressContactAddressRow);
        inputAddressContactAddressRow.clear();
        write(inputAddressContactAddressRow, address);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectCountryContactAddressRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownCountryContactAddressRow);
        click(dropDownCountryContactAddressRow);
        pause(500);
        clickBelowElementByOffset(inputCountryContactAddressRow, 40);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectProvinceContactAddressRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownProvinceContactAddressRow);
        click(dropDownProvinceContactAddressRow);
        pause(500);
        clickBelowElementByOffset(inputProvinceContactAddressRow, 90);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectCityContactAddressRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownCityContactAddressRow);
        click(dropDownCityContactAddressRow);
        pause(500);
        clickBelowElementByOffset(inputCityContactAddressRow, 90);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterZipCodeContactAddressRow(String zipCode) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputZipCodeContactAddressRow);
        inputZipCodeContactAddressRow.clear();
        write(inputZipCodeContactAddressRow, zipCode);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectHealthZoneContactAddressRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownHealthZoneContactAddressRow);
        click(dropDownHealthZoneContactAddressRow);
        pause(500);
        clickBelowElementByOffset(inputHealthZoneContactAddressRow, 40);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterStartDateContactAddressRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputStartDateContactAddressRow);
        click(inputStartDateContactAddressRow);
        inputStartDateContactAddressRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputStartDateContactAddressRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterEndDateContactAddressRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputEndDateContactAddressRow);
        click(inputEndDateContactAddressRow);
        inputEndDateContactAddressRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputEndDateContactAddressRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterOtherContactAddressRow(String other) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputOtherContactAddressRow);
        inputOtherContactAddressRow.clear();
        write(inputOtherContactAddressRow, other);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void saveContactAddressRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnSaveContactAddressRow);
        click(btnSaveContactAddressRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void cancelContactAddressRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnCancelContactAddressRow);
        click(btnCancelContactAddressRow);
        pause(500);
        driver.switchTo().parentFrame();
    }


    // ===================== IDENTIFICATION methods =====================

    public void selectIdentificationType() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dropDownIdentificationType);
        click(dropDownIdentificationType);
        pause(500);
        clickBelowElementByOffset(inputIdentificationType, 40);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterIdentificationValue(String value) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputIdentificationValue);
        inputIdentificationValue.sendKeys(Keys.CONTROL + "a");
        inputIdentificationValue.sendKeys(Keys.DELETE);
        inputIdentificationValue.sendKeys(Keys.ENTER);
        write(inputIdentificationValue, value);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterIdentificationObservations(String observations) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputIdentificationObservations);
        inputIdentificationObservations.sendKeys(Keys.CONTROL + "a");
        inputIdentificationObservations.sendKeys(Keys.DELETE);
        inputIdentificationObservations.sendKeys(Keys.ENTER);
        write(inputIdentificationObservations, observations);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void saveIdentificationRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnSaveIdentificationRow);
        click(btnSaveIdentificationRow);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void cancelIdentificationRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnCancelIdentificationRow);
        click(btnCancelIdentificationRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickEditIdentificationButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(btnEditIdentificationRow);
        click(btnEditIdentificationRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickButtonEditIdentifications()throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(btnEditIdentificationRow);
        scrollToElementMove(btnEditIdentificationRow);
        click(btnEditIdentificationRow);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDeleteIdentifications()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(btnDeleteIdentificationRow);
        scrollToElementMove(btnDeleteIdentificationRow);
        click(btnDeleteIdentificationRow);
        pause(500);
        driver.switchTo().parentFrame();
    }
}