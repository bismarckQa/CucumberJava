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
    private static final String INTERVENTIONS_PANEL =
            "//h2[normalize-space(.)='Interventions']/ancestor::div[contains(@class,'x_panel')][1]";
    private static final String ASSOCIATED_MEDICATION_PANEL =
            "//h2[normalize-space(.)='Associated medication']/ancestor::div[contains(@class,'x_panel')][1]";
    private static final String ASSOCIATED_HOSPITALIZATION_PANEL =
            "//h2[normalize-space(.)='Associated hospitalization']/ancestor::div[contains(@class,'x_panel')][1]";
    private static final String ASSOCIATED_ACCESS_PANEL =
            "//h2[normalize-space(.)='Associated access']/ancestor::div[contains(@class,'x_panel')][1]";
    private static final String ASSIGN_MEDICATION_MODAL =
            "//div[@id='genericModalWin' and @data-role='window']";
    private static final String ASSIGN_HOSPITALIZATION_MODAL =
            "//div[@id='genericModalWin' and @data-role='window']";
    private static final String ASSIGN_ACCESS_MODAL =
            "//div[@id='genericModalWin' and @data-role='window']";
    private static final String ASSIGN_SIGNS_SYMPTOMS_MODAL =
            "//div[@id='genericModalWin' and @data-role='window']" +
                    "[.//p[normalize-space(.)='Presenting signs/symptoms'" +
                    " or contains(@data-translate,'Signos')]]";
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
    private static final String OPTION_NEW_INTERVENTION_XPATH =
            INTERVENTIONS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='New intervention']]";
    private static final String OPTION_EDIT_INTERVENTION_XPATH =
            INTERVENTIONS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Edit']]";
    private static final String OPTION_DELETE_INTERVENTION_XPATH =
            INTERVENTIONS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Delete']]";
    private static final String OPTION_SAVE_INTERVENTION_XPATH =
            INTERVENTIONS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Save']]";
    private static final String OPTION_CANCEL_INTERVENTION_XPATH =
            INTERVENTIONS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Cancel']]";
    private static final String OPTION_LINK_MEDICATION_XPATH =
            ASSOCIATED_MEDICATION_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][normalize-space(.)='Link']";
    private static final String OPTION_DELETE_MEDICATION_XPATH =
            ASSOCIATED_MEDICATION_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][normalize-space(.)='Delete']";
    private static final String OPTION_LINK_HOSPITALIZATION_XPATH =
            ASSOCIATED_HOSPITALIZATION_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][normalize-space(.)='Link']";
    private static final String OPTION_DELETE_HOSPITALIZATION_XPATH =
            ASSOCIATED_HOSPITALIZATION_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][normalize-space(.)='Delete']";
    private static final String OPTION_LINK_ACCESS_XPATH =
            ASSOCIATED_ACCESS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][normalize-space(.)='Link']";
    private static final String OPTION_DELETE_ACCESS_XPATH =
            ASSOCIATED_ACCESS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][normalize-space(.)='Delete']";
    private static final String OPTION_NEW_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='New infection']]";
    private static final String OPTION_EDIT_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Edit']]";
    private static final String OPTION_EDIT_ALL_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Edit all']]";
    private static final String OPTION_DELETE_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Delete']]";
    private static final String OPTION_SAVE_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Save']]";
    private static final String OPTION_CANCEL_INFECTION_XPATH =
            "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Cancel']]";
    private static final String OPTION_ASSIGN_SIGNS_SYMPTOMS_XPATH =
            INFECTIONS_PANEL + "//ul[contains(@class,'dropdown-menu') and contains(@class,'three-points')]" +
                    "//a[not(ancestor::*[contains(@class,'ng-hide')])][.//span[normalize-space(.)='Assign signs/symptoms']]";
    private static final String PRESENTING_SIGNS_SYMPTOMS_LABEL_XPATH =
            INFECTIONS_PANEL + "//label[normalize-space(.)='Presenting signs/symptoms']";
    private static final String DELETE_INFECTION_MODAL =
            "//span[normalize-space(.)='Delete infection']";
    private static final String INPUT_PASSWORD_DELETE_INFECTION_XPATH = "//input[@type='password']";
    private static final String INPUT_REASON_DELETE_INFECTION_XPATH =
            "//label[normalize-space(.)='Reason']/following-sibling::input";
    private static final String BUTTON_OK_DELETE_INFECTION_XPATH = "//button[@translate-once='Modal_Button_OK']";
    private static final String BUTTON_CANCEL_DELETE_INFECTION_XPATH = "//button[@translate-once='Modal_Button_Cancelar']";
    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Infections')]")
    private WebElement titleInfections;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL)
    private WebElement culturesPanel;

    @FindBy(how = How.XPATH, using = INTERVENTIONS_PANEL)
    private WebElement interventionsPanel;

    @FindBy(how = How.XPATH, using = ASSOCIATED_MEDICATION_PANEL)
    private WebElement associatedMedicationPanel;

    @FindBy(how = How.XPATH, using = ASSOCIATED_HOSPITALIZATION_PANEL)
    private WebElement associatedHospitalizationPanel;

    @FindBy(how = How.XPATH, using = ASSOCIATED_ACCESS_PANEL)
    private WebElement associatedAccessPanel;

    @FindBy(how = How.XPATH, using = INFECTIONS_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuInfections;

    @FindBy(how = How.XPATH, using = CULTURES_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuCultures;

    @FindBy(how = How.XPATH, using = INTERVENTIONS_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuInterventions;

    @FindBy(how = How.XPATH, using = ASSOCIATED_MEDICATION_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuAssociatedMedication;

    @FindBy(how = How.XPATH, using = ASSOCIATED_HOSPITALIZATION_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuAssociatedHospitalization;

    @FindBy(how = How.XPATH, using = ASSOCIATED_ACCESS_PANEL +
            "//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]")
    private WebElement threePointsMenuAssociatedAccess;

    @FindBy(how = How.XPATH, using = OPTION_NEW_INFECTION_XPATH)
    private WebElement optionNewInfection;

    @FindBy(how = How.XPATH, using = OPTION_EDIT_INFECTION_XPATH)
    private WebElement optionEditInfection;

    @FindBy(how = How.XPATH, using = OPTION_EDIT_ALL_INFECTION_XPATH)
    private WebElement optionEditAllInfection;

    @FindBy(how = How.XPATH, using = OPTION_DELETE_INFECTION_XPATH)
    private WebElement optionDeleteInfection;

    @FindBy(how = How.XPATH, using = OPTION_SAVE_INFECTION_XPATH)
    private WebElement optionSaveInfection;

    @FindBy(how = How.XPATH, using = OPTION_CANCEL_INFECTION_XPATH)
    private WebElement optionCancelInfection;

    @FindBy(how = How.XPATH, using = OPTION_ASSIGN_SIGNS_SYMPTOMS_XPATH)
    private WebElement optionAssignSignsSymptoms;

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

    @FindBy(how = How.XPATH, using = OPTION_NEW_INTERVENTION_XPATH)
    private WebElement optionNewIntervention;

    @FindBy(how = How.XPATH, using = OPTION_EDIT_INTERVENTION_XPATH)
    private WebElement optionEditIntervention;

    @FindBy(how = How.XPATH, using = OPTION_DELETE_INTERVENTION_XPATH)
    private WebElement optionDeleteIntervention;

    @FindBy(how = How.XPATH, using = OPTION_SAVE_INTERVENTION_XPATH)
    private WebElement optionSaveIntervention;

    @FindBy(how = How.XPATH, using = OPTION_CANCEL_INTERVENTION_XPATH)
    private WebElement optionCancelIntervention;

    @FindBy(how = How.XPATH, using = OPTION_LINK_MEDICATION_XPATH)
    private WebElement optionLinkMedication;

    @FindBy(how = How.XPATH, using = OPTION_DELETE_MEDICATION_XPATH)
    private WebElement optionDeleteMedication;

    @FindBy(how = How.XPATH, using = OPTION_LINK_HOSPITALIZATION_XPATH)
    private WebElement optionLinkHospitalization;

    @FindBy(how = How.XPATH, using = OPTION_DELETE_HOSPITALIZATION_XPATH)
    private WebElement optionDeleteHospitalization;

    @FindBy(how = How.XPATH, using = OPTION_LINK_ACCESS_XPATH)
    private WebElement optionLinkAccess;

    @FindBy(how = How.XPATH, using = OPTION_DELETE_ACCESS_XPATH)
    private WebElement optionDeleteAccess;

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

    @FindBy(how = How.XPATH, using = INTERVENTIONS_PANEL +
            "//b[normalize-space(.)='Date of intervention']/following::input[@data-role='datepicker' and not(@disabled)][1]")
    private WebElement inputInterventionDate;

    @FindBy(how = How.XPATH, using = INTERVENTIONS_PANEL +
            "//b[normalize-space(.)='Type of intervention']/following::span[contains(@class,'k-combobox')][1]")
    private WebElement dropDownTypeOfIntervention;

    @FindBy(how = How.XPATH, using = INTERVENTIONS_PANEL +
            "//b[normalize-space(.)='Result']/following::span[contains(@class,'k-combobox')][1]")
    private WebElement dropDownResultIntervention;

    @FindBy(how = How.XPATH, using = INTERVENTIONS_PANEL +
            "//p[contains(@class,'bllInvalido') and not(contains(@class,'ng-hide'))]")
    private WebElement dateValidationIntervention;

    @FindBy(how = How.XPATH, using = ASSIGN_MEDICATION_MODAL)
    private WebElement modalAssignMedication;

    @FindBy(how = How.XPATH, using = ASSIGN_MEDICATION_MODAL +
            "//div[contains(@class,'comboDiv')]//span[contains(@class,'k-combobox')]")
    private WebElement dropDownAssignMedication;

    @FindBy(how = How.XPATH, using = ASSIGN_MEDICATION_MODAL +
            "//div[contains(@class,'comboDiv')]//button[@aria-label='expand combobox']")
    private WebElement buttonDropDownAssignMedication;

    @FindBy(how = How.XPATH, using = ASSIGN_MEDICATION_MODAL +
            "//div[contains(@class,'comboDiv')]//input[@role='combobox']")
    private WebElement inputAssignMedication;

    @FindBy(how = How.XPATH, using = ASSIGN_MEDICATION_MODAL +
            "//button[normalize-space(.)='Add']")
    private WebElement buttonAddAssignMedication;

    @FindBy(how = How.XPATH, using = ASSIGN_MEDICATION_MODAL +
            "//button[normalize-space(.)='Cancel']")
    private WebElement buttonCancelAssignMedication;

    @FindBy(how = How.XPATH, using = ASSIGN_HOSPITALIZATION_MODAL)
    private WebElement modalAssignHospitalization;

    @FindBy(how = How.XPATH, using = ASSIGN_HOSPITALIZATION_MODAL +
            "//div[contains(@class,'comboDiv')]//span[contains(@class,'k-combobox')]")
    private WebElement dropDownAssignHospitalization;

    @FindBy(how = How.XPATH, using = ASSIGN_HOSPITALIZATION_MODAL +
            "//div[contains(@class,'comboDiv')]//button[@aria-label='expand combobox']")
    private WebElement buttonDropDownAssignHospitalization;

    @FindBy(how = How.XPATH, using = ASSIGN_HOSPITALIZATION_MODAL +
            "//div[contains(@class,'comboDiv')]//input[@role='combobox']")
    private WebElement inputAssignHospitalization;

    @FindBy(how = How.XPATH, using = ASSIGN_HOSPITALIZATION_MODAL +
            "//button[normalize-space(.)='Add']")
    private WebElement buttonAddAssignHospitalization;

    @FindBy(how = How.XPATH, using = ASSIGN_HOSPITALIZATION_MODAL +
            "//button[normalize-space(.)='Cancel']")
    private WebElement buttonCancelAssignHospitalization;

    @FindBy(how = How.XPATH, using = ASSIGN_ACCESS_MODAL)
    private WebElement modalAssignAccess;

    @FindBy(how = How.XPATH, using = ASSIGN_ACCESS_MODAL +
            "//div[contains(@class,'comboDiv')]//span[contains(@class,'k-combobox')]")
    private WebElement dropDownAssignAccess;

    @FindBy(how = How.XPATH, using = ASSIGN_ACCESS_MODAL +
            "//div[contains(@class,'comboDiv')]//button[@aria-label='expand combobox']")
    private WebElement buttonDropDownAssignAccess;

    @FindBy(how = How.XPATH, using = ASSIGN_ACCESS_MODAL +
            "//div[contains(@class,'comboDiv')]//input[@role='combobox']")
    private WebElement inputAssignAccess;

    @FindBy(how = How.XPATH, using = ASSIGN_ACCESS_MODAL +
            "//button[normalize-space(.)='Add']")
    private WebElement buttonAddAssignAccess;

    @FindBy(how = How.XPATH, using = ASSIGN_ACCESS_MODAL +
            "//button[normalize-space(.)='Cancel']")
    private WebElement buttonCancelAssignAccess;

    @FindBy(how = How.XPATH, using = ASSIGN_SIGNS_SYMPTOMS_MODAL)
    private WebElement modalAssignSignsSymptoms;

    @FindBy(how = How.XPATH, using = ASSIGN_SIGNS_SYMPTOMS_MODAL +
            "//div[contains(@class,'comboDiv')]//span[contains(@class,'k-combobox') or contains(@class,'k-input')]")
    private WebElement dropDownAssignSignsSymptoms;

    @FindBy(how = How.XPATH, using = ASSIGN_SIGNS_SYMPTOMS_MODAL +
            "//button[normalize-space(.)='Add']")
    private WebElement buttonAddAssignSignsSymptoms;

    @FindBy(how = How.XPATH, using = ASSIGN_SIGNS_SYMPTOMS_MODAL +
            "//button[normalize-space(.)='Cancel']")
    private WebElement buttonCancelAssignSignsSymptoms;

    @FindBy(how = How.XPATH, using = DELETE_INFECTION_MODAL)
    private WebElement modalDeleteInfection;

    @FindBy(how = How.XPATH, using = INPUT_PASSWORD_DELETE_INFECTION_XPATH)
    private WebElement inputPasswordDeleteInfection;

    @FindBy(how = How.XPATH, using = INPUT_REASON_DELETE_INFECTION_XPATH)
    private WebElement inputReasonDeleteInfection;

    @FindBy(how = How.XPATH, using = BUTTON_OK_DELETE_INFECTION_XPATH)
    private WebElement buttonOkDeleteInfection;

    @FindBy(how = How.XPATH, using = BUTTON_CANCEL_DELETE_INFECTION_XPATH)
    private WebElement buttonCancelDeleteInfection;

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

    public void clickEditAllOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionEditAllInfection);
        click(optionEditAllInfection);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionDeleteInfection);
        click(optionDeleteInfection);
        driver.switchTo().parentFrame();
        waitElements(modalDeleteInfection);
        pause(300);
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

    public void clickAssignSignsSymptomsOptionInInfectionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionAssignSignsSymptoms);
        click(optionAssignSignsSymptoms);
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

    public boolean isInterventionsPanelDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(interventionsPanel);
        boolean isDisplayed = interventionsPanel.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isAssociatedMedicationPanelDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(associatedMedicationPanel);
        boolean isDisplayed = associatedMedicationPanel.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isAssociatedHospitalizationPanelDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(associatedHospitalizationPanel);
        boolean isDisplayed = associatedHospitalizationPanel.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isAssociatedAccessPanelDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(associatedAccessPanel);
        boolean isDisplayed = associatedAccessPanel.isDisplayed();
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

    public boolean isDeleteInfectionModalDisplayed() {
        driver.switchTo().defaultContent();
        waitElements(modalDeleteInfection);
        boolean isDisplayed = modalDeleteInfection.isDisplayed();
        return isDisplayed;
    }

    public boolean isDeleteInfectionModalClosed() {
        driver.switchTo().defaultContent();
        boolean isClosed = driver.findElements(By.xpath(DELETE_INFECTION_MODAL)).isEmpty();
        return isClosed;
    }

    public void enterPasswordInDeleteInfectionModal(String password) throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(By.xpath(INPUT_PASSWORD_DELETE_INFECTION_XPATH));
        inputPasswordDeleteInfection.clear();
        write(inputPasswordDeleteInfection, password);
        pause(300);
    }

    public void enterReasonInDeleteInfectionModal(String reason) throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(By.xpath(INPUT_REASON_DELETE_INFECTION_XPATH));
        inputReasonDeleteInfection.clear();
        write(inputReasonDeleteInfection, reason);
        pause(300);
    }

    public void clickOkButtonInDeleteInfectionModal() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(By.xpath(BUTTON_OK_DELETE_INFECTION_XPATH));
        click(buttonOkDeleteInfection);
        pause(700);
    }

    public void clickCancelButtonInDeleteInfectionModal() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(By.xpath(BUTTON_CANCEL_DELETE_INFECTION_XPATH));
        click(buttonCancelDeleteInfection);
        pause(700);
    }

    public void enterPresentationDateInInfectionForm(String presentationDate) throws InterruptedException {
        enterDateInForm(inputPresentationDateInfection, presentationDate);
    }

    public void enterResolutionDateInInfectionForm(String resolutionDate) throws InterruptedException {
        enterDateInForm(inputResolutionDateInfection, resolutionDate);
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

    public void clickThreePointsMenuInInterventions() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(threePointsMenuInterventions);
        scrollToElementMove(threePointsMenuInterventions);
        click(threePointsMenuInterventions);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickNewInterventionOptionInInterventionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionNewIntervention);
        click(optionNewIntervention);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickEditInterventionOptionInInterventionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionEditIntervention);
        click(optionEditIntervention);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteInterventionOptionInInterventionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionDeleteIntervention);
        click(optionDeleteIntervention);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickSaveOptionInInterventionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionSaveIntervention);
        click(optionSaveIntervention);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelOptionInInterventionsMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionCancelIntervention);
        click(optionCancelIntervention);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickThreePointsMenuInAssociatedMedication() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(threePointsMenuAssociatedMedication);
        scrollToElementMove(threePointsMenuAssociatedMedication);
        click(threePointsMenuAssociatedMedication);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickLinkOptionInAssociatedMedicationMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionLinkMedication);
        click(optionLinkMedication);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteOptionInAssociatedMedicationMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionDeleteMedication);
        click(optionDeleteMedication);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickThreePointsMenuInAssociatedHospitalization() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(threePointsMenuAssociatedHospitalization);
        scrollToElementMove(threePointsMenuAssociatedHospitalization);
        click(threePointsMenuAssociatedHospitalization);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickLinkOptionInAssociatedHospitalizationMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionLinkHospitalization);
        click(optionLinkHospitalization);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteOptionInAssociatedHospitalizationMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionDeleteHospitalization);
        click(optionDeleteHospitalization);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickThreePointsMenuInAssociatedAccess() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(threePointsMenuAssociatedAccess);
        scrollToElementMove(threePointsMenuAssociatedAccess);
        click(threePointsMenuAssociatedAccess);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickLinkOptionInAssociatedAccessMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionLinkAccess);
        click(optionLinkAccess);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteOptionInAssociatedAccessMenu() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(optionDeleteAccess);
        click(optionDeleteAccess);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void enterCultureDateInCultureForm(String cultureDate) throws InterruptedException {
        enterDateInForm(inputCultureDate, cultureDate);
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

    public void enterInterventionDateInInterventionForm(String interventionDate) throws InterruptedException {
        enterDateInForm(inputInterventionDate, interventionDate);
    }

    public void selectTypeOfInterventionInInterventionForm(String typeOfIntervention) throws InterruptedException {
        selectComboInInfectionForm(dropDownTypeOfIntervention, typeOfIntervention);
    }

    public void selectResultInInterventionForm(String result) throws InterruptedException {
        selectComboInInfectionForm(dropDownResultIntervention, result);
    }

    public boolean isSaveOptionInInterventionsMenuNotDisplayed() {
        driver.switchTo().frame("frmContenido");
        boolean isNotDisplayed = driver.findElements(By.xpath(OPTION_SAVE_INTERVENTION_XPATH)).isEmpty();
        driver.switchTo().parentFrame();
        return isNotDisplayed;
    }

    public boolean isInterventionDateValidationDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(dateValidationIntervention);
        boolean isDisplayed = dateValidationIntervention.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void selectFirstMedicationInAssignMedicationModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(modalAssignMedication);
        waitElements(dropDownAssignMedication);
        scrollToElementMove(dropDownAssignMedication);
        click(dropDownAssignMedication);
        pause(500);
        click(buttonDropDownAssignMedication);
        pause(500);
        click(inputAssignMedication);
        pause(500);
        clickBelowElementByOffset(inputAssignMedication, 35);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickAddButtonInAssignMedicationModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonAddAssignMedication);
        click(buttonAddAssignMedication);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelButtonInAssignMedicationModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelAssignMedication);
        click(buttonCancelAssignMedication);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void selectFirstHospitalizationInAssignHospitalizationModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(modalAssignHospitalization);
        waitElements(dropDownAssignHospitalization);
        scrollToElementMove(dropDownAssignHospitalization);
        click(dropDownAssignHospitalization);
        pause(500);
        click(buttonDropDownAssignHospitalization);
        pause(500);
        click(inputAssignHospitalization);
        pause(500);
        clickBelowElementByOffset(inputAssignHospitalization, 35);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickAddButtonInAssignHospitalizationModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonAddAssignHospitalization);
        click(buttonAddAssignHospitalization);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelButtonInAssignHospitalizationModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelAssignHospitalization);
        click(buttonCancelAssignHospitalization);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void selectFirstAccessInAssignAccessModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(modalAssignAccess);
        waitElements(dropDownAssignAccess);
        scrollToElementMove(dropDownAssignAccess);
        click(dropDownAssignAccess);
        pause(500);
        click(buttonDropDownAssignAccess);
        pause(500);
        click(inputAssignAccess);
        pause(500);
        clickBelowElementByOffset(inputAssignAccess, 35);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickAddButtonInAssignAccessModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonAddAssignAccess);
        click(buttonAddAssignAccess);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelButtonInAssignAccessModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelAssignAccess);
        click(buttonCancelAssignAccess);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void selectSignsSymptomsInAssignSignsSymptomsModal(String signsSymptoms) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(modalAssignSignsSymptoms);
        waitElements(dropDownAssignSignsSymptoms);
        selectKendoDropdownOption(dropDownAssignSignsSymptoms, signsSymptoms);
        driver.switchTo().parentFrame();
    }

    public void clickAddButtonInAssignSignsSymptomsModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonAddAssignSignsSymptoms);
        click(buttonAddAssignSignsSymptoms);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickCancelButtonInAssignSignsSymptomsModal() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelAssignSignsSymptoms);
        click(buttonCancelAssignSignsSymptoms);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteSignsSymptomsInInfectionForm(String signsSymptoms) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        String signsSymptomsDeleteButtonXpath = PRESENTING_SIGNS_SYMPTOMS_LABEL_XPATH +
                "/following::*[contains(normalize-space(.),'" + signsSymptoms + "')][1]" +
                "//*[contains(@class,'fa-times') or contains(@class,'k-i-x') or contains(@class,'close')" +
                " or self::button or self::a][1]";
        WebElement buttonDeleteSignsSymptoms = driver.findElement(By.xpath(signsSymptomsDeleteButtonXpath));
        waitElements(buttonDeleteSignsSymptoms);
        scrollToElementMove(buttonDeleteSignsSymptoms);
        click(buttonDeleteSignsSymptoms);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickPageInCulturesPagination(String page) throws InterruptedException {
        clickPageInPanelPagination(culturesPanel, CULTURES_PANEL, page);
    }

    public void clickPageInInterventionsPagination(String page) throws InterruptedException {
        clickPageInPanelPagination(interventionsPanel, INTERVENTIONS_PANEL, page);
    }

    public void clickDeleteCultureIconInEditAll() throws InterruptedException {
        clickDeleteIconInEditAll(culturesPanel, CULTURES_PANEL);
    }

    public void clickDeleteInterventionIconInEditAll() throws InterruptedException {
        clickDeleteIconInEditAll(interventionsPanel, INTERVENTIONS_PANEL);
    }

    public boolean isCulturesPanelEmpty() {
        return isPanelEmpty(CULTURES_PANEL);
    }

    public boolean isInterventionsPanelEmpty() {
        return isPanelEmpty(INTERVENTIONS_PANEL);
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

    private void enterDateInForm(WebElement inputDate, String date) throws InterruptedException {
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

    private void scrollToPanelTitle(String panelXpath) throws InterruptedException {
        WebElement panel = driver.findElement(By.xpath(panelXpath));
        WebElement panelTitle = panel.findElement(By.xpath(".//h2[1]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block: 'start', inline: 'nearest'});", panelTitle);
        javascriptExecutor.executeScript("window.scrollBy(0, -80);");
        javascriptExecutor.executeScript(
                "const panel = arguments[0];" +
                        "if (window.jQuery && jQuery.fn && jQuery.fn.mCustomScrollbar) {" +
                        "  jQuery(panel).find('.mCustomScrollbar').mCustomScrollbar('scrollTo', 'top', {scrollInertia: 0, timeout: 0});" +
                        "}" +
                        "panel.querySelectorAll('.mCustomScrollBox').forEach(el => el.scrollTop = 0);" +
                        "panel.querySelectorAll('.mCSB_container').forEach(el => {" +
                        "  el.style.top = '0px';" +
                        "  el.style.transform = 'translate3d(0px, 0px, 0px)';" +
                        "});" +
                        "panel.querySelectorAll('.mCSB_dragger').forEach(el => el.style.top = '0px');",
                panel);
        pause(300);
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

    private void clickPageInPanelPagination(WebElement panel, String panelXpath, String page) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(panel);
        scrollToElementMove(panel);
        WebElement pageButton = driver.findElement(By.xpath(panelXpath +
                "//div[contains(@class,'versiaUXPagination')]" +
                "//button[normalize-space(.)='" + page + "']"));
        waitElements(pageButton);
        click(pageButton);
        pause(700);
        scrollToPanelTitle(panelXpath);
        driver.switchTo().parentFrame();
    }

    private void clickDeleteIconInEditAll(WebElement panel, String panelXpath) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(panel);
        scrollToElementMove(panel);
        WebElement deleteIcon = driver.findElement(By.xpath(panelXpath +
                "//div[contains(@class,'unlink-zone')]" +
                "//a[@title='Delete' or .//i[contains(@class,'fa-trash')]][1]"));
        waitElements(deleteIcon);
        click(deleteIcon);
        pause(700);
        driver.switchTo().parentFrame();
    }

    private boolean isPanelEmpty(String panelXpath) {
        driver.switchTo().frame("frmContenido");
        boolean isEmpty = !driver.findElements(By.xpath(panelXpath +
                "//div[contains(@class,'empty-panel') and not(contains(@class,'ng-hide'))]")).isEmpty();
        driver.switchTo().parentFrame();
        return isEmpty;
    }

}