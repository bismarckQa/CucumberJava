package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class WaitingListPage extends BasePage<WaitingListPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'WAITING LIST TX')]")
    private WebElement titleWaitingList;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_divBotones\"]")
    private WebElement threeButtonsOptionsMenu;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_btnNuevo\"]")
    private WebElement newButtonLineWaitingList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_fvDetalle_rcbOrgano_Arrow\"]")
    private WebElement dropButtonOrgan;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_fvDetalle_rcbSituacion_Arrow\"]")
    private WebElement dropButtonSituation;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_fvDetalle_rcbHospitalLista_Arrow\"]")
    private WebElement dropButtonHospitalList;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_fvDetalle_rcbHospital_Arrow\"]")
    private WebElement dropButtonOriginHospital;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_fvDetalle_rcbUrgencia_Arrow\"]")
    private WebElement dropButtonLevelOfUrgency;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_btnGuardar\"]")
    private WebElement saveWaitingList;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Associate additional examination')]")
    private WebElement associateAdditionalExaminationButton;

    @FindBy(how = How.XPATH, using = "(//label[normalize-space()='5/4/2024 - Patient condition - Anemia'])[1]")
    private WebElement selectFirstOptionOfStudiesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_relacionarPruebasComplementarias_C_btnRelacionarPrueba\"]")
    private WebElement acceptAssociateButton;

    @FindBy(how = How.XPATH, using = "(//a[normalize-space()='Top'])[1]")
    private WebElement upButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuRepeaterPanel\"]/div/div/div[1]")
    private WebElement leftButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_btnEliminar\"]")
    private WebElement deleteButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_BBorrarOK\"]")
    private WebElement acceptDeleteButton;

    //*********Page Methods*********


    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleWaitingList);
        titleWaitingList.isDisplayed();
    }
    public void acceptDeleteRecord() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame(0);
        click(acceptDeleteButton);
        pause(1000);
        driver.switchTo().parentFrame();

    }

    public void clickThreeButtons() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(threeButtonsOptionsMenu);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickSave() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(saveWaitingList);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickDelete() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(deleteButton);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickNewLineWaitingList(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(newButtonLineWaitingList);
        driver.switchTo().parentFrame();
    }

    public void selectOrgan(String organ) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(dropButtonOrgan);
        pause(500);
        By loc = By.xpath("//*[contains(text(),'"+organ+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }
    public void selectSituation(String situation) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(dropButtonSituation);
        pause(100);
        By loc = By.xpath("//*[contains(text(),'"+situation+"')]");
        click(loc);
        driver.switchTo().parentFrame();
        pause(500);
    }
    public void selectHospitalList(String hospitalList) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(dropButtonHospitalList);
        pause(100);
        By loc = By.xpath("//*[contains(text(),'"+hospitalList+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }
    public void selectOriginHospital(String originHospital) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(dropButtonOriginHospital);
        pause(100);
        By loc = By.xpath("//*[contains(text(),'"+originHospital+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }
    public void selectLevelOfUrgency(String levelUrgency) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(dropButtonLevelOfUrgency);
        pause(100);
        By loc = By.xpath("//*[contains(text(),'"+levelUrgency+"')]");
        click(loc);
        driver.switchTo().parentFrame();
    }

    public void clickAssociateAdditionalExamination(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(associateAdditionalExaminationButton);
        driver.switchTo().parentFrame();
    }

    public void clickFirstOptionOfStudiesForAttached() throws InterruptedException {

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(100);
        click(selectFirstOptionOfStudiesButton);
        driver.switchTo().parentFrame();
    }
    public void clickAcceptAssociate() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(100);
        click(acceptAssociateButton);
        driver.switchTo().parentFrame();
        pause(100);
        click(upButton);
        pause(100);
        click(leftButton);
    }



    @Override
    public boolean isAt() {
        return false;
    }




}
