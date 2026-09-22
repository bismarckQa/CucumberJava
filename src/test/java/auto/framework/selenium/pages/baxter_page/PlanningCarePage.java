package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class PlanningCarePage extends BasePage<PlanningCarePage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Care Plans')]")
    private WebElement titlePlanningCare;

    // Menu three points
    @FindBy(how = How.XPATH, using = "//fa-icon[@class='ng-fa-icon px-3 three-points-menu__icon']//*[name()='svg']")
    private WebElement buttonThreePoints;

    // Menu options (Kendo/Angular dropdown)
    @FindBy(how = How.XPATH, using = "//button[contains(@class,'dropdown-item')][.//span[normalize-space(.)='New']]")
    private WebElement buttonNew;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'dropdown-item')][.//span[normalize-space(.)='Edit']]")
    private WebElement buttonEdit;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'dropdown-item')][.//span[normalize-space(.)='Delete']]")
    private WebElement buttonDelete;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'dropdown-item')][.//span[normalize-space(.)='Save']]")
    private WebElement buttonSave;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'dropdown-item')][.//span[normalize-space(.)='Cancel']]")
    private WebElement buttonCancel;

    // Form fields (edit mode)
    @FindBy(how = How.ID, using = "ctl00_mainContent_fvCuidado_rcbAsunto_Input")
    private WebElement inputSubject;

    @FindBy(how = How.ID, using = "ctl00_mainContent_fvCuidado_rcbAsunto_Arrow")
    private WebElement arrowSubject;

    @FindBy(how = How.ID, using = "ctl00_mainContent_fvCuidado_rcbPuesto_Input")
    private WebElement inputPosition;

    @FindBy(how = How.ID, using = "ctl00_mainContent_fvCuidado_rcbPuesto_Arrow")
    private WebElement arrowPosition;

    @FindBy(how = How.ID, using = "ctl00_mainContent_fvCuidado_rdpFecha_dateInput")
    private WebElement inputDate;


    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titlePlanningCare);
        titlePlanningCare.isDisplayed();
        driver.switchTo().parentFrame();
    }

    // ---- Granular methods ----

    public void selectPeriod(String period) throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        pause(500);
        // Kendo radio: el <input> es hermano previo del <span class="k-radio-text"> con el texto del periodo
        By radioInput = By.xpath("//span[contains(@class,'k-radio-text') and normalize-space(.)='" + period + "']/preceding-sibling::input[contains(@class,'k-radio')]");
        waitElements(radioInput);
        WebElement input = driver.findElement(radioInput);
        // Solo clic si aun no esta seleccionado
        if (!input.isSelected()) {
            By radioText = By.xpath("//span[contains(@class,'k-radio-text') and normalize-space(.)='" + period + "']");
            click(radioText);
            pause(2000);
        } else {
            pause(300);
        }
        driver.switchTo().defaultContent();
    }

    public void clickThreePoints() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonThreePoints);
        click(buttonThreePoints);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickNew() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonNew);
        click(buttonNew);
        pause(2000);
        driver.switchTo().defaultContent();
    }

    public void clickEdit() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonEdit);
        click(buttonEdit);
        pause(2000);
        driver.switchTo().defaultContent();
    }

    public void clickDelete() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDelete);
        click(buttonDelete);
        pause(1000);
        driver.switchTo().defaultContent();
    }

    public void clickSave() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonSave);
        click(buttonSave);
        pause(2000);
        driver.switchTo().defaultContent();
    }

    public void clickCancel() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancel);
        click(buttonCancel);
        pause(1500);
        driver.switchTo().defaultContent();
    }

    public void selectSubject(String subject) throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        pause(500);
        // Subject es el dropdown requerido (ng-invalid + required en su input hidden)
        By subjectDropdown = By.xpath("//versia-codes[.//input[@required]]//kendo-dropdownlist");
        waitElements(subjectDropdown);
        click(subjectDropdown);
        pause(1000);
        // Las opciones se renderizan en un popup Kendo (listbox) al final del body
        By option = By.xpath("//ul[contains(@class,'k-list-ul')]//li[normalize-space(.)='" + subject + "'] | //li[contains(@class,'k-list-item') and normalize-space(.)='" + subject + "']");
        waitElements(option);
        click(option);
        pause(800);
        driver.switchTo().defaultContent();
    }

    public void selectPosition(String position) throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        pause(500);
        // Position = 1er kendo-dropdownlist (versia-codes SIN required)
        By posDropdown = By.xpath("(//versia-codes//kendo-dropdownlist)[1]");
        waitElements(posDropdown);
        click(posDropdown);
        pause(1000);
        By option = By.xpath("//ul[contains(@class,'k-list-ul')]//li[normalize-space(.)='" + position + "'] | //li[contains(@class,'k-list-item') and normalize-space(.)='" + position + "']");
        waitElements(option);
        click(option);
        pause(800);
        driver.switchTo().defaultContent();
    }

    public void enterDate(String date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(inputDate);
        inputDate.sendKeys(Keys.CONTROL + "a");
        inputDate.sendKeys(Keys.DELETE);
        write(inputDate, date);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clearSubject() throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        pause(500);
        // El Subject es el kendo-dropdownlist requerido; se limpia con su boton clear (la X)
        By clearBtn = By.xpath("//versia-codes[.//input[@required]]//span[contains(@class,'k-clear-value')]");
        waitElements(clearBtn);
        click(clearBtn);
        pause(500);
        driver.switchTo().defaultContent();
    }

    public void acceptAlert() throws InterruptedException {
        pause(1000);
        driver.switchTo().alert().accept();
        pause(500);
    }

    public void dismissAlert() throws InterruptedException {
        pause(1000);
        driver.switchTo().alert().dismiss();
        pause(500);
    }

    // Confirmation modal (versia-ui-confirmation-modal) -> Yes / No
    public void clickConfirmationButton(String option) throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        pause(500);
        By button = By.xpath("//versia-ui-confirmation-modal//div[contains(@class,'modal-footer')]//button[normalize-space(.)='" + option + "']");
        waitElements(button);
        click(button);
        pause(1500);
        driver.switchTo().defaultContent();
    }


    @Override
    public boolean isAt() {
        return false;
    }
}
