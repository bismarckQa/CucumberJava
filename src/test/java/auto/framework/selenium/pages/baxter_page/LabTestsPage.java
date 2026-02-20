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
public class LabTestsPage extends BasePage<LabTestsPage>{


    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Analytics']")
    private WebElement titleLabTests;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Lab tests')]")
    private WebElement buttonLabTestsSection;

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
        pause(500);
       clickOption(action);
        pause(500);
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
        scrollToElementMove(inputValueResultLabTestSelected);
        inputValueResultLabTestSelected.sendKeys(Keys.CONTROL + "a");
        inputValueResultLabTestSelected.sendKeys(Keys.DELETE);
        inputValueResultLabTestSelected.sendKeys(Keys.ENTER);
        write(inputValueResultLabTestSelected,data);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }



    @Override
    public boolean isAt() {
        return false;
    }




    //*********Page Methods*********


}
