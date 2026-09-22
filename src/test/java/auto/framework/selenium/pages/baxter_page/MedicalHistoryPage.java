package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class MedicalHistoryPage extends BasePage<MedicalHistoryPage>{


    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Personal Medical history']")
    private WebElement titleMedicalHistory;

    // Grid commands (Kendo)
    @FindBy(how = How.XPATH, using = "//button[contains(@class,'k-grid-add-command')]")
    private WebElement buttonAddNew;

    @FindBy(how = How.XPATH, using = "(//tr[contains(@class,'k-master-row')]//button[contains(@class,'k-grid-edit-command')])[1]")
    private WebElement buttonEditRow;

    @FindBy(how = How.XPATH, using = "(//tr[contains(@class,'k-master-row')]//button[contains(@class,'k-grid-remove-command')])[1]")
    private WebElement buttonDeleteRow;

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//button[contains(@class,'k-grid-save-command')]")
    private WebElement buttonSaveRow;

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//button[contains(@class,'k-grid-cancel-command')]")
    private WebElement buttonCancelRow;

    // Edit row fields
    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//td[@aria-colindex='2']//input[@type='checkbox']")
    private WebElement checkFather;

    @FindBy(how = How.XPATH, using = "//tr[contains(@class,'k-grid-edit-row')]//td[@aria-colindex='3']//input[@type='checkbox']")
    private WebElement checkMother;

    // Three points menu (main) + History editor
    @FindBy(how = How.XPATH, using = "//versia-ui-three-points-menu//a[@id='dropDownMenuTp']")
    private WebElement threePointsMenu;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'k-editor-content')]//div[@contenteditable='true']")
    private WebElement historyEditor;

    // Delete confirmation modal
    @FindBy(how = How.XPATH, using = "//versia-ui-confirmation-modal//div[contains(@class,'modal-footer')]//button[normalize-space(.)='Yes']")
    private WebElement buttonYesDeleteModal;

    @FindBy(how = How.XPATH, using = "//versia-ui-confirmation-modal//div[contains(@class,'modal-footer')]//button[normalize-space(.)='No']")
    private WebElement buttonNoDeleteModal;


    public void isDisplayedTheTittleMedicalHistory(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(2000); } catch (InterruptedException ignored) {}
        waitElements(titleMedicalHistory);
        titleMedicalHistory.isDisplayed();
        driver.switchTo().parentFrame();
    }

    // ---- Granular methods (grid) ----

    public void clickAddNew() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonAddNew);
        click(buttonAddNew);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickEditRow() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonEditRow);
        click(buttonEditRow);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteRow() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonDeleteRow);
        click(buttonDeleteRow);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickYesDeleteModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonYesDeleteModal);
        click(buttonYesDeleteModal);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickNoDeleteModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonNoDeleteModal);
        click(buttonNoDeleteModal);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickThreePointsMenu() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(threePointsMenu);
        click(threePointsMenu);
        pause(800);
        driver.switchTo().parentFrame();
    }

    public void clickMenuOption(String option) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(300);
        WebElement menuOption = driver.findElement(By.xpath("//versia-ui-three-points-menu//button[contains(@class,'dropdown-item')][.//span[normalize-space(.)='" + option + "']]"));
        click(menuOption);
        pause(1500);
        driver.switchTo().parentFrame();
    }

    public void writeHistory(String text) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        click(historyEditor);
        historyEditor.sendKeys(text);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectHistory(String history) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(300);
        WebElement dropdown = driver.findElement(By.xpath("//tr[contains(@class,'k-grid-edit-row')]//kendo-dropdownlist"));
        click(dropdown);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//span[@class='k-list-item-text'][contains(normalize-space(.),'" + history + "')]"));
        click(option);
        pause(800);
        driver.switchTo().parentFrame();
    }

    public void checkFather() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(checkFather);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void checkMother() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(checkMother);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickSaveRow() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonSaveRow);
        click(buttonSaveRow);
        pause(1500);
        driver.switchTo().parentFrame();
    }

    public void clickCancelRow() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelRow);
        click(buttonCancelRow);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickOkValidationErrorModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        WebElement okButton = driver.findElement(By.xpath("//versia-ui-error-modal//div[contains(@class,'modal-footer')]//button[normalize-space(.)='Ok']"));
        click(okButton);
        pause(800);
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }
}
