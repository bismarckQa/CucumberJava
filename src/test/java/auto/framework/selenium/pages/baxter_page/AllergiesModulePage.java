package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class AllergiesModulePage extends BasePage<AllergiesModulePage>{

    private static final String ALLERGIES_PANEL = "//div[contains(@id,'seccionAlergias')]";


    @FindBy(how = How.XPATH, using = "//*[@id=\"seccionAlergias\"]/div[3]/div/div[1]/div[1]/h2")
    private WebElement titleAllergies;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-three-points')]")
    private  WebElement MenuButtonNewAllergies;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'New allergy')]")
    private WebElement ButtonNewAllergy;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Filter')]")
    private WebElement buttonFilter;


    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[1]")
    private WebElement DropDownTypeAllergy;

    @FindBy(how = How.XPATH, using = "//li[@tabindex='-1'][contains(.,'Medicamento')]")
    private WebElement SelectTheTypeOption;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div[3]/div/div[1]/ul/li/ng-form/div/div/div[1]/div[1]/div[1]/div/span/span[1]/span")
    private WebElement SelectTheTypeOptionMedi;


    @FindBy(how = How.XPATH, using = "(//li[contains(.,'Otras')])[3]")
    private WebElement SelectOtrasTypeOption;



    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[3]")
    private WebElement  DropDownSeverityAllergy;

    @FindBy(how = How.XPATH, using = "(//li[contains(.,'Grave')])[2]")
    private WebElement SelectTheSeverityOption;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div[3]/div/div[1]/ul/li/ng-form/div/div/div[3]/div/span/span[1]/span")
    private WebElement SelectTheSeverityOption2;


    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[4]")
    private WebElement DropDownReaction;

    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Prueba Activo')])[2]")
    private WebElement SelectReactionOption;

    @FindBy(how = How.XPATH, using = "//ng-form/div/div/div[4]//span[1]")
    private WebElement SelectReactionOption2;



    @FindBy(how = How.XPATH, using = "//*[@id=\"alergias\"]/li/ng-form/div/div/div[1]/div[1]/div[2]/div/selector-alergias/span")
    private WebElement DropDownAllergy;

    @FindBy(how = How.XPATH, using = "(//li[contains(@role,'option')])[42]")
    private WebElement SelectAllergyOption;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div[3]/div/div[1]/ul/li/ng-form/div/div/div[1]/div[1]/div[2]/div/selector-alergias/span/span[1]/span")
    private WebElement SelectAllergyOption2;



    @FindBy(how = How.XPATH, using = "/html/body")
    private WebElement TextAreaObservations;

    @FindBy(how = How.CSS, using = "iframe.k-content")
    private WebElement iframeObservations;


    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-undo')]")
    private WebElement CancelButtonAllergy;


    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-save')]")
    private WebElement SaveButtonAllergy;

    @FindBy(how = How.XPATH, using = "//h2[@translate-once='Alergias_Label_Alergias'][contains(.,'Allergies')]")
    private WebElement titlePageAllergiesAdded;



    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-trash')]")
    private WebElement DeleteButtonAllergy;

    @FindBy(how = How.XPATH, using = "//span[contains(@id,'genericModalWin_wnd_title')]")
    private WebElement TitleModalDeleteAllergy;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/button[1]")
    private WebElement AcceptDeleteButtonAllergy;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[2]/div/button[2]")
    private WebElement CancelDeleteButtonAllergy;

    @FindBy(how = How.XPATH, using = "//p[@ng-if='modal.configuration.messages.msg'][contains(.,'The allergy has been successfully eliminated')]")
    private WebElement mesaggeAllergyHasEliminated;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary ng-scope'][contains(.,'OK')]")
    private WebElement buttonOkDeleteAllergy;



    @FindBy(how = How.XPATH, using = "(//label[@ng-show='alergia.edicion === true'])[1]")
    private WebElement buttonYesActiveAllergy;

    @FindBy(how = How.XPATH, using = "(//label[contains(@ng-model,'alergia.activa')])[2]")
    private WebElement buttonNoActiveAllergy;

    @FindBy(how = How.XPATH, using = "//b[@class='orange'][contains(.,'Filters selected:')]")
    private WebElement textFilterSelectedActive;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-close']")
    private WebElement buttonCloseWindowsFilterAllergies;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Active')]")
    private WebElement selectRadioActiveWindowsFilterAllergies;

    @FindBy(how = How.XPATH, using = "//label[@class='radio-text'][contains(.,'Inactive')]")
    private WebElement selectRadioInactiveWindowsFilterAllergies;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-pencil')]")
    private WebElement buttonEditAllergy;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/div[3]/div/div[1]/div[3]/div/span[1]")
    private WebElement noDataAllergyTitle;



    @FindBy(how = How.XPATH, using = "//label[@ng-show='ac.alergiaMan.edicion === false'][contains(.,'Yes')]")
    private WebElement buttonYesNoKnownAllergies;
    @FindBy(how = How.XPATH, using = "(//label[contains(.,'No')])[2]")
    private WebElement buttonNoNoKnownAllergies;

    @FindBy(how = How.XPATH, using = "//p[@ng-if='modal.configuration.messages.msg']")
    private WebElement messageConfirmKnownAllergies ;

    @FindBy(how = How.XPATH, using = "//p[@ng-if='modal.configuration.messages.msg']")
    private WebElement messageConfirmUncheckKnownAllergies ;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'No')]")
    private WebElement buttonNoConfirmKnownAllergies ;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Yes')]")
    private WebElement buttonYesConfirmKnownAllergies ;



    @FindBy(how = How.XPATH, using = "//span[contains(.,'Patient has no known allergies')]")
    private WebElement messageConfirmPatientHasNoKnownAllergies ;

    @FindBy(how = How.XPATH, using = "//p[contains(.,'Are you sure you want to mark that the patient may have some kind of allergy?')]")
    private WebElement messageConfirmIfUncheckedPatientHasNoKnownAllergies ;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'No data')]")
    private WebElement messageNoData ;







    public void isDisplayedTheTittle() throws InterruptedException {
        withinAllergiesFrame(() -> {
            waitElements(titleAllergies);
            titleAllergies.isDisplayed();
        });
    }


    @Override
    public boolean isAt() {
        return false;
    }



    //*********Page Methods*********




    public void openMenuNewAllergies() throws InterruptedException {
        withinAllergiesFrame(() -> {
            click(By.xpath(ALLERGIES_PANEL + "//div[contains(@class,'x_title')]//a[contains(@class,'dropdown-toggle')][.//i[contains(@class,'icon-three-points')]]"));
            click(By.xpath("//ul[contains(@class,'dropdown-menu') and not(contains(@style,'display: none'))]//*[self::a or self::span][normalize-space(.)='New allergy']"));
        });
        pause(5000);
    }

    public void enterAllergyData(String observation) throws InterruptedException {
        withinAllergiesFrame(() -> {
            selectAllergyType("Medicamento");
            selectAllergyName("Abacavir");
            selectAllergySeverity("Grave");
            selectAllergyReaction("Prueba Activo");
            enterAllergyIdentificationDate("07/24/2026");
            selectAllergyActiveState("Yes");
            enterAllergyObservations(observation);
        });
        pause(3000);
    }

    public void selectAllergyType(String type) throws InterruptedException {
        withinAllergiesFrame(() -> selectKendoDropdownOption(findDropdownByLabel("Type"), type));
    }

    public void selectAllergyName(String allergy) throws InterruptedException {
        withinAllergiesFrame(() -> selectKendoDropdownOption(findAllergyDropdown(), allergy));
    }

    public void selectAllergySeverity(String severity) throws InterruptedException {
        withinAllergiesFrame(() -> selectKendoDropdownOption(findDropdownByLabel("Severity"), severity));
    }

    public void selectAllergyReaction(String reaction) throws InterruptedException {
        withinAllergiesFrame(() -> selectKendoDropdownOption(findDropdownByLabel("Reaction"), reaction));
    }

    public void enterAllergyIdentificationDate(String date) throws InterruptedException {
        withinAllergiesFrame(() -> setIdentificationDate(date));
    }

    public void selectAllergyActiveState(String state) throws InterruptedException {
        withinAllergiesFrame(() -> clickActiveState(state));
    }

    public void enterAllergyObservations(String observation) throws InterruptedException {
        withinAllergiesFrame(() -> writeObservation(observation));
    }

    public void clickEditAllergyButton() throws InterruptedException {
        withinAllergiesFrame(() -> {
            click(buttonEditAllergy);
            pause(500);
            waitElements(titlePageAllergiesAdded);
            titlePageAllergiesAdded.isDisplayed();
        });
    }

    public void clickDeleteAllergyButton() throws InterruptedException {
        withinAllergiesFrame(() -> click(DeleteButtonAllergy));
        pause(500);
        waitElements(TitleModalDeleteAllergy);
        TitleModalDeleteAllergy.isDisplayed();
    }

    public void confirmDeleteAllergyModal() throws InterruptedException {
        click(AcceptDeleteButtonAllergy);
        waitElements(mesaggeAllergyHasEliminated);
        mesaggeAllergyHasEliminated.isDisplayed();
        click(buttonOkDeleteAllergy);
    }

    public void cancelDeleteAllergyModal() throws InterruptedException {
        click(CancelDeleteButtonAllergy);
        pause(500);
    }

    public void cancelAllergyEdition() throws InterruptedException {
        withinAllergiesFrame(() -> click(CancelButtonAllergy));
    }

    public void saveAllergyEdition() throws InterruptedException {
        withinAllergiesFrame(() -> click(SaveButtonAllergy));
    }

    public void canceledCreateNewAllergy() throws InterruptedException {
        withinAllergiesFrame(() -> click(CancelButtonAllergy));
        pause(5000);
    }

    public void successCreateNewAllergy() throws InterruptedException {
        withinAllergiesFrame(() -> click(SaveButtonAllergy));
        pause(500);

    }

    public void checkNewAllergyCreated() throws InterruptedException {
        withinAllergiesFrame(() -> {
            waitElements(titlePageAllergiesAdded);
            titlePageAllergiesAdded.isDisplayed();
        });
        pause(10000);

    }

    public void deleteAllergy() throws InterruptedException {
        clickDeleteAllergyButton();
        confirmDeleteAllergyModal();
        withinAllergiesFrame(() -> {
            pause(500);
            noDataAllergyTitle.isDisplayed();
        });
    }


    public void cancelingCheckNoKnownAllergies() throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        pause(500);
        click(buttonYesNoKnownAllergies);
        driver.switchTo().parentFrame();
        pause(400);
        waitElements(messageConfirmKnownAllergies);
        messageConfirmKnownAllergies.isDisplayed();
        click(buttonNoConfirmKnownAllergies);
        pause(500);
    }

    public void checkedSuccessfulNoKnownAllergies() throws InterruptedException{
        withinAllergiesFrame(() -> {
            pause(500);
            click(buttonYesNoKnownAllergies);
        });
        pause(400);
        waitElements(messageConfirmKnownAllergies);
        messageConfirmKnownAllergies.isDisplayed();
        click(buttonYesConfirmKnownAllergies);
        pause(500);
    }

    public void verifiedSuccessfullyNoKnownAllergies() throws InterruptedException{
        withinAllergiesFrame(() -> {
            pause(500);
            waitElements(messageConfirmPatientHasNoKnownAllergies);
            isDisplayed(messageConfirmPatientHasNoKnownAllergies);
        });
    }
    public void uncheckedNoKnownAllergies() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonNoNoKnownAllergies);
        driver.switchTo().parentFrame();

        pause(500);
        waitElements(messageConfirmIfUncheckedPatientHasNoKnownAllergies);
        isDisplayed(messageConfirmIfUncheckedPatientHasNoKnownAllergies);
        click(buttonYesConfirmKnownAllergies);
        pause(500);

        driver.switchTo().frame("frmContenido");
        waitElements(messageNoData);
        isDisplayed(messageNoData);
        driver.switchTo().parentFrame();



    }

    private void withinAllergiesFrame(FrameAction action) throws InterruptedException {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frmContenido");
        try {
            action.run();
        } finally {
            driver.switchTo().defaultContent();
        }
    }

    private WebElement findDropdownByLabel(String label) {
        String xpath = "//label[normalize-space(.)='" + label + "']/ancestor::div[contains(@class,'row') or contains(@class,'col-md')][1]" +
                "//span[contains(@class,'k-picker') or contains(@class,'k-dropdownlist') or contains(@class,'k-combobox')][1]";
        return driver.findElement(By.xpath(xpath));
    }

    private WebElement findAllergyDropdown() {
        return driver.findElement(By.xpath("//label[normalize-space(.)='Allergy']/ancestor::div[contains(@class,'row') or contains(@class,'col-md')][1]//selector-alergias//*[contains(@class,'k-dropdownlist')][1]"));
    }

    private void writeObservation(String observation) throws InterruptedException {
        WebElement editorFrame = driver.findElement(By.cssSelector("iframe.k-content"));
        driver.switchTo().frame(editorFrame);
        write(TextAreaObservations, observation);
        driver.switchTo().parentFrame();
    }

    private void setIdentificationDate(String date) {
        WebElement input = driver.findElement(By.xpath(
                "//label[normalize-space(.)='Identification date']/ancestor::div[contains(@class,'form-group')][1]" +
                        "//input[@data-role='datepicker' and not(@type='hidden')]"));
        click(input);
        input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input.sendKeys(Keys.DELETE);
        input.sendKeys(date);
        input.sendKeys(Keys.TAB);
    }

    private void clickActiveState(String state) {
        String normalizedState = state == null ? "" : state.trim();
        WebElement button = driver.findElement(By.xpath(
                "//label[normalize-space(.)='Active']/ancestor::div[contains(@class,'form-group')][1]" +
                        "//label[contains(@class,'btn-switch')][normalize-space(.)='" + normalizedState + "']"));
        click(button);
    }

    @FunctionalInterface
    private interface FrameAction {
        void run() throws InterruptedException;
    }

}