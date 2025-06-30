package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class AccessesPage extends BasePage<AccessesPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Location')]")
    private WebElement titleAccesses;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Save')]")
    private WebElement saveButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'New additional test')]")
    private WebElement newAdditionalTestButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'See further tests')]")
    private WebElement seeFurtherTestsButton;
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'5/4/2024 - Patient condition - Anemia')]")
    private WebElement attachedTestAnemiaButton;

    @FindBy(how = How.ID, using = "Localizacion1")
    private WebElement accessLocation1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div/div[2]/div[2]/div/span/button")
    private WebElement accessTypeButtonDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div/div[3]/div[2]/div/span/button")
    private WebElement accessLocationButtonDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[1]/div/div/div/span/button")
    private WebElement associateAdditionalStudyButtonDropdown;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'5/4/2024 - Patient condition - Anemia')]")
    private WebElement associateAdditionalStudySelectionAnemia;

    @FindBy(how = How.XPATH, using = "//*[@id=\"genericModalWin\"]/div[2]/div/button[1]")
    private WebElement associateAdditionalStudyAddButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"AccesoVascularView\"]/ng-form/div[2]/div/ng-form/ng-form/div/div/div[1]/div[1]/menu-individual/ul")
    private WebElement accessDataButtonDropdown;

    @FindBy(how = How.XPATH, using = "/html/body")
    private WebElement inputComments;

    @FindBy(how = How.XPATH, using = "(//i[@class='icon-three-points'])[1]")
    private WebElement threePointButtonOfAccesses;

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

    @FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div/div[7]/div[2]/div/span/input")
    private WebElement inputImplantationDate;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div/div[11]/div[2]/div/span/input")
    private WebElement inputDateOfRemoval;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement upArrowOnPage;

    @FindBy(how = How.XPATH, using = "//*[@id=\"mCSB_2_container\"]/div/div[12]/div[2]/div/span/button")
    private WebElement accessRemovalCenterDropDown;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Edit all')]")
    private WebElement editAllButton;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'QATestAccessEdit')]")
    private WebElement commentQATestAccessEdit;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'accLocation ng-scope ng-isolate-scope zoomTarget inactivos')]")
    private WebElement target1InactiveRedColour;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'accLocation ng-scope ng-isolate-scope zoomTarget')]")
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



    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New pre-assessment')]")
    private WebElement newPreAssessmentButton;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'New post-assessment')]")
    private WebElement newPostAssessmentButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div/div[2]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[2]/treatment-assessment-access[1]/div/div/div[1]/div/div[2]/span/input")
    private WebElement inputDatePreTreatment;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div/div[2]/ng-form/div[3]/div/ng-form/assessment-tabs-access/div/div/div[2]/treatment-assessment-access[2]/div/div/div[1]/div/div[2]/span/input")
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

    @FindBy(how = How.XPATH, using = "//li[@tabindex='-1'][contains(.,'Catéter percutáneo yugular')]")
    private WebElement optionTypeJugularCatheter;

    @FindBy(how = How.XPATH, using = "(//li[@aria-selected='false'])[57]")
    private WebElement optionLocationJugular;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Accesos_Label_Cancelar']")
    private WebElement buttonCancelStartModule;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'No')]")
    private WebElement modalOptionNo;

    @FindBy(how = How.XPATH, using = "(//label[@class='toggle'])[1]")
    private WebElement approvedForUse;



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
        pause(5000);
    }


    public void writeComment(String comment){
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame(0);
        inputComments.sendKeys(Keys.CONTROL + "a");
        inputComments.sendKeys(Keys.DELETE);
        write(inputComments,comment);
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

    public void clickSaveButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(saveButton);
        driver.switchTo().parentFrame();
        pause(5000);
    }
    public void clickEditAll() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(editAllButton);
        driver.switchTo().parentFrame();
        pause(2000);
    }
    public void newCommentEditIsVisible(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(commentQATestAccessEdit);
        driver.switchTo().parentFrame();
    }
    public void newAccessIsActiveColourGreen(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        isDisplayed(target1activeGreenColour);
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

    public void writeImplantationDate(String ImplantationDate){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
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
        inputDateOfRemoval.sendKeys(Keys.ENTER);
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
        pause(1500);
        By loc = By.xpath("/html/body/div/div/div/div/ul/li/span[contains(text(),'"+RemovalCenter+"')]");
        click(loc);
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



    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********

    public void createANewJugularCatheterTypeAccess() throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        pause(1000);
        threePointButtonOfAccesses.click();
        buttonCancelStartModule.click();
        pause(200);
        threePointButtonOfAccesses.click();
        click(buttonNewAccess);
        pause(500);
        driver.switchTo().parentFrame();

        driver.switchTo().frame("frmContenido");
        click(accessTypeButtonDropdown);

        pause(200);
        click(optionTypeJugularCatheter);
        accessLocationButtonDropdown.click();
        pause(300);
        click(optionLocationJugular);
        pause(200);
        threePointButtonOfAccesses.click();
        saveButton.click();

        driver.switchTo().parentFrame();
    }





}
