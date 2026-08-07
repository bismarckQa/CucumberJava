package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

@LazyComponent
public class HDTreatmentPage extends BasePage<HDTreatmentPage> {
    @FindBy(how = How.XPATH, using = "//a[@translate-once='TratamientoHD_boton_historial' or normalize-space(.)='Treatment history']")
    private WebElement titleHDTreatment;
    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[1]")
    private WebElement threeDotsMenu;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New treatment')]")
    private WebElement newTreatmentButton;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Preparation')]")
    private WebElement preparationTabButton;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Admin. drugs/other')]")
    private WebElement drugsOtherTabButton;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Session')]")
    private WebElement sessionTabButton;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Location']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Center']/following-sibling::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement centerDropdownInLocation;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Location']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Room']/following-sibling::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement roomDropdownInLocation;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Location']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Shift']/following-sibling::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement shiftDropdownInLocation;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Location']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Location']/following-sibling::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement locationDropdownInLocation;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Location']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Monitors']/following-sibling::span[contains(@class,'k-combobox')][1]")
    private WebElement monitorDropdownInLocation;
    @FindBy(how = How.XPATH, using = "//*[@id='datosAccesoId']//label[normalize-space(.)='Arterial needle size' or normalize-space(.)='Single-puncture needle']/following::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement arterialNeedleDropdownInAccessData;
    @FindBy(how = How.XPATH, using = "//*[@id='datosAccesoId']//label[normalize-space(.)='Venous needle size']/following::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement venousNeedleDropdownInAccessData;
    @FindBy(how = How.XPATH, using = "//*[@id='datosAccesoId']//label[normalize-space(.)='Access']/following::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement accessDropdownInAccessData;
    @FindBy(how = How.XPATH, using = "//*[@id='liquidosId']//label[normalize-space(.)='Acid bath 1']/ancestor::div[contains(@class,'form-group')][1]//span[contains(@class,'k-dropdownlist')][1]")
    private WebElement acidBath1DropdownInFluids;
    @FindBy(how = How.XPATH, using = "//*[@id='liquidosId']//label[normalize-space(.)='Acid bath 2']/ancestor::div[contains(@class,'form-group')][1]//span[contains(@class,'k-dropdownlist')][1]")
    private WebElement acidBath2DropdownInFluids;
    @FindBy(how = How.XPATH, using = "//h5[normalize-space(.)='Other consumables']/following::button[@translate-once='Modal_Button_Añadir' or normalize-space(.)='Add'][1]")
    private WebElement addOtherConsumablesButton;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//input[@ng-model='tratManager.tratamientoActual.otrosFungiblesTtoHd[indexOtrosFungiblesPopUp].tipoFungibleId']/following-sibling::span[contains(@class,'k-dropdownlist')][1]")
    private WebElement otherConsumablesNameDropdown;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//input[@ng-model='tratManager.tratamientoActual.otrosFungiblesTtoHd[indexOtrosFungiblesPopUp].lote']")
    private WebElement otherConsumablesLotNumberInput;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//input[@ng-model='tratManager.tratamientoActual.otrosFungiblesTtoHd[indexOtrosFungiblesPopUp].fechaCaducidad']")
    private WebElement otherConsumablesExpiryDateInput;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//button[@translate-once='GestorContraseña_Label_Guardar' or normalize-space(.)='Save']")
    private WebElement otherConsumablesSaveButton;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//button[@translate-once='DeleteConfirm_Label_Cancelar' or normalize-space(.)='Cancel']")
    private WebElement otherConsumablesCancelButton;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//h4[@class='modal-title']//span[normalize-space(.)='NEW' or normalize-space(.)='Edit']")
    private WebElement otherConsumablesModalTitle;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-content')]//label[normalize-space(.)='Name']")
    private WebElement otherConsumablesNameLabel;
    @FindBy(how = How.XPATH, using = "//*[@id='modalValueChanged']//textarea")
    private WebElement valueChangedReasonTextarea;
    @FindBy(how = How.XPATH, using = "//*[@id='modalValueChanged']//button[@translate-once='Modal_Button_Cancelar' or normalize-space(.)='Cancel']")
    private WebElement valueChangedCancelButton;
    @FindBy(how = How.XPATH, using = "//*[@id='modalValueChanged']//button[@translate-once='Modal_Button_OK' or normalize-space(.)='OK']")
    private WebElement valueChangedOkButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"estadoPaciente\"]")
    private WebElement checkboxPatientStatus;
    @FindBy(how = How.XPATH, using = "//div[@class='modal-dialog ']//div[@class='modal-content']")
    private WebElement errorWindowsAlert;
    @FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary'])[1]")
    private WebElement oKErrorWindowsButton;
    @FindBy(how = How.XPATH, using = "(//button[@ng-click='$ctrl.habilitarImportarLectura()'])[1]")
    private WebElement newObservationButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"locked_datacell_0_0\"]/button[1]")
    private WebElement saveObservation;
    @FindBy(how = How.XPATH, using = "//*[@id='historicoTrat']/preceding::div[contains(@class,'historico-presc')][1]//a[@translate-once='TratamientoHD_boton_historial' or normalize-space(.)='Treatment history'][1]")
    private WebElement treatmentHistoryButton;
    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Top'])[1]")
    private WebElement upPageArrow;

    @FindBy(how = How.XPATH, using = "//label[contains(@for,'step-circle-5')]")
    private WebElement buttonFinalSignature;

    @FindBy(how = How.XPATH, using = "(//button[@role='button'])[9]")
    private WebElement dropDownSignedNephrologist;
    @FindBy(how = How.XPATH, using = "(//li[contains(@tabindex,'-1')])[1]")
    private WebElement optionSignedNephrologist;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Final signature']/ancestor::div[contains(@class,'x_panel')][1]//textarea[@name='notas']")
    private WebElement finalSignatureNotesTextarea;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Final signature']/ancestor::div[contains(@class,'x_panel')][1]//input[@ng-model='tratManager.tratamientoActual.tratamientoFinalizado']")
    private WebElement finalizedCheckboxInput;
    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Final signature']/ancestor::div[contains(@class,'x_panel')][1]//input[@ng-model='tratManager.tratamientoActual.tratamientoFinalizado']/following-sibling::label[contains(@class,'check-box')][1]")
    private WebElement checkBoxFinalized;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-three-points')]")
    private WebElement buttonThreePointsFinalSignature;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Save')]")
    private WebElement saveFinalSignature;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Save')]")
    private WebElement titleAdditionalSignature;

    @FindBy(how = How.XPATH, using = "//span[@class='fa fa-angle-down']")
    private WebElement buttonDropDownProfile;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Configuration')]")
    private WebElement optionConfigurationMenu;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Formularios')])[2]")
    private WebElement optionFormSideBar;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'k-icon k-i-expand')])[4]")
    private WebElement dropDownHDOption;
    @FindBy(how = How.XPATH, using = "//span[@class='k-treeview-leaf-text'][contains(.,'HD Treatment')]")
    private WebElement optionHDTreatment;

    //Botones formulario

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/pagina-config-formularios/div/div/div/div/div[1]/div/div[2]/div[2]/tabla-controles/div/div[3]/table/tbody/tr[4]/td[6]/button")
    private WebElement buttonEditDesinfectedBy;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[8]")
    private WebElement checkBoxRequiredDesinfectedBy;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[6]")
    private WebElement buttonSaveDesinfectedBy;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/pagina-config-formularios/div/div/div/div/div[1]/div/div[2]/div[2]/tabla-controles/div/div[3]/table/tbody/tr[12]/td[6]/button")
    private WebElement buttonEditSignedNephologist;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[24]")
    private WebElement checkBoxSignedNephologist;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[14]")
    private WebElement buttonSaveSignedNephologist;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/pagina-config-formularios/div/div/div/div/div[1]/div/div[2]/div[2]/tabla-controles/div/div[3]/table/tbody/tr[18]/td[6]/button")
    private WebElement buttonEditNotes;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[36]")
    private WebElement checkBoxNotes;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[20]")
    private WebElement buttonSaveNotes;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/pagina-config-formularios/div/div/div/div/div[1]/div/div[2]/div[2]/tabla-controles/div/div[3]/table/tbody/tr[31]/td[6]/button")
    private WebElement buttonEditMonitor;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[62]")
    private WebElement checkBoxMonitor;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[33]")
    private WebElement buttonSaveMonitor;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/pagina-config-formularios/div/div/div/div/div[1]/div/div[2]/div[2]/tabla-controles/div/div[3]/table/tbody/tr[32]/td[6]/button")
    private WebElement buttonEditLocation;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[64]")
    private WebElement checkBoxLocation;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[34]")
    private WebElement buttonSaveLocation;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/pagina-config-formularios/div/div/div/div/div[1]/div/div[2]/div[2]/tabla-controles/div/div[3]/table/tbody/tr[33]/td[6]/button")
    private WebElement buttonEditRoom;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[66]")
    private WebElement checkBoxRoom;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[35]")
    private WebElement buttonSaveRoom;

    @FindBy(how = How.XPATH, using = "//button[contains(@translate-once,'OK')]")
    private WebElement buttonOkWarning;



    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[2]")
    private WebElement buttonDropDownPod;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Room A')]")
    private WebElement optionRoomAPod;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[3]")
    private WebElement buttonDropDownShift;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Morning')]")
    private WebElement optionShiftMorning;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[4]")
    private WebElement buttonDropDownStation;
    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'3')])[15]")
    private WebElement optionStation2;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[1]")
    private WebElement buttonDropDownHdMachine;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'Ak98 (1)')]")
    private WebElement optionHdMachineAk98;

    @FindBy(how = How.XPATH, using = "(//span[contains(@type,'button')])[12]")
    private WebElement buttonDropDownDesinfectedBy;
    @FindBy(how = How.XPATH, using = "//li[contains(.,'NurseAr, Anna Rita')]")
    private WebElement optionDesinfectedBy;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Traceability')]")
    private WebElement titleTraceability;

    @FindBy(how = How.XPATH, using = "//textarea[@required='required']")
    private WebElement textAreaNotes;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div/div[3]/div/div/div[1]/h2")
    private WebElement titleIsNotShowData;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-three-points']")
    private WebElement buttonThreePointsHdTreatment;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'New treatment')]")
    private WebElement buttonNewHdTreatment;

    @FindBy(how = How.XPATH, using = "//label[contains(@for,'step-circle-1')]")
    private WebElement buttonPreparationArea;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div[1]/div[3]/ng-form/div[3]/div/ng-form/div[1]/div[2]/form/div/div[2]/div/div[1]/box-personal-logado/input")
    private WebElement inputSignedBy;


    @FindBy(how = How.XPATH, using = "//button[contains(.,'Shift')]")
    private WebElement buttonShift;

    @FindBy(how = How.XPATH, using = "//span[@class='rpText'][contains(.,'Medicamentos')]")
    private WebElement optionMedicationsSideBar ;

    @FindBy(how = How.XPATH, using = "//label[contains(@for,'step-circle-6')]")
    private WebElement buttonLabsResults ;

    @FindBy(how = How.XPATH, using = "(//label[@class='radio-label'])[4]")
    private WebElement checkBoxLast12Months ;

    @FindBy(how = How.XPATH, using = "(//label[@class='radio-label'])[3]")
    private WebElement checkBoxLast6Months ;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class,'icon-three-points')])[1]")
    private WebElement buttonThreePointsLabResults ;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class,'icon-three-points')])[2]")
    private WebElement buttonThreePointsLabResultsCenter ;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Save')]")
    private WebElement buttonSaveLabResults ;

    @FindBy(how = How.XPATH, using = "//label[contains(@for,'step-circle-3')]")
    private WebElement buttonDrugsOther ;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Lab tests')]")
    private WebElement titleLabTest ;

    @FindBy(how = How.XPATH, using = "//span[@class='rpText'][contains(.,'Terapia HD')]")
    private WebElement optionHdTherapySideBar ;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'rdExpand')])[1]")
    private WebElement dropDownMachineDisinfection ;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[2]")
    private WebElement dropDownButtonCenter ;

    @FindBy(how = How.XPATH, using = "(//li[contains(@tabindex,'-1')])[34]")
    private WebElement optionCenterCentro1 ;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'checkbox')])[7]")
    private WebElement checkBoxConfirmTheMostRecentLaboratory ;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[1]")
    private WebElement dropDownProfileLabResults ;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'TratamientoHD')]")
    private WebElement optionProfileLabResults ;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class,'fa fa-history')])[2]")
    private WebElement widgetHistory ;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Medication administration history')]")
    private WebElement titleModalMedicationAdministrationHistory ;

    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'radio-label')])[8]")
    private WebElement checkBoxLast12MonthsModalMedicationHistory ;

    @FindBy(how = How.XPATH, using = "(//a[@href='javascript:void(0);'][contains(.,'Close')])[3]")
    private WebElement buttonCloseModalMedicationHistory ;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/medicacion-prescrita-trat-hd[1]/div[1]/div[1]/div[1]/span[1]/div[1]/label[1]")
    private WebElement checkBoxPrescribedShowAllMedications ;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div[1]/div[3]/div/div/div[1]/div/medicacion-prescrita-trat-hd/div/div/div[2]/div[2]/div/div[1]/div[1]/div[1]/span[2]")
    private WebElement medicamentToMoved ;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/medicacion-administrada-trat-hd[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
    private WebElement zoneMedicamentToMoved ;

    @FindBy(how = How.XPATH, using = "//h4[contains(.,'Administer medication')]")
    private WebElement titleModalAdministerMedication ;


    @FindBy(how = How.XPATH, using = "//i[@id='collapseFlechaNAD0']cione")
    private WebElement dropDownFirstMedicament ;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Lab tests')]")
    private WebElement titlePrescribedMedication ;

    @FindBy(how = How.XPATH, using = "//div[@id='arrastrarAqui']")
    private WebElement dropArea;

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tratHD-farmacos-prescritos-sesion-actual')]")
    private WebElement draggableElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"locked_datacell_0_0\"]/button[2]")
    private WebElement removeButtonOfNewObservation;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Delete')]")
    private WebElement deleteTreatmentButton;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement inputPasswordDeleteAlertRemoveWindow;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@id,'TextMotivo')]")
    private WebElement textAreaReason ;

    @FindBy(how = How.XPATH, using = "//input[@value='Accept']")
    private WebElement buttonAcceptDeleteAlertRemoveWindows;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Unverified')]")
    private WebElement patientStatusUnverifiedText;

    @FindBy(how = How.XPATH, using = "(//input[@title='SBP'])[1]")
    private WebElement sbp;

    @FindBy(how = How.XPATH, using = "(//input[@title='DBP'])[1]")
    private WebElement dbp;

    @FindBy(how = How.XPATH, using = "((//input[@title='Pulse'])[1]")
    private WebElement pulse;

    @FindBy(how = How.XPATH, using = "(//input)[135]")
    private WebElement CurrentVhPp;

    @FindBy(how = How.XPATH, using = "(//input)[137]")
    private WebElement TheoreticalVhPp;

    @FindBy(how = How.XPATH, using = "(//input[@title='Pump velocity'])[1]")
    private WebElement pumpVelocity;

    @FindBy(how = How.XPATH, using = "(//input[@title='Pump velocity'])[1]")
    private WebElement arterialPressure;

    @FindBy(how = How.XPATH, using = "(//input[@title='Venous pressure'])[1]")
    private WebElement venousPressure;
    @FindBy(how = How.XPATH, using = "((//input[@title='TMP'])[1]")
    private WebElement tmp;
    @FindBy(how = How.XPATH, using = "(//input[@title='Cond. Plasma'])[1]")
    private WebElement condPlasma;
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Verified')]")
    private WebElement verifiedText;
    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'check-box')])[1]")
    private WebElement checkBoxModalConfirmTheMostRecentLaboratory;
    @FindBy(how = How.XPATH, using = "(//button[@type='button'])[4]")
    private WebElement buttonAddModalAdministerMedication;

    @FindBy(how = How.XPATH, using = "(//button[@type='button'])[3]")
    private WebElement buttonCancelModalAdministerMedication;

    public void isDisplayedVerifiedText(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(verifiedText);
        driver.switchTo().parentFrame();
    }
    public void writeCondPlasma (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(condPlasma,data);
        driver.switchTo().parentFrame();
        pause(500);
    }

    public void writeTMP (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(tmp,data);
        driver.switchTo().parentFrame();
        pause(500);
    }

    public void writeVenousPressure (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(venousPressure,data);
        driver.switchTo().parentFrame();
        pause(500);
    }
    public void writeArterialPressure (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(arterialPressure,data);
        driver.switchTo().parentFrame();
        pause(500);
    }
    public void writePumpVelocity (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(pumpVelocity,data);
        driver.switchTo().parentFrame();
        pause(500);
    }

    public void writeTheoreticalVhPp (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(TheoreticalVhPp,data);
        driver.switchTo().parentFrame();
        pause(500);
    }
    public void writeCurrentVhPp (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(CurrentVhPp,data);
        driver.switchTo().parentFrame();
        pause(500);
    }

    public void writePulse (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(pulse,data);
        driver.switchTo().parentFrame();
        pause(500);
    }


    public void writeDBP (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(dbp,data);
        driver.switchTo().parentFrame();
        pause(500);
    }
    public void isDisplayedTheTittle() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(titleHDTreatment);
        titleHDTreatment.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void clickRemoveNewObservation(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(removeButtonOfNewObservation);
        driver.switchTo().parentFrame();
    }

    public void clickThreeDotsMenu() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(threeDotsMenu);
        driver.switchTo().parentFrame();
    }

    public void clickTreatmentButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(newTreatmentButton);
        driver.switchTo().parentFrame();
    }

    public void selectCenterInLocation(String center) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(centerDropdownInLocation, center);
        driver.switchTo().parentFrame();
    }

    public void selectRoomInLocation(String room) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(roomDropdownInLocation, room);
        driver.switchTo().parentFrame();
    }

    public void selectShiftInLocation(String shift) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(shiftDropdownInLocation, shift);
        driver.switchTo().parentFrame();
    }

    public void selectLocationInLocation(String location) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(locationDropdownInLocation, location);
        driver.switchTo().parentFrame();
    }

    public void selectMonitorInLocation(String monitor) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(monitorDropdownInLocation, monitor);
        driver.switchTo().parentFrame();
    }


    public void selectArterialNeedleSizeInAccessData(String needleSize) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(arterialNeedleDropdownInAccessData, needleSize);
        driver.switchTo().parentFrame();
    }

    public void selectVenousNeedleSizeInAccessData(String needleSize) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(venousNeedleDropdownInAccessData, needleSize);
        driver.switchTo().parentFrame();
    }

    public void selectFirstAccessInAccessData() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(accessDropdownInAccessData);
        click(accessDropdownInAccessData);
        pause(500);
        WebElement firstOption = waitElements(By.xpath("(//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.) != ''])[1]")).get(0);
        click(firstOption);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectAcidBath1InFluids(String acidBath) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(acidBath1DropdownInFluids);
        selectKendoDropdownOption(acidBath1DropdownInFluids, acidBath);
        driver.switchTo().parentFrame();
    }

    public void selectAcidBath2InFluids(String acidBath) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(acidBath2DropdownInFluids);
        selectKendoDropdownOption(acidBath2DropdownInFluids, acidBath);
        driver.switchTo().parentFrame();
    }

    public void clickAddOtherConsumables() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(addOtherConsumablesButton);
        click(addOtherConsumablesButton);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void verifyOtherConsumablesModalIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(otherConsumablesModalTitle);
        isDisplayed(otherConsumablesNameLabel);
        driver.switchTo().parentFrame();
    }

    public void selectOtherConsumablesName(String name) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        selectKendoDropdownOption(otherConsumablesNameDropdown, name);
        driver.switchTo().parentFrame();
    }

    public void enterOtherConsumablesLotNumber(String lotNumber) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(otherConsumablesLotNumberInput);
        otherConsumablesLotNumberInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        otherConsumablesLotNumberInput.sendKeys(Keys.DELETE);
        write(otherConsumablesLotNumberInput, lotNumber);
        driver.switchTo().parentFrame();
    }

    public void enterOtherConsumablesExpiryDate(String expiryDate) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(otherConsumablesExpiryDateInput);
        otherConsumablesExpiryDateInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        otherConsumablesExpiryDateInput.sendKeys(Keys.DELETE);
        write(otherConsumablesExpiryDateInput, expiryDate);
        driver.switchTo().parentFrame();
    }

    public void clickOtherConsumablesModalButton(String button) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        if ("Save".equalsIgnoreCase(button)) {
            click(otherConsumablesSaveButton);
        } else if ("Cancel".equalsIgnoreCase(button)) {
            click(otherConsumablesCancelButton);
        } else {
            throw new IllegalArgumentException("Unsupported Other consumables modal button: " + button);
        }
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void fillValueChangedReasonAndChooseButton(String reason, String button) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        if (reason != null && !reason.isBlank()) {
            click(valueChangedReasonTextarea);
            valueChangedReasonTextarea.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            valueChangedReasonTextarea.sendKeys(Keys.DELETE);
            write(valueChangedReasonTextarea, reason.trim());
            pause(300);
        }
        if ("OK".equalsIgnoreCase(button)) {
            click(valueChangedOkButton);
        } else if ("Cancel".equalsIgnoreCase(button)) {
            click(valueChangedCancelButton);
        } else {
            throw new IllegalArgumentException("Unsupported value changed modal button: " + button);
        }
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void isDisplayedPreparationTab() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(preparationTabButton);
        driver.switchTo().parentFrame();
    }

    public void isDisplayedAdminDrugsOther() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(drugsOtherTabButton);
        driver.switchTo().parentFrame();
    }

    public void isDisplayedAlertWidows() {
        isDisplayed(errorWindowsAlert);
    }

    public void clickOkButtonAlert() {
        click(oKErrorWindowsButton);
    }

    public void clickSessionTabButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(sessionTabButton);
        driver.switchTo().parentFrame();
    }

    public void clickPreparationTabButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(preparationTabButton);
        driver.switchTo().parentFrame();
    }

    public void clickDrugsOtherTabButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(drugsOtherTabButton);
        driver.switchTo().parentFrame();
    }

    public void clickFinalSignatureTabButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(buttonFinalSignature);
        driver.switchTo().parentFrame();
    }

    public void enterNotesInFinalSignature(String notes) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(finalSignatureNotesTextarea);
        click(finalSignatureNotesTextarea);
        finalSignatureNotesTextarea.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        finalSignatureNotesTextarea.sendKeys(Keys.DELETE);
        write(finalSignatureNotesTextarea, notes);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void setFinalizedCheckboxState(String state) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(finalizedCheckboxInput);
        boolean shouldBeChecked;
        if ("checked".equalsIgnoreCase(state)) {
            shouldBeChecked = true;
        } else if ("unchecked".equalsIgnoreCase(state)) {
            shouldBeChecked = false;
        } else {
            throw new IllegalArgumentException("Unsupported finalized checkbox state: " + state);
        }
        if (finalizedCheckboxInput.isSelected() != shouldBeChecked) {
            click(checkBoxFinalized);
            pause(300);
        }
        driver.switchTo().parentFrame();
    }

    public void verifyFinalizedCheckboxState(String state)throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(checkBoxFinalized);
        pause(800);
        boolean isChecked = finalizedCheckboxInput.isSelected();
        driver.switchTo().parentFrame();
        if ("checked".equalsIgnoreCase(state) && !isChecked) {
            throw new AssertionError("Expected Finalized checkbox to be checked");
        }
        if ("unchecked".equalsIgnoreCase(state) && isChecked) {
            throw new AssertionError("Expected Finalized checkbox to be unchecked");
        }
        if (!"checked".equalsIgnoreCase(state) && !"unchecked".equalsIgnoreCase(state)) {
            throw new IllegalArgumentException("Unsupported finalized checkbox state: " + state);
        }
    }

    public void clickCheckBoxPatientStatus(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(checkboxPatientStatus);
        driver.switchTo().parentFrame();
    }

    public void clickNewObservation() throws InterruptedException {
        pause(2000);
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(2000);
        click(newObservationButton);
        pause(2000);
        driver.switchTo().parentFrame();
    }
    public void writeSBP (String data) throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(sbp,data);
        driver.switchTo().parentFrame();
        pause(500);
    }
    public void clickNewObservation2() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(newObservationButton);
        driver.switchTo().parentFrame();
    }
    public void clickDeleteTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(deleteTreatmentButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickSaveNewObservation() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(saveObservation);
        driver.switchTo().parentFrame();
    }
    public void isDisplayedUnverifiedText(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(patientStatusUnverifiedText);
        driver.switchTo().parentFrame();
    }
    public void clickTreatmentHistoryBreadcrumb() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(titleHDTreatment);
        click(treatmentHistoryButton);
        pause(700);
        driver.switchTo().parentFrame();
    }


    public void clickTreatmentHistoryDate(String date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement treatmentHistoryDate = driver.findElement(By.xpath("//*[@id='historicoTrat']//a[normalize-space(.)='" + date.trim() + "']"));
        click(treatmentHistoryDate);
        pause(500);
        driver.switchTo().parentFrame();
    }

