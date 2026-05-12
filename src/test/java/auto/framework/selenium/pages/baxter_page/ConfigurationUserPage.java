package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    // --- Staff member selector ---

    @FindBy(how = How.XPATH, using = "//selector-perfiles-personales//span[@role='combobox']")
    private WebElement staffMemberPicker;

    @FindBy(how = How.XPATH, using = "//selector-perfiles-personales//span[@role='button' and contains(@class,'k-input-button')]")
    private WebElement staffMemberExpandBtn;

    @FindBy(how = How.XPATH, using = "//selector-perfiles-personales//span[contains(@class,'k-input-inner')]")
    private WebElement staffMemberInputRef;

    // --- Three points menu ---

    @FindBy(how = How.XPATH, using = "//i[@class='icon-three-points']")
    private WebElement threePointsMenuBtn;

    // --- Create/Modify user form — Staff section ---

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

    // --- Modify user form — additional fields ---

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.personalSeleccionado.personal.numColegiado']")
    private WebElement inputLicenseNo;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.personalSeleccionado.personal.apellido2']")
    private WebElement inputSecondSurname;

    @FindBy(how = How.XPATH, using = "//input[@ng-model='$ctrl.personalSeleccionado.personal.dni']")
    private WebElement inputNID;

    // --- Create/Modify user form — Security section ---

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

    @FindBy(how = How.XPATH, using = "//p[contains(@ng-show,'erroresBLL.Password') and not(contains(@class,'ng-hide'))]")
    private WebElement errorPasswordRequirements;

    // --- Center assignment ---

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Center assignment']")
    private WebElement centerAssignmentTitle;

    @FindBy(how = How.XPATH, using = "//asignacion-centros-personal//button[contains(@class,'k-grid-add')]")
    private WebElement btnNewCenterAssignment;

    @FindBy(how = How.XPATH, using = "//asignacion-centros-personal//tr[contains(@class,'k-grid-edit-row')]")
    private WebElement centerAssignmentEditRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//tr[td[normalize-space(.)='Centro medico S.Brigida']]//button[contains(@class,'k-grid-edit')]")
    private WebElement btnEditCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//tr[td[normalize-space(.)='Centro medico S.Brigida']]//button[contains(@class,'k-grid-delete')]")
    private WebElement btnDeleteCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='centroId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='centroId']//span[@role='button' and contains(@class,'k-input-button')]")
    private WebElement dropDownButtonCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='centroId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='fechaInicio']//input[@data-role='datepicker']")
    private WebElement inputStartDateCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='fechaFin']//input[@data-role='datepicker']")
    private WebElement inputEndDateCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-update')]")
    private WebElement btnSaveCenterAssignmentRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Center assignment']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-cancel')]")
    private WebElement btnCancelCenterAssignmentRow;

    // --- Contacts ---

    @FindBy(how = How.XPATH, using = "//h2[normalize-space()='Contacts']")
    private WebElement contactsTitle;

    @FindBy(how = How.XPATH, using = "//medios-contacto-personal//button[contains(@class,'k-grid-add')]")
    private WebElement btnNewContact;

    @FindBy(how = How.XPATH, using = "//medios-contacto-personal//tr[contains(@class,'k-grid-edit-row')]")
    private WebElement contactEditRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Contacts']/ancestor::div[contains(@class,'x_panel')][1]//button[contains(@class,'k-grid-edit')]")
    private WebElement btnEditContactRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Contacts']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='tipoContactoId']//span[contains(@class,'k-picker')]")
    private WebElement dropDownContactTypeRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Contacts']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='tipoContactoId']//span[contains(@class,'k-input-inner')]")
    private WebElement inputContactTypeRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Contacts']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[@data-container-for='info']//input")
    private WebElement inputContactValueRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Contacts']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-update')]")
    private WebElement btnSaveContactRow;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Contacts']/ancestor::div[contains(@class,'x_title')][1]/following-sibling::div[contains(@class,'x_content')][1]//td[contains(@class,'k-command-cell')]//button[contains(@class,'k-grid-cancel')]")
    private WebElement btnCancelContactRow;

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

    // --- Modify user ---

    public void selectUserInUsersModule(String userName) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(staffMemberPicker);
        scrollToElementMove(staffMemberPicker);
        click(staffMemberPicker);
        pause(500);
        searchUserInOpenedStaffDropdown(userName);
        clickStaffDropdownOption(userName);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    private void searchUserInOpenedStaffDropdown(String userName) throws InterruptedException {
        By filterInput = By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]" +
                "//input[not(@type='hidden') and not(contains(@class,'ng-hide'))]");
        try {
            WebElement input = new WebDriverWait(driver, Duration.ofSeconds(2))
                    .until(ExpectedConditions.elementToBeClickable(filterInput));
            input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
            input.sendKeys(Keys.DELETE);
            input.sendKeys(normalizeUserSearchText(userName));
            pause(500);
        } catch (TimeoutException e) {
            staffMemberPicker.sendKeys(normalizeUserSearchText(userName));
            pause(500);
        }
    }

    private void clickStaffDropdownOption(String userName) {
        String compactUserName = userName.replace(" ", "");
        By optionByCompactText = By.xpath("//ul[contains(@class,'k-list-ul')]//li[" +
                "contains(translate(normalize-space(.), ' ', ''), " + xpathLiteral(compactUserName) + ")]");
        try {
            WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionByCompactText));
            option.click();
        } catch (TimeoutException e) {
            String[] userParts = compactUserName.split(",", 2);
            By optionByNameParts = By.xpath("//ul[contains(@class,'k-list-ul')]//li[" +
                    "contains(translate(normalize-space(.), ' ', ''), " + xpathLiteral(userParts[0]) + ")" +
                    (userParts.length > 1 ? " and contains(translate(normalize-space(.), ' ', ''), " + xpathLiteral(userParts[1]) + ")" : "") +
                    "]");
            wait.until(ExpectedConditions.elementToBeClickable(optionByNameParts)).click();
        }
    }

    private String normalizeUserSearchText(String userName) {
        return userName.replace(" ,", ",").replace(", ", ", ");
    }

    private String xpathLiteral(String value) {
        if (value.contains("'") && value.contains("\"")) {
            StringBuilder concat = new StringBuilder("concat(");
            for (int i = 0; i < value.length(); i++) {
                if (i > 0) {
                    concat.append(", ");
                }
                char c = value.charAt(i);
                concat.append(c == '\'' ? "\"'\"" : "'" + c + "'");
            }
            concat.append(")");
            return concat.toString();
        }
        if (value.contains("'")) {
            return "\"" + value + "\"";
        }
        return "'" + value + "'";
    }

    public void enterLicenseNoInUserForm(String licenseNo) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputLicenseNo);
        scrollToElementMove(inputLicenseNo);
        inputLicenseNo.clear();
        write(inputLicenseNo, licenseNo);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterSecondSurnameInUserForm(String secondSurname) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputSecondSurname);
        scrollToElementMove(inputSecondSurname);
        inputSecondSurname.clear();
        write(inputSecondSurname, secondSurname);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterNIDInUserForm(String nid) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputNID);
        scrollToElementMove(inputNID);
        inputNID.clear();
        write(inputNID, nid);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public boolean isPasswordRequirementsErrorDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(errorPasswordRequirements);
        boolean isDisplayed = errorPasswordRequirements.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    // --- Center assignment ---

    public boolean isCenterAssignmentDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(centerAssignmentTitle);
        scrollToElementMove(centerAssignmentTitle);
        boolean isDisplayed = centerAssignmentTitle.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void clickNewCenterAssignment() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnNewCenterAssignment);
        scrollToElementMove(btnNewCenterAssignment);
        click(btnNewCenterAssignment);
        pause(1500);
        click(btnNewCenterAssignment);
        pause(3000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectCenterInCenterAssignmentRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(2000);
        waitElements(dropDownCenterAssignmentRow);
        click(dropDownCenterAssignmentRow);
        pause(500);
        clickBelowElementByOffset(inputCenterAssignmentRow, 60);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickEditCenterAssignmentRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnEditCenterAssignmentRow);
        scrollToElementMove(btnEditCenterAssignmentRow);
        click(btnEditCenterAssignmentRow);
        pause(800);
        click(btnEditCenterAssignmentRow);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickDeleteCenterAssignmentRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnDeleteCenterAssignmentRow);
        scrollToElementMove(btnDeleteCenterAssignmentRow);
        click(btnDeleteCenterAssignmentRow);
        pause(500);
    }

    public void acceptDeleteCenterAssignmentRow() throws InterruptedException {
        clickDeleteCenterAssignmentRow();
        acceptBrowserAlert();
        pause(500);
    }

    public void dismissDeleteCenterAssignmentRow() throws InterruptedException {
        clickDeleteCenterAssignmentRow();
        dismissBrowserAlert();
        pause(500);
    }

    public void enterStartDateCenterAssignmentRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputStartDateCenterAssignmentRow);
        scrollToElementMove(inputStartDateCenterAssignmentRow);
        inputStartDateCenterAssignmentRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputStartDateCenterAssignmentRow.sendKeys(Keys.DELETE);
        inputStartDateCenterAssignmentRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterEndDateCenterAssignmentRow(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputEndDateCenterAssignmentRow);
        scrollToElementMove(inputEndDateCenterAssignmentRow);
        inputEndDateCenterAssignmentRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputEndDateCenterAssignmentRow.sendKeys(Keys.DELETE);
        inputEndDateCenterAssignmentRow.sendKeys(date);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void saveCenterAssignmentRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnSaveCenterAssignmentRow);
        scrollToElementMove(btnSaveCenterAssignmentRow);
        click(btnSaveCenterAssignmentRow);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void cancelCenterAssignmentRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnCancelCenterAssignmentRow);
        scrollToElementMove(btnCancelCenterAssignmentRow);
        click(btnCancelCenterAssignmentRow);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    // --- Contacts ---

    public boolean isContactsDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(contactsTitle);
        scrollToElementMove(contactsTitle);
        boolean isDisplayed = contactsTitle.isDisplayed();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void clickNewContact() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnNewContact);
        scrollToElementMove(btnNewContact);
        click(btnNewContact);
        pause(1500);
        click(btnNewContact);
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectContactTypeRow(String contactType) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(contactEditRow);
        waitElements(dropDownContactTypeRow);
        selectKendoDropdownOption(dropDownContactTypeRow, contactType);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickEditContactRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnEditContactRow);
        scrollToElementMove(btnEditContactRow);
        click(btnEditContactRow);
        pause(1500);
        click(btnEditContactRow);
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterContactValueRow(String value) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(inputContactValueRow);
        scrollToElementMove(inputContactValueRow);
        inputContactValueRow.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputContactValueRow.sendKeys(Keys.DELETE);
        write(inputContactValueRow, value);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void saveContactRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnSaveContactRow);
        scrollToElementMove(btnSaveContactRow);
        click(btnSaveContactRow);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void cancelContactRow() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        waitElements(btnCancelContactRow);
        scrollToElementMove(btnCancelContactRow);
        click(btnCancelContactRow);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
}