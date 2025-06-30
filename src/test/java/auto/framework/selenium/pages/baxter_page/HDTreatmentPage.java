package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

@LazyComponent
public class HDTreatmentPage extends BasePage<HDTreatmentPage> {
    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'HD Treatment')]")
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
    @FindBy(how = How.XPATH, using = "(//span[@translate-once='TratamientoHD_boton_historial'])[1]")
    private WebElement treatmentHistoryButton;
    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Top'])[1]")
    private WebElement upPageArrow;

    @FindBy(how = How.XPATH, using = "//label[contains(@for,'step-circle-5')]")
    private WebElement buttonFinalSignature;

    @FindBy(how = How.XPATH, using = "(//button[@role='button'])[9]")
    private WebElement dropDownSignedNephrologist;
    @FindBy(how = How.XPATH, using = "(//li[contains(@tabindex,'-1')])[1]")
    private WebElement optionSignedNephrologist;
    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'check-box')])[5]")
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

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[6]")
    private WebElement buttonDropDownArterialNeedle;
    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Ag 4')])[1]")
    private WebElement optionArterialNeedle;
    @FindBy(how = How.XPATH, using = "(//textarea[contains(@required,'required')])[1]")
    private WebElement textAreaReasonArterialNeedle;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/modal-value-changed/div/div[3]/button[2]")
    private WebElement buttonOKTextAreaReasonArterialNeedle;


    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[7]")
    private WebElement buttonDropDownVenousNeedle;
    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Ag 4')])[2]")
    private WebElement optionVenousNeedle;
    @FindBy(how = How.XPATH, using = "(//textarea[contains(@required,'required')])[1]")
    private WebElement textAreaVenousNeedle;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/modal-value-changed/div/div[3]/button[2]")
    private WebElement buttonOkTextAreaVenousNeedle;


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
    public void clickTreatmentHistoryButton() throws InterruptedException {
        click(upPageArrow);
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(treatmentHistoryButton);
        driver.switchTo().parentFrame();
    }
    public void createASimpleNewTreatmentIfItDoesNotExist()throws InterruptedException{
            driver.switchTo().frame("frmContenido");
            pause(3000);
            boolean flag = false;
            try {
                waitElements(titleHDTreatment);
                flag = titleHDTreatment.isDisplayed();

            }catch (TimeoutException e){
                flag = false;

            }

            if (flag){
                pause(300);
                buttonThreePointsHdTreatment.click();
                pause(200);
                click(buttonNewHdTreatment);
                pause(200);
                click(buttonPreparationArea);
            }else {
                pause(200);
                buttonPreparationArea.click();
            }

            driver.switchTo().parentFrame();
    }
    public void makeTheFinalSignatureWithTheNephrologistField()throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        waitElements(buttonFinalSignature);
        click(buttonFinalSignature);
        pause(1000);

        click(checkBoxFinalized);
        pause(200);

        driver.switchTo().parentFrame();

        buttonOkWarning.isDisplayed();
        click(buttonOkWarning);
        pause(1000);

    }
    public void adaptTheConfigurationToTheRequiredFieldsToCompleteTheTreatment()throws InterruptedException{
        pause(300);
        waitElements(buttonDropDownProfile);
        click(buttonDropDownProfile);
        pause(200);
        optionConfigurationMenu.click();
        driver.switchTo().frame("frmContenido");
        pause(5000);
        waitElements(optionFormSideBar);
        optionFormSideBar.isDisplayed();
        optionFormSideBar.click();
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(dropDownHDOption);
        pause(200);
        optionHDTreatment.isDisplayed();
        click(optionHDTreatment);
        pause(1200);
        waitElements(buttonEditDesinfectedBy);
        buttonEditDesinfectedBy.isDisplayed();
        buttonEditDesinfectedBy.click();
        if (checkBoxRequiredDesinfectedBy.isSelected()){
            pause(200);
            buttonSaveDesinfectedBy.isDisplayed();
            buttonSaveDesinfectedBy.click();
        }else{
            checkBoxRequiredDesinfectedBy.click();
            pause(400);
            buttonSaveDesinfectedBy.click();
        }

        pause(200);
        buttonEditSignedNephologist.isDisplayed();
        buttonEditSignedNephologist.click();
        if (checkBoxSignedNephologist.isSelected()){
            pause(200);
            buttonSaveSignedNephologist.isDisplayed();
            buttonSaveSignedNephologist.click();
        }else {
            checkBoxSignedNephologist.click();
            pause(300);
            buttonSaveSignedNephologist.click();
        }

        pause(200);
        buttonEditNotes.isDisplayed();
        click(buttonEditNotes);
        if (checkBoxNotes.isSelected()){
            buttonSaveNotes.isDisplayed();
            buttonSaveNotes.click();
        }else{
            checkBoxNotes.click();
            pause(200);
            buttonSaveNotes.click();
        }
        pause(200);
        buttonEditMonitor.isDisplayed();
        click(buttonEditMonitor);
        if (checkBoxMonitor.isSelected()){
            buttonSaveMonitor.isDisplayed();
            buttonSaveMonitor.click();
        }else{
            checkBoxMonitor.click();
            pause(200);
            buttonSaveMonitor.click();
        }

        pause(200);
        buttonEditLocation.isDisplayed();
        click(buttonEditLocation);
        if (checkBoxLocation.isSelected()){
            buttonSaveLocation.isDisplayed();
            buttonSaveLocation.click();
        }else{
            checkBoxLocation.click();
            pause(200);
            buttonSaveLocation.click();
        }

        pause(200);
        buttonEditRoom.isDisplayed();
        click(buttonEditRoom);
        if (checkBoxRoom.isSelected()){
            buttonSaveRoom.isDisplayed();
            buttonSaveRoom.click();
        }else{
            checkBoxRoom.click();
            pause(200);
            buttonSaveRoom.click();
        }

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        pause(300);
        upPageArrow.click();
        pause(5000);

    }

    public void tryingToFinishTheTreatmentButIMustCompleteTheRequiredFields() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonFinalSignature);
        click(buttonFinalSignature);
        pause(300);
        click(checkBoxFinalized);
        pause(200);


        driver.switchTo().parentFrame();

        buttonOkWarning.isDisplayed();
        click(buttonOkWarning);
        pause(1000);
    }

    public void finishFinalSignatureTheSystemMustAllowUsingReadOnlyMode()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownPod);
        click(buttonDropDownPod);
        pause(200);
        optionRoomAPod.click();
        pause(200);
        click(buttonDropDownShift);
        pause(300);
        optionShiftMorning.click();
        click(buttonDropDownStation);
        pause(300);
        optionStation2.isDisplayed();
        optionStation2.click();
        buttonDropDownHdMachine.click();
        pause(300);
        optionHdMachineAk98.isDisplayed();
        optionHdMachineAk98.click();

        pause(200);
        moveScrollToElement(titleTraceability);

        pause(200);
        waitElements(buttonDropDownDesinfectedBy);
        pause(200);
        click(buttonDropDownDesinfectedBy);
        pause(200);
        optionDesinfectedBy.isDisplayed();
        optionDesinfectedBy.click();

        driver.switchTo().parentFrame();
        pause(300);
        click(upPageArrow);
        pause(1000);

        driver.switchTo().frame("frmContenido");
        waitElements(buttonFinalSignature);
        click(buttonFinalSignature);
        pause(300);
        dropDownSignedNephrologist.isDisplayed();
        click(dropDownSignedNephrologist);
        pause(200);
        optionSignedNephrologist.click();
        click(textAreaNotes);
        String note = "test Qa";
        write(textAreaNotes,note);
        pause(200);
        checkBoxFinalized.click();

        buttonThreePointsFinalSignature.click();
        pause(200);
        saveFinalSignature.click();
        pause(300);


        driver.switchTo().parentFrame();
    }
    public void makeChangesToTheFieldsDefinedInTheTreatmentPrescription() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownPod);
        click(buttonDropDownPod);
        pause(200);
        optionRoomAPod.click();
        pause(200);
        click(buttonDropDownShift);
        pause(300);
        optionShiftMorning.click();
        click(buttonDropDownStation);
        pause(300);
        optionStation2.isDisplayed();
        optionStation2.click();
        buttonDropDownHdMachine.click();
        pause(300);
        optionHdMachineAk98.isDisplayed();
        optionHdMachineAk98.click();

        buttonDropDownArterialNeedle.click();
        pause(200);
        optionArterialNeedle.isDisplayed();
        optionArterialNeedle.click();
        String reason = "Test qa";
        pause(200);
        waitElements(textAreaReasonArterialNeedle);
        textAreaReasonArterialNeedle.click();
        write(textAreaReasonArterialNeedle, reason);
        pause(200);
        buttonOKTextAreaReasonArterialNeedle.click();

        pause(300);
        buttonDropDownVenousNeedle.click();
        pause(200);
        optionVenousNeedle.isDisplayed();
        optionVenousNeedle.click();
        pause(200);
        waitElements(textAreaVenousNeedle);
        textAreaVenousNeedle.click();
        write(textAreaVenousNeedle,reason);
        pause(200);
        buttonOkTextAreaVenousNeedle.click();

        pause(300);
        moveScrollToElement(titleTraceability);

        pause(200);
        waitElements(buttonDropDownDesinfectedBy);
        pause(200);
        click(buttonDropDownDesinfectedBy);
        pause(200);
        optionDesinfectedBy.isDisplayed();
        optionDesinfectedBy.click();

        driver.switchTo().parentFrame();
        pause(300);
        click(upPageArrow);
        pause(1000);

        driver.switchTo().frame("frmContenido");
        waitElements(buttonFinalSignature);
        click(buttonFinalSignature);
        pause(300);
        dropDownSignedNephrologist.isDisplayed();
        click(dropDownSignedNephrologist);
        pause(200);
        optionSignedNephrologist.click();
        click(textAreaNotes);
        String note = "test Qa";
        write(textAreaNotes,note);
        pause(200);
        checkBoxFinalized.click();

        buttonThreePointsFinalSignature.click();
        pause(200);
        saveFinalSignature.click();
        pause(300);
        if(textAreaNotes.getAttribute("value").isEmpty()){
            System.out.println("The changes were executed successfully");
        }else {
            System.out.println("The changes were not executed correctly");
        }
        pause(4000);


        driver.switchTo().parentFrame();
    }

    public void closeTheTreatmentWithTheNephrologistSignatureFieldNotRequired()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownPod);
        click(buttonDropDownPod);
        pause(200);
        optionRoomAPod.click();
        pause(200);
        click(buttonDropDownShift);
        pause(300);
        optionShiftMorning.click();
        click(buttonDropDownStation);
        pause(300);
        optionStation2.isDisplayed();
        optionStation2.click();
        buttonDropDownHdMachine.click();
        pause(300);
        optionHdMachineAk98.isDisplayed();
        optionHdMachineAk98.click();

        pause(200);
        moveScrollToElement(titleTraceability);

        pause(200);
        waitElements(buttonDropDownDesinfectedBy);
        pause(200);
        click(buttonDropDownDesinfectedBy);
        pause(200);
        optionDesinfectedBy.isDisplayed();
        optionDesinfectedBy.click();

        driver.switchTo().parentFrame();
        pause(300);
        click(upPageArrow);
        pause(1000);

        driver.switchTo().frame("frmContenido");
        waitElements(buttonFinalSignature);
        click(buttonFinalSignature);
        pause(300);

        click(textAreaNotes);
        String note = "test Qa";
        write(textAreaNotes,note);
        pause(200);
        checkBoxFinalized.click();

        buttonThreePointsFinalSignature.click();
        pause(200);
        saveFinalSignature.click();
        pause(300);


        driver.switchTo().parentFrame();
    }

    public void checkIfTheSignedByFieldInTheAdditionalSignaturesSectionIsCompleteIfTheUserIsANurse()throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownPod);
        click(buttonDropDownPod);
        pause(200);
        optionRoomAPod.click();
        pause(200);
        click(buttonDropDownShift);
        pause(300);
        optionShiftMorning.click();
        click(buttonDropDownStation);
        pause(300);
        optionStation2.isDisplayed();
        optionStation2.click();
        buttonDropDownHdMachine.click();
        pause(300);
        optionHdMachineAk98.isDisplayed();
        optionHdMachineAk98.click();

        pause(200);
        moveScrollToElement(titleTraceability);

        pause(200);
        waitElements(buttonDropDownDesinfectedBy);
        pause(200);
        click(buttonDropDownDesinfectedBy);
        pause(200);
        optionDesinfectedBy.isDisplayed();
        optionDesinfectedBy.click();

        driver.switchTo().parentFrame();
        pause(300);
        click(upPageArrow);
        pause(1000);

        driver.switchTo().frame("frmContenido");
        waitElements(buttonFinalSignature);
        click(buttonFinalSignature);
        pause(300);

        click(textAreaNotes);
        String note = "test Qa";
        write(textAreaNotes,note);
        pause(200);

        if (inputSignedBy.isDisplayed()) {
            System.out.println("The inputSignedBy field is visible.");

            if (!inputSignedBy.isEnabled()) {
                System.out.println("The inputSignedBy field is disabled.");

                String actualValue = inputSignedBy.getAttribute("value");
                String expectedValue = "Robles Martín, Miguel";

                if (actualValue.equals(expectedValue)) {
                    System.out.println("The inputSignedBy field has the expected value: " + expectedValue);
                } else {
                    System.out.println("The value of the inputSignedBy field is not as expected. Actual: " + actualValue);
                }

            } else {
                System.out.println("The inputSignedBy field is enabled, but it should be disabled.");
            }

        } else {
            System.out.println("The inputSignedBy field is not visible.");
        }

        inputSignedBy.isDisplayed();
        checkBoxFinalized.click();

        driver.switchTo().parentFrame();
    }

