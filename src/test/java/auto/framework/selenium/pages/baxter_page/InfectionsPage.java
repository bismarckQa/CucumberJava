package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@LazyComponent
public class InfectionsPage extends BasePage<InfectionsPage> {

    private static final String INFECTIONS_PANEL =
            "//h2[normalize-space(.)='Infections']/ancestor::div[contains(@class,'x_panel')][1]";
    private static final String CULTURES_PANEL =
            "//h2[normalize-space(.)='Cultures']/ancestor::div[contains(@class,'x_panel')][1]";
    private static final String INPUT_PRESENTATION_DATE_INFECTION_XPATH = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Presentation date']/following::input[@data-role='datepicker' and not(@disabled)" +
            " and not(ancestor::*[contains(@class,'ng-hide')])][1]";
    private static final String OPTION_NEW_CULTURE_XPATH =
            CULTURES_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='New culture']]";
    private static final String OPTION_EDIT_CULTURE_XPATH =
            CULTURES_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Edit']]";
    private static final String OPTION_DELETE_CULTURE_XPATH =
            CULTURES_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Delete']]";
    private static final String OPTION_SAVE_CULTURE_XPATH =
            CULTURES_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Save']]";
    private static final String OPTION_CANCEL_CULTURE_XPATH =
            CULTURES_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Cancel']]";
    private static final String OPTION_NEW_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='New infection']]";
    private static final String OPTION_EDIT_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Edit']]";
    private static final String OPTION_SAVE_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Save']]";
    private static final String OPTION_CANCEL_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Cancel']]";
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Infections')]")
    private WebElement titleInfections;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL)
    private WebElement culturesPanel;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuInfections;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuCultures;

    @FindBy(how = How.XPATH, using = OPTION_NEW_INFECTION_XPATH)
    private WebElement optionNewInfection;

    @FindBy(how = How.XPATH, using = OPTION_EDIT_INFECTION_XPATH)
    private WebElement optionEditInfection;

    @FindBy(how = How.XPATH, using = OPTION_SAVE_INFECTION_XPATH)
    private WebElement optionSaveInfection;

    @FindBy(how = How.XPATH, using = OPTION_CANCEL_INFECTION_XPATH)
    private WebElement optionCancelInfection;

    @FindBy(how = How.XPATH, using = OPTION_NEW_CULTURE_XPATH)
    private WebElement optionNewCulture;

    @FindBy(how = How.XPATH, using = OPTION_EDIT_CULTURE_XPATH)
    private WebElement optionEditCulture;

    @FindBy(how = How.XPATH, using = OPTION_DELETE_CULTURE_XPATH)
    private WebElement optionDeleteCulture;

    @FindBy(how = How.XPATH, using = OPTION_SAVE_CULTURE_XPATH)
    private WebElement optionSaveCulture;

    @FindBy(how = How.XPATH, using = OPTION_CANCEL_CULTURE_XPATH)
    private WebElement optionCancelCulture;

    @FindBy(how = How.XPATH, using = INPUT_PRESENTATION_DATE_INFECTION_XPATH)
    private WebElement inputPresentationDateInfection;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Resolution date']/following::input[@data-role='datepicker' and not(@disabled)" +
            " and not(ancestor::*[contains(@class,'ng-hide')])][1]")
    private WebElement inputResolutionDateInfection;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Infection type']/following::span[contains(@class,'k-combobox')" +
            " and not(ancestor::*[contains(@class,'ng-hide')])][1]")
    private WebElement dropDownInfectionType;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Treatment location']/following::span[contains(@class,'k-combobox')" +
            " and not(ancestor::*[contains(@class,'ng-hide')])][1]")
    private WebElement dropDownTreatmentLocation;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Evaluation']/following::span[contains(@class,'k-combobox')" +
            " and not(ancestor::*[contains(@class,'ng-hide')])][1]")
    private WebElement dropDownEvaluationInfection;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Observations']/following::iframe[@title='Editable area. Press F10 for toolbar.'" +
            " and contains(@class,'k-content') and not(ancestor::*[contains(@class,'ng-hide')])][1]")
    private WebElement iframeObservationsInfection;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//input[contains(@class,'ng-invalid-required') and @required='required'" +
            " and not(ancestor::*[contains(@class,'ng-hide')])]")
    private WebElement requiredFieldsValidationInfection;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//label[normalize-space(.)='Resolution date']/ancestor::div[contains(@class,'form-group')][1]" +
            "//p[contains(@class,'bllInvalido') and not(contains(@class,'ng-hide'))]")
    private WebElement dateValidationInfection;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//b[normalize-space(.)='Culture date']/following::input[@data-role='datepicker' and not(@disabled)][1]")
    private WebElement inputCultureDate;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//b[normalize-space(.)='Laboratory']/following::span[contains(@class,'k-combobox')][1]")
    private WebElement dropDownCultureLaboratory;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//b[normalize-space(.)='Culture type']/following::span[contains(@class,'k-combobox')][1]")
    private WebElement dropDownCultureType;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//b[normalize-space(.)='Result']/following::multiselect[1]//button[contains(@class,'dropdown-toggle')]")
    private WebElement dropDownCultureResult;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//b[normalize-space(.)='Sample method']/following::span[contains(@class,'k-combobox')][1]")
    private WebElement dropDownCultureSampleMethod;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//b[normalize-space(.)='Comments']/following::textarea[1]")
    private WebElement textAreaCultureComments;

    public void isDisplayedTheTittle() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleInfections);
        titleInfections.isDisplayed();
        driver.switchTo().parentFrame();
    }

    @Override
    public boolean isAt() {
        return false;
    }

    public void clickThreePointsMenuInInfections() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(threePointsMenuInfections);
        click(threePointsMenuInfections);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickNewInfectionOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionNewInfection);
        click(optionNewInfection);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickEditOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionEditInfection);
        click(optionEditInfection);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickSaveOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionSaveInfection);
        click(optionSaveInfection);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionCancelInfection);
        click(optionCancelInfection);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public boolean isSaveOptionInInfectionsMenuNotDisplayed() {
        driver.switchTo().frame("frmContenido");
        boolean isNotDisplayed = driver.findElements(By.xpath(OPTION_SAVE_INFECTION_XPATH)).isEmpty();
        driver.switchTo().parentFrame();
        return isNotDisplayed;
    }

    public boolean isSaveOptionInCulturesMenuNotDisplayed() {
        driver.switchTo().frame("frmContenido");
        boolean isNotDisplayed = driver.findElements(By.xpath(OPTION_SAVE_CULTURE_XPATH)).isEmpty();
        driver.switchTo().parentFrame();
        return isNotDisplayed;
    }

    public boolean isCulturesPanelDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(culturesPanel);
        boolean isDisplayed = culturesPanel.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isNewInfectionFormDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(inputPresentationDateInfection);
        waitElements(dropDownInfectionType);
        boolean isDisplayed = inputPresentationDateInfection.isDisplayed()
                && dropDownInfectionType.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isNewInfectionFormClosed() {
        driver.switchTo().frame("frmContenido");
        boolean isClosed = driver.findElements(By.xpath(INPUT_PRESENTATION_DATE_INFECTION_XPATH)).isEmpty();
        driver.switchTo().parentFrame();
        return isClosed;
    }

    public void enterPresentationDateInInfectionForm(String presentationDate) throws InterruptedException {
        enterDateInInfectionForm(inputPresentationDateInfection, presentationDate);
    }

    public void enterResolutionDateInInfectionForm(String resolutionDate) throws InterruptedException {
        enterDateInInfectionForm(inputResolutionDateInfection, resolutionDate);
    }

    public void clickThreePointsMenuInCultures() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(threePointsMenuCultures);
        scrollToElementMove(threePointsMenuCultures);
        click(threePointsMenuCultures);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickNewCultureOptionInCulturesMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionNewCulture);
        click(optionNewCulture);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickEditCultureOptionInCulturesMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionEditCulture);
        click(optionEditCulture);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteCultureOptionInCulturesMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionDeleteCulture);
        click(optionDeleteCulture);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickSaveOptionInCulturesMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionSaveCulture);
        click(optionSaveCulture);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelOptionInCulturesMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionCancelCulture);
        click(optionCancelCulture);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void enterCultureDateInCultureForm(String cultureDate) throws InterruptedException {
        enterDateInInfectionForm(inputCultureDate, cultureDate);
    }

    public void selectLaboratoryInCultureForm(String laboratory) throws InterruptedException {
        selectComboInInfectionForm(dropDownCultureLaboratory, laboratory);
    }

    public void selectCultureTypeInCultureForm(String cultureType) throws InterruptedException {
        selectComboInInfectionForm(dropDownCultureType, cultureType);
    }

    public void selectResultInCultureForm(String result) throws InterruptedException {
        selectCultureResult(result);
    }

    public void selectSampleMethodInCultureForm(String sampleMethod) throws InterruptedException {
        selectComboInInfectionForm(dropDownCultureSampleMethod, sampleMethod);
    }

    public void enterCommentsInCultureForm(String comments) throws InterruptedException {
        enterCultureComments(comments);
    }

    public void selectInfectionTypeInInfectionForm(String infectionType) throws InterruptedException {
        selectComboInInfectionForm(dropDownInfectionType, infectionType);
    }

    public void selectTreatmentLocationInInfectionForm(String treatmentLocation) throws InterruptedException {
        selectComboInInfectionForm(dropDownTreatmentLocation, treatmentLocation);
    }

    public void selectEvaluationInInfectionForm(String evaluation) throws InterruptedException {
        selectComboInInfectionForm(dropDownEvaluationInfection, evaluation);
    }

    public void enterObservationsInInfectionForm(String observations) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(iframeObservationsInfection);
        scrollToElementMove(iframeObservationsInfection);
        driver.switchTo().frame(iframeObservationsInfection);
        WebElement editorBody = driver.findElement(By.tagName("body"));
        editorBody.click();
        editorBody.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        editorBody.sendKeys(Keys.DELETE);
        if (observations != null && !observations.isEmpty()) {
            editorBody.sendKeys(observations);
        }
        driver.switchTo().parentFrame();
        pause(300);
        driver.switchTo().parentFrame();
    }

    public boolean isInfectionRequiredFieldsValidationDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(requiredFieldsValidationInfection);
        boolean isDisplayed = requiredFieldsValidationInfection.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isInfectionDateValidationDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(dateValidationInfection);
        boolean isDisplayed = dateValidationInfection.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    private void enterDateInInfectionForm(WebElement inputDate, String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(inputDate);
        scrollToElementMove(inputDate);
        inputDate.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        inputDate.sendKeys(Keys.DELETE);
        if (date != null && !date.isEmpty()) {
            write(inputDate, date);
        }
        pause(300);
        driver.switchTo().parentFrame();
    }

    private void selectComboInInfectionForm(WebElement combo, String option) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(combo);
        selectKendoDropdownOption(combo, option);
        driver.switchTo().parentFrame();
    }

    private void selectCultureResult(String result) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(dropDownCultureResult);
        click(dropDownCultureResult);
        click(By.xpath(CULTURES_PANEL + "//ul[contains(@class,'multi-select-popup')]" +
                "//span[normalize-space(.)='" + result + "']/ancestor::a"));
        pause(300);
        click(dropDownCultureResult);
        pause(300);
        driver.switchTo().parentFrame();
    }

    private void enterCultureComments(String comments) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(textAreaCultureComments);
        scrollToElementMove(textAreaCultureComments);
        textAreaCultureComments.clear();
        write(textAreaCultureComments, comments);
        pause(300);
        driver.switchTo().parentFrame();
    }

}