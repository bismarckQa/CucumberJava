package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class HospitalizationPage extends BasePage<HospitalizationPage>{


    @FindBy(how = How.XPATH, using = "(//fa-icon[@class='ng-fa-icon flip-color'])[1]")
    private WebElement titleHospitalization;

    @FindBy(how = How.XPATH, using = "(//fa-icon[@class='ng-fa-icon px-3 three-points-menu__icon'])[1]")
    private WebElement threeButtonsDropdownMenuHospitalization;

    @FindBy(how = How.XPATH, using = "(//button[@type='button'][contains(.,'New')])[1]")
    private WebElement newButtonLineHospitalization;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[2]")
    private WebElement dropdownButtonTypeOfAdmission;
    @FindBy(how = How.XPATH, using = "//li[@role='option'][contains(.,'Programado')]")
    private WebElement optionTypeOfAdmission;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[3]")
    private WebElement dropdownButtonHospital;

    @FindBy(how = How.XPATH, using = "//span[@class='k-list-item-text'][contains(.,'Clinica Pamplona')]")
    private WebElement optionHospital;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rcbMedico_Arrow\"]")
    private WebElement dropdownButtonPhysician;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[4]")
    private WebElement dropdownDoctorName;

    @FindBy(how = How.XPATH, using = "//li[@role='option'][contains(.,'Belart, Montse')]")
    private WebElement optionDoctorName;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@name,'admissionReason')]")
    private WebElement textAreaReasonForAdmission;

    @FindBy(how = How.XPATH, using = "//button[@type='button'][contains(.,'Save')]")
    private WebElement saveButtonHospitalization;
    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Save')]")
    private WebElement saveButtonEditProgressData;

    @FindBy(how = How.XPATH, using = "//span[@class='text-uppercase'][contains(.,'Delete')]")
    private WebElement deleteButtonHospitalization;
    @FindBy(how = How.XPATH, using = "//span[@class='text-uppercase'][contains(.,'Cancel')]")
    private WebElement cancelButtonHospitalization;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Associate additional examination')]")
    private WebElement associateAdditionalExaminationButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_dvHospitalizacion_rdpFechaIngreso_dateInput\"]")
    private WebElement dateOfAdmissionInput;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_relacionarPruebasComplementarias_C_listPruebas_i0\"]/span/div/label")
    private WebElement selectAdditionalStudyFirstFile;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_relacionarPruebasComplementarias_C_btnRelacionarPrueba\"]")
    private WebElement saveButtonForAttached;

    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Top'])[1]")
    private WebElement upButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuRepeaterPanel\"]/div/div/div[1]")
    private WebElement leftButton;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[1]")
    private WebElement dropDownDate;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[5]")
    private WebElement dropDownDischargeDate;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[6]")
    private WebElement dropDownDischargeDateDoctorName;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[1]")
    private WebElement dropDownCalendarDate;

    @FindBy(how = How.XPATH, using = "//span[@class='k-button-text'][contains(.,'Today')]")
    private WebElement optionTodayCalendarDate;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Belart, Montse')]")
    private WebElement optionDischargeDateDoctorName;

    @FindBy(how = How.XPATH, using = "//span[@class='k-button-text'][contains(.,'Today')]")
    private WebElement optionTodayDischargeDate;

    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Top'])[1]")
    private WebElement upPageArrow;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'No')]")
    private WebElement buttonNoConfirmation;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Yes')]")
    private WebElement buttonYesConfirmation;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Edit')]")
    private WebElement buttonEdit;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'HOSPITAL DISCHARGE DATA')]")
    private WebElement titleDischargeDate;

    @FindBy(how = How.XPATH, using = "(//fa-icon[@class='ng-fa-icon flip-color'])[2]")
    private WebElement buttonProgressDataSection;
    @FindBy(how = How.XPATH, using = "(//fa-icon[contains(@class,'ng-fa-icon px-3 three-points-menu__icon')])[2]")
    private WebElement buttonThreePointsProgressDataSection;
    @FindBy(how = How.XPATH, using = "(//button[contains(.,'New')])[2]")
    private WebElement buttonNewProgressDataSection;
    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@aria-hidden,'true')])[8]")
    private WebElement buttonDropDownMadeByProgressDataSection;
    @FindBy(how = How.XPATH, using = "//span[@class='k-list-item-text'][contains(.,'Belart, Montse')]")
    private WebElement optionMadeByProgressDataSection;
    @FindBy(how = How.XPATH, using = "//li[@role='option'][contains(.,'Borras, Merce')]")
    private WebElement option2MadeByProgressDataSection;
    @FindBy(how = How.XPATH, using = "//textarea[@rows='5']")
    private WebElement textAreaCommentsProgressDataSection;
    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Cancel')]")
    private WebElement buttonCancelSaveProgressDataSection;
    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Save')]")
    private WebElement buttonSaveProgressDataSection;
    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[5]")
    private WebElement buttonDailyValues;

    @FindBy(how = How.XPATH, using = "(//fa-icon[contains(@class,'ng-fa-icon px-3 three-points-menu__icon')])[3]")
    private WebElement buttonThreePointsDailyValues;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'New')])[3]")
    private WebElement buttonNewDailyValues;

    @FindBy(how = How.XPATH, using = "(//kendo-svgicon[contains(@class,'k-svg-i-calendar k-button-icon k-svg-icon k-icon')])[4]")
    private WebElement dropDownDateDaily;

    @FindBy(how = How.XPATH, using = "//span[@class='k-button-text'][contains(.,'Today')]")
    private WebElement optionTodayDateDailyValues;

    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Cancel')]")
    private WebElement buttonCancelDailyValueTaking;
    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Save')]")
    private WebElement buttonSaveDailyValueTaking;
    @FindBy(how = How.XPATH, using = "//button[@type='button'][contains(.,'Associate revision')]")
    private WebElement buttonAssociateRevision;

    @FindBy(how = How.XPATH, using = "//button[@type='button'][contains(.,'Cancel')]")
    private WebElement buttonCancelRevision;

    @FindBy(how = How.XPATH, using = "//button[@type='button'][contains(.,'Save')]")
    private WebElement buttonSaveRevision;

    @FindBy(how = How.XPATH, using = "//input[contains(@type,'checkbox')]")
    private WebElement checkBoxSaveRevision;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Associate additional examination')]")
    private WebElement buttonAssociateAdditionalExamination;

    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Edit')]")
    private WebElement buttonEditProgressDataSection;

    @FindBy(how = How.XPATH, using = "//button[contains(@title,'Cancel')]")
    private WebElement cancelButtonEditProgressData;

    @FindBy(how = How.XPATH, using = "(//button[@title='Edit'])[3]")
    private WebElement buttonEditDailyValues;

    @FindBy(how = How.XPATH, using = "//input[@max='500']")
    private WebElement inputWeightDailyValues;

    @FindBy(how = How.XPATH, using = "(//button[contains(@title,'Delete')])[1]")
    private WebElement buttonDeleteProgressData;

    @FindBy(how = How.XPATH, using = "(//button[contains(@title,'Delete')])[2]")
    private WebElement buttonDeleteDailyValuesCollected;





    //*********Page Methods*********


    public void selectAdditionalStudyFile() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(selectAdditionalStudyFirstFile);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectTodayCalendarDate() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(dropDownCalendarDate);
        pause(500);
        waitElements(optionTodayCalendarDate);
        click(optionTodayCalendarDate);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickSaveAttachedAdditionalStudy() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(saveButtonForAttached);
        driver.switchTo().parentFrame();
        pause(500);
        click(upButton);
        pause(100);
        click(leftButton);
    }


    public void resetReceptionDate(){
        driver.switchTo().frame("frmContenido");
        dateOfAdmissionInput.sendKeys(Keys.CONTROL + "a");
        dateOfAdmissionInput.sendKeys(Keys.DELETE);
        dateOfAdmissionInput.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();

    }

    public void writeDateOfAdmission(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        dateOfAdmissionInput.sendKeys(Keys.HOME);
        write(dateOfAdmissionInput,date);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void writeReasonForAdmission(String Reason) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        write(textAreaReasonForAdmission,Reason);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void writeReasonForAdmission2() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        String Reason = "Qa test";
        textAreaReasonForAdmission.click();
        textAreaReasonForAdmission.sendKeys(Keys.CONTROL + "a");
        textAreaReasonForAdmission.sendKeys(Keys.DELETE);
        write(textAreaReasonForAdmission,Reason);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void selectPhysician(String Physician) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonPhysician);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+Physician+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }

    public void selectHospital(String Hospital) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonHospital);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+Hospital+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }
    public void selectHospital2() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonHospital);
        pause(500);
        click(optionHospital);

        driver.switchTo().parentFrame();
    }

    public void selectTypeOfAdmission(String TypeAdmission) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonTypeOfAdmission);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+TypeAdmission+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }
    public void selectDoctorName() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownDoctorName);
        pause(500);
        click(optionDoctorName);
        driver.switchTo().parentFrame();
    }

    public void selectTypeOfAdmission2() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(dropdownButtonTypeOfAdmission);
        pause(500);
        click(optionTypeOfAdmission);
        driver.switchTo().parentFrame();
    }


    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleHospitalization);
        titleHospitalization.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void clickThreePointsButton()throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(400);
        click(threeButtonsDropdownMenuHospitalization);
        driver.switchTo().parentFrame();
    }
    public void clickSaveButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(saveButtonHospitalization);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickSaveButtonEditProgressData() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(saveButtonEditProgressData);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(deleteButtonHospitalization);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickEditButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(buttonEdit);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickNoDeleteButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonNoConfirmation);
        click(buttonNoConfirmation);
        pause(400);
        driver.switchTo().parentFrame();
    }
    public void clickYesDeleteButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonYesConfirmation);
        click(buttonYesConfirmation);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void selectDischargeDate() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(titleDischargeDate);
        click(dropDownDischargeDate);
        pause(300);
        waitElements(optionTodayDischargeDate);
        click(optionTodayDischargeDate);
        pause(500);
        scrollToElementMove(titleDischargeDate);
        dropDownDischargeDateDoctorName.click();
        pause(300);
        optionDischargeDateDoctorName.click();
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void clickCancelButton() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(cancelButtonHospitalization);
        cancelButtonHospitalization.isDisplayed();
        pause(500);
        click(cancelButtonHospitalization);
        driver.switchTo().parentFrame();
    }

    public void clickAssociateAdditionalExaminationButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(associateAdditionalExaminationButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickNewButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(newButtonLineHospitalization);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void checkTheHospitalizationWindowWithAllTheAvailableInformationFilteringByAdmissionDate()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(dropDownDate);
        dropDownDate.isDisplayed();
        click(dropDownDate);
        pause(500);
        click(dropDownDate);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonUpArrow() throws InterruptedException{
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        pause(500);
        click(upPageArrow);
        pause(300);
    }

    public void clickButtonProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonProgressDataSection);
        buttonProgressDataSection.isDisplayed();
        pause(500);
        click(buttonProgressDataSection);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonThreePointsProgressDataSection);
        buttonThreePointsProgressDataSection.isDisplayed();
        pause(500);
        click(buttonThreePointsProgressDataSection);
        driver.switchTo().parentFrame();
    }
    public void clickButtonNewProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonNewProgressDataSection);
        buttonNewProgressDataSection.isDisplayed();
        pause(500);
        click(buttonNewProgressDataSection);
        driver.switchTo().parentFrame();
    }
    public void selectMadeByProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownMadeByProgressDataSection);
        buttonDropDownMadeByProgressDataSection.isDisplayed();
        pause(500);
        click(buttonDropDownMadeByProgressDataSection);
        pause(300);
        isDisplayed(optionMadeByProgressDataSection);
        click(optionMadeByProgressDataSection);
        driver.switchTo().parentFrame();
    }
    public void modifyMadeByProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDropDownMadeByProgressDataSection);
        buttonDropDownMadeByProgressDataSection.isDisplayed();
        pause(500);
        click(buttonDropDownMadeByProgressDataSection);
        pause(300);
        isDisplayed(option2MadeByProgressDataSection);
        click(option2MadeByProgressDataSection);
        driver.switchTo().parentFrame();
    }
    public void writeTextAreaCommentsProgressData() throws InterruptedException {

        driver.switchTo().frame("frmContenido");
        pause(200);
        String Comments = "Qa test";
        textAreaCommentsProgressDataSection.click();
        textAreaCommentsProgressDataSection.sendKeys(Keys.CONTROL + "a");
        textAreaCommentsProgressDataSection.sendKeys(Keys.DELETE);
        write(textAreaCommentsProgressDataSection,Comments);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void modifyWriteTextAreaCommentsProgressData() throws InterruptedException {

        driver.switchTo().frame("frmContenido");
        pause(200);
        String Comments = "Qa test modified";
        textAreaCommentsProgressDataSection.click();
        textAreaCommentsProgressDataSection.sendKeys(Keys.CONTROL + "a");
        textAreaCommentsProgressDataSection.sendKeys(Keys.DELETE);
        write(textAreaCommentsProgressDataSection,Comments);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void modifyInputWeightDailyValues() throws InterruptedException {

        driver.switchTo().frame("frmContenido");
        pause(200);
        String weigth = "1";
        inputWeightDailyValues.click();
        inputWeightDailyValues.sendKeys(Keys.CONTROL + "a");
        inputWeightDailyValues.sendKeys(Keys.DELETE);
        write(inputWeightDailyValues,weigth);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickButtonCancelSaveProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelSaveProgressDataSection);
        buttonCancelSaveProgressDataSection.isDisplayed();
        pause(500);
        click(buttonCancelSaveProgressDataSection);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveProgressDataSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonSaveProgressDataSection);
        buttonSaveProgressDataSection.isDisplayed();
        pause(500);
        click(buttonSaveProgressDataSection);
        pause(3000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDailyValuesSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDailyValues);
        buttonDailyValues.isDisplayed();
        pause(500);
        click(buttonDailyValues);
        driver.switchTo().parentFrame();
    }

    public void clickButttonThreePointsDailyValuesSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonThreePointsDailyValues);
        buttonThreePointsDailyValues.isDisplayed();
        pause(500);
        click(buttonThreePointsDailyValues);
        pause(500);
        driver.switchTo().parentFrame();

    }
    public void clickButttonNewDailyValuesSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonNewDailyValues);
        buttonNewDailyValues.isDisplayed();
        pause(500);
        click(buttonNewDailyValues);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void clickDropDownDateDailyValuesSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(dropDownDateDaily);
        dropDownDateDaily.isDisplayed();
        click(dropDownDateDaily);
        pause(200);
        waitElements(optionTodayDateDailyValues);
        isDisplayed(optionTodayDateDailyValues);
        click(optionTodayDateDailyValues);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void clickButtonCancelDailyValuesTaken()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonCancelDailyValueTaking);
        buttonCancelDailyValueTaking.isDisplayed();
        pause(500);
        click(buttonCancelDailyValueTaking);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void clickButtonSaveDailyValuesTaken()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonSaveDailyValueTaking);
        buttonSaveDailyValueTaking.isDisplayed();
        pause(200);
        click(buttonSaveDailyValueTaking);
        pause(600);
        driver.switchTo().parentFrame();

    }
    public void clickAssociateRevisionButton()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonAssociateRevision);
        buttonAssociateRevision.isDisplayed();
        pause(500);
        click(buttonAssociateRevision);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelRevisions()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonCancelRevision);
        buttonCancelRevision.isDisplayed();
        pause(500);
        click(buttonCancelRevision);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveRevisions()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(checkBoxSaveRevision);
        click(checkBoxSaveRevision);
        waitElements(buttonSaveRevision);
        buttonSaveRevision.isDisplayed();
        pause(500);
        click(buttonSaveRevision);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonAssociateAdditionalExamination()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonAssociateAdditionalExamination);
        buttonAssociateAdditionalExamination.isDisplayed();
        pause(500);
        click(buttonAssociateAdditionalExamination);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonEditProgressData()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonEditProgressDataSection);
        buttonEditProgressDataSection.isDisplayed();
        pause(500);
        click(buttonEditProgressDataSection);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonEditDailyValues()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonEditDailyValues);
        buttonEditDailyValues.isDisplayed();
        pause(500);
        click(buttonEditDailyValues);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelEditProgressData()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(cancelButtonEditProgressData);
        cancelButtonEditProgressData.isDisplayed();
        pause(500);
        click(cancelButtonEditProgressData);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteProgressData()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonDeleteProgressData);
        buttonDeleteProgressData.isDisplayed();
        pause(200);
        click(buttonDeleteProgressData);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteDailyValuesCollected()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonDeleteDailyValuesCollected);
        buttonDeleteDailyValuesCollected.isDisplayed();
        pause(200);
        click(buttonDeleteDailyValuesCollected);
        pause(500);
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
