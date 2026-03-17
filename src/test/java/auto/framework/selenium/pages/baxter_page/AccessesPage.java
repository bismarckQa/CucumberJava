package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


@LazyComponent
public class AccessesPage extends BasePage<AccessesPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Location')]")
    private WebElement titleAccesses;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Save')]")
    private WebElement saveButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Save')]")
    private WebElement CancelButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'New additional test')]")
    private WebElement newAdditionalTestButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'See further tests')]")
    private WebElement seeFurtherTestsButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'5/4/2024 - Patient condition - Anemia')]")
    private WebElement attachedTestAnemiaButton;

    @FindBy(how = How.ID, using = "Localizacion1")
    private WebElement accessLocation1;

    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[1]")
    private WebElement accessTypeButtonDropdown;

    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[2]")
    private WebElement accessLocationButtonDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[1]/div/div/div/span/button")
    private WebElement associateAdditionalStudyButtonDropdown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'5/4/2024 - Patient condition - Anemia')]")
    private WebElement associateAdditionalStudySelectionAnemia;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[2]/div/button[1]")
    private WebElement associateAdditionalStudyAddButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AccesoVascularView\"]/ng-form/div[2]/div/ng-form/ng-form/div/div/div[1]/div[1]/menu-individual/ul")
    private WebElement accessDataButtonDropdown;

    @FindBy(how = How.XPATH, using = "//body[@contenteditable='true']")
    private WebElement inputComments;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[1]")
    private WebElement threePointButtonOfAccesses;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[3]")
    private WebElement threePointButtonOfAccessData;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Patient condition - Anemia')]")
    private WebElement testCheckConditionAnemia;

    @FindBy(how = How.XPATH, using = "(//span[@translate-once='Accesos_Label_Eliminar'])[1]")
    private WebElement deleteAccessButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div/div[4]/div[2]/div/span/input")
    private WebElement inputDateOfFirstUse;
    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[2]/div/button[2]")
    private WebElement cancelDeleteAccess;
    @FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary ng-scope'])[1]")
    private WebElement acceptDeleteAccess;
    @FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary ng-scope'])[1]")
    private WebElement acceptInformationDeleteAccess;

    @FindBy(how = How.XPATH, using = "(//input[@placeholder='MM/dd/yyyy'])[2]")
    private WebElement inputImplantationDate;

    @FindBy(how = How.XPATH, using = "(//input[@data-role='datepicker'])[3]")
    private WebElement inputDateOfRemoval;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement upArrowOnPage;

    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[6]")
    private WebElement accessRemovalCenterDropDown;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Edit all')]")
    private WebElement editAllButton;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Edit')]")
    private WebElement buttonEdit;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'QATestAccessEdit')]")
    private WebElement commentQATestAccessEdit;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'accLocation ng-scope ng-isolate-scope zoomTarget inactivos')]")
    private WebElement target1InactiveRedColour;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'accLocation ng-scope ng-isolate-scope zoomTarget')][1]")
    private WebElement target1activeGreenColour;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Location')]")
    private WebElement locationTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Access data')]")
    private WebElement accessDataTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Swab')]")
    private WebElement swabTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Location')]")
    private WebElement implantationTitleMainMenu;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Access data')]")
    private WebElement evaluationTitleMainMenu;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Swab')]")
    private WebElement complicationsTitleMainMenu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AccesoVascularView\"]/div/div/div[2]/div[2]/a")
    private WebElement evaluationMainMenuButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AccesoVascularView\"]/div/div/div[2]/div[3]/a")
    private WebElement complicationsMainMenuButton;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Follow-up')]")
    private WebElement followUpTittle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Follow-up')]")
    private WebElement evaluationSubmenuTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Follow-up')]")
    private WebElement historicPhotographsTittle;


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Complications')]")
    private WebElement complicationsSubMenuTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Interventions')]")
    private WebElement interventionsSubMenuTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Observations')]")
    private WebElement observationsSubMenuTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Medications')]")
    private WebElement medicationsSubMenuTitle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Hospitalisations')]")
    private WebElement hospitalisationsSubMenuTittle;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[4]")
    private WebElement threeButtonSecond;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[2]")
    private WebElement threeButtonSwab;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New pre-assessment')]")
    private WebElement newPreAssessmentButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New post-assessment')]")
    private WebElement newPostAssessmentButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div/div[2]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[2]/treatment-assessment-access[1]/div/div/div[1]/div/div[2]/span/input")
    private WebElement inputDatePreTreatment;

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner'])[3]")
    private WebElement inputDatePostTreatment;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div/div[2]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[2]/treatment-assessment-access[1]/div/div/div[2]/div/div/div/div[1]/formulario-custom/div/ng-form/div[6]/div/div[1]/div[1]/div[1]/input")
    private WebElement inputTextFieldPreTreatment;
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/ng-form[1]/div[3]/div[1]/ng-form[1]/assessment-tabs-access[1]/div[1]/div[1]/div[2]/treatment-assessment-access[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/formulario-custom[1]/div[1]/ng-form[1]/div[5]/div[1]/div[1]/div[2]/div[1]/input[1]")
    private WebElement inputTextFieldPostTreatment;

    @FindBy(how = How.XPATH, using = "//*[contains(@name,'data[textArea]')]")
    private WebElement inputTextAreaPostTreatment;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'data[number]')]")
    private WebElement inputNumberPostTreatment;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'data[checkbox]')]")
    private WebElement inputCheckBoxPostTreatment;

    @FindBy(how = How.XPATH, using = "(//input[@value='0'])[1]")
    private WebElement inputCheckboxPreTreatment;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'data[selectBoxes][]')]")
    private WebElement inputSelectBoxesPreTreatment;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Save')]")
    private WebElement saveButtonSecondThreeButtons;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Edit')]")
    private WebElement editButtonSecondThreeButtons;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
    private WebElement cancelButtonSecondThreeButtons;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Error')]")
    private WebElement alertError;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Pre-treatment')]")
    private WebElement preTreatmentTabTittle;

    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Post-treatment')]")
    private WebElement postTreatmentTabTittle;


    @FindBy(how = How.XPATH, using = "(//button[@class='btn btn-primary ng-scope'])[1]")
    private WebElement okAlertWindows;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div/div[2]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[2]/treatment-assessment-access[2]/div/div/div[2]/div/div/div/div[1]/formulario-custom/div/ng-form/div[5]/div/div[1]/div[4]/div[1]/label/input")
    private WebElement trueCheckBox;

    @FindBy(how = How.XPATH, using = "(//div[@class='checkbox  form-check'])")
    private WebElement falseSelectBoxes;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AccesoVascularView\"]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[3]/pagination/div/div/div/button[2]")
    private WebElement page2ofPreAssessment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AccesoVascularView\"]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[3]/pagination/div/div/div/button[1]")
    private WebElement page1ofPreAssessment;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Text Field')]")
    private WebElement textFieldPreTreatmentLabel;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Number')]")
    private WebElement numberPreTreatmentLabel;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cancel')]")
    private WebElement cancelButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Delete')]")
    private WebElement deleteButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Action')]")
    private WebElement actionTittle;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[2]/div/button[1]")
    private WebElement yesButtonConfirmWindows;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[2]/div/button[2]")
    private WebElement noButtonConfirmWindows;

    @FindBy(how = How.XPATH, using = "//a[@href='javascript:void(0);'][contains(.,'New access')]")
    private WebElement buttonNewAccess;

    @FindBy(how = How.XPATH, using = "//li[@tabindex='-1'][contains(.,'Cat\u00e9ter percut\u00e1neo yugular')]")
    private WebElement optionTypeJugularCatheter;

    @FindBy(how = How.XPATH, using = "(//li[@aria-selected='false'])[57]")
    private WebElement optionLocationJugular;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Accesos_Label_Cancelar']")
    private WebElement buttonCancelStartModule;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'No')]")
    private WebElement modalOptionNo;

    @FindBy(how = How.XPATH, using = "(//label[@class='toggle'])[1]")
    private WebElement approvedForUse;

    @FindBy(how = How.XPATH, using = "//label[@for='step-circle-2']")
    private WebElement buttonImplantationSection;

    @FindBy(how = How.XPATH, using = "(//div[@ng-repeat='(zona, accesosEnZona) in $ctrl.cuerpo.zonas.Der track by zona']/following-sibling::div)[3]")
    private WebElement zonaDer;

    @FindBy(how = How.XPATH, using = "//h2[text()='Change of extension']")
    private WebElement titleChangeOfExtension;

    @FindBy(how = How.XPATH, using = "//h2[text()='Historic photographs of accesses']")
    private WebElement titleHistoricPhotographsOfAccesses;

    @FindBy(how = How.XPATH, using = "//span[text()='New extender change']")
    private WebElement buttonNewExtenderChange;

    @FindBy(how = How.XPATH, using = "(//input[@aria-disabled='false'])[1]")
    private WebElement inputDateChangeOfExtension;


    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[1]")
    private WebElement dropDownTypeOfConfiguration;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Modal_Button_OK']")
    private WebElement buttonOkModalError;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'image view')]")
    private WebElement imageEvaluationHistory;

    @FindBy(how = How.XPATH, using = "//i[@title='Eliminar']")
    private WebElement iconDeleteImage;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'New additional test')]")
    private WebElement optionNewAdditionalTest ;

    @FindBy(how = How.XPATH, using = "//span[@role='button']/following-sibling::button[1]")
    private WebElement dropDownAssociateAdditionalStudy ;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'Associate additional study')]")
    private WebElement subtitleAssociateAdditionalStudy ;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'k-input-button k-button')])[2]")
    private WebElement dropDownLocationSwab ;

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner'])[1]")
    private WebElement inputSwabDate ;

    @FindBy(how = How.XPATH, using = "//body[@contenteditable='true']")
    private WebElement inputSwabEvaluation ;

    @FindBy(how = How.XPATH, using = "//h2[text()='Follow-up']//ancestor::div[contains(@class, 'x_panel')]//i[contains(@class, 'icon-three-points')]")
    private WebElement buttonThreePointsFollowUp ;

    @FindBy(how = How.XPATH, using = "(//span[@role='button']/following-sibling::button)[1]")
    private WebElement dropDownEvaluationFollowUp ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-disabled='false'])[1]")
    private WebElement inputDateFollowUp ;

    @FindBy(how = How.XPATH, using = "//a[@section-write='Accesos']")
    private WebElement buttonImagePhotoEvaluation ;

    @FindBy(how = How.XPATH, using = "//input[@type='file' and @id='file-5']")
    private WebElement inputSelectFileImagePhotoEvaluation ;

    @FindBy(how = How.XPATH, using = "(//div[@class='modal-footer']//button)[2]")
    private WebElement buttonAddImagePhotoEvaluation ;

    @FindBy(how = How.XPATH, using = "//label[normalize-space(text())='Date']/following::input")
    private WebElement inputDateImagePhotoEvaluation ;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Complications']/following::i[contains(@class, 'icon-three-points')][1]")
    private WebElement buttonThreePointsComplications ;

    @FindBy(how = How.XPATH, using = "//div[h2[contains(text(), 'Interventions')]]//i[contains(@class, 'icon-three-points')][1]")
    private WebElement buttonThreePointsInterventions ;

    @FindBy(how = How.XPATH, using = "//div[h2[contains(text(), 'Medications')]]//i[contains(@class, 'icon-three-points')][1]")
    private WebElement buttonThreePointsMedications ;

    @FindBy(how = How.XPATH, using = "//div[h2[contains(text(), 'Hospitalizations')]]//i[contains(@class, 'icon-three-points')][1]")
    private WebElement buttonThreePointsHospitalizations ;
    @FindBy(how = How.XPATH, using = "//div[h2[contains(text(), 'Evaluation')]]//i[contains(@class, 'icon-three-points')][1]")
    private WebElement buttonThreeEvaluation ;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'table table-striped')]/tbody[1]/tr[1]/td[5]/div[1]/menu-individual[1]/ul[1]/li[1]/a[1]")
    private WebElement buttonThreePointsInterventionsActions ;

    @FindBy(how = How.XPATH, using = "(//button[@aria-label='expand combobox'])[1]")
    private WebElement dropDownTypeProblem ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-busy='false'])[1]")
    private WebElement inputTypeProblem ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-disabled='false'])[3]")
    private WebElement inputIdentificationDateComplications ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-disabled='false'])[6]")
    private WebElement inputResolutionDateComplications ;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='expand combobox']")
    private WebElement dropDownAssignSymptomComplications ;
    @FindBy(how = How.XPATH, using = "//input[@aria-busy='false']")
    private WebElement inputAssignSymptomComplications ;
    @FindBy(how = How.XPATH, using = "(//span[@class='k-icon k-i-x'])[1]")
    private WebElement buttonXDeleteComplications ;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='Accesos_Label_Intervenciones']")
    private WebElement titleInterventions ;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'table table-striped')]/tbody[1]/tr[1]/td[2]/div[1]/span[1]/button[1]")
    private WebElement dropDownTypeOfInterventions ;
    @FindBy(how = How.XPATH, using = "//table[contains(@class,'table table-striped')]/tbody[1]/tr[1]/td[3]/div[1]/span[1]/button[1]")
    private WebElement dropDownResultOfInterventions ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-busy='false'])[1]")
    private WebElement inputTypeOfInterventions ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-busy='false'])[2]")
    private WebElement inputResultInterventions ;

    @FindBy(how = How.XPATH, using = "(//input[@aria-disabled='false'])[3]")
    private WebElement inputDateInterventions ;

    @FindBy(how = How.XPATH, using = "(//span[@role='button']//span)[1]")
    private WebElement deleteTypeInterventions ;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='expand combobox']")
    private WebElement dropDownAssignMedication ;

    @FindBy(how = How.XPATH, using = "//input[@aria-busy='false']")
    private WebElement inputAssignMedication ;

    @FindBy(how = How.XPATH, using = "(//a[@translate-once='Accesos_Label_Vincular'])[3]")
    private WebElement buttonLinkHospitalizations ;

    @FindBy(how = How.XPATH, using = "//button[@aria-label='expand combobox']")
    private WebElement dropDownHospitalizations ;

    @FindBy(how = How.XPATH, using = "//input[@aria-busy='false']")
    private WebElement inputOptionHospitalizations ;

    @FindBy(how = How.XPATH, using = "(//a[@translate-once='Title_Eliminar'])[2]")
    private WebElement buttonDeleteHospitalizations ;

    @FindBy(how = How.XPATH, using = "(//span[@role='button'])[1]")
    private WebElement buttonDeleteOptionLocationSwab ;

    public void clickPostTreatmentTab() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(postTreatmentTabTittle);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickPreTreatmentTab() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(preTreatmentTabTittle);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickYesButtonConfirmWindow() throws InterruptedException {
        click(yesButtonConfirmWindows);
        pause(2000);
    }
    public void clickNoButtonConfirmWindow() throws InterruptedException {
        click(noButtonConfirmWindows);
        pause(2000);
    }
    public void isDisplayedTheActionWindow(){
        waitElements(actionTittle);
        actionTittle.isDisplayed();
    }
    public void clickDelete() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(deleteButton);
        driver.switchTo().parentFrame();
        pause(2000);
    }


    public void clickCancel() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(cancelButton);
        driver.switchTo().parentFrame();
        pause(2000);

    }
    public void clickPage2OfPreAssessment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(page2ofPreAssessment);
        pause(2000);
        driver.switchTo().parentFrame();
    }
    public void clickPage1OfPreAssessment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(page1ofPreAssessment);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void isDisplayedFalseSelectBoxes(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        falseSelectBoxes.isDisplayed();
        driver.switchTo().parentFrame();

    }
    public void isDisplayedTrueCheckBox(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(trueCheckBox);
        trueCheckBox.isDisplayed();
        driver.switchTo().parentFrame();

    }

    public void clickCancelButtonSecondThreeButtons() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(cancelButtonSecondThreeButtons);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTheAlertError(){
        waitElements(alertError);
        alertError.isDisplayed();
    }
    public void isDisplayedPreTreatmentTabTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        waitElements(preTreatmentTabTittle);
        preTreatmentTabTittle.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedPreTreatmentTextFieldTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        waitElements(textFieldPreTreatmentLabel);
        textFieldPreTreatmentLabel.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedPreTreatmentNumberTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        waitElements(numberPreTreatmentLabel);
        numberPreTreatmentLabel.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedPostTreatmentTabTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        waitElements(postTreatmentTabTittle);
        postTreatmentTabTittle.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void clickOkAlertWindow(){
        click(okAlertWindows);
    }

    public void clickSaveButtonSecondThreeButtons() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(saveButtonSecondThreeButtons);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickEditButtonSecondThreeButtons() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(editButtonSecondThreeButtons);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickCheckboxPreTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(inputCheckboxPreTreatment);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickSelectBoxes() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(500);
        click(inputSelectBoxesPreTreatment);
        driver.switchTo().parentFrame();
    }

    public void writeTextFieldPreTreatment(String TextField){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputTextFieldPreTreatment.sendKeys(Keys.CONTROL + "a");
        inputTextFieldPreTreatment.sendKeys(Keys.DELETE);
        inputTextFieldPreTreatment.sendKeys(Keys.HOME);
        write(inputTextFieldPreTreatment,TextField);
        driver.switchTo().parentFrame();
    }
    public void writeTextFieldPostTreatment(String TextField){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputTextFieldPostTreatment.sendKeys(Keys.CONTROL + "a");
        inputTextFieldPostTreatment.sendKeys(Keys.DELETE);
        inputTextFieldPostTreatment.sendKeys(Keys.HOME);
        write(inputTextFieldPostTreatment,TextField);
        driver.switchTo().parentFrame();

    }
    public void writeTextAreaPostTreatment(String TextArea){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputTextAreaPostTreatment.sendKeys(Keys.CONTROL + "a");
        inputTextAreaPostTreatment.sendKeys(Keys.DELETE);
        inputTextAreaPostTreatment.sendKeys(Keys.HOME);
        write(inputTextAreaPostTreatment,TextArea);
        driver.switchTo().parentFrame();


    }
    public void writeNumberPostTreatment(String Number){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputNumberPostTreatment.sendKeys(Keys.CONTROL + "a");
        inputNumberPostTreatment.sendKeys(Keys.DELETE);
        inputNumberPostTreatment.sendKeys(Keys.HOME);
        write(inputNumberPostTreatment,Number);
        driver.switchTo().parentFrame();

    }


    public void resetDatePreTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        inputDatePreTreatment.sendKeys(Keys.CONTROL + "a");
        inputDatePreTreatment.sendKeys(Keys.DELETE);
        inputDatePreTreatment.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();
    }


    public void writeDatePreTreatment(String Date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputDatePreTreatment.sendKeys(Keys.HOME);
        write(inputDatePreTreatment,Date);
        pause(1000);
        inputDatePreTreatment.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();

    }
    public void resetDatePostTreatment() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        inputDatePostTreatment.sendKeys(Keys.CONTROL + "a");
        inputDatePostTreatment.sendKeys(Keys.DELETE);
        inputDatePostTreatment.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();
    }


    public void writeDatePostTreatment(String Date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputDatePostTreatment.sendKeys(Keys.HOME);
        write(inputDatePostTreatment,Date);
        pause(2000);
        inputDatePostTreatment.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();

    }


    public void clickNewPreAssessmentButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        click(newPreAssessmentButton);
        driver.switchTo().parentFrame();

    }
    public void clickNewPostAssessmentButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        click(newPostAssessmentButton);
        driver.switchTo().parentFrame();

    }


    public void clickThreeButtonSecond() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(2000);
        click(threeButtonSecond);
        driver.switchTo().parentFrame();
    }
    public void clickThreeButtonSwab() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        scrollToElementMove(threeButtonSwab);
        pause(200);
        click(threeButtonSwab);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonThreePointsChangeOfExtension() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        click(threeButtonSecond);
        pause(200);
        driver.switchTo().parentFrame();
    }


    public void isDisplayedTheFollowUpTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(followUpTittle);
        followUpTittle.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTheEvaluationSubmenuTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(evaluationSubmenuTitle);
        evaluationSubmenuTitle.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedTheHistoricPhotographsTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(historicPhotographsTittle);
        historicPhotographsTittle.isDisplayed();
        driver.switchTo().parentFrame();
    }


    public void clickComplicationMainMenuButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(complicationsMainMenuButton);
        driver.switchTo().parentFrame();
        pause(1000);
    }


    public void clickEvaluationMainMenuButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(evaluationMainMenuButton);
        driver.switchTo().parentFrame();
        pause(3000);
    }


    public void writeComment(String comment)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame(0);
        pause(300);
        scrollToElementMove(inputComments);
        inputComments.sendKeys(Keys.CONTROL + "a");
        inputComments.sendKeys(Keys.DELETE);
        write(inputComments,comment);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void approvedForUse()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(approvedForUse);
        click(approvedForUse);
        driver.switchTo().parentFrame();
    }

    public void clickThreeButtons() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(threePointButtonOfAccesses);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickThreeButtonsAccessData() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(threePointButtonOfAccessData);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickSaveButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(saveButton);
        driver.switchTo().parentFrame();
        pause(5000);
    }

    public void clickCancelButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(cancelButton);
        driver.switchTo().parentFrame();
        pause(5000);
    }
    public void clickEditAll() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(editAllButton);
        driver.switchTo().parentFrame();
        pause(200);
    }
    public void newCommentEditIsVisible(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(commentQATestAccessEdit);
        driver.switchTo().parentFrame();
    }
    public void newAccessIsActiveColourGreen()throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(target1activeGreenColour);
        click(target1activeGreenColour);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void newAccessIsInActiveColourRed() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        isDisplayed(target1InactiveRedColour);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteButton(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(deleteAccessButton);
        driver.switchTo().parentFrame();
    }
    public void clickOkDeleteAccess() throws InterruptedException {
        click(acceptDeleteAccess);
        pause(1000);
    }
    public void clickCancelDeleteAccess() throws InterruptedException {
        click(cancelDeleteAccess);
        pause(1000);
    }
    public void clickInformationDeleteAccess() throws InterruptedException {
        click(acceptInformationDeleteAccess);
        pause(1000);
    }

    public void writeDateOfFirstUse(String FirstUse){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        inputDateOfFirstUse.sendKeys(Keys.CONTROL + "a");
        inputDateOfFirstUse.sendKeys(Keys.DELETE);
        inputDateOfFirstUse.sendKeys(Keys.ENTER);
        write(inputDateOfFirstUse,FirstUse);
        driver.switchTo().parentFrame();
    }
    public void writeImplantationDate(String ImplantationDate)throws InterruptedException{
        driver.switchTo().parentFrame();
        pause(200);
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(inputImplantationDate);
        inputImplantationDate.sendKeys(Keys.CONTROL + "a");
        inputImplantationDate.sendKeys(Keys.DELETE);
        inputImplantationDate.sendKeys(Keys.ENTER);
        write(inputImplantationDate,ImplantationDate);
        driver.switchTo().parentFrame();

    }
    public void writeDateOfRemoval(String DateRemoval) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(100);
        moveScrollToElement(inputDateOfRemoval);
        inputDateOfRemoval.sendKeys(Keys.CONTROL + "a");
        inputDateOfRemoval.sendKeys(Keys.DELETE);
        inputDateOfRemoval.sendKeys(Keys.ENTER);
        write(inputDateOfRemoval,DateRemoval);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickOnUpArrow() throws InterruptedException {
        driver.switchTo().parentFrame();
        waitElements(upArrowOnPage);
        click(upArrowOnPage);
        pause(1000);
    }


    public void selectRemovalCenter(String RemovalCenter) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        click(accessRemovalCenterDropDown);
        pause(1000);
        //By loc = By.xpath("*[contains(text(),'"+RemovalCenter+"')]");
        //click(loc);
        clickBelowElementByOffset(inputDateOfRemoval,140);
        driver.switchTo().parentFrame();
    }

    public void selectAccessType(String AccessType) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(accessTypeButtonDropdown);
        pause(1000);
        By loc = By.xpath("//span[contains(text(),'"+AccessType+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }

    public void selectAccessLocation(String Location) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(accessLocationButtonDropdown);
        pause(1000);
        By loc = By.xpath("//span[contains(text(),'"+Location+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }

    public void addAdditionalTestButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(accessDataButtonDropdown);
        click(newAdditionalTestButton);
        driver.switchTo().parentFrame();
        pause(1000);
    }

    public void goToAttachedTestOfAccesses() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(1000);
        click(seeFurtherTestsButton);
        pause(1000);
        click(attachedTestAnemiaButton);
        driver.switchTo().parentFrame();
    }

    public void addAdditionalTestAnemia(){
        driver.switchTo().frame("frmContenido");
        click(associateAdditionalStudyButtonDropdown);
        click(associateAdditionalStudySelectionAnemia);
        click(associateAdditionalStudyAddButton);
        driver.switchTo().parentFrame();
    }

    public void isDisplayedTheLocationTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(locationTitle);
        locationTitle.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTheAccessDataTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(accessDataTitle);
        accessDataTitle.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTheSwabTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(swabTitle);
        swabTitle.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedTheImplantationTittleMainMenu(){
        driver.switchTo().frame("frmContenido");
        waitElements(implantationTitleMainMenu);
        implantationTitleMainMenu.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedTheEvaluationTittleMainMenu(){
        driver.switchTo().frame("frmContenido");
        waitElements(evaluationTitleMainMenu);
        evaluationTitleMainMenu.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTheComplicationsTittleMainMenu(){
        driver.switchTo().frame("frmContenido");
        waitElements(complicationsTitleMainMenu);
        complicationsTitleMainMenu.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleAccesses);
        titleAccesses.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTheSeeFurtherTestsButton(){
        driver.switchTo().frame("frmContenido");
        isDisplayed(seeFurtherTestsButton);
        driver.switchTo().parentFrame();
    }
    public void isDisplayedTestCheckConditionAnemia(){
        driver.switchTo().frame("frmContenido");
        isDisplayed(testCheckConditionAnemia);
        driver.switchTo().parentFrame();
    }

    public void clickLocation1(){
        driver.switchTo().frame("frmContenido");
        click(accessLocation1);
        driver.switchTo().parentFrame();
    }

    public void clickButtonImplantationSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonImplantationSection);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsAccess()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(threePointButtonOfAccesses);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonNewAccess()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonNewAccess);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickZoneRightLocation()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        click(zonaDer);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void checkTheCommentChanged(String comment)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement comments = driver.findElement(By.xpath("//*[contains(text(),'"+ comment +"')]"));
        isDisplayed(comments);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void titleChangeOfExtension()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        scrollToElementMove(titleChangeOfExtension);
        pause(200);
        isDisplayed(titleChangeOfExtension);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void verifyHistoricPhotographsOfAccessesDisplayed()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        scrollToElementMove(titleHistoricPhotographsOfAccesses);
        pause(200);
        isDisplayed(titleHistoricPhotographsOfAccesses);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void  clickButtonNewExtenderChange()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        click(buttonNewExtenderChange);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void insertDataIntoDateChangeOfExtension(String date)throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(200);
        inputDateChangeOfExtension.sendKeys(Keys.CONTROL + "a");
        inputDateChangeOfExtension.sendKeys(Keys.DELETE);
        inputDateChangeOfExtension.sendKeys(Keys.ENTER);
        write(inputDateChangeOfExtension,date);
        driver.switchTo().parentFrame();
    }
    public void selectOptionTypeOfConfigurationForChangeExtension()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(dropDownTypeOfConfiguration);
        click(dropDownTypeOfConfiguration);
        pause(200);
        clickBelowElementByOffset(inputDateChangeOfExtension,100);
        pause(500);
        driver.switchTo().parentFrame();

    }
    public void clickButtonOkModalError()throws InterruptedException{
        driver.switchTo().parentFrame();
        pause(200);
        buttonOkModalError.isDisplayed();
        pause(200);
        click(buttonOkModalError);
        pause(200);
    }
    public void clickButtonOkInModalErrorInModule()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonOkModalError);
        click(buttonOkModalError);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickImageEvaluationHistory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(imageEvaluationHistory);
        waitElements(imageEvaluationHistory);
        click(imageEvaluationHistory);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteImage()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(iconDeleteImage);
        click(iconDeleteImage);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void selectOptionActionInModalByText(String action)throws InterruptedException{
        pause(300);
        driver.switchTo().parentFrame();
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'"+action+"')]")));
        button.click();
        pause(3000);
    }

    public void clickButtonNewAdditionalTest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(optionNewAdditionalTest);
        click(optionNewAdditionalTest);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void selectAssociateAdditionalStudy() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(dropDownAssociateAdditionalStudy);
        click(dropDownAssociateAdditionalStudy);
        pause(300);
        clickBelowElementByOffset(subtitleAssociateAdditionalStudy,80);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void selectOptionActionInAssociateAdditionalStudy(String action)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'"+action+"')]")));
        button.click();
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonEdit()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(buttonEdit);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void selectOptionActionInAssociate(String action)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(400);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+action+"')]")));
        pause(200);
        button.click();
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void selectOptionLocationSwab()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(dropDownLocationSwab);
        pause(300);
        clickBelowElementByOffset(inputSwabDate,80);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataEvaluation(String evaluation)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='k-content k-iframe']"));
        driver.switchTo().frame(iframe);

        pause(200);
        inputSwabEvaluation.sendKeys(Keys.CONTROL + "a");
        inputSwabEvaluation.sendKeys(Keys.DELETE);
        inputSwabEvaluation.sendKeys(Keys.ENTER);
        write(inputSwabEvaluation,evaluation);

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonThreePointsFollowUp()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonThreePointsFollowUp);
        isDisplayed(buttonThreePointsFollowUp);
        click(buttonThreePointsFollowUp);
        driver.switchTo().parentFrame();
    }
    public void selectEvaluationInFollowUp()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(1000);
        isDisplayed(dropDownEvaluationFollowUp);
        click(dropDownEvaluationFollowUp);
        pause(500);
        WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@aria-disabled='false'])[2]")));
        clickBelowElementByOffset(option,40);
        driver.switchTo().parentFrame();
    }

    public void insertDataIntoInputDate(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        inputDateFollowUp.sendKeys(Keys.CONTROL + "a");
        inputDateFollowUp.sendKeys(Keys.DELETE);
        inputDateFollowUp.sendKeys(Keys.ENTER);
        write(inputDateFollowUp,date);
        driver.switchTo().parentFrame();
    }
    public void clickButtonImagePhoto()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonImagePhotoEvaluation);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void selectImageToUpload()throws InterruptedException{
        pause(400);
        driver.switchTo().parentFrame();
        String rutaFile= "C:\\Users\\colombb\\Pictures\\capture1.png";
        //((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility = 'visible'; ",inputSelectFileImagePhotoEvaluation);
        //waitElements(inputSelectFileImagePhotoEvaluation);
        inputSelectFileImagePhotoEvaluation.sendKeys(rutaFile);
        pause(2000);
        buttonAddImagePhotoEvaluation.click();
        buttonAddImagePhotoEvaluation.click();
        pause(400);
    }


    public void selectOptionAction(String action)throws InterruptedException{
        driver.switchTo().parentFrame();
        pause(500);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'"+action+"')]")));
        String buttonText = button.getText().trim();
        if (buttonText.equalsIgnoreCase("Add")){
            button.click();
            pause(300);
            button.click();
        }else{
            pause(300);
            button.click();
        }

        pause(300);

    }
    public void insertDataIntoDateAddPhotograph(String date)throws InterruptedException{
        driver.switchTo().parentFrame();
        pause(200);
        inputDateImagePhotoEvaluation.sendKeys(Keys.CONTROL + "a");
        inputDateImagePhotoEvaluation.sendKeys(Keys.DELETE);
        inputDateImagePhotoEvaluation.sendKeys(Keys.ENTER);
        write(inputDateImagePhotoEvaluation,date);
        pause(1000);

    }
    public void clickButtonThreePointsComplications()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonThreePointsComplications);
        click(buttonThreePointsComplications);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonThreePointsInterventions()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        scrollToElementMove(buttonThreePointsInterventions);
        pause(200);
        waitElements(buttonThreePointsInterventions);
        click(buttonThreePointsInterventions);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsMedications()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        scrollToElementMove(buttonThreePointsMedications);
        pause(200);
        waitElements(buttonThreePointsMedications);
        click(buttonThreePointsMedications);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsHospitalizations()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        scrollToElementMove(buttonThreePointsHospitalizations);
        pause(200);
        waitElements(buttonThreePointsHospitalizations);
        click(buttonThreePointsHospitalizations);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonThreePointsInterventionsActions()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonThreePointsInterventionsActions);
        scrollToElementMove(buttonThreePointsInterventionsActions);
        click(buttonThreePointsInterventionsActions);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void selectTypeOfProblemComplication()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(dropDownTypeProblem);
        pause(300);
        clickBelowElementByOffset(inputTypeProblem,25);
        driver.switchTo().parentFrame();
    }
    public void inputDataIdentificationDate(String date){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputIdentificationDateComplications.sendKeys(Keys.CONTROL + "a");
        inputIdentificationDateComplications.sendKeys(Keys.DELETE);
        inputIdentificationDateComplications.sendKeys(Keys.HOME);
        write(inputIdentificationDateComplications,date);
        driver.switchTo().parentFrame();
    }

    public void inputDataResolutionDate(String date){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        inputResolutionDateComplications.sendKeys(Keys.CONTROL + "a");
        inputResolutionDateComplications.sendKeys(Keys.DELETE);
        inputResolutionDateComplications.sendKeys(Keys.HOME);
        write(inputResolutionDateComplications,date);
        driver.switchTo().parentFrame();
    }
    public void selectOptionInModalAssignSymptoms()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(dropDownAssignSymptomComplications);
        pause(300);
        clickBelowElementByOffset(inputAssignSymptomComplications,25);
        driver.switchTo().parentFrame();
    }
    public void deleteTypeOfProblemSelected()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonXDeleteComplications);
        click(buttonXDeleteComplications);
        driver.switchTo().parentFrame();
    }

    public void clickButtonInActionModal(String action)throws InterruptedException{
        driver.switchTo().parentFrame();

        pause(300);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'"+action+"')]")));
        button.click();
        pause(3000);

    }
    public void selectTypeOfIntervention() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(dropDownTypeOfInterventions);
        click(dropDownTypeOfInterventions);
        pause(300);
        clickBelowElementByOffset(inputTypeOfInterventions,40);
        driver.switchTo().parentFrame();
    }

    public void selectResultOfInterventions() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(dropDownResultOfInterventions);
        click(dropDownResultOfInterventions);
        pause(300);
        clickBelowElementByOffset(inputResultInterventions,40);
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoDateInterventions(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        inputDateInterventions.sendKeys(Keys.CONTROL + "a");
        inputDateInterventions.sendKeys(Keys.DELETE);
        inputDateInterventions.sendKeys(Keys.HOME);
        write(inputDateInterventions,date);
        driver.switchTo().parentFrame();
    }
    public void deleteTypeOfInterventionSelected()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(deleteTypeInterventions);
        driver.switchTo().parentFrame();
    }
    public  void selectMedicationToAssignInComplication()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(dropDownAssignMedication);
        click(dropDownAssignMedication);
        pause(300);
        clickBelowElementByOffset(inputAssignMedication,40);
        driver.switchTo().parentFrame();
    }
    public void clickButtonLinkHospitalizations()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonLinkHospitalizations);
        driver.switchTo().parentFrame();
    }
    public void selectOptionHospitalizationsInComplications()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(dropDownHospitalizations);
        pause(300);
        clickBelowElementByOffset(inputOptionHospitalizations,40);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteHospitalization()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonDeleteHospitalizations);
        driver.switchTo().parentFrame();

    }

    public void clearInputDataLocationSwab()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonDeleteOptionLocationSwab);
        driver.switchTo().parentFrame();

    }

    public void clickButtonThreePointsEvaluation()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(buttonThreeEvaluation);
        pause(200);
        click(buttonThreeEvaluation);
        pause(200);
        driver.switchTo().parentFrame();

    }

    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********

}