public void configureTheLatestLabResultsByTimeInterval()throws InterruptedException{
    driver.switchTo().frame("frmContenido");
    pause(5000);
    moveScrollToElement(optionMedicationsSideBar);
    click(optionMedicationsSideBar);
    driver.switchTo().parentFrame();

    pause(300);
    upPageArrow.click();

    driver.switchTo().frame("frmContenido");
    driver.switchTo().frame("iframeV2");
    pause(400);
    click(buttonLabsResults);
    pause(2000);
    waitElements(checkBoxLast12Months);
    checkBoxLast12Months.isDisplayed();
    checkBoxLast12Months.click();
    pause(300);
    click(buttonThreePointsLabResults);
    pause(300);
    buttonSaveLabResults.click();

    driver.switchTo().parentFrame();
    driver.switchTo().parentFrame();


    }

    public void reviewTheInformationDisplayedUnderDrugsOther()throws InterruptedException{
        driver.switchTo().frame("frmContenido");

        buttonDrugsOther.click();
        pause(400);
        waitElements(titleLabTest);
        titleLabTest.isDisplayed();

        driver.switchTo().parentFrame();
    }
    public void selectLaboratoryResultsMaximumDateRange()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(5000);
        moveScrollToElement(optionMedicationsSideBar);
        click(optionMedicationsSideBar);
        driver.switchTo().parentFrame();

        pause(300);
        upPageArrow.click();

        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        click(buttonLabsResults);
        pause(2000);
        waitElements(checkBoxLast12Months);
        checkBoxLast12Months.isDisplayed();
        checkBoxLast12Months.click();
        pause(300);
        click(buttonThreePointsLabResults);
        pause(300);
        buttonSaveLabResults.click();

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();


    }

    public void selectHDTherapyOptionInTheConfigurationSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(5000);
        moveScrollToElement(optionHdTherapySideBar);
        click(optionHdTherapySideBar);
        driver.switchTo().parentFrame();

        pause(300);
        upPageArrow.click();

        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(dropDownMachineDisinfection);
        click(dropDownMachineDisinfection);

        pause(2000);


        driver.switchTo().parentFrame();
    }
    public void selectAnActiveLabProfileAndDateRangeAndSaveThem()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(5000);
        moveScrollToElement(optionMedicationsSideBar);
        click(optionMedicationsSideBar);
        driver.switchTo().parentFrame();

        pause(300);
        upPageArrow.click();

        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        click(buttonLabsResults);
        pause(2000);
        waitElements(checkBoxLast6Months);
        checkBoxLast6Months.isDisplayed();
        checkBoxLast6Months.click();
        pause(200);
        waitElements(checkBoxLast12Months);
        checkBoxLast12Months.isDisplayed();
        checkBoxLast12Months.click();
        pause(300);
        click(buttonThreePointsLabResults);
        pause(300);
        buttonSaveLabResults.click();

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectInTheMiddleSectionCheckAndConfirmThatTheMostRecentLaboratory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(5000);
        moveScrollToElement(optionMedicationsSideBar);
        click(optionMedicationsSideBar);
        driver.switchTo().parentFrame();

        pause(300);
        upPageArrow.click();

        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        click(buttonLabsResults);
        pause(2000);
        waitElements(checkBoxLast6Months);
        checkBoxLast6Months.isDisplayed();
        checkBoxLast6Months.click();
        pause(200);
        waitElements(checkBoxLast12Months);
        checkBoxLast12Months.isDisplayed();
        checkBoxLast12Months.click();
        pause(300);
        click(buttonThreePointsLabResults);
        pause(300);
        buttonSaveLabResults.click();
        pause(300);
        dropDownButtonCenter.click();
        pause(300);
        optionCenterCentro1.isDisplayed();
        optionCenterCentro1.click();
        pause(200);
        checkBoxConfirmTheMostRecentLaboratory.click();
        pause(200);
        buttonThreePointsLabResultsCenter.click();
        pause(200);
        buttonSaveLabResults.click();

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void selectOnlyOneProfileFromTheListOfAllActiveLaboratories()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(5000);
        moveScrollToElement(optionMedicationsSideBar);
        click(optionMedicationsSideBar);
        driver.switchTo().parentFrame();

        pause(300);
        upPageArrow.click();

        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        click(buttonLabsResults);
        pause(2000);
        waitElements(dropDownProfileLabResults);
        click(dropDownProfileLabResults);
        pause(200);
        click(optionProfileLabResults);
        pause(200);
        waitElements(checkBoxLast6Months);
        checkBoxLast6Months.isDisplayed();
        checkBoxLast6Months.click();
        pause(200);
        waitElements(checkBoxLast12Months);
        checkBoxLast12Months.isDisplayed();
        checkBoxLast12Months.click();
        pause(300);
        click(buttonThreePointsLabResults);
        pause(300);
        buttonSaveLabResults.click();


        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectARangeFromTheLastMonthsAndRunTheQueryToGetTheDataItWillShowTheMedicationAdministrationHistory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(3000);
        waitElements(buttonDrugsOther);
        buttonDrugsOther.isDisplayed();
        buttonDrugsOther.click();
        pause(300);
        waitElements(widgetHistory);
        click(widgetHistory);
        pause(300);
        titleModalMedicationAdministrationHistory.isDisplayed();
        click(checkBoxLast12MonthsModalMedicationHistory);
        pause(200);
        buttonCloseModalMedicationHistory.click();
        pause(3000);

        driver.switchTo().parentFrame();
    }

    public void clickDrugsAndOtherTab() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(buttonDrugsOther);
        pause(2000);
        driver.switchTo().parentFrame();
    }
    public void clickShowAllMedicationsCheck() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);

        click(checkBoxPrescribedShowAllMedications);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void DragAndDropMedicationPrescribedToAdministered() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(titlePrescribedMedication);
        medicamentToMoved.isDisplayed();
        pause(500);
        dragAndDrop(medicamentToMoved,dropArea);
        pause(2000);
        isDisplayed(titleModalAdministerMedication);
        pause(2000);
        isDisplayed(checkBoxModalConfirmTheMostRecentLaboratory);
        click(checkBoxModalConfirmTheMostRecentLaboratory);
        pause(400);
        scrollToElementMove(buttonCancelModalAdministerMedication);
        pause(500);
        clickJS(buttonCancelModalAdministerMedication);
        pause(2000);
        medicamentToMoved.isDisplayed();
        pause(500);
        dragAndDrop(medicamentToMoved,dropArea);
        pause(2000);
        isDisplayed(titleModalAdministerMedication);
        pause(2000);
        scrollToElementMove(buttonAddModalAdministerMedication);
        pause(500);
        clickJS(buttonAddModalAdministerMedication);

        pause(2000);
        driver.switchTo().parentFrame();


    }

    public void removeAlertWithFillDataAndAccept(String reason) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(800);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("deleteWin")));
        pause(300);
        String contra = "renal2";
        write(inputPasswordDeleteAlertRemoveWindow, contra);
        write(textAreaReason, reason);
        click(buttonAcceptDeleteAlertRemoveWindows);
        pause(3000);
        driver.switchTo().parentFrame();
    }



    @Override
    public boolean isAt() {
        return false;
    }

    //*********Page Methods*********


}