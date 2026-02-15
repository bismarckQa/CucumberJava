package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class PDPrescriptionPage extends BasePage<PDPrescriptionPage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Prescription')]")
    private WebElement titlePrescription;

    @FindBy(how = How.XPATH, using = "//h2[text()='Questionnaires']")
    private WebElement titleQuestionnaire;

    @FindBy(how = How.XPATH, using = "//tr[@ng-repeat='c in $ctrl.pCuestionarios track by $index']//td[1]")
    private WebElement buttonQuestionnaireProva;

    @FindBy(how = How.XPATH, using = "//label[text()='Copy questionnaire']")
    private WebElement optionCopyQuestionnaireProva;

    @FindBy(how = How.XPATH, using = "//label[text()='Active']/following-sibling::select")
    private WebElement buttonDropDownActiveQuestionnaireProva;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'k-picker k-dropdownlist')]//span)[3]")
    private WebElement dropDownCopyQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-primary')])[3]")
    private WebElement buttonCloseQuestionnaire;

    @FindBy(how = How.XPATH, using = "//a[@class='ng-isolate-scope']//i[1]")
    private WebElement buttonEditQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//input[@k-ng-model='$ctrl.prescripcion.data.fechaFin'])[2]")
    private WebElement inputEndDate;

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner']/following-sibling::button)[3]")
    private WebElement dropDownDateOfOnset;

    @FindBy(how = How.XPATH, using = "//a[@class='k-link k-nav-today']")
    private WebElement selectDateOfOnset;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='{ dropup: dropup, single: !multiple }']//button)[1]")
    private WebElement dropDownDayOfTheWeek;

    @FindBy(how = How.XPATH, using = "(//button[@type='button']/following-sibling::button)[2]")
    private WebElement buttonDiscardAll;

    @FindBy(how = How.XPATH, using = "(//li[@ng-repeat='i in items | filter:searchText']//a)[2]")
    private WebElement buttonTuesday;

    @FindBy(how = How.XPATH, using = "(//li[@ng-repeat='i in items | filter:searchText']//a)[4]")
    private WebElement buttonThursday;

    @FindBy(how = How.XPATH, using = "(//button[@translate-once='Demograficos_Label_Guardar'])[2]")
    private WebElement buttonSave;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-default')]/following-sibling::button)[1]")
    private WebElement buttonSaveBiometricMarket;

    @FindBy(how = How.XPATH, using = "//div[@class='x_panel'][.//h2[contains(text(),'Biometric markers')]]//i[contains(@class, 'icon-three-points')]")
    private WebElement buttonThreePointsBiometricMarket;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[1]")
    private WebElement buttonThreePointsPrescription;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[2]")
    private WebElement buttonThreePointsPrescriptionLast;

    @FindBy(how = How.XPATH, using = "//a[@data-target='.modal-nueva-prescripcion']")
    private WebElement buttonNewBiometricMarket;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Modal_Button_OK']")
    private WebElement buttonOkModal;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='InsertarPrescripcion_Label_Cancelar']")
    private WebElement buttonCancelBiometricMarket;

    @FindBy(how = How.XPATH, using = "(//button[@role='button'])[1]")
    private WebElement dropDownBiometricDatum;
    @FindBy(how = How.XPATH, using = "//label[text()='Biometric datum']")
    private WebElement labelBiometricDatum;

    @FindBy(how = How.XPATH, using = "//label[text()='Notice time']")
    private WebElement labelNoticeTime;

    @FindBy(how = How.XPATH, using = "(//input[@k-options='::$root.config.culture.kDateOptions'])[3]")
    private WebElement inputEndDateBiometricMarket;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'k-input k-combobox')]//option)[3]")
    private WebElement optionBiometricDatum;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'k-timepicker k-input')]//button)[1]")
    private WebElement buttonNoticeTime;

    @FindBy(how = How.XPATH, using = "(//div[@class='form-group col-md-6']//select)[2]")
    private WebElement buttonDropDownFrequency;

    @FindBy(how = How.XPATH, using = "(//option[@value='number:0']/following-sibling::option)[1]")
    private WebElement optionDayOfTheWeek;

    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Days of the week')]/following-sibling::multiselect//button[contains(@class, 'dropdown-toggle')]")
    private WebElement buttonDropDownDayOfTheWeek;

    @FindBy(how = How.XPATH, using = "//ul[contains(@class, 'multi-select-popup')]//span[text()='Monday']")
    private WebElement optionMondayDay;

    @FindBy(how = How.XPATH, using = "(//li[@class='ng-scope']//a)[2]")
    private WebElement optionTuesday;

    @FindBy(how = How.XPATH, using = "(//li[@class='ng-scope']//a)[3]")
    private WebElement optionWednesday;

    @FindBy(how = How.XPATH, using = "(//li[@class='ng-scope']//a)[5]")
    private WebElement optionFriday;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'btn-link btn-small')]/following-sibling::button[1]")
    private WebElement discardAllDayOfTheWeek;

    @FindBy(how = How.XPATH, using = "(//a[@section-write='Prescripción DP'])[1]")
    private WebElement buttonEditBiometricMarker;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-plus']/following-sibling::span[1]")
    private WebElement buttonNewPrescription;

    @FindBy(how = How.XPATH, using = "//span[text()='APD']")
    private WebElement optionAPD;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Modal_Button_OK']")
    private WebElement buttonOkWarning;
    @FindBy(how = How.XPATH, using = "(//select[@ng-show='edicion'])[1]")
    private WebElement dropDownTypeOfInfusion;
    @FindBy(how = How.XPATH, using = "(//span[@role='button'])[2]")
    private WebElement dropDownTreatment;

    @FindBy(how = How.XPATH, using = "(//option[@selected='selected']/following-sibling::option)[1]")
    private WebElement optionVolumeTypeOfInfusion;

    @FindBy(how = How.XPATH, using = "//label[text()='Treatment']")
    private WebElement labelTreatment;

    @FindBy(how = How.XPATH, using = "//h2[text()='Manual exchanges']")
    private WebElement titleManualExchange;

    @FindBy(how = How.XPATH, using = "(//button[@type='button'])[2]")
    private WebElement dropDownWeekDaysPrescription;

    @FindBy(how = How.XPATH, using = "//label[text()='Urine volume']/following-sibling::input")
    private WebElement inputUrineVolume;

    @FindBy(how = How.XPATH, using = "//label[text()='Target UF']/following-sibling::input")
    private WebElement inputTargetUf;

    @FindBy(how = How.XPATH, using = "//label[text()='Dry weight']/following-sibling::input")
    private WebElement inputDryWeight;

    @FindBy(how = How.XPATH, using = "//div[@class='intercambios-button']//button[1]")
    private WebElement buttonAddExchange;

    @FindBy(how = How.XPATH, using = "(//input[@aria-placeholder='99h 99m'])[3]")
    private WebElement inputExchangeTime;

    @FindBy(how = How.XPATH, using = "(//input[contains(@class,'form-control ng-pristine')])[1]")
    private WebElement inputInfusionVol;

    @FindBy(how = How.XPATH, using = "(//span[@aria-label='select'])[3]")
    private WebElement dropDownConcentration;

    @FindBy(how = How.XPATH, using = "//label[text()='Concentration']")
    private WebElement optionConcentration;

    @FindBy(how = How.XPATH, using = "//button[text()='Cancel']")
    private WebElement buttonCancelAddExchange;

    @FindBy(how = How.XPATH, using = "//button[text()='Add']")
    private WebElement buttonSaveAddExchange;

    @FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Top']")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "//span[text()='Save']")
    private WebElement buttonSavePrescription;

    @FindBy(how = How.XPATH, using = "//input[@name='totalVolume']")
    private WebElement inputTotalVolume;

    @FindBy(how = How.XPATH, using = "//input[@name='therapyTime']")
    private WebElement inputTherapyTime;

    @FindBy(how = How.XPATH, using = "//a[text()='Prescription history']")
    private WebElement buttonPrescriptionHistory;

    @FindBy(how = How.XPATH, using = "(//a[@section-write='Prescripción DP']//i)[1]")
    private WebElement buttonAddPrescriptionHistory;

    @FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
    private WebElement buttonCancelPrescription;

    @FindBy(how = How.XPATH, using = "(//ul[@id='soluciones-dp']//div[@ng-drag='edicion'])[2]")
    private WebElement optionPhysioneal40Green2500;

    @FindBy(how = How.XPATH, using = "//div[@ng-drop-success='onDropComplete($data,4)']")
    private WebElement place1Drop;

    @FindBy(how = How.XPATH, using = "//div[@class= 'bolsa-solucion luna' and contains(@ng-drop-success, 'onDropComplete($data,3)')]")
    private WebElement place2Drop;

    @FindBy(how = How.XPATH, using = "//div[@title='Retirar solución']")
    private WebElement removeSolution;

    @FindBy(how = How.XPATH, using = "//a[text()='E']")
    private WebElement solutionE;

    @FindBy(how = How.XPATH, using = "//a[text()='N']")
    private WebElement solutionN;

    @FindBy(how = How.XPATH, using = "//a[text()='P']")
    private WebElement solutionP;

    @FindBy(how = How.XPATH, using = "//h2[text()='Parameter adjustments']")
    private WebElement titleParameterAdjustments;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-chevron-down']")
    private WebElement buttonArrowDownParameterAdjustments;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-chevron-up']")
    private WebElement buttonArrowUpParameterAdjustments;

    @FindBy(how = How.XPATH, using = "//div[@class='x_title'][.//h2[contains(text(), 'Questionnaires')]]//i[contains(@class, 'icon-three-points')]")
    private WebElement buttonThreePointsQuestionnaire;

    @FindBy(how = How.XPATH, using = "//label[contains(text(), 'Limit')]/following::input[@type='number'][1]")
    private WebElement inputLimitInferiorQuestionnaire;
    @FindBy(how = How.XPATH, using = "(//input[@ng-model='pregunta.limInferior'])[2]")
    private WebElement inputLimitInferiorQuestionnaire2;

    @FindBy(how = How.XPATH, using = "//span[text()='New questionnaire']")
    private WebElement buttonNewQuestionnaire;

    @FindBy(how = How.XPATH, using = "//span[text()='Assign questionnaire']")
    private WebElement buttonAssignQuestionnaire;

    @FindBy(how = How.XPATH, using = "//span[@title='clear']/following-sibling::button[1]")
    private WebElement dropDownAssignQuestionnaire;

    @FindBy(how = How.XPATH, using = "//option[@value='129']")
    private WebElement optionAssignQuestionnaire;

    @FindBy(how = How.XPATH, using = "//label[text()='Questionnaire']")
    private WebElement labelQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//input[@k-ng-model='$ctrl.prescripcion.data.fechaFin'])[2]")
    private WebElement inputEndDateQuestionnaire;

    @FindBy(how = How.XPATH, using = "//select[@ng-options='obj.value as obj.text | translate for obj in ::$ctrl.enumTipoFrecuencia']")
    private WebElement dropDownFrequencyQuestionnaire;

    @FindBy(how = How.XPATH, using = "//label[text()='Frequency']")
    private WebElement optionFrequencyQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-primary')])[2]")
    private WebElement buttonSaveQuestionnaire;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.cuestionario.nuevo.nombreCuestionario']")
    private WebElement inputQuestionnaireName;

    @FindBy(how = How.XPATH, using = "//div[label[text()='Question'] and label[text()='1']]//input")
    private WebElement inputQuestion1;

    @FindBy(how = How.XPATH, using = "//div[label[text()='Question'] and label[text()='2']]//input")
    private WebElement inputQuestion2;

    @FindBy(how = How.XPATH, using = "(//span[@role='combobox'])[2]")
    private WebElement dropDownQuestionnaireCopy;

    @FindBy(how = How.XPATH, using = "//label[text()='Copy questionnaire']")
    private WebElement labelQuestionnaireCopy;


    @FindBy(how = How.XPATH, using = "(//a[contains(@class,'btn btn-primary')])[2]")
    private WebElement buttonSaveNewQuestionnaire;

    @FindBy(how = How.XPATH, using = "//span[@data-translate='CAPD']")
    private WebElement buttonCAPD;

    @FindBy(how = How.XPATH, using = "(//input[@aria-placeholder='99h 99m'])[2]")
    private WebElement inputExtraTime;

    @FindBy(how = How.XPATH, using = "(//tr[contains(@class,'trs-intercambios-escritura ng-scope')]//input)[3]")
    private WebElement inputVolInfoCAPDExchange;

    @FindBy(how = How.XPATH, using = "(//div[@ng-drop-success='onDropCompleteCAPD($data,$index)']//div)[1]")
    private WebElement initPlaceDrop;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[4]")
    private WebElement solutionGreen40_2500mlDrag;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[6]")
    private WebElement solutionYellow35_2000mlDrag;

    @FindBy(how = How.XPATH, using = "//a[@title='Delete']")
    private WebElement buttonDeleteManualExchange;

    @FindBy(how = How.XPATH, using = "//a[text()='Cancel']")
    private WebElement buttonCancelSaveNewQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//div[@class='modal-footer']//button[text()='Cancel'])[2]")
    private WebElement buttonCancelQuestionnaire;

    @FindBy(how = How.XPATH, using = "//div[@class='modal-dialog modal-ml'][.//h4[contains(text(), 'See questionnaire')]]//button[text()='Close']")
    private WebElement buttonClose;

    @FindBy(how = How.XPATH, using = "//h2[text()='Biometric markers']")
    private WebElement titleBiometricMarket;

    @FindBy(how = How.XPATH, using = "//label[text()='Days of the week']")
    private WebElement labelDayOfTheWeek;

    @FindBy(how = How.XPATH, using = "(//input[@k-options='::$root.config.culture.kDateOptions'])[1]")
    private WebElement inputDateOfOnset;

    @FindBy(how = How.XPATH, using = "//input[@uib-tooltip='The value entered must be between 60 and 125']")
    private WebElement inputMinDrainageVol;

    @FindBy(how = How.XPATH, using = "//span[text()='8 Routes']")
    private WebElement button8Routes;

    @FindBy(how = How.XPATH, using = "//span[text()='4 Routes']")
    private WebElement button4Routes;

    @FindBy(how = How.XPATH, using = "(//div[@id='AssistContent']//div[@ng-drop='edicion' and contains(@ng-drop-success, 'onDropComplete($data,')])[3]")
    private WebElement zoneDrope3;

    @FindBy(how = How.XPATH, using = "//label[text()='System']/following-sibling::span")
    private WebElement buttonDropDownSystem;

    @FindBy(how = How.XPATH, using = "//select[@k-ng-model='prescripciones[indexPresDPActual].proveedorId']//option[text()='Sleep Safe']")
    private WebElement optionSleepSafe;

    @FindBy(how = How.XPATH, using = "//label[text()='System']")
    private WebElement labelSystem;

    @FindBy(how = How.XPATH, using = "//button[text()='Add cycle' and @class='btn btn-primary btn-xs']")
    private WebElement buttonAddCycle;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='prescDPIntercambio.manFillVolume']")
    private WebElement inputLowerVolAssistant;

    @FindBy(how = How.XPATH, using = "(//input[@data-role='maskedtextbox'])[1]")
    private WebElement inputExTimeAssistant;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'k-input k-maskedtextbox')]//input)[2]")
    private WebElement inputDwellTimeAssistant;

    @FindBy(how = How.XPATH, using = "//span[@unselectable='on']/following-sibling::button[1]")
    private WebElement buttonDropDownConcentrationAssistant;

    @FindBy(how = How.XPATH, using = "(//input[@role='combobox'])[1]")
    private WebElement optionNullConcentrationAssistant;

    @FindBy(how = How.XPATH, using = "(//i[contains(@class,  'fa-trash')])[1]")
    private WebElement buttonIconDelete;

    @FindBy(how = How.XPATH, using = "(//div[@ng-drop-success='onDropCompleteCAPD($data,$index)']//div)[1]")
    private WebElement initPlaceDrop2;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[5]")
    private WebElement solutionGreen40_2500mlDrag2;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[6]")
    private WebElement solutionYellow35_2000mlDrag2;
    @FindBy(how = How.XPATH, using = "//label[text()='Nº daytime inf.']/following-sibling::input")
    private WebElement inputNDayTimeInfo;

    @FindBy(how = How.XPATH, using = "(//span[@class='nowrap']/following-sibling::input)[2]")
    private WebElement inputTidalVol;

    @FindBy(how = How.XPATH, using = "(//span[@class='nowrap']/following-sibling::input)[3]")
    private WebElement inputTotalUF;

    @FindBy(how = How.XPATH, using = "//span[text()='See questionnaire']")
    private WebElement buttonSeeQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//div[@class='col-md-4']//span)[1]")
    private WebElement dropDownBaxterFresenius;

    @FindBy(how = How.XPATH, using = "(//div[@class='show-action-buttons-container'])[1]")
    private WebElement buttonDeleteQuestionQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//a[@data-placement='top'])[1]")
    private WebElement buttonAddNewQuestion;









    public void isDisplayedTheTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(titlePrescription);
        titlePrescription.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void scrollToQuestionnaireTitle()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(titleQuestionnaire);
        scrollToElementMove(titleQuestionnaire);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonQuestionnaireProva()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonQuestionnaireProva);
        click(buttonQuestionnaireProva);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonActiveQuestionnaireProva()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownActiveQuestionnaireProva);
        click(buttonDropDownActiveQuestionnaireProva);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonCloseQuestionnaireProva()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownActiveQuestionnaireProva);
        click(buttonDropDownActiveQuestionnaireProva);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonEditQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonEditQuestionnaire);
        click(buttonEditQuestionnaire);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String endDate = "02/18/2026";

        pause(300);
        waitElements(inputEndDate);
        inputEndDate.sendKeys(Keys.CONTROL + "a");
        inputEndDate.sendKeys(Keys.DELETE);
        inputEndDate.sendKeys(Keys.ENTER);
        write(inputEndDate,endDate);
        pause(200);
        click(dropDownDateOfOnset);
        pause(300);
        scrollToElementMove(selectDateOfOnset);
        click(selectDateOfOnset);

        click(buttonSave);
        pause(400);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsBiometricMarket()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonThreePointsBiometricMarket);
        click(buttonThreePointsBiometricMarket);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonNew()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonNewBiometricMarket);
        click(buttonNewBiometricMarket);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveBiometricMarket()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonSaveBiometricMarket);
        click(buttonSaveBiometricMarket);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonOkModal()throws InterruptedException {
        driver.switchTo().parentFrame();
        waitElements(buttonOkModal);
        click(buttonOkModal);
        pause(300);
    }
    public void clickButtonCancelBiometricMarket()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelBiometricMarket);
        click(buttonCancelBiometricMarket);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonEditBiometricMarker()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonEditBiometricMarker);
        click(buttonEditBiometricMarker);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataNewBiometricMarket()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        dropDownBiometricDatum.isDisplayed();
        dropDownBiometricDatum.click();
        pause(1000);
        clickBelowElementByOffset(labelBiometricDatum,120);
        pause(1000);
        String endDateBiometric = "02/15/2026";
        waitElements(inputEndDateBiometricMarket);
        inputEndDateBiometricMarket.sendKeys(Keys.CONTROL + "a");
        inputEndDateBiometricMarket.sendKeys(Keys.DELETE);
        inputEndDateBiometricMarket.sendKeys(Keys.ENTER);
        write(inputEndDateBiometricMarket,endDateBiometric);
        pause(300);
        click(buttonNoticeTime);
        pause(300);
        clickBelowElementByOffset(labelNoticeTime,100);
        pause(300);
        waitElements(buttonDropDownFrequency);
        click(buttonDropDownFrequency);
        pause(300);
        click(optionDayOfTheWeek);
        pause(300);
        click(buttonDropDownFrequency);
        pause(200);
        click(buttonDropDownDayOfTheWeek);
        pause(300);
        clickBelowElementByOffset(labelDayOfTheWeek,120);
        pause(200);
        clickBelowElementByOffset(labelDayOfTheWeek,140);
        pause(200);
        click(buttonDropDownDayOfTheWeek);
        driver.switchTo().parentFrame();
    }
    public void editDataBiometricMarket()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        Actions actions = new Actions(driver);
        actions.moveToElement(dropDownBiometricDatum).moveByOffset(-10, 40).click().build().perform();
        pause(200);
        String endDateBiometric = "04/25/2026";
        waitElements(inputEndDateBiometricMarket);
        inputEndDateBiometricMarket.sendKeys(Keys.CONTROL + "a");
        inputEndDateBiometricMarket.sendKeys(Keys.DELETE);
        inputEndDateBiometricMarket.sendKeys(Keys.ENTER);
        write(inputEndDateBiometricMarket,endDateBiometric);
        pause(300);
        click(buttonNoticeTime);
        pause(300);
        actions.moveToElement(buttonNoticeTime).moveByOffset(-10, 60).click().build().perform();
        pause(300);
        waitElements(buttonDropDownFrequency);
        click(buttonDropDownFrequency);
        pause(300);
        click(optionDayOfTheWeek);
        pause(300);
        waitElements(buttonDropDownDayOfTheWeek);
        click(buttonDropDownDayOfTheWeek);
        pause(300);
        click(discardAllDayOfTheWeek);
        click(optionTuesday);
        pause(300);
        click(optionFriday);
        pause(300);
        click(buttonDropDownDayOfTheWeek);
        pause(3000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsPrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonThreePointsPrescription);
        click(buttonThreePointsPrescription);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsPrescriptionLast()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonThreePointsPrescriptionLast);
        click(buttonThreePointsPrescriptionLast);
        pause(3000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonNewPrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(400);
        waitElements(buttonNewPrescription);
        click(buttonNewPrescription);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonAPDOption()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(optionAPD);
        click(optionAPD);

        driver.switchTo().parentFrame();
    }
    public void clickDropDownTypeOfInfusion()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(dropDownTypeOfInfusion);
        click(dropDownTypeOfInfusion);
        pause(300);
        //optionVolumeTypeOfInfusion.isDisplayed();
        //optionVolumeTypeOfInfusion.click();
        click(dropDownTypeOfInfusion);

        driver.switchTo().parentFrame();
    }
    public void clickButtonOkWarning()throws InterruptedException{
        pause(300);
        try {
            if (buttonOkWarning.isDisplayed()){
                click(buttonOkWarning);
                pause(400);
            }
        }catch (NoSuchElementException | ElementNotInteractableException e){

        }

    }
    public void clickButtonDropDownTreatment()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(dropDownTreatment);
        click(dropDownTreatment);
        pause(500);
        Actions actions = new Actions(driver);
        actions.moveToElement(labelTreatment).moveByOffset(-0, 80).click().build().perform();
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDropDownTreatmentOcpd()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(dropDownTreatment);
        click(dropDownTreatment);
        pause(500);
        clickBelowElementByOffset(labelTreatment,150);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDropDownTreatmentOCDPTidal()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(dropDownTreatment);
        click(dropDownTreatment);
        pause(500);
        clickBelowElementByOffset(labelTreatment,180);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDropDownTreatmentTidal()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(dropDownTreatment);
        click(dropDownTreatment);
        pause(500);
        clickBelowElementByOffset(labelTreatment,200);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDropDownWeekdays()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        isDisplayed(dropDownWeekDaysPrescription);
        click(dropDownWeekDaysPrescription);
        pause(500);
        waitElements(optionMondayDay);
        click(optionMondayDay);
        pause(200);
        optionWednesday.click();
        pause(200);
        optionFriday.click();
        click(dropDownWeekDaysPrescription);
        driver.switchTo().parentFrame();
    }
    public void inputDataUrineVolume()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputUrineVolume);
        click(inputUrineVolume);
        pause(200);
        String urineVolume = "1";
        inputUrineVolume.sendKeys(Keys.CONTROL + "a");
        inputUrineVolume.sendKeys(Keys.DELETE);
        inputUrineVolume.sendKeys(Keys.ENTER);
        write(inputUrineVolume,urineVolume);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataNDayTimeInfo()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputNDayTimeInfo);
        click(inputNDayTimeInfo);
        pause(200);
        String dayTimeInfo = "1";
        inputNDayTimeInfo.sendKeys(Keys.CONTROL + "a");
        inputNDayTimeInfo.sendKeys(Keys.DELETE);
        inputNDayTimeInfo.sendKeys(Keys.ENTER);
        write(inputNDayTimeInfo,dayTimeInfo);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataTargetUf()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputTargetUf);
        click(inputTargetUf);
        pause(200);
        String targetUf = "0";
        inputTargetUf.sendKeys(Keys.CONTROL + "a");
        inputTargetUf.sendKeys(Keys.DELETE);
        inputTargetUf.sendKeys(Keys.ENTER);
        write(inputTargetUf,targetUf);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataDryWeight()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputDryWeight);
        click(inputDryWeight);
        pause(200);
        String dryWeight = "10.5";
        inputDryWeight.sendKeys(Keys.CONTROL + "a");
        inputDryWeight.sendKeys(Keys.DELETE);
        inputDryWeight.sendKeys(Keys.ENTER);
        write(inputDryWeight,dryWeight);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataTotalVolume()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputTotalVolume);
        click(inputTotalVolume);
        pause(200);
        String totalVolume = "300";
        inputTotalVolume.sendKeys(Keys.CONTROL + "a");
        inputTotalVolume.sendKeys(Keys.DELETE);
        inputTotalVolume.sendKeys(Keys.ENTER);
        write(inputTotalVolume,totalVolume);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataTherapyTime()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputTherapyTime);
        click(inputTherapyTime);
        pause(200);
        String therapyTime = "0830";
        inputTherapyTime.sendKeys(Keys.CONTROL + "a");
        inputTherapyTime.sendKeys(Keys.DELETE);
        inputTherapyTime.sendKeys(Keys.ENTER);
        write(inputTherapyTime,therapyTime);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataTherapyTimeLowTime()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(inputTherapyTime);
        click(inputTherapyTime);
        pause(200);
        String therapyTime = "0010";
        inputTherapyTime.sendKeys(Keys.CONTROL + "a");
        inputTherapyTime.sendKeys(Keys.DELETE);
        inputTherapyTime.sendKeys(Keys.ENTER);
        write(inputTherapyTime,therapyTime);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonAddExchange()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        scrollToElementMove(buttonAddExchange);
        isDisplayed(buttonAddExchange);
        click(buttonAddExchange);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void dataAddExchange()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        String exchangeTime = "0120";
        String infusionVol= "34";
        waitElements(inputExchangeTime);
        click(inputExchangeTime);
        click(inputExchangeTime);
        inputExchangeTime.sendKeys(Keys.CONTROL + "a");
        inputExchangeTime.sendKeys(Keys.DELETE);
        inputExchangeTime.sendKeys(Keys.ENTER);
        pause(200);
        write(inputExchangeTime,exchangeTime);
        pause(200);
        inputInfusionVol.click();
        pause(200);
        write(inputInfusionVol,infusionVol);
        pause(200);
        click(dropDownConcentration);
        pause(200);
        clickBelowElementByOffset(optionConcentration,120);
        driver.switchTo().parentFrame();
    }
    public void clickSaveAddExchange()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonSaveAddExchange);
        click(buttonSaveAddExchange);
        driver.switchTo().parentFrame();
    }

    public void clickButtonArrowUp()throws InterruptedException{
        pause(200);
        driver.switchTo().parentFrame();
        buttonArrowUp.click();
        pause(300);

    }
    public void clickSavePrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonSavePrescription);
        click(buttonSavePrescription);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonPrescriptionHistory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonPrescriptionHistory);
        click(buttonPrescriptionHistory);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonAddPrescriptionHistory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonAddPrescriptionHistory);
        click(buttonAddPrescriptionHistory);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelPrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonCancelPrescription);
        click(buttonCancelPrescription);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void cleanInputDataTotalVolume()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputTotalVolume);
        waitElements(inputTotalVolume);
        click(inputTotalVolume);
        pause(200);
        inputTotalVolume.sendKeys(Keys.CONTROL + "a");
        inputTotalVolume.sendKeys(Keys.DELETE);
        inputTotalVolume.sendKeys(Keys.ENTER);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void dragAndDrop1()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(place1Drop);
        scrollToElementMove(optionPhysioneal40Green2500);

        dragAndDrop(optionPhysioneal40Green2500,place2Drop);
        //dragAndDropVisible(optionPhysioneal40Green2500,place1Drop);
        pause(500);


        driver.switchTo().parentFrame();
    }
    public void clickButtonRemoveSolution()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(removeSolution);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSolutionE()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(solutionE);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSolutionN()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(solutionN);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSolutionP()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(solutionP);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void titleParameterAdjustments()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(titleParameterAdjustments);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonArrowDownParameterAdjustments()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonArrowDownParameterAdjustments);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonArrowUpParameterAdjustments()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonArrowUpParameterAdjustments);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePointsQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonNewQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonNewQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void clickButtonAssignQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonAssignQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void inputsDataAssignQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(dropDownAssignQuestionnaire);

        pause(300);
        clickBelowElementByOffset(labelQuestionnaire,60);
        pause(300);
        click(dropDownFrequencyQuestionnaire);
        pause(200);
        clickBelowElementByOffset(dropDownFrequencyQuestionnaire,65);
        pause(300);
        String endDate="04/09/2026";
        click(inputEndDateQuestionnaire);
        inputEndDateQuestionnaire.sendKeys(Keys.CONTROL + "a");
        inputEndDateQuestionnaire.sendKeys(Keys.DELETE);
        inputEndDateQuestionnaire.sendKeys(Keys.ENTER);
        write(inputEndDateQuestionnaire,endDate);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void inputsDataAssignWithoutQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(dropDownFrequencyQuestionnaire);
        pause(200);
        clickBelowElementByOffset(dropDownFrequencyQuestionnaire,65);
        pause(300);
        String endDate="04/09/2026";
        click(inputEndDateQuestionnaire);
        inputEndDateQuestionnaire.sendKeys(Keys.CONTROL + "a");
        inputEndDateQuestionnaire.sendKeys(Keys.DELETE);
        inputEndDateQuestionnaire.sendKeys(Keys.ENTER);
        write(inputEndDateQuestionnaire,endDate);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonSaveQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void inputDataQuestionnaireName()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String questionnaireName="Questionnaire test";
        click(inputQuestionnaireName);
        inputQuestionnaireName.sendKeys(Keys.CONTROL + "a");
        inputQuestionnaireName.sendKeys(Keys.DELETE);
        inputQuestionnaireName.sendKeys(Keys.ENTER);
        write(inputQuestionnaireName,questionnaireName);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void inputDataQuestion1()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String question1="Firts Question Qa";
        click(inputQuestion1);
        inputQuestion1.sendKeys(Keys.CONTROL + "a");
        inputQuestion1.sendKeys(Keys.DELETE);
        inputQuestion1.sendKeys(Keys.ENTER);
        write(inputQuestion1,question1);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void inputDataQuestion2()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String question2="Second Question Qa";
        click(inputQuestion2);
        inputQuestion2.sendKeys(Keys.CONTROL + "a");
        inputQuestion2.sendKeys(Keys.DELETE);
        inputQuestion2.sendKeys(Keys.ENTER);
        write(inputQuestion2,question2);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void clickDropDownQuestionnaireCopy()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(3000);
        waitElements(dropDownQuestionnaireCopy);
        click(dropDownQuestionnaireCopy);
        pause(200);
        clickBelowElementByOffset(labelQuestionnaireCopy,120);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveNewQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonSaveNewQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCapd()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonCAPD);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void inputsDataAddExchangeCapd()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(inputExtraTime);
        String extraTime = "0500";
        pause(200);
        write(inputExtraTime,extraTime);
        pause(200);
        click(inputVolInfoCAPDExchange);
        String VolInfo= "200";
        inputVolInfoCAPDExchange.sendKeys(Keys.CONTROL + "a");
        inputVolInfoCAPDExchange.sendKeys(Keys.DELETE);
        inputVolInfoCAPDExchange.sendKeys(Keys.ENTER);
        write(inputVolInfoCAPDExchange,VolInfo);
        pause(200);
        scrollToElementMove(solutionGreen40_2500mlDrag);
        dragAndDropVisible(solutionYellow35_2000mlDrag, initPlaceDrop);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void inputsDataAddExchangeCapdFresenius()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(inputExtraTime);
        String extraTime = "0500";
        pause(200);
        write(inputExtraTime,extraTime);
        pause(200);
        String lowerVol = "200";
        click(inputLowerVolAssistant);
        write(inputLowerVolAssistant, lowerVol);
        pause(200);
        click(buttonDropDownConcentrationAssistant);
        pause(200);
        click(optionNullConcentrationAssistant);
        String nullOption ="null";
        pause(200);
        optionNullConcentrationAssistant.sendKeys(Keys.CONTROL + "a");
        optionNullConcentrationAssistant.sendKeys(Keys.DELETE);
        optionNullConcentrationAssistant.sendKeys(Keys.ENTER);
        write(optionNullConcentrationAssistant,nullOption);
        driver.switchTo().parentFrame();
    }
    public void inputsDataAddExchangeCapdFreseniusWithFieldRequiredEmpty()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(inputExtraTime);
        String extraTime = "0500";
        pause(200);
        write(inputExtraTime,extraTime);
        pause(200);
        click(buttonDropDownConcentrationAssistant);
        pause(200);
        click(optionNullConcentrationAssistant);
        String nullOption ="null";
        pause(200);
        optionNullConcentrationAssistant.sendKeys(Keys.CONTROL + "a");
        optionNullConcentrationAssistant.sendKeys(Keys.DELETE);
        optionNullConcentrationAssistant.sendKeys(Keys.ENTER);
        write(optionNullConcentrationAssistant,nullOption);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDeleteManualExchanges()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonDeleteManualExchange);
        click(buttonDeleteManualExchange);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelAddExchanges()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonCancelAddExchange);
        click(buttonCancelAddExchange);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelSaveNewQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonCancelSaveNewQuestionnaire);
        scrollToElementMove(buttonCancelSaveNewQuestionnaire);
        click(buttonCancelSaveNewQuestionnaire);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelNewQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonCancelQuestionnaire);
        scrollToElementMove(buttonCancelQuestionnaire);
        click(buttonCancelQuestionnaire);
        pause(300);
        driver.switchTo().parentFrame();
    }


    public void scrollToBiometricMarket()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(titleBiometricMarket);
        scrollToElementMove(titleBiometricMarket);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void cleanInputDateOfOnset()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(inputDateOfOnset);
        inputDateOfOnset.sendKeys(Keys.CONTROL + "a");
        inputDateOfOnset.sendKeys(Keys.DELETE);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void inputDataMinDrainageVol()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        inputMinDrainageVol.click();
        String drainage_vol ="90";
        pause(200);
        inputMinDrainageVol.sendKeys(Keys.CONTROL + "a");
        inputMinDrainageVol.sendKeys(Keys.DELETE);
        inputMinDrainageVol.sendKeys(Keys.ENTER);
        write(inputMinDrainageVol,drainage_vol);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButton8Routes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(button8Routes);
        click(button8Routes);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButton4Routes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(button4Routes);
        click(button4Routes);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void dragAndDropAssistant1()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(optionPhysioneal40Green2500);
        dragAndDrop(optionPhysioneal40Green2500,zoneDrope3);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDropDownSystem()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        //scrollToElementMove(buttonDropDownSystem);
        pause(200);
        click(buttonDropDownSystem);
        driver.switchTo().parentFrame();
    }
    public void selectClariaSystem()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        clickBelowElementByOffset(labelSystem,130);
        driver.switchTo().parentFrame();
    }


    public void selectSleepSafeSystem()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        clickBelowElementByOffset(labelSystem,170);
        driver.switchTo().parentFrame();
    }
    public void selectHomeChoiseSystem()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        clickBelowElementByOffset(labelSystem,150);
        driver.switchTo().parentFrame();
    }
    public void clickButtonAddCycle()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonAddCycle);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void inputDataLowerVolAssistant()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        inputLowerVolAssistant.click();
        String lower_vol ="10";
        pause(200);
        inputLowerVolAssistant.sendKeys(Keys.CONTROL + "a");
        inputLowerVolAssistant.sendKeys(Keys.DELETE);
        inputLowerVolAssistant.sendKeys(Keys.ENTER);
        write(inputLowerVolAssistant,lower_vol);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataExTimeAssistant()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        inputExTimeAssistant.click();
        String exTime ="0300";
        pause(200);
        inputExTimeAssistant.sendKeys(Keys.CONTROL + "a");
        inputExTimeAssistant.sendKeys(Keys.DELETE);
        inputExTimeAssistant.sendKeys(Keys.ENTER);
        write(inputExTimeAssistant,exTime);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataDwellTimeAssistant()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        inputDwellTimeAssistant.click();
        String dwellTime ="0200";
        pause(200);
        inputDwellTimeAssistant.sendKeys(Keys.CONTROL + "a");
        inputDwellTimeAssistant.sendKeys(Keys.DELETE);
        inputDwellTimeAssistant.sendKeys(Keys.ENTER);
        write(inputDwellTimeAssistant,dwellTime);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDropDownConcentrationAssistant()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonDropDownConcentrationAssistant);
        pause(200);
        click(optionNullConcentrationAssistant);
        String nullOption ="null";
        pause(200);
        optionNullConcentrationAssistant.sendKeys(Keys.CONTROL + "a");
        optionNullConcentrationAssistant.sendKeys(Keys.DELETE);
        optionNullConcentrationAssistant.sendKeys(Keys.ENTER);
        write(optionNullConcentrationAssistant,nullOption);
        pause(200);
        driver.switchTo().parentFrame();
    }

    @Override
    public boolean isAt() {
        return false;
    }

    public void clickButtonIconDelete()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonIconDelete);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickDropDownBaxterFresenius()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(dropDownBaxterFresenius);
        clickBelowElementByOffset(titleManualExchange, 90);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void inputDataTidalVol()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        inputTidalVol.click();
        String tidalVol ="40";
        pause(200);
        inputTidalVol.sendKeys(Keys.CONTROL + "a");
        inputTidalVol.sendKeys(Keys.DELETE);
        inputTidalVol.sendKeys(Keys.ENTER);
        write(inputTidalVol,tidalVol);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataTotalUF()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        inputTotalUF.click();
        String totalUf ="10";
        pause(200);
        inputTotalUF.sendKeys(Keys.CONTROL + "a");
        inputTotalUF.sendKeys(Keys.DELETE);
        inputTotalUF.sendKeys(Keys.ENTER);
        write(inputTotalUF,totalUf);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataLimitInferiorClean()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        String limitInferior = " ";
        inputLimitInferiorQuestionnaire.click();
        pause(300);
        inputLimitInferiorQuestionnaire.sendKeys(Keys.CONTROL + "a");
        inputLimitInferiorQuestionnaire.sendKeys(Keys.DELETE);
        inputLimitInferiorQuestionnaire.sendKeys(Keys.ENTER);
        write(inputLimitInferiorQuestionnaire, limitInferior);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataLimitInferiorWrong()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        String limitInferior = "1234344544645 ";
        inputLimitInferiorQuestionnaire.click();
        pause(300);
        inputLimitInferiorQuestionnaire.sendKeys(Keys.CONTROL + "a");
        inputLimitInferiorQuestionnaire.sendKeys(Keys.DELETE);
        inputLimitInferiorQuestionnaire.sendKeys(Keys.ENTER);
        write(inputLimitInferiorQuestionnaire, limitInferior);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataLimitInferior()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        String limitInferior = "10";
        inputLimitInferiorQuestionnaire.click();
        pause(300);
        inputLimitInferiorQuestionnaire.sendKeys(Keys.CONTROL + "a");
        inputLimitInferiorQuestionnaire.sendKeys(Keys.DELETE);
        inputLimitInferiorQuestionnaire.sendKeys(Keys.ENTER);
        write(inputLimitInferiorQuestionnaire, limitInferior);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void inputDataLimitInferior2()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        String limitInferior2 = "10";
        inputLimitInferiorQuestionnaire2.click();
        pause(300);
        inputLimitInferiorQuestionnaire2.sendKeys(Keys.CONTROL + "a");
        inputLimitInferiorQuestionnaire2.sendKeys(Keys.DELETE);
        inputLimitInferiorQuestionnaire2.sendKeys(Keys.ENTER);
        write(inputLimitInferiorQuestionnaire2, limitInferior2);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDropDownCopyQuestionnaire()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(dropDownCopyQuestionnaire);
        click(dropDownCopyQuestionnaire);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickOptionCopyQuestionnaireProva() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        clickBelowElementByOffset(optionCopyQuestionnaireProva,100);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonSeeQuestionnaire() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(buttonSeeQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonClose() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        scrollToElementMove(buttonClose);
        scrollByPixels(200);
        clickJS(buttonClose);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteQuestion() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonDeleteQuestionQuestionnaire);
        scrollToElementMove(buttonDeleteQuestionQuestionnaire);
        click(buttonDeleteQuestionQuestionnaire);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void clickButtonAddNewQuestion() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        isDisplayed(buttonAddNewQuestion);
        scrollToElementMove(buttonAddNewQuestion);
        click(buttonAddNewQuestion);
        pause(200);
        driver.switchTo().parentFrame();
    }




    //*********Page Methods*********


}
