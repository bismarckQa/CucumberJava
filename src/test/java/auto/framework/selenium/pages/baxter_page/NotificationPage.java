package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

@LazyComponent
public class NotificationPage extends BasePage<NotificationPage> {

    @FindBy(how = How.XPATH, using = "//li[@id='alertas']//a[contains(@class,'dropdown-toggle')]//i[contains(@class,'fa-bell')]/ancestor::a")
    private WebElement btnNotificationBell;

    @FindBy(how = How.XPATH, using = "//li[contains(@class,'uib-tab')]//a[starts-with(normalize-space(.),'Patient')]")
    private WebElement tabPatientNotificationBell;

    @FindBy(how = How.XPATH, using = "//li[contains(@class,'uib-tab')]//a[starts-with(normalize-space(.),'Section')]")
    private WebElement tabSectionNotificationBell;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']")
    private WebElement titleNotificationPanel;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']")
    private WebElement titleNotificationsList;

    @FindBy(how = How.XPATH, using = "//label[normalize-space(.)='Show All']")
    private WebElement checkboxShowAll;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//i[contains(@class,'fa-user')]/ancestor::div[contains(@ng-click,'cambiarTipoListado(0)')]")
    private WebElement btnPatientNotificationFilter;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//i[contains(@class,'fa-desktop')]/ancestor::div[contains(@ng-click,'cambiarTipoListado(1)')]")
    private WebElement btnSectionNotificationFilter;

    @FindBy(how = How.XPATH, using = "//th[normalize-space(.)='Patient' and not(contains(@style,'display:none'))]")
    private WebElement columnPatient;