public void checkFinalSignatureAndAdditionalSignaturesTheSystemShouldAllowUsingReadOnlyMode() throws InterruptedException{
    driver.switchTo().frame("frmContenido");
    waitElements(buttonDropDownPod);
    click(buttonDropDownPod);
    pause(200);
    optionRoomAPod.click();
    pause(200);
    click(buttonDropDownShift);
    pause(300);
    optionShiftMorning.click();
    click(buttonDropDownStation);
    pause(300);
    optionStation2.isDisplayed();
    optionStation2.click();
    buttonDropDownHdMachine.click();
    pause(300);
    optionHdMachineAk98.isDisplayed();
    optionHdMachineAk98.click();

    pause(200);
    moveScrollToElement(titleTraceability);

    pause(200);
    waitElements(buttonDropDownDesinfectedBy);
    pause(200);
    click(buttonDropDownDesinfectedBy);
    pause(200);
    optionDesinfectedBy.isDisplayed();
    optionDesinfectedBy.click();

    driver.switchTo().parentFrame();
    pause(300);
    click(upPageArrow);
    pause(1000);

    driver.switchTo().frame("frmContenido");
    waitElements(buttonFinalSignature);
    click(buttonFinalSignature);
    pause(300);

    click(textAreaNotes);
    String note = "test Qa";
    write(textAreaNotes,note);
    pause(200);

    if (inputSignedBy.isDisplayed()) {
        System.out.println("The inputSignedBy field is visible.");

        if (!inputSignedBy.isEnabled()) {
            System.out.println("The inputSignedBy field is disabled.");

            String actualValue = inputSignedBy.getAttribute("value");
            String expectedValue = "Robles Martín, Miguel";

            if (actualValue.equals(expectedValue)) {
                System.out.println("The inputSignedBy field has the expected value: " + expectedValue);
            } else {
                System.out.println("The value of the inputSignedBy field is not as expected. Actual: " + actualValue);
            }

        } else {
            System.out.println("The inputSignedBy field is enabled, but it should be disabled.");
        }

    } else {
        System.out.println("The inputSignedBy field is not visible.");
    }

    inputSignedBy.isDisplayed();
    checkBoxFinalized.click();

    buttonThreePointsFinalSignature.click();
    pause(300);
    saveFinalSignature.click();
    pause(300);

    driver.switchTo().parentFrame();
}
public void tryToCloseTheTreatmentWithoutTheNephrologistSSignatureAndItShowsMeAnAlert()throws InterruptedException{
    driver.switchTo().frame("frmContenido");
    waitElements(buttonDropDownPod);
    click(buttonDropDownPod);
    pause(200);
    optionRoomAPod.click();
    pause(200);
    click(buttonDropDownShift);
    pause(300);
    optionShiftMorning.click();
    click(buttonDropDownStation);
    pause(300);
    optionStation2.isDisplayed();
    optionStation2.click();
    buttonDropDownHdMachine.click();
    pause(300);
    optionHdMachineAk98.isDisplayed();
    optionHdMachineAk98.click();

    pause(200);
    moveScrollToElement(titleTraceability);

    pause(200);
    waitElements(buttonDropDownDesinfectedBy);
    pause(200);
    click(buttonDropDownDesinfectedBy);
    pause(200);
    optionDesinfectedBy.isDisplayed();
    optionDesinfectedBy.click();

    driver.switchTo().parentFrame();
    pause(300);
    click(upPageArrow);
    pause(1000);

    driver.switchTo().frame("frmContenido");
    waitElements(buttonFinalSignature);
    click(buttonFinalSignature);
    pause(300);

    click(textAreaNotes);
    String note = "test Qa";
    write(textAreaNotes,note);
    pause(200);

    if (inputSignedBy.isDisplayed()) {
        System.out.println("The inputSignedBy field is visible.");

        if (!inputSignedBy.isEnabled()) {
            System.out.println("The inputSignedBy field is disabled.");

            String actualValue = inputSignedBy.getAttribute("value");
            String expectedValue = "PruebaAA Ape Supp, Personal450nefro";

            if (actualValue.equals(expectedValue)) {
                System.out.println("The inputSignedBy field has the expected value: " + expectedValue);
            } else {
                System.out.println("The value of the inputSignedBy field is not as expected. Actual: " + actualValue);
            }

        } else {
            System.out.println("The inputSignedBy field is enabled, but it should be disabled.");
        }

    } else {
        System.out.println("The inputSignedBy field is not visible.");
    }

    click(buttonShift);
    pause(3000);
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