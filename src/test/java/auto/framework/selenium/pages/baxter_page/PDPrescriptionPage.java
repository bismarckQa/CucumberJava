package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Keys;
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

    @FindBy(how = How.XPATH, using = "//label[text()='Active']/following-sibling::select")
    private WebElement buttonDropDownActiveQuestionnaireProva;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-primary')])[3]")
    private WebElement buttonCloseQuestionnaire;

    @FindBy(how = How.XPATH, using = "//a[@class='ng-isolate-scope']//i[1]")
    private WebElement buttonEditQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//input[@k-ng-model='$ctrl.prescripcion.data.fechaFin'])[2]")
    private WebElement inputEndDate;

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner']/following-sibling::button)[3]")
    private WebElement dropDownDateOfOnset;

    @FindBy(how = How.XPATH, using = "/html/body/div[9]/div/div/div[3]/a")
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

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[2]")
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

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-default')])[1]")
    private WebElement buttonDropDownDayOfTheWeek;

    @FindBy(how = How.XPATH, using = "(//li[@class='ng-scope']//a)[1]")
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

    @FindBy(how = How.XPATH, using = "//span[text()='APD']/following-sibling::label")
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

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[2]")
    private WebElement optionPhysioneal40Green2500;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'col-md-2 col-sm-2')]//div)[1]")
    private WebElement place1Drop;

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

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[4]")
    private WebElement buttonThreePointsQuestionnaire;

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

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner'])[6]")
    private WebElement inputEndDateQuestionnaire;

    @FindBy(how = How.XPATH, using = "//select[@ng-options='obj.value as obj.text | translate for obj in ::$ctrl.enumTipoFrecuencia']")
    private WebElement dropDownFrequencyQuestionnaire;

    @FindBy(how = How.XPATH, using = "//label[text()='Frequency']")
    private WebElement optionFrequencyQuestionnaire;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'btn btn-default')]/following-sibling::button)[3]")
    private WebElement buttonSaveQuestionnaire;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.cuestionario.nuevo.nombreCuestionario']")
    private WebElement inputQuestionnaireName;

    @FindBy(how = How.XPATH, using = "(//span[@role='button'])[7]")
    private WebElement dropDownQuestionnaireCopy;

    @FindBy(how = How.XPATH, using = "//label[text()='Copy questionnaire']")
    private WebElement labelQuestionnaireCopy;


    @FindBy(how = How.XPATH, using = "(//a[contains(@class,'btn btn-primary')])[2]")
    private WebElement buttonSaveNewQuestionnaire;

    @FindBy(how = How.XPATH, using = "//span[@data-translate='CAPD']")
    private WebElement buttonCAPD;

    @FindBy(how = How.XPATH, using = "(//input[@aria-placeholder='99h 99m'])[2]")
    private WebElement inputExtraTime;

    @FindBy(how = How.XPATH, using = "(//div[@ng-drop-success='onDropCompleteCAPD($data,$index)']//div)[1]")
    private WebElement initPlaceDrop;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[5]")
    private WebElement solutionGreen40_2500mlDrag;

    @FindBy(how = How.XPATH, using = "(//div[@ng-class='getCSS_ListadoSolucion(solHijo)'])[6]")
    private WebElement solutionYellow35_2000mlDrag;

    @FindBy(how = How.XPATH, using = "//a[@title='Delete']")
    private WebElement buttonDeleteManualExchange;





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
        String endDate = "02/15/2026";

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
        click(dropDownDayOfTheWeek);
        pause(300);
        click(buttonDiscardAll);
        pause(200);
        click(buttonTuesday);
        pause(300);
        click(buttonThursday);
        pause(200);
        click(dropDownDayOfTheWeek);
        pause(300);
        click(buttonSave);
        pause(400);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePoints()throws InterruptedException{
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
        Actions actions = new Actions(driver);
        actions.moveToElement(dropDownBiometricDatum).moveByOffset(-10, 100).click().build().perform();
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
        actions.moveToElement(buttonNoticeTime).moveByOffset(-10, 100).click().build().perform();
        pause(300);
        waitElements(buttonDropDownFrequency);
        click(buttonDropDownFrequency);
        pause(300);
        click(optionDayOfTheWeek);
        pause(300);
        waitElements(buttonDropDownDayOfTheWeek);
        click(buttonDropDownDayOfTheWeek);
        pause(300);
        click(optionMondayDay);
        pause(300);
        click(optionWednesday);
        pause(300);
        click(buttonDropDownDayOfTheWeek);
        pause(3000);
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
        isDisplayed(buttonOkWarning);
        click(buttonOkWarning);
        pause(400);
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
        String totalVolume = "251";
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
        pause(200);
        dragAndDrop(optionPhysioneal40Green2500,place1Drop);
        pause(400);

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
        clickBelowElementByOffset(dropDownFrequencyQuestionnaire,60);
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
        String questionnaireName="Questionnaire Qa";
        click(inputQuestionnaireName);
        inputQuestionnaireName.sendKeys(Keys.CONTROL + "a");
        inputQuestionnaireName.sendKeys(Keys.DELETE);
        inputQuestionnaireName.sendKeys(Keys.ENTER);
        write(inputQuestionnaireName,questionnaireName);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void clickDropDownQuestionnaireCopy()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(labelQuestionnaireCopy);
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
        String extraTime = "0320";
        pause(200);
        write(inputExtraTime,extraTime);
        pause(300);
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

    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********


}
