package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

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
    @FindBy(how = How.XPATH, using = "//h5[normalize-space(.)='Other consumables']")
    private WebElement otherConsumablesSectionTitle;
    @FindBy(how = How.XPATH, using = "//h5[normalize-space(.)='Consumables']")
    private WebElement traceabilityConsumablesSectionTitle;
    @FindBy(how = How.XPATH, using = "//menu-individual[contains(@class,'menuIndAbsolute')]//i[contains(@class,'icon-three-points')][1]")
    private WebElement hdTreatmentTopActionsButton;
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'k-window') and .//*[@id='genericModalWin']]//span[normalize-space(.)='Action']")
    private WebElement actionModalTitle;
    private final By actionModalContainerBy = By.xpath("//div[contains(@class,'k-window') and .//*[@id='genericModalWin']]");
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

    @FindBy(how = How.XPATH, using = "//label[contains(@for,'step-circle-4')]")
    private WebElement buttonExtractions;

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

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Demograficos_Label_Guardar']/..")
    private WebElement saveMenuOption;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Demograficos_Label_Cancelar']/..")
    private WebElement cancelMenuOption;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='TratamientoHD_Label_Reabrir_Tratamiento']/..")
    private WebElement reopenTreatmentMenuOption;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Save')]")
    private WebElement titleAdditionalSignature;

    // Final Signature & Additional Signature elements
    @FindBy(how = How.XPATH, using = "//button[@translate-once='AsignarPuestoTiempoReal_Label_Turno']")
    private WebElement shiftButton;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Label_Firma_adicional']")
    private WebElement additionalSignatureTitle;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Label_Firma_adicional']/ancestor::div[contains(@class,'x_panel')]//table//tr[contains(@ng-repeat,'firmaAd')]")
    private WebElement additionalSignatureRow;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Label_Firma_adicional']/ancestor::div[contains(@class,'x_panel')]//a[.//i[contains(@class,'fa-pencil')]]")
    private WebElement editAdditionalSignatureButton;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Label_Firma_adicional']/ancestor::div[contains(@class,'x_panel')]//a[.//i[contains(@class,'fa-trash')]]")
    private WebElement deleteAdditionalSignatureButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-firma-adicional')]//h4[contains(@class,'modal-title')]")
    private WebElement additionalSignatureModalTitle;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-firma-adicional')]//textarea[@ng-model='firmas.adicional.dm.notas']")
    private WebElement additionalSignatureNotesInput;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-firma-adicional')]//button[@translate-once='Modal_Button_Guardar']")
    private WebElement additionalSignatureModalSaveButton;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-firma-adicional')]//button[@translate-once='Modal_Button_Cancelar']")
    private WebElement additionalSignatureModalCancelButton;

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

    @FindBy(how = How.XPATH, using = "//div[contains(@class, 'tratHD-farmacos-prescritos-sesion-actual')][1]")
    private WebElement medicamentToMoved;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Medicacion_Label_Administrado']")
    private WebElement zoneMedicamentToMoved;

    @FindBy(how = How.XPATH, using = "//h4[contains(.,'Administer medication')]")
    private WebElement titleModalAdministerMedication ;


    @FindBy(how = How.XPATH, using = "//i[@id='collapseFlechaNAD0']cione")
    private WebElement dropDownFirstMedicament ;

    @FindBy(how = How.XPATH, using = "(//div[@id='tratHD-farmacos-administrados-sesion-actual'])[1]")
    private WebElement administeredMedicationItem;

    @FindBy(how = How.XPATH, using = "//div[@id='tratHD-farmacos' and contains(@class,'papelera')]")
    private WebElement medicationBin;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='InsertarTratamiento_Label_Prescrito']")
    private WebElement titlePrescribedMedication;

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

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='modal.items.delete.motivo'])[1]")
    private WebElement deleteReasonInput;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Modal_Button_OK']")
    private WebElement buttonAcceptDeleteAlertRemoveWindows;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Unverified')]")
    private WebElement patientStatusUnverifiedText;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='taSis']//input[@tabindex='0']")
    private WebElement sbp;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='taDia']//input[@tabindex='0']")
    private WebElement dbp;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='pulso']//input[@tabindex='0']")
    private WebElement pulse;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='InsertarTratamiento_Label_Prescrito']")
    private WebElement prescribedBlockTitle;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Medicacion_Label_Administrado']")
    private WebElement administeredBlockTitle;

    // Perfusion/Blood product elements
    @FindBy(how = How.XPATH, using = "(//div[@id='tratHD-farmacos-perfusion'])[1]")
    private WebElement prescribedPerfusionItem;

    @FindBy(how = How.XPATH, using = "//div[@id='arrastrarAquiPerfusion']")
    private WebElement perfusionDropArea;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//h4[contains(@class,'modal-title')]")
    private WebElement titlePerfusionModal;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//input[@ng-model='dragDropPerfusiones.perfusionParaAdministrar.cantidad']")
    private WebElement perfusionQuantityInput;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//input[@k-ng-model='dragDropPerfusiones.perfusionParaAdministrar.fechaCaducidad']")
    private WebElement perfusionExpiryDateInput;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//input[@ng-model='dragDropPerfusiones.perfusionParaAdministrar.codigo']")
    private WebElement perfusionCodeInput;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//textarea[@ng-model='dragDropPerfusiones.perfusionParaAdministrar.comentario']")
    private WebElement perfusionCommentsInput;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//button[@translate-once='InsertarPrescripcion_Label_Anyadir']")
    private WebElement perfusionAddButton;

    @FindBy(how = How.XPATH, using = "//div[@id='modalPerfusionAdministrado']//button[@translate-once='Modal_Button_Cancelar']")
    private WebElement perfusionCancelButton;

    @FindBy(how = How.XPATH, using = "//div[@id='tratHD-perfusion']")
    private WebElement perfusionBin;

    @FindBy(how = How.XPATH, using = "//button[@class='k-grid-edit k-button k-icon-button k-button-md k-rounded-md k-button-solid k-button-solid-base']")
    private WebElement editReadingButton;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Modal_Button_Cancelar']")
    private WebElement cancelDeleteModalButton;

    @FindBy(how = How.XPATH, using = "//button[@class='k-grid-delete k-button k-icon-button k-button-md k-rounded-md k-button-solid k-button-solid-base']")
    private WebElement deleteReadingButton;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='TratamientoHD_Label_Lecturas_de_la_sesión']")
    private WebElement sessionReadingsTitle;

    // Session graph and alerts elements
    @FindBy(how = How.XPATH, using = "//input[@id='grafica']")
    private WebElement showGraphToggle;

    @FindBy(how = How.XPATH, using = "//label[@for='grafica']")
    private WebElement showGraphToggleLabel;

    @FindBy(how = How.XPATH, using = "//div[contains(@ng-if,'modoVistoGrafica')]")
    private WebElement graphVariablesPanel;

    @FindBy(how = How.XPATH, using = "//charts-trat-hd")
    private WebElement graphChartElement;

    // Treatment History popup elements
    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-histTratHD')]//h4[contains(@class,'modal-title')]")
    private WebElement treatmentHistoryPopupTitle;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-histTratHD')]//p[@translate-once='HistorialTratamiento_Label_Filtros']")
    private WebElement treatmentHistoryFilters;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-histTratHD')]//table[@id='table-lecturas-reales']")
    private WebElement treatmentHistoryGrid;

    @FindBy(how = How.XPATH, using = "//button[.//span[@translate-once='TratamientoHD_Label_Grafica_Datos']]")
    private WebElement treatmentHistoryGraphButton;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='HistorialTratamiento_Label_Columnas']")
    private WebElement treatmentHistoryColumnsButton;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Label_Atrás']")
    private WebElement treatmentHistoryBackButton;

    @FindBy(how = How.XPATH, using = "//div[@ng-show='$ctrl.verPantallaGraficas']//input[@ng-model='$ctrl.groupedCharts']")
    private WebElement treatmentHistoryGroupChartsCheckbox;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-histTratHD')]//div[@id='divGestionColumnas']")
    private WebElement treatmentHistoryColumnsConfig;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'modal-histTratHD')]//kendo-custom-chart")
    private WebElement treatmentHistoryChart;

    // PRE section inputs
    @FindBy(how = How.XPATH, using = "//input[@name='pesoPre']")
    private WebElement weightPreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='sentadoSisPre']")
    private WebElement systolicBpPreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='sentadoDiaPre']")
    private WebElement diastolicBpPreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='pulsoPre']")
    private WebElement pulsePreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='temperaturaPre']")
    private WebElement temperaturePreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='glucemiaPre']")
    private WebElement glycemiaPreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='perdidaProgramada']")
    private WebElement programmedLossPreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='hematocritoPre']")
    private WebElement hematocritPreInput;

    @FindBy(how = How.XPATH, using = "//input[@name='bcmOh']")
    private WebElement bcmOhPreInput;

    // POST section inputs
    @FindBy(how = How.XPATH, using = "//input[@name='aportePost']")
    private WebElement fluidIntakePostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='pesoPost']")
    private WebElement weightPostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='sentadoSisPost']")
    private WebElement systolicBpPostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='sentadoDiaPost']")
    private WebElement diastolicBpPostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='pulsoPost']")
    private WebElement pulsePostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='temperaturaPost']")
    private WebElement temperaturePostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='glucemiaPost']")
    private WebElement glycemiaPostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='perdidaReal']")
    private WebElement realLossPostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='hematocritoPost']")
    private WebElement hematocritPostInput;

    @FindBy(how = How.XPATH, using = "//input[@name='respiracionPost']")
    private WebElement bloodRemainsPostInput;

    @FindBy(how = How.XPATH, using = "(//input)[135]")
    private WebElement CurrentVhPp;

    @FindBy(how = How.XPATH, using = "(//input)[137]")
    private WebElement TheoreticalVhPp;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='velocidadBomba']//input[@tabindex='0']")
    private WebElement pumpVelocity;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='presionArterial']//input[@tabindex='0']")
    private WebElement arterialPressure;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='presionVenosa']//input[@tabindex='0']")
    private WebElement venousPressure;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='tmp']//input[@tabindex='0']")
    private WebElement tmp;

    @FindBy(how = How.XPATH, using = "//td[@data-container-for='condPlasma']//input[@tabindex='0']")
    private WebElement condPlasma;
    @FindBy(how = How.XPATH, using = "//td[contains(text(),'Verified')]")
    private WebElement verifiedText;
    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'check-box')])[1]")
    private WebElement checkBoxModalConfirmTheMostRecentLaboratory;
    @FindBy(how = How.XPATH, using = "//div[@id='modalMedicamentoAdministrado']//button[@translate-once='InsertarPrescripcion_Label_Anyadir']")
    private WebElement buttonAddModalAdministerMedication;

    @FindBy(how = How.XPATH, using = "//div[@id='modalMedicamentoAdministrado']//button[@translate-once='Modal_Button_Cancelar']")
    private WebElement buttonCancelModalAdministerMedication;

    public void isDisplayedVerifiedText(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(verifiedText);
        driver.switchTo().parentFrame();
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

    public void clickSaveMenuOption() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(saveMenuOption);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void clickCancelMenuOption() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(cancelMenuOption);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void clickReopenTreatmentMenuOption() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(reopenTreatmentMenuOption);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteMenuOption() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(deleteTreatmentButton);
        pause(2000);
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
        pause(2000);
        scrollToElementMove(roomDropdownInLocation);
        click(roomDropdownInLocation);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + room + "']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        option.click();
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void selectShiftInLocation(String shift) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(2000);
        scrollToElementMove(shiftDropdownInLocation);
        click(shiftDropdownInLocation);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + shift + "']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        option.click();
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void selectLocationInLocation(String location) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(2000);
        scrollToElementMove(locationDropdownInLocation);
        click(locationDropdownInLocation);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + location + "']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        option.click();
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void selectMonitorInLocation(String monitor) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(2000);
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

    public void clickEditOtherConsumablesByName(String name) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(otherConsumablesSectionTitle);
        pause(500);
        WebElement row = findOtherConsumablesRow(name);
        WebElement editButton = row.findElement(By.xpath(".//a[@title='Edit' or .//i[contains(@class,'fa-pencil')]][1]"));
        click(editButton);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteOtherConsumablesByName(String name) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(otherConsumablesSectionTitle);
        pause(500);
        WebElement row = findOtherConsumablesRow(name);
        WebElement deleteButton = row.findElement(By.xpath(".//a[@title='Delete' or .//i[contains(@class,'fa-trash')]][1]"));
        click(deleteButton);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void verifyOtherConsumablesRowIsDisplayed(String name) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(otherConsumablesSectionTitle);
        pause(500);
        WebElement row = findOtherConsumablesRow(name);
        WebElement rowName = row.findElement(By.xpath(".//td//span[normalize-space(.)='" + name.trim() + "'][1]"));
        if (!rowName.isDisplayed()) {
            driver.switchTo().parentFrame();
            throw new AssertionError("Expected Other consumables row to be visible: " + name);
        }
        driver.switchTo().parentFrame();
    }

    public void verifyOtherConsumablesRowIsNotDisplayed(String name) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(otherConsumablesSectionTitle);
        pause(500);
        boolean exists = !driver.findElements(By.xpath("//h5[normalize-space(.)='Other consumables']/following::tbody[1]//tr[td//span[normalize-space(.)='" + name.trim() + "']]")).isEmpty();
        driver.switchTo().parentFrame();
        if (exists) {
            throw new AssertionError("Expected Other consumables row to be absent: " + name);
        }
    }

    private WebElement findOtherConsumablesRow(String name) {
        return driver.findElement(By.xpath("//h5[normalize-space(.)='Other consumables']/following::tbody[1]//tr[td//span[normalize-space(.)='" + name.trim() + "']][1]"));
    }

    public void fillTraceabilityConsumableRow(String rowName, String lotNumber, String expiryDate) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(traceabilityConsumablesSectionTitle);
        pause(300);

        By lotInput = getTraceabilityLotInput(rowName);
        WebElement lotElement = driver.findElement(lotInput);
        scrollToElementMove(lotElement);
        click(lotElement);
        lotElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        lotElement.sendKeys(Keys.DELETE);
        write(lotElement, lotNumber);

        By expiryInput = getTraceabilityExpiryInput(rowName);
        WebElement expiryElement = driver.findElement(expiryInput);
        click(expiryElement);
        expiryElement.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        expiryElement.sendKeys(Keys.DELETE);
        write(expiryElement, expiryDate);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickTopArrowInHDTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        pause(500);
        try {
            click(upPageArrow);
        } catch (Exception e) {
            javascriptExecutor.executeScript("arguments[0].click();", upPageArrow);
        }
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickTopActionInHDTreatment(String action) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(hdTreatmentTopActionsButton);
        pause(300);
        WebElement actionButton = driver.findElement(By.xpath("//menu-individual[contains(@class,'menuIndAbsolute')]//span[normalize-space(.)='" + action.trim() + "']/ancestor::a[1]"));
        click(actionButton);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void verifyActionModalIsDisplayedInHDTreatment() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(actionModalTitle);
        driver.switchTo().parentFrame();
    }

    public void clickButtonInActionModalInHDTreatment(String button) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickOptionInContainer(actionModalContainerBy, button);
        pause(500);
        driver.switchTo().parentFrame();
    }

    private By getTraceabilityLotInput(String rowName) {
        return switch (rowName.trim()) {
            case "Arterial needle size", "Single-puncture needle" -> By.name("loteAgujaArterial");
            case "Venous needle", "Venous needle size" -> By.name("loteAgujaVenosa");
            case "Dialyzer" -> By.name("loteDializador");
            case "Acid bath 1" -> By.name("loteConcentrado1");
            case "Acid bath 2" -> By.name("loteConcentrado2");
            default -> throw new IllegalArgumentException("Unsupported traceability consumable row: " + rowName);
        };
    }

    private By getTraceabilityExpiryInput(String rowName) {
        return switch (rowName.trim()) {
            case "Arterial needle size", "Single-puncture needle" -> By.xpath("//input[@name='fechaCadAgujaArterial']/following-sibling::span//input[contains(@class,'k-input-inner')][1]");
            case "Venous needle", "Venous needle size" -> By.xpath("//input[@name='fechaCadAgujaVenosa']/following-sibling::span//input[contains(@class,'k-input-inner')][1]");
            case "Dialyzer" -> By.xpath("//input[@name='fechaCadDializador']/following-sibling::span//input[contains(@class,'k-input-inner')][1]");
            case "Acid bath 1" -> By.xpath("//input[@name='fechaCadConcentrado1']/following-sibling::span//input[contains(@class,'k-input-inner')][1]");
            case "Acid bath 2" -> By.xpath("//input[@name='fechaCadConcentrado2']/following-sibling::span//input[contains(@class,'k-input-inner')][1]");
            default -> throw new IllegalArgumentException("Unsupported traceability consumable row: " + rowName);
        };
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

    public void verifyRequiredFieldsSignatureWarningIsDisplayed() {
        driver.switchTo().parentFrame();
        try { pause(1500); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//p[@data-translate='Msg_No_puede_finalizar_el_tratamiento_hasta_que_no_rellene_correctamente_los_siguientes_campos_']")).isEmpty();
        assert present : "Required fields warning should be displayed when finalizing signature with empty required fields";
    }

    public void clickOkRequiredFieldsSignatureWarning() throws InterruptedException {
        driver.switchTo().parentFrame();
        WebElement ok = driver.findElement(By.xpath("//button[@translate-once='Modal_Button_OK']"));
        click(ok);
        pause(500);
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

    public void clickExtractionsTabButton() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(buttonExtractions);
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
            clickJS(checkBoxFinalized);
            pause(500);
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
    public void writeSBP(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(sbp);
        write(sbp, data);
        driver.switchTo().parentFrame();
    }

    public void writeDBP(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(dbp);
        write(dbp, data);
        driver.switchTo().parentFrame();
    }

    public void writeHR(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(pulse);
        write(pulse, data);
        driver.switchTo().parentFrame();
    }

    public void writeBloodFlowRate(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(pumpVelocity);
        write(pumpVelocity, data);
        driver.switchTo().parentFrame();
    }

    public void writeArterialPressureReading(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(arterialPressure);
        write(arterialPressure, data);
        driver.switchTo().parentFrame();
    }

    public void writeVenousPressureReading(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(venousPressure);
        write(venousPressure, data);
        driver.switchTo().parentFrame();
    }

    public void writeTMP(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(tmp);
        write(tmp, data);
        driver.switchTo().parentFrame();
    }

    public void writeCondPlasmaReading(String data) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(condPlasma);
        write(condPlasma, data);
        driver.switchTo().parentFrame();
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
        write(deleteReasonInput, reason);
        click(buttonAcceptDeleteAlertRemoveWindows);
        pause(3000);
        driver.switchTo().parentFrame();
    }



    public void scrollToSessionReadingsInHDTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(sessionReadingsTitle);
        driver.switchTo().parentFrame();
    }

    public void enterPasswordInDeleteModal(String password) throws InterruptedException {
        driver.switchTo().parentFrame();
        write(inputPasswordDeleteAlertRemoveWindow, password);
        pause(300);
    }

    public void enterReasonInDeleteModal(String reason) throws InterruptedException {
        write(deleteReasonInput, reason);
        pause(300);
    }

    public void clickCancelInDeleteModal() throws InterruptedException {
        click(cancelDeleteModalButton);
        pause(500);
    }

    public void clickAcceptInDeleteModal() throws InterruptedException {
        click(buttonAcceptDeleteAlertRemoveWindows);
        pause(1000);
    }

    public void verifyDeleteErrorMessageIsDisplayed() {
        try { pause(2000); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//p[contains(@class,'errorMessage')]")).isEmpty();
        assert present : "Delete error message should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
    }

    public void clickDeleteReadingRow() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement deleteBtn = driver.findElement(By.xpath("//button[@class='k-grid-delete k-button k-icon-button k-button-md k-rounded-md k-button-solid k-button-solid-base']"));
        javascriptExecutor.executeScript("arguments[0].click();", deleteBtn);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickEditReadingRow() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(editReadingButton);
        click(editReadingButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void dragAdministeredMedicationToBin() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(administeredMedicationItem);
        pause(500);
        dragAndDropMouseEvents(administeredMedicationItem, medicationBin);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public boolean isAdministeredMedicationRemoved() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean removed = driver.findElements(By.xpath("//div[@id='tratHD-farmacos-administrados-sesion-actual']")).isEmpty();
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
        return removed;
    }

    // Perfusion/Blood product methods
    public void dragPrescribedPerfusionToAdministered() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(perfusionDropArea);
        pause(1000);
        scrollToElementMove(prescribedPerfusionItem);
        pause(1000);
        dragAndDropMouseEvents(prescribedPerfusionItem, perfusionDropArea);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void verifyPerfusionModalIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(titlePerfusionModal);
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void enterQuantityInPerfusionModal(String quantity) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(perfusionQuantityInput, quantity);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterExpiryDateInPerfusionModal(String date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(perfusionExpiryDateInput, date);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterCodeInPerfusionModal(String code) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(perfusionCodeInput, code);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterCommentsInPerfusionModal(String comments) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(perfusionCommentsInput, comments);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickAddInPerfusionModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(perfusionAddButton);
        clickJS(perfusionAddButton);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void clickCancelInPerfusionModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(perfusionCancelButton);
        clickJS(perfusionCancelButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyAddButtonDisabledInPerfusionModal() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean disabled = !perfusionAddButton.isEnabled();
        assert disabled : "Add button in perfusion modal should be disabled when quantity is empty";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyAdministeredPerfusionIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean present = !driver.findElements(By.xpath(
                "//div[contains(@ng-repeat,'tratManager.tratamientoActual.tratamientoPerfusiones')]")).isEmpty();
        assert present : "Administered perfusion should be displayed but was not found";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyAdministeredPerfusionIsNotDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean absent = driver.findElements(By.xpath(
                "//div[contains(@ng-repeat,'tratManager.tratamientoActual.tratamientoPerfusiones')]")).isEmpty();
        assert absent : "Administered perfusion should not be displayed but was found";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyPerfusionBlockIsReadOnly() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(prescribedPerfusionItem);
        pause(1000);
        boolean binHidden = driver.findElements(By.xpath("//div[@id='tratHD-perfusion' and contains(@style,'display')]")).isEmpty()
                || !driver.findElement(By.xpath("//div[@id='tratHD-perfusion']")).isDisplayed();
        assert binHidden : "Perfusion bin should not be visible in finalized treatment";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void dragAdministeredPerfusionToBin() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement administeredPerfusion = driver.findElement(By.xpath(
                "//div[contains(@ng-repeat,'tratManager.tratamientoActual.tratamientoPerfusiones')]"));
        scrollToElementMove(administeredPerfusion);
        pause(1000);
        dragAndDropMouseEvents(administeredPerfusion, perfusionBin);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void dragPrescribedMedicationToAdministered() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(medicamentToMoved);
        pause(500);
        dragAndDropMouseEvents(medicamentToMoved, dropArea);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyAdministerMedicationModalIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(titleModalAdministerMedication);
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void checkConfirmLabResultsInModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(checkBoxModalConfirmTheMostRecentLaboratory);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickAddInAdministerMedicationModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(buttonAddModalAdministerMedication);
        clickJS(buttonAddModalAdministerMedication);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void clickCancelInAdministerMedicationModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(buttonCancelModalAdministerMedication);
        clickJS(buttonCancelModalAdministerMedication);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyPrescribedBlockIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(prescribedBlockTitle);
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyAdministeredBlockIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(administeredBlockTitle);
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public boolean isSessionPreInputsDisabledInHDTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(weightPreInput);
        pause(1000);
        boolean disabled = !weightPreInput.isEnabled();
        driver.switchTo().parentFrame();
        return disabled;
    }

    public boolean isNewReadingButtonNotAvailableInSession() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean notAvailable = driver.findElements(By.xpath("//button[@ng-click='$ctrl.habilitarImportarLectura()']")).isEmpty();
        driver.switchTo().parentFrame();
        return notAvailable;
    }

    public boolean isReadingRowSavedInSession() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(500); } catch (InterruptedException ignored) {}
        boolean saved = !driver.findElements(By.xpath(
                "//*[@id='lecturasHDGrid']//tbody//tr[not(contains(@class,'k-no-data'))]")).isEmpty();
        driver.switchTo().parentFrame();
        return saved;
    }

    public boolean isReadingRowNotSavedInSession() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(500); } catch (InterruptedException ignored) {}
        boolean empty = driver.findElements(By.xpath(
                "//*[@id='lecturasHDGrid']//tbody//tr[not(contains(@class,'k-no-data')) and not(contains(@class,'k-grid-edit-row'))]")).isEmpty();
        driver.switchTo().parentFrame();
        return empty;
    }

    // PRE section methods
    public void enterWeightPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(weightPreInput);
        click(weightPreInput);
        weightPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        weightPreInput.sendKeys(Keys.DELETE);
        write(weightPreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterSystolicBpPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(systolicBpPreInput);
        systolicBpPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        systolicBpPreInput.sendKeys(Keys.DELETE);
        write(systolicBpPreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterDiastolicBpPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(diastolicBpPreInput);
        diastolicBpPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        diastolicBpPreInput.sendKeys(Keys.DELETE);
        write(diastolicBpPreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterPulsePreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(pulsePreInput);
        pulsePreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        pulsePreInput.sendKeys(Keys.DELETE);
        write(pulsePreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterTemperaturePreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(temperaturePreInput);
        temperaturePreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        temperaturePreInput.sendKeys(Keys.DELETE);
        write(temperaturePreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterGlycemiaPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(glycemiaPreInput);
        glycemiaPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        glycemiaPreInput.sendKeys(Keys.DELETE);
        write(glycemiaPreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterProgrammedLossPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(programmedLossPreInput);
        programmedLossPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        programmedLossPreInput.sendKeys(Keys.DELETE);
        write(programmedLossPreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterHematocritPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(hematocritPreInput);
        hematocritPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        hematocritPreInput.sendKeys(Keys.DELETE);
        write(hematocritPreInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterBcmOhPreInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(bcmOhPreInput);
        bcmOhPreInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        bcmOhPreInput.sendKeys(Keys.DELETE);
        write(bcmOhPreInput, value);
        driver.switchTo().parentFrame();
    }

    // POST section methods
    public void enterFluidIntakePostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(fluidIntakePostInput);
        click(fluidIntakePostInput);
        fluidIntakePostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        fluidIntakePostInput.sendKeys(Keys.DELETE);
        write(fluidIntakePostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterWeightPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(weightPostInput);
        weightPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        weightPostInput.sendKeys(Keys.DELETE);
        write(weightPostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterSystolicBpPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(systolicBpPostInput);
        systolicBpPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        systolicBpPostInput.sendKeys(Keys.DELETE);
        write(systolicBpPostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterDiastolicBpPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(diastolicBpPostInput);
        diastolicBpPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        diastolicBpPostInput.sendKeys(Keys.DELETE);
        write(diastolicBpPostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterPulsePostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(pulsePostInput);
        pulsePostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        pulsePostInput.sendKeys(Keys.DELETE);
        write(pulsePostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterTemperaturePostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(temperaturePostInput);
        temperaturePostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        temperaturePostInput.sendKeys(Keys.DELETE);
        write(temperaturePostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterGlycemiaPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(glycemiaPostInput);
        glycemiaPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        glycemiaPostInput.sendKeys(Keys.DELETE);
        write(glycemiaPostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterRealLossPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(realLossPostInput);
        realLossPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        realLossPostInput.sendKeys(Keys.DELETE);
        write(realLossPostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterHematocritPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(hematocritPostInput);
        hematocritPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        hematocritPostInput.sendKeys(Keys.DELETE);
        write(hematocritPostInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterBloodRemainsPostInSession(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(bloodRemainsPostInput);
        bloodRemainsPostInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        bloodRemainsPostInput.sendKeys(Keys.DELETE);
        write(bloodRemainsPostInput, value);
        driver.switchTo().parentFrame();
    }

    // Session graph and alerts methods
    public void clickShowGraphToggle() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(sessionReadingsTitle);
        pause(500);
        clickJS(showGraphToggleLabel);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyGraphViewIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try {
            scrollToElementMove(graphVariablesPanel);
            pause(500);
        } catch (InterruptedException ignored) {}
        isDisplayed(graphVariablesPanel);
        driver.switchTo().parentFrame();
    }

    public void clickSelectAllVariablesInGraph() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(graphVariablesPanel);
        pause(500);
        // Click the multiselect dropdown button to open it
        WebElement multiselectBtn = driver.findElement(By.xpath("//div[contains(@ng-if,'modoVistoGrafica')]//multiselect//button[contains(@class,'dropdown-toggle')]"));
        click(multiselectBtn);
        pause(500);
        // Click "Select all"
        WebElement selectAllBtn = driver.findElement(By.xpath("//div[contains(@ng-if,'modoVistoGrafica')]//multiselect//button[@ng-click='checkAll()']"));
        click(selectAllBtn);
        pause(1000);
        // Close dropdown by clicking the button again
        click(multiselectBtn);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void verifySessionChartIsVisible() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try {
            WebElement chart = driver.findElement(By.xpath("//charts-trat-hd//div[@data-role='chart']"));
            scrollToElementMove(chart);
            pause(500);
            assert chart.isDisplayed() : "Session chart should be visible";
        } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    // Treatment History popup methods
    public void clickTreatmentHistoryOption() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        WebElement historyOption = driver.findElement(By.xpath("//a[@data-target='.modal-histTratHD']"));
        javascriptExecutor.executeScript("arguments[0].click();", historyOption);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void verifyTreatmentHistoryPopupIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(2000); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//div[contains(@class,'modal-histTratHD')]//h4[contains(@class,'modal-title')]")).isEmpty();
        assert present : "Treatment history popup should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyTreatmentHistoryFiltersAreDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(1000); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//p[@translate-once='HistorialTratamiento_Label_Filtros']")).isEmpty();
        assert present : "Treatment history filters should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyTreatmentHistoryGridIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean present = !driver.findElements(By.xpath("//table[@id='table-lecturas-reales']")).isEmpty();
        assert present : "Treatment history grid should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickGraphButtonInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(treatmentHistoryGraphButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyTreatmentHistoryGraphViewIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean present = !driver.findElements(By.xpath("//kendo-custom-chart")).isEmpty();
        assert present : "Treatment history graph should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickGroupChartsCheckboxInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(treatmentHistoryGroupChartsCheckbox);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickColumnsButtonInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(treatmentHistoryColumnsButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyColumnsConfigurationIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean present = !driver.findElements(By.xpath("//div[@id='divGestionColumnas']")).isEmpty();
        assert present : "Columns configuration should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickBackButtonInTreatmentHistoryColumns() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(treatmentHistoryBackButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickExportButtonInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        WebElement exportBtn = driver.findElement(By.xpath("//button[@translate-once='Informes_Label_Exportar']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", exportBtn);
        pause(500);
        javascriptExecutor.executeScript("arguments[0].click();", exportBtn);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void clickCloseButtonInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement closeBtn = driver.findElement(By.xpath("//button[@translate-once='Modal_Button_Cerrar']"));
        clickJS(closeBtn);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickSelectAllVariablesInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        // Open the multiselect dropdown
        WebElement multiselectBtn = driver.findElement(By.xpath("//div[@ng-show='$ctrl.verPantallaGraficas']//multiselect//button[contains(@class,'dropdown-toggle')]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", multiselectBtn);
        pause(500);
        javascriptExecutor.executeScript("arguments[0].click();", multiselectBtn);
        pause(500);
        // Click Select all
        WebElement selectAllBtn = driver.findElement(By.xpath("//div[@ng-show='$ctrl.verPantallaGraficas']//multiselect//button[@ng-click='checkAll()']"));
        javascriptExecutor.executeScript("arguments[0].click();", selectAllBtn);
        pause(1000);
        // Close dropdown
        javascriptExecutor.executeScript("arguments[0].click();", multiselectBtn);
        pause(500);
        driver.switchTo().parentFrame();
    }


    public void selectLastFilterInTreatmentHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        WebElement lastRadio = driver.findElement(By.xpath("//input[@name='filtroTrat' and @value='false']"));
        javascriptExecutor.executeScript("arguments[0].click();", lastRadio);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void selectLastFilterComboOption(String option) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement comboBtn = driver.findElement(By.xpath("//select[@k-ng-model='$ctrl.filtro.comboValor']/parent::span//button[@role='button']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", comboBtn);
        pause(500);
        javascriptExecutor.executeScript("arguments[0].click();", comboBtn);
        pause(1000);
        WebElement comboOption = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + option + "']"));
        javascriptExecutor.executeScript("arguments[0].click();", comboOption);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void checkSeeTreatmentsInColumns() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement checkbox = driver.findElement(By.xpath("//div[@ng-model='$ctrl.modoColumnasTratamientos']//input[@type='checkbox']"));
        if (!checkbox.isSelected()) {
            javascriptExecutor.executeScript("arguments[0].click();", checkbox);
            pause(500);
        }
        driver.switchTo().parentFrame();
    }

    public void checkSeeMinimumMaximum() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement checkbox = driver.findElement(By.xpath("//div[@ng-model='$ctrl.verEstadisticas']//input[@type='checkbox']"));
        if (!checkbox.isSelected()) {
            javascriptExecutor.executeScript("arguments[0].click();", checkbox);
            pause(500);
        }
        driver.switchTo().parentFrame();
    }

    // Final Signature & Additional Signature methods
    public void verifyFinalSignatureBlockIsReadOnly() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(1000); } catch (InterruptedException ignored) {}
        boolean readOnly = driver.findElements(By.xpath("//button[@translate-once='AsignarPuestoTiempoReal_Label_Turno']")).isEmpty()
                || !driver.findElement(By.xpath("//button[@translate-once='AsignarPuestoTiempoReal_Label_Turno']")).isDisplayed();
        assert readOnly : "Final signature block should be read only in finalized treatment";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }


    public void selectNephrologist() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropDownSignedNephrologist);
        pause(500);
        click(optionSignedNephrologist);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void checkFinalizedCheckbox() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(checkBoxFinalized);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickShiftButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(shiftButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyAdditionalSignatureIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { scrollToElementMove(additionalSignatureTitle); pause(500); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath(
                "//h2[@translate-once='TratamientoHD_Label_Firma_adicional']/ancestor::div[contains(@class,'x_panel')]//table//tr[contains(@ng-repeat,'firmaAd')]")).isEmpty();
        assert present : "Additional signature row should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyAdditionalSignatureIsNotCreated() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { scrollToElementMove(additionalSignatureTitle); pause(500); } catch (InterruptedException ignored) {}
        boolean absent = driver.findElements(By.xpath(
                "//h2[@translate-once='TratamientoHD_Label_Firma_adicional']/ancestor::div[contains(@class,'x_panel')]//table//tr[contains(@ng-repeat,'firmaAd')]")).isEmpty();
        assert absent : "Additional signature should not be created";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickEditAdditionalSignature() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(additionalSignatureTitle);
        pause(500);
        click(editAdditionalSignatureButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteAdditionalSignature() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(additionalSignatureTitle);
        pause(500);
        click(deleteAdditionalSignatureButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void verifyAdditionalSignatureModalIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(1000); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//div[contains(@class,'modal-firma-adicional')]//h4[contains(@class,'modal-title')]")).isEmpty();
        assert present : "Additional signature modal should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void enterNotesInAdditionalSignatureModal(String notes) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(additionalSignatureNotesInput, notes);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickSaveInAdditionalSignatureModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(additionalSignatureModalSaveButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickCancelInAdditionalSignatureModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        clickJS(additionalSignatureModalCancelButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    // Extraction methods

    public void clickExtractionsThreePointsMenu() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement threePoints = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//menu-individual//i[contains(@class,'icon-three-points')]"));
        click(threePoints);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickShowExtraction() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement showOption = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//menu-individual//ul[@role='menu']//a"));
        click(showOption);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void verifyExtractionIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean present = !driver.findElements(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//peticion-laboratorio")).isEmpty();
        assert present : "Extraction should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyEditExtractionButtonIsAvailable() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean available = !driver.findElements(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//div[contains(@class,'editionDiv')]//a[.//i[contains(@class,'fa-pencil')]]")).isEmpty();
        assert available : "Edit extraction button should be available";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void verifyExtractionIsReadOnly() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        boolean readOnly = driver.findElements(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//div[contains(@class,'editionDiv')]//a[.//i[contains(@class,'fa-pencil')]]")).isEmpty();
        assert readOnly : "Extraction should be read only (no edit button)";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickEditExtraction() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement editBtn = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//div[contains(@class,'editionDiv')]//a[.//i[contains(@class,'fa-pencil')]]"));
        click(editBtn);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void enterExtractionDate(String date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement dateInput = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//peticion-laboratorio//input[@k-ng-model='$ctrl.peticion.dto.specimenDate']"));
        dateInput.clear();
        dateInput.sendKeys(date);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterSampleCode(String code) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement sampleInput = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//peticion-laboratorio//input[@ng-model='$ctrl.peticion.dto.sampleCode']"));
        sampleInput.clear();
        sampleInput.sendKeys(code);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterExtractionObservations(String observations) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement editor = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//peticion-laboratorio//textbox-validation[@name='comments']//iframe"));
        driver.switchTo().frame(editor);
        WebElement body = driver.findElement(By.xpath("//body"));
        body.clear();
        body.sendKeys(observations);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickSaveExtraction() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement saveBtn = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//div[contains(@class,'editionDiv')]//a[.//i[contains(@class,'fa-save')]]"));
        click(saveBtn);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void clickCancelExtraction() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement cancelBtn = driver.findElement(By.xpath("//h2[@translate-once='TratamientoHD_Label_Extracciones']/ancestor::div[contains(@class,'x_panel')]//div[contains(@class,'editionDiv')]//a[.//i[contains(@class,'fa-undo')]]"));
        click(cancelBtn);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    @Override
    public boolean isAt() {
        return false;
    }

    //*********Page Methods*********


}