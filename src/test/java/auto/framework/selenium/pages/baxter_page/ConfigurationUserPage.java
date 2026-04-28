package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

@LazyComponent
public class ConfigurationUserPage extends BasePage<ConfigurationUserPage> {

    @FindBy(how = How.XPATH, using = "//a[text()=\"Configuration\"]")
    private WebElement configurationButton;

    @FindBy(how = How.XPATH, using = "//span[@class='rpText' and normalize-space()='Usuarios']")
    private WebElement usersButton;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Staff']")
    private WebElement staffTitle;

    @FindBy(how = How.ID, using = "chkInactivos")
    private WebElement showInactiveUsersCheckbox;

    // --- Three points menu ---

    @FindBy(how = How.XPATH, using = "//i[@class='icon-three-points']")
    private WebElement threePointsMenuBtn;

    // --- Create new user form — Staff section ---

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.personalSeleccionado.personal.apellido1']")
    private WebElement inputLastName;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.personalSeleccionado.personal.nombre']")
    private WebElement inputFirstName;

    @FindBy(how = How.XPATH, using = "(//select[@ng-model='$ctrl.personalSeleccionado.personal.profesionId'])[1]")
    private WebElement selectProfession;

    @FindBy(how = How.XPATH, using = "//select[@ng-model='$ctrl.personalSeleccionado.perfilId']")
    private WebElement selectUserProfile;

    @FindBy(how = How.XPATH, using = "(//select[@ng-model='$ctrl.personalSeleccionado.personal.terapiaId'])[1]")
    private WebElement selectTreatment;

    @FindBy(how = How.XPATH, using = "(//select[@ng-show='$ctrl.esNuevo'])[1]")
    private WebElement selectCenter;

    // --- Create new user form — Security section ---

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.personalSeleccionado.usuario'][not(contains(@class,'ng-hide'))]")
    private WebElement inputUsername;

    @FindBy(how = How.XPATH, using = "//input[@name='password'][not(contains(@class,'ng-hide'))]")
    private WebElement inputPassword;

    @FindBy(how = How.XPATH, using = "//input[@name='confirm_password'][not(contains(@class,'ng-hide'))]")
    private WebElement inputConfirmPassword;

    // --- Validation messages ---

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Configuracion_Personal_Contrasenya_o_Pin_No_Coinciden'][not(contains(@class,'ng-hide'))]")
    private WebElement errorPasswordMismatch;

    @FindBy(how = How.XPATH, using = "//p[contains(@ng-show,'erroresBLL.UserName') and not(contains(@class,'ng-hide'))]")
    private WebElement errorDuplicateUsername;

    @FindBy(how = How.XPATH, using = "//input[contains(@class,'ng-invalid-required') and not(contains(@class,'ng-hide'))]")
    private WebElement invalidRequiredField;

    @Override
    public boolean isAt() throws InterruptedException {
        return isUsersModuleDisplayed();
    }

    public boolean isConfigurationUserHomeDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(usersButton);
        boolean isDisplayed = usersButton.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void openConfigurationUserModule() throws InterruptedException {
        pause(200);
        click(configurationButton);
        pause(200);
    }

    public void openUsersModule() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(usersButton);
        click(usersButton);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public boolean isUsersModuleDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(staffTitle);
        boolean isDisplayed = staffTitle.isDisplayed();
        pause(1000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void clickShowInactiveUsers() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(showInactiveUsersCheckbox);
        click(showInactiveUsersCheckbox);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public boolean isInactiveUsersFilterDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(showInactiveUsersCheckbox);
        boolean isDisplayed = showInactiveUsersCheckbox.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    // --- Three points menu ---

    public void clickThreePointsMenuInUsersModule() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(threePointsMenuBtn);
        scrollToElementMove(threePointsMenuBtn);
        click(threePointsMenuBtn);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickOptionInUsersModuleMenu(String option) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        click(By.xpath("//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                "//a[not(contains(@class,'ng-hide'))]//span[normalize-space(.)='" + option + "']"));
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    // --- Create new user form — Staff section ---

    public void enterLastNameInUserForm(String lastName) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputLastName);
        scrollToElementMove(inputLastName);
        inputLastName.clear();
        write(inputLastName, lastName);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterFirstNameInUserForm(String firstName) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputFirstName);
        scrollToElementMove(inputFirstName);
        inputFirstName.clear();
        write(inputFirstName, firstName);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectProfessionInUserForm() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(selectProfession);
        scrollToElementMove(selectProfession);
        new Select(selectProfession).selectByIndex(1);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectUserProfileInUserForm() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(selectUserProfile);
        scrollToElementMove(selectUserProfile);
        new Select(selectUserProfile).selectByIndex(1);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectTreatmentInUserForm() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(selectTreatment);
        scrollToElementMove(selectTreatment);
        new Select(selectTreatment).selectByIndex(1);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectCenterInUserForm() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(selectCenter);
        scrollToElementMove(selectCenter);
        new Select(selectCenter).selectByIndex(1);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    // --- Create new user form — Security section ---

    public void enterUsernameInUserForm(String username) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputUsername);
        scrollToElementMove(inputUsername);
        inputUsername.clear();
        write(inputUsername, username);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterPasswordInUserForm(String password) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputPassword);
        scrollToElementMove(inputPassword);
        inputPassword.clear();
        write(inputPassword, password);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterConfirmPasswordInUserForm(String password) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputConfirmPassword);
        scrollToElementMove(inputConfirmPassword);
        inputConfirmPassword.clear();
        write(inputConfirmPassword, password);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    // --- Validations ---

    public boolean isRequiredFieldsValidationDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(invalidRequiredField);
        boolean isDisplayed = invalidRequiredField.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isDuplicateUsernameErrorDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(errorDuplicateUsername);
        boolean isDisplayed = errorDuplicateUsername.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isPasswordMismatchErrorDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(errorPasswordMismatch);
        boolean isDisplayed = errorPasswordMismatch.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }
}