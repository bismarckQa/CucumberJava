package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@LazyComponent
public class LabTestsPage extends BasePage<LabTestsPage>{


    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Analytics']")
    private WebElement titleLabTests;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Lab tests')]")
    private WebElement buttonLabTestsSection;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Laboratory request')]")
    private WebElement buttonLaboratoryRequestSection;

    @FindBy(how = How.XPATH, using = "//i[@class='icon-three-points']")
    private WebElement buttonThreePointsLabTestsSection;

    @FindBy(how = How.XPATH, using = "//input[@kendo-datepicker='$controles.insertar.rdpFechaPeticion']")
    private WebElement inputDateRequest;

    @FindBy(how = How.XPATH, using = "(//span[contains(text(),'All profiles')])[1]")
    private WebElement inputProfileLabTestSection;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Add profile']")
    private WebElement buttonAddProfileLabTestSection;

    @FindBy(how = How.XPATH, using = "//input[@kendo-datepicker='$controles.insertar.rdpFechaMuestra']")
    private WebElement inputSampleDateLabTestSection;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'All tests')]")
    private WebElement inputTestLabSection;

    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Add test']")
    private WebElement buttonAddTestLabSection;

    @FindBy(how = How.XPATH, using = "//body[1]/div[10]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[7]")
    private WebElement buttonDeleteResultSection;

    @FindBy(how = How.XPATH, using = "//tr[td[normalize-space(.)='Volumen Orina']]//input[@ng-model='nuevoResultado.valor']")
    private WebElement inputResultAddLabTestSection;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='resultadoEdicion.valor']")
    private WebElement inputValueResultLabTestSelected;

    @FindBy(how = How.XPATH, using = "(//input[@id='rdpFechaInicio'])[1]")
    private WebElement inputStartDateAnalytics;

    @FindBy(how = How.XPATH, using = "(//input[@id='rdpFechaFin'])[1]")
    private WebElement inputEndDateAnalytics;

    @FindBy(how = How.XPATH, using = "(//input[@id='idPeticionImp'])[1]")
    private WebElement inputIdRequestAnalytics;

    @FindBy(how = How.XPATH, using = "(//span[@role='presentation'])[1]")
    private WebElement checkBoxPrimaryIdentification;

    @FindBy(how = How.XPATH, using = "(//div[@class='k-window-actions k-hstack'])[3]")
    private WebElement buttonCloseModalImportLaboratoryResults;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'btn-group')])[1]")
    private WebElement dropDownAnalyticProfiles;

    @FindBy(how = How.XPATH, using = "//div[@id='ctl00_mainContent_divBotones']//button[contains(@class, 'icon-three-points')]")
    private WebElement buttonTheePointsLaboratoryRequestSection;

    @FindBy(how = How.XPATH, using = "(//textarea[@id='ctl00_mainContent_rtbObservaciones'])[1]")
    private WebElement textAreaObservationsLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//span[@class='rtUnchecked'])[2]")
    private WebElement checkBoxAdecuacionLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_imgbtnEditar'])[1]")
    private WebElement buttonEditLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_rowPickerFechaMuestra_dateInput'])[1]")
    private WebElement inputExtractionDateEditLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rdpFechaInicioPP_dateInput'])[1]")
    private WebElement inputRequestDateLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rdpFechaFinPP_dateInput'])[1]")
    private WebElement inputEndRequestDateLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//textarea[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_RadTextBox2'])[1]")
    private WebElement textAreaObservationsEditLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_imgbtnEliminar'])[1]")
    private WebElement buttonCancelEditLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_imgbtnEditar'])[1]")
    private WebElement buttonSaveEditLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_imgbtnEliminar'])[1]")
    private WebElement buttonDeleteLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rgPeticionLaboratorio_ctl00_ctl05_imgbtnInforme'])[1]")
    private WebElement buttonPrintLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_rcbPerfiles_Input'])[1]")
    private WebElement inputProfilesLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_CheckBoxSoloPorEnviar'])[1]")
    private WebElement checkBoxShowOnlyUnsentRequest;

    @FindBy(how = How.XPATH, using = "(//a[@id='ctl00_mainContent_rcbPerfiles_Arrow'])[1]")
    private WebElement dropDownProfilesRequest;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl00_mainContent_rcbPerfiles_i2_chkPerfil']")
    private WebElement checkBoxAdequacyProfilesRequest;

    @FindBy(how = How.XPATH, using = "(//input[@id='ctl00_mainContent_btnBuscar'])[1]")
    private WebElement buttonSearchLaboratoryRequest;

    @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-bar-chart'])[1]")
    private WebElement buttonShowGraphWindow;


    @FindBy(how = How.XPATH, using = "(//div[normalize-space()='No records'])[1]")
    private WebElement titleNoRecords;





    public void isDisplayedTheTittle()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(titleLabTests);
        titleLabTests.isDisplayed();
       driver.switchTo().parentFrame();
       driver.switchTo().parentFrame();
    }
    public void clickButtonLabTestSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonLabTestsSection);
        click(buttonLabTestsSection);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsLabTestSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(buttonThreePointsLabTestsSection);
        click(buttonThreePointsLabTestsSection);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void selectOptionButton(String action)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        By modal = By.id("kendo-window-analiticas");
        try {
            new WebDriverWait(driver, Duration.ofMillis(50))
                    .until(ExpectedConditions.visibilityOfElementLocated(modal));
            clickOptionInContainer(modal, action);
        } catch (org.openqa.selenium.TimeoutException e) {
            clickOption(action);
        }
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void selectOptionButtonB(String action)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        By modal = By.id("kendo-window-analiticas");
        try {
            new WebDriverWait(driver, Duration.ofMillis(50))
                    .until(ExpectedConditions.visibilityOfElementLocated(modal));
            clickOptionInContainer(modal, action);
        } catch (org.openqa.selenium.TimeoutException e) {
            clickOption(action);
        }
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void selectOptionButtonC(String action)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("CrearPeticionLaboratorio");
        pause(200);
        By modal = By.id("kendo-window-analiticas");
        try {
            new WebDriverWait(driver, Duration.ofMillis(50))
                    .until(ExpectedConditions.visibilityOfElementLocated(modal));
            clickOptionInContainer(modal, action);
        } catch (org.openqa.selenium.TimeoutException e) {
            clickOption(action);
        }
        pause(500);
        try{

            acceptBrowserAlert();
        }catch (TimeoutException e){

        }
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void insertDataIntoInputDateRequest(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(inputDateRequest);
        inputDateRequest.sendKeys(Keys.CONTROL + "a");
        inputDateRequest.sendKeys(Keys.DELETE);
        inputDateRequest.sendKeys(Keys.ENTER);
        write(inputDateRequest,date);

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectProfileOptionInLabTest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(inputProfileLabTestSection);
        click(inputProfileLabTestSection);
        pause(500);
        clickBelowElementByOffset(inputProfileLabTestSection, 140);
        pause(300);
        click(buttonAddProfileLabTestSection);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoInputDateSample(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(inputSampleDateLabTestSection);
        inputSampleDateLabTestSection.sendKeys(Keys.CONTROL + "a");
        inputSampleDateLabTestSection.sendKeys(Keys.DELETE);
        inputSampleDateLabTestSection.sendKeys(Keys.ENTER);
        write(inputSampleDateLabTestSection,date);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectTestOptionInLabTests()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(inputTestLabSection);
        click(inputTestLabSection);
        pause(500);
        clickBelowElementByOffset(inputTestLabSection, 120);
        pause(300);
        waitElements(buttonAddTestLabSection);
        isDisplayed(buttonAddTestLabSection);
        click(buttonAddTestLabSection);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickOnRemoveButtonOnAnExistingResult()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonDeleteResultSection);
        scrollToElementMove(buttonDeleteResultSection);
        click(buttonDeleteResultSection);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoInputResultTest(String data)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        waitElements(inputResultAddLabTestSection);
        scrollToElementMove(inputResultAddLabTestSection);
        inputResultAddLabTestSection.sendKeys(Keys.CONTROL + "a");
        inputResultAddLabTestSection.sendKeys(Keys.DELETE);
        inputResultAddLabTestSection.sendKeys(Keys.ENTER);
        write(inputResultAddLabTestSection,data);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickNameSelectedRow(String name)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        clickInTableByTextInIframe(name);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void insertDataIntoUnputValueResultSelected(String data)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(inputValueResultLabTestSelected);
        inputValueResultLabTestSelected.sendKeys(Keys.CONTROL + "a");
        inputValueResultLabTestSelected.sendKeys(Keys.DELETE);
        inputValueResultLabTestSelected.sendKeys(Keys.ENTER);
        write(inputValueResultLabTestSelected,data);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void insertDataIntoInputStartDateAnalytics(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(inputStartDateAnalytics);
        inputStartDateAnalytics.sendKeys(Keys.CONTROL + "a");

        write(inputStartDateAnalytics,date);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoIdRequestImportLaboratoryResults(String data)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(inputIdRequestAnalytics);
        inputIdRequestAnalytics.sendKeys(Keys.CONTROL + "a");
        write(inputIdRequestAnalytics,data);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void selectCheckBoxPrimaryIdentification()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        waitElements(checkBoxPrimaryIdentification);
        click(checkBoxPrimaryIdentification);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonCloseModalImportLaboratoryResults()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        scrollToElementMove(buttonCloseModalImportLaboratoryResults);
        click(buttonCloseModalImportLaboratoryResults);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickInDropDownProfilesAnalytics()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(dropDownAnalyticProfiles);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void insertDataIntoInputEndDateAnalytics(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(inputEndDateAnalytics);
        inputEndDateAnalytics.sendKeys(Keys.CONTROL + "a");
        write(inputEndDateAnalytics,date);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonLaboratoryRequestSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonLaboratoryRequestSection);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsLaboratoryRequestSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonTheePointsLaboratoryRequestSection);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoInputObservationsLaboratoryRequest(String data)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("CrearPeticionLaboratorio");
        pause(200);
        waitElements(textAreaObservationsLaboratoryRequest);
        textAreaObservationsLaboratoryRequest.sendKeys(Keys.CONTROL + "a");
        write(textAreaObservationsLaboratoryRequest,data);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void selectCheckBoxAdecuacionInLaboratoryRequest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("CrearPeticionLaboratorio");
        pause(250);
        waitElements(checkBoxAdecuacionLaboratoryRequest);
        scrollToElementMove(checkBoxAdecuacionLaboratoryRequest);
        click(checkBoxAdecuacionLaboratoryRequest);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonEditLaboratoryRequest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonEditLaboratoryRequest);
        scrollToElementMove(buttonEditLaboratoryRequest);
        click(buttonEditLaboratoryRequest);
        driver.switchTo().parentFrame();
    }

    public void insertDataIntoInputExtractionDateInEditLaboratoryRequest(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(inputExtractionDateEditLaboratoryRequest);
        inputExtractionDateEditLaboratoryRequest.sendKeys(Keys.CONTROL + "a");
        write(inputExtractionDateEditLaboratoryRequest,date);
        pause(200);

        driver.switchTo().parentFrame();
    }
    public void insertDataIntoInputObservationsEditLaboratoryRequest(String data)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(textAreaObservationsEditLaboratoryRequest);
        textAreaObservationsEditLaboratoryRequest.sendKeys(Keys.CONTROL + "a");
        write(textAreaObservationsEditLaboratoryRequest,data);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelEditLaboratoryRequest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonCancelEditLaboratoryRequest);
        scrollToElementMove(buttonCancelEditLaboratoryRequest);
        click(buttonCancelEditLaboratoryRequest);
        driver.switchTo().parentFrame();

    }
    public void clickButtonSaveEditLaboratoryRequest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonSaveEditLaboratoryRequest);
        scrollToElementMove(buttonSaveEditLaboratoryRequest);
        click(buttonSaveEditLaboratoryRequest);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDeleteLaboratoryRequest()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonDeleteLaboratoryRequest);
        scrollToElementMove(buttonDeleteLaboratoryRequest);
        click(buttonDeleteLaboratoryRequest);
        driver.switchTo().parentFrame();

    }

    public void clickButtonDeleteLaboratoryRequestAndCancelIt()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonDeleteLaboratoryRequest);
        scrollToElementMove(buttonDeleteLaboratoryRequest);
        click(buttonDeleteLaboratoryRequest);
        pause(1000);
        driver.switchTo().alert().dismiss();
        pause(500);
        driver.switchTo().parentFrame();

    }
    public void clickButtonDeleteLaboratoryRequestAndAcceptIt()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonDeleteLaboratoryRequest);
        scrollToElementMove(buttonDeleteLaboratoryRequest);
        click(buttonDeleteLaboratoryRequest);
        pause(1000);
        driver.switchTo().alert().accept();
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickButtonButtonPrintReport()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonPrintLaboratoryRequest);
        scrollToElementMove(buttonPrintLaboratoryRequest);
        click(buttonPrintLaboratoryRequest);
        pause(500);
        driver.switchTo().parentFrame();

    }

    public void selectOptionInProfilesInLaboratoryRequest()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(dropDownProfilesRequest);
        scrollToElementMove(dropDownProfilesRequest);
        click(dropDownProfilesRequest);
       pause(300);
       click(checkBoxAdequacyProfilesRequest);
        pause(300);
        click(dropDownProfilesRequest);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void checkACheckboxShowOnlyUnsentRequests()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(checkBoxShowOnlyUnsentRequest);
        click(checkBoxShowOnlyUnsentRequest);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickButtonSearchLaboratoryRequest()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonSearchLaboratoryRequest);
        click(buttonSearchLaboratoryRequest);
        pause(1500);
        driver.switchTo().parentFrame();
    }

    public void clickButtonShowTheResultsGraphWindow()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(buttonShowGraphWindow);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void verifyTheInformationSavedByIdRequest(String name)throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(200);
        clickInTableByTextInIframe(name);
        pause(200);
        driver.switchTo().parentFrame();

    }

    public void insertDataIntoInputRequestDateInLaboratoryRequest(String date) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(inputRequestDateLaboratoryRequest);
        inputRequestDateLaboratoryRequest.sendKeys(Keys.CONTROL + "a");
        write(inputRequestDateLaboratoryRequest,date);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoInputEndRequestDateInLaboratoryRequest(String date)throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(inputEndRequestDateLaboratoryRequest);
        inputEndRequestDateLaboratoryRequest.sendKeys(Keys.CONTROL + "a");
        write(inputEndRequestDateLaboratoryRequest,date);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void checkTheTitleNoRecordIsShown()throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(titleNoRecords);
        isDisplayed(titleNoRecords);
        scrollToElementMove(titleNoRecords);
        pause(200);
        driver.switchTo().parentFrame();
    }




    @Override
    public boolean isAt() {
        return false;
    }

    public void clickButtonSearchInLaboratoryRequest() {
    }



    //*********Page Methods*********


}