    @FindBy(how = How.XPATH, using = "//th[normalize-space(.)='Section' and not(contains(@style,'display:none'))]")
    private WebElement columnSection;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//i[contains(@class,'icon-three-points')]")
    private WebElement btnNotificationThreePoints;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//form[@id='form']")
    private WebElement notificationForm;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//selector-pacientes//button[contains(@class,'k-input-button')]")
    private WebElement dropDownNotificationPatient;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//selector-secciones-notificaciones//button[contains(@class,'k-input-button')]")
    private WebElement dropDownNotificationSection;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//selector-perfiles-personales//div[contains(@class,'k-input-values')]")
    private WebElement dropDownNotificationAvailableFor;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//textarea[@id='notificacionTexto']")
    private WebElement textAreaNotification;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]//form[@id='form' and contains(@class,'ng-invalid-required')]")
    private WebElement notificationInvalidRequiredForm;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//tbody/tr[contains(@class,'k-master-row')][1]")
    private WebElement firstNotificationRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Show All']")
    private WebElement labelShowAllNotifications;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//label[normalize-space(.)='Show All']/preceding-sibling::input[@type='checkbox']")
    private WebElement inputShowAllNotifications;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//div[contains(@class,'k-grid-content')]")
    private WebElement notificationGridContent;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//div[contains(@class,'k-scrollbar-vertical')]")
    private WebElement notificationGridVerticalScroll;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//tr[contains(@class,'k-grid-edit-row')]//td[@data-container-for='fechaFin']//input[@data-role='datepicker']")
    private WebElement inputNotificationEndDate;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//tr[contains(@class,'k-grid-edit-row')]//button[contains(@class,'k-grid-update')]")
    private WebElement btnSaveNotificationEditRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]//tr[contains(@class,'k-grid-edit-row')]//button[contains(@class,'k-grid-cancel')]")
    private WebElement btnCancelNotificationEditRow;

    private final By activeGoToNotificationCenterBy = By.xpath("//div[contains(@class,'tab-pane') and contains(@class,'active')]//a[normalize-space(.)='Go to notification center']");

    @Override
    public boolean isAt() {
        return false;
    }

    public void clickNotificationBell() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(btnNotificationBell);
        click(btnNotificationBell);
        waitElements(tabPatientNotificationBell);
        waitElements(tabSectionNotificationBell);
        pause(300);
    }

    public void clickSectionTabInNotificationBellPanel() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(tabSectionNotificationBell);
        click(tabSectionNotificationBell);
        pause(300);
    }

    public void clickPatientTabInNotificationBellPanel() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(tabPatientNotificationBell);
        click(tabPatientNotificationBell);
        pause(300);
    }

    public void clickGoToNotificationCenterInBellPanel() throws InterruptedException {
        driver.switchTo().defaultContent();
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(activeGoToNotificationCenterBy));
        click(link);
        pause(1500);
    }

    public void verifyNotificationCenterOpenedCorrectly() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationPanel);
        waitElements(titleNotificationsList);
        waitElements(checkboxShowAll);
        titleNotificationPanel.isDisplayed();
        titleNotificationsList.isDisplayed();
        checkboxShowAll.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void clickPatientFilterInNotificationCenter() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationsList);
        waitElements(btnPatientNotificationFilter);
        scrollToElementMove(btnPatientNotificationFilter);
        click(btnPatientNotificationFilter);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickSectionFilterInNotificationCenter() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationsList);
        waitElements(btnSectionNotificationFilter);
        scrollToElementMove(btnSectionNotificationFilter);
        click(btnSectionNotificationFilter);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void verifyPatientNotificationsDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationsList);
        List<WebElement> patientColumns = driver.findElements(By.xpath("//th[normalize-space(.)='Patient' and not(contains(@style,'display:none'))]"));
        if (!patientColumns.isEmpty()) {
            patientColumns.get(0).isDisplayed();
        } else {
            waitElements(columnPatient);
            columnPatient.isDisplayed();
        }
        driver.switchTo().parentFrame();
    }

    public void verifySectionNotificationsDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationsList);
        waitElements(columnSection);
        columnSection.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void clickThreePointsMenuInNotificationForm() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationPanel);
        waitElements(btnNotificationThreePoints);
        scrollToElementMove(btnNotificationThreePoints);
        click(btnNotificationThreePoints);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickOptionInNotificationFormMenu(String option) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(By.xpath("//h2[normalize-space(.)='Notification']/ancestor::div[contains(@class,'x_panel')][1]" +
                "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                "//*[self::a or self::button][not(contains(@class,'ng-hide'))]" +
                "[.//span[normalize-space(.)='" + option + "'] or normalize-space(.)='" + option + "']"));
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void selectPatientInNotificationForm(String patient) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(notificationForm);
        waitElements(dropDownNotificationPatient);
        selectKendoDropdownOption(dropDownNotificationPatient, patient);
        driver.switchTo().parentFrame();
    }

    public void selectSectionInNotificationForm(String section) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(notificationForm);
        waitElements(dropDownNotificationSection);
        selectKendoDropdownOption(dropDownNotificationSection, section);
        driver.switchTo().parentFrame();
    }

    public void selectAvailableForInNotificationForm(String availableFor) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(notificationForm);
        waitElements(dropDownNotificationAvailableFor);
        selectKendoDropdownOption(dropDownNotificationAvailableFor, availableFor);
        driver.switchTo().parentFrame();
    }

    public void enterTextInNotificationForm(String notificationText) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(textAreaNotification);
        scrollToElementMove(textAreaNotification);
        textAreaNotification.clear();
        if (notificationText != null && !notificationText.isEmpty()) {
            write(textAreaNotification, notificationText);
        }
        pause(300);
        driver.switchTo().parentFrame();
    }

    public boolean isNotificationRequiredFieldsValidationDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(notificationInvalidRequiredForm);
        boolean isDisplayed = notificationInvalidRequiredForm.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isNotificationCreated(String notificationText) {
        driver.switchTo().frame("frmContenido");
        By notificationRowBy = By.xpath("//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]" +
                "//tr[contains(@class,'k-master-row')]//td[normalize-space(.)='" + notificationText + "']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(notificationRowBy));
        boolean isDisplayed = driver.findElement(notificationRowBy).isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isFirstNotificationRowDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationsList);
        waitElements(notificationGridContent);
        boolean isDisplayed = titleNotificationsList.isDisplayed() && notificationGridContent.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void clickShowAllNotifications() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(labelShowAllNotifications);
        if (!inputShowAllNotifications.isSelected()) {
            click(labelShowAllNotifications);
            pause(1500);
        }
        driver.switchTo().parentFrame();
    }

    public void clickEditNotificationByPatient(String patientName) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNotificationsList);
        WebElement editButton = findEditNotificationButtonByPatient(patientName);
        clickJS(editButton);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void enterEndDateInNotificationForm(String endDate) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(inputNotificationEndDate);
        scrollToElementMove(inputNotificationEndDate);
        inputNotificationEndDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputNotificationEndDate.sendKeys(Keys.DELETE);
        write(inputNotificationEndDate, endDate);
        inputNotificationEndDate.sendKeys(Keys.TAB);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void saveNotificationEditRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(btnSaveNotificationEditRow);
        click(btnSaveNotificationEditRow);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void cancelNotificationEditRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(btnCancelNotificationEditRow);
        click(btnCancelNotificationEditRow);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public boolean isNotificationEndDateDisplayed(String patientName, String endDate) {
        driver.switchTo().frame("frmContenido");
        By notificationEndDateBy = By.xpath("//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]" +
                "//tr[contains(@class,'k-master-row') and .//td[normalize-space(.)='" + patientName + "'] and .//td[normalize-space(.)='" + endDate + "']]");
        WebElement notificationRow = wait.until(ExpectedConditions.visibilityOfElementLocated(notificationEndDateBy));
        boolean isDisplayed = notificationRow.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    private WebElement findEditNotificationButtonByPatient(String patientName) throws InterruptedException {
        waitElements(notificationGridContent);
        By editButtonBy = By.xpath("//h2[normalize-space(.)='Notifications']/ancestor::div[contains(@class,'x_panel')][1]" +
                "//tr[contains(@class,'k-master-row') and .//td[normalize-space(.)='" + patientName + "']]" +
                "//button[contains(@class,'k-grid-edit')]");

        for (int i = 0; i < 35; i++) {
            List<WebElement> editButtons = driver.findElements(editButtonBy);
            if (!editButtons.isEmpty()) {
                WebElement editButton = editButtons.get(0);
                javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", editButton);
                return editButton;
            }
            scrollNotificationGridDown();
            pause(300);
        }
        return wait.until(ExpectedConditions.elementToBeClickable(editButtonBy));
    }

    private void scrollNotificationGridDown() {
        javascriptExecutor.executeScript(
                "arguments[0].scrollTop = arguments[0].scrollTop + 450;" +
                        "arguments[0].dispatchEvent(new Event('scroll'));",
                notificationGridContent);
        javascriptExecutor.executeScript(
                "arguments[0].scrollTop = arguments[0].scrollTop + 450;" +
                        "arguments[0].dispatchEvent(new Event('scroll'));",
                notificationGridVerticalScroll);
    }
}