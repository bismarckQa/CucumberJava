package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;


@LazyComponent
public class PhysicalAssessmentPage extends BasePage<PhysicalAssessmentPage>{


    @FindBy(how = How.XPATH, using = "//*[@id=\"ExploracionFisicaView\"]/exploracion-fisica-comp/ng-form/div[1]/div/div[1]/h2")
    private WebElement titlePhysicalAssessment;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Indicators')]")
    private WebElement titleIndicatorsAssessment;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Assessment area and comments')]")
    private WebElement AssessmentAreaAndComments;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Observations')]")
    private WebElement titleObservations;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Vaccines')]")
    private WebElement vaccinesSections;

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Hepatitis B - Inmunizado ')]")
    private WebElement titleVaccines;
    @FindBy(how = How.XPATH, using = "//a[contains(normalize-space(.), 'Physical assessment') and @translate-once='ExploracionFisica_Label_Cabecera_ExpFisica']")
    private WebElement physicalAssessmentArea;

    @FindBy(how = How.XPATH, using = "(//a[@class='dropdown-toggle']//i)[2]")
    private WebElement buttonThreePointsPhysicalAssessment;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'col-md-3 col-xs-6')]//input)[1]")
    private WebElement inputSeatedBP1;

    @FindBy(how = How.XPATH, using = "(//div[contains(@class,'col-md-3 col-xs-6')]//input)[2]")
    private WebElement inputSeatedBP2;

    @FindBy(how = How.XPATH, using = "//menu-individual[@class='menuIndAbsolute ng-isolate-scope']//li[@class='dropdown']//a[1]")
    private WebElement buttonThreePointsVaccines;

    @FindBy(how = How.XPATH, using = "(//a[@class='dropdown-toggle']//i)[2]")
    private WebElement buttonThreePointsDose;

    @FindBy(how = How.XPATH, using = "//span[@class='k-input-inner']/following-sibling::span[1]")
    private WebElement dropDownVaccinesName;


    @FindBy(how = How.XPATH, using = "//span[@class='k-input-inner']//span[1]")
    private WebElement inputVaccinesName;

    @FindBy(how = How.XPATH, using = "//body[@contenteditable='true']")
    private WebElement inputObservationsVaccines;

    @FindBy(how = How.XPATH, using = "(//input[@aria-disabled='false'])[1]")
    private WebElement inputSecondDoseVaccines;

    @FindBy(how = How.XPATH, using = "//h2[text()='Assessment area and comments']/following::i[@class='icon-three-points'][1]")
    private WebElement buttonThreePointsAssessmentComments;

    @FindBy(how = How.XPATH, using = "(//td[@class='ng-isolate-scope']//a)[1]")
    private WebElement buttonEditValueIndicator;

    @FindBy(how = How.XPATH, using = "(//input[@ng-model='indiceExploracion.valor'])[1]")
    private WebElement inputValueIndicator;

    @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-save'])[1]")
    private WebElement buttonSaveIndicators;

    @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-undo'])[1]")
    private WebElement buttonCancelIndicators;

    @FindBy(how = How.XPATH, using = "(//a[@ng-show='!indiceExploracion.edicion && $ctrl.edicionInd === false'])[2]")
    private WebElement buttonDeleteIndicators;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement inputPassword;

    @FindBy(how = How.XPATH, using = "//label[text()='Reason']/following-sibling::input")
    private WebElement inputReason;

    @FindBy(how = How.XPATH, using = "(//i[@class='fa fa-trash'])[1]")
    private WebElement buttonDeleteExtraDose;

    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titlePhysicalAssessment);
        titlePhysicalAssessment.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void seeIndicatorSectionAllAvailable()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(titleIndicatorsAssessment);
        scrollToElementMove(titleIndicatorsAssessment);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickInAssessmentAreaAndComments()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        click(AssessmentAreaAndComments);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void seeObservationsWindowWithAllAvailable()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(titleObservations);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickInVaccinesArea()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(vaccinesSections);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void seeVaccinesWindowWithAllAvailable()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(titleVaccines);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickInPhysicalAssessmentArea()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(physicalAssessmentArea);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void seePhysicalAssessmentWindowWithInformationAboutPhysicalExam()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(titlePhysicalAssessment);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void clickButtonThreePointsPhysicalAssessment()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonThreePointsPhysicalAssessment);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void selectOptionButton(String action)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(400);
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),'"+action+"')]")));
        pause(200);
        button.click();
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void insertDateIntoInputsSeatedBP(String data1, String data2)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(inputSeatedBP1);
        scrollToElementMove(inputSeatedBP1);
        inputSeatedBP1.sendKeys(Keys.CONTROL + "a");
        inputSeatedBP1.sendKeys(Keys.DELETE);
        inputSeatedBP1.sendKeys(Keys.ENTER);
        write(inputSeatedBP1, data1);
        pause(300);
        inputSeatedBP2.sendKeys(Keys.CONTROL + "a");
        inputSeatedBP2.sendKeys(Keys.DELETE);
        inputSeatedBP2.sendKeys(Keys.ENTER);
        write(inputSeatedBP2, data2);
        pause(300);
        driver.switchTo().parentFrame();

    }
    public void clickButtonThreePointsVaccines()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonThreePointsVaccines);
        click(buttonThreePointsVaccines);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void selectOptionVaccineName()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(dropDownVaccinesName);
        click(dropDownVaccinesName);
        pause(200);
        clickBelowElementByOffset(inputVaccinesName,130);
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoObservationsVaccines(String evaluation)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='k-content k-iframe']"));
        driver.switchTo().frame(iframe);

        pause(200);
        inputObservationsVaccines.sendKeys(Keys.CONTROL + "a");
        inputObservationsVaccines.sendKeys(Keys.DELETE);
        inputObservationsVaccines.sendKeys(Keys.ENTER);
        write(inputObservationsVaccines,evaluation);

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsDose()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(buttonThreePointsDose);
        click(buttonThreePointsDose);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void insertDataIntoInputSecondDose(String date)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        inputSecondDoseVaccines.sendKeys(Keys.CONTROL + "a");
        inputSecondDoseVaccines.sendKeys(Keys.DELETE);
        inputSecondDoseVaccines.sendKeys(Keys.ENTER);
        write(inputSecondDoseVaccines,date);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonThreePointsAssessmentArea()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(buttonThreePointsAssessmentComments);
        click(buttonThreePointsAssessmentComments);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoValueIndicator(String value)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonEditValueIndicator);
        click(buttonEditValueIndicator);
        pause(200);
        inputValueIndicator.sendKeys(Keys.CONTROL + "a");
        inputValueIndicator.sendKeys(Keys.DELETE);
        inputValueIndicator.sendKeys(Keys.ENTER);
        write(inputValueIndicator,value);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void clickButtonCancelIndicators()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonCancelIndicators);
        click(buttonCancelIndicators);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveIndicators()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonSaveIndicators);
        click(buttonSaveIndicators);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteIndicators()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonDeleteIndicators);
        click(buttonDeleteIndicators);
        pause(200);
        driver.switchTo().parentFrame();

    }
    public void fillingInTheDataToDeleteTheRecord(String password, String reason, String option)throws InterruptedException{
        driver.switchTo().parentFrame();
        pause(200);
        inputPassword.sendKeys(Keys.CONTROL + "a");
        inputPassword.sendKeys(Keys.DELETE);
        inputPassword.sendKeys(Keys.ENTER);
        write(inputPassword,password);
        pause(200);
        inputReason.sendKeys(Keys.CONTROL + "a");
        inputReason.sendKeys(Keys.DELETE);
        inputReason.sendKeys(Keys.ENTER);
        write(inputReason,reason);
        pause(200);
        String key = option.equalsIgnoreCase("OK") ? "Modal_Button_OK" : "Modal_Button_Cancelar";
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@translate-once='"+key+"']")));
        pause(200);
        button.click();
        pause(500);

    }
    public void clickButtonDeleteExtraDose()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        waitElements(buttonDeleteExtraDose);
        scrollToElementMove(buttonDeleteExtraDose);
        click(buttonDeleteExtraDose);
        pause(200);
        driver.switchTo().parentFrame();
    }

    @Override
    public boolean isAt() {
        return false;
    }

}
