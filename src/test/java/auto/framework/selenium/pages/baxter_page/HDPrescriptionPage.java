package auto.framework.selenium.pages.baxter_page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;


@LazyComponent
public class HDPrescriptionPage extends BasePage<HDPrescriptionPage>{

    // Title and navigation
    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Prescription')]")
    private WebElement titleHDPrescription;

    @FindBy(how = How.XPATH, using = "//menu-individual[contains(@class,'menuIndAbsolute')]//i[contains(@class,'icon-three-points')]")
    private WebElement buttonThreePointsPrescription;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='PrescripcionHD_Label_Nueva_Prescripción']/..")
    private WebElement buttonNewPrescription;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Title_Guardar']/..")
    private WebElement buttonSavePrescription;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Title_Cancelar']/..")
    private WebElement buttonCancelPrescription;

    @FindBy(how = How.XPATH, using = "//span[@translate-once='Title_Eliminar']/..")
    private WebElement buttonDeletePrescription;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Prescription history']")
    private WebElement buttonPrescriptionHistory;

    // Prescribed by
    @FindBy(how = How.XPATH, using = "//label[@translate-once='PrescripcionHD_Label_Prescrito_Por']")
    private WebElement fieldPrescribedBy;

    // Access Data
    @FindBy(how = How.XPATH, using = "//label[@translate-once='PrescripcionHD_Label_Aguja_arterial']/following-sibling::*[self::span[contains(@class,'k-dropdownlist')] or self::div]//select")
    private WebElement dropDownArterialNeedle;

    @FindBy(how = How.XPATH, using = "//label[@translate-once='PrescripcionHD_Label_Aguja_venosa']/following-sibling::*[self::span[contains(@class,'k-dropdownlist')] or self::div]//select")
    private WebElement dropDownVenousNeedle;

    @FindBy(how = How.XPATH, using = "//label[@translate-once='ControlPrescripcionHD_Label_Acceso']/following-sibling::*//select[contains(@k-ng-model,'accesoId')]")
    private WebElement dropDownAccess;

    @FindBy(how = How.XPATH, using = "//label[@translate-once='PrescripcionHD_Label_Sellado_Cateter']/following-sibling::*//select[contains(@k-ng-model,'selladoCateterId')]")
    private WebElement dropDownSealedCatheter;

    // Fluids
    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.conductividad')]")
    private WebElement inputConductNa;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.bicarbonato')]")
    private WebElement inputConductBicarb;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.temperatura')]")
    private WebElement inputTemperature;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.flujoDializado')]")
    private WebElement inputDialysateFlow;

    // Anticoagulation
    @FindBy(how = How.XPATH, using = "//select[contains(@k-ng-model,'tipoAnticoagulacionId')]")
    private WebElement dropDownAnticoagulantType;

    @FindBy(how = How.XPATH, using = "//select[contains(@k-ng-model,'medicamentoAnticoagulacionId')]")
    private WebElement dropDownMedication;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.bolo')]")
    private WebElement inputBolus;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.velocidad')]")
    private WebElement inputContinuousInfusion;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.tiempoDesconexion')]")
    private WebElement inputDisconnectionTime;

    @FindBy(how = How.XPATH, using = "//select[contains(@k-ng-model,'tipoSueroId')]")
    private WebElement dropDownSerumType;

    // Treatment characteristics
    @FindBy(how = How.XPATH, using = "//select[contains(@k-ng-model,'tipoTerEspId')]")
    private WebElement dropDownTypeOfTreatment;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.ratio')]")
    private WebElement inputRatio;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.talla')]")
    private WebElement inputHeight;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.vHemocontrol')]")
    private WebElement inputDistributionVol;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.coefMaxUF')]")
    private WebElement inputMaxInitialUF;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.volumenPerfusion')]")
    private WebElement inputPerfusionVol;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.kConstante')]")
    private WebElement inputKConstant;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.kEntrada')]")
    private WebElement inputKInput;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.kSalida')]")
    private WebElement inputKOutput;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.kEquivalente')]")
    private WebElement inputKEquivalent;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.terEspVolInf')]")
    private WebElement inputInfusionVol;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.ptm')]")
    private WebElement inputPTM;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.terEspVolAguja')]")
    private WebElement inputNeedleVol;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.terEspRelBomb')]")
    private WebElement inputAVPumpRatio;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.terEspTidal')]")
    private WebElement inputTidal;

    // Adequacy
    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.flujoSanguineo')]")
    private WebElement inputBloodFlowRate;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.tratamientoSemana')]")
    private WebElement inputTxPerWeek;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.ktv')]")
    private WebElement inputKtVGoal;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.kt')]")
    private WebElement inputKtTarget;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.pesoSeco')]")
    private WebElement inputDryWeight;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.uf')]")
    private WebElement inputMaximumUF;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.ratioUF')]")
    private WebElement inputMaximumUFRate;

    @FindBy(how = How.XPATH, using = "//input[contains(@ng-model,'.frr')]")
    private WebElement inputRRF;

    @FindBy(how = How.XPATH, using = "//select[contains(@k-ng-model,'dializadorId')]")
    private WebElement dropDownDialyzer;

    // Special Orders

    @FindBy(how = How.XPATH, using = "(//div[contains(.,'- The prescription cannot be dellted because it already has associated treatment records.')])[5]")
    private WebElement modalWarningPrescription;



    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-bell']")
    private WebElement buttonBellNotification;

    @FindBy(how = How.XPATH, using = "//b[contains(.,'Ape1_1838 Ape2_1838, Nom_1838 - 1838')]")
    private WebElement optionBellNotificationUser;

    @FindBy(how = How.XPATH, using = "//span[@class='fa fa-angle-down']")
    private WebElement buttonDropDownProfile;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Configuration')]")
    private WebElement optionConfigurationMenu;

    @FindBy(how = How.XPATH, using = "//span[@class='rpText'][contains(.,'Notificaciones')]")
    private WebElement optionNotificationSideBar;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/nts-main/div[2]/div/div/div[1]/versia-ui-basic-operations-menu/versia-ui-three-points-menu/ul/li/a/fa-icon")
    private WebElement buttonThreePointsNotification;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Edit')]")
    private WebElement optionEditNotification;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'New patient')]")
    private WebElement titleNewPatientNotification;

    @FindBy(how = How.XPATH, using = "(//input[@size='1'])[1]")
    private WebElement inputNewPrescription;

    @FindBy(how = How.XPATH, using = "(//input[@size='1'])[2]")
    private WebElement inputInventory;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'SuperUsuario')]")
    private WebElement optionInputNewPrescription;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'SuperUsuario')]")
    private WebElement optionInputInventory;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'New prescription')]")
    private WebElement titleContainNewPrescription;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Save')]")
    private WebElement buttonSaveNotificationProfile;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/nts-main/div[2]/div/div/div[2]/div[1]/div/div/versia-profile-selector/versia-kendo-multiselect/kendo-multiselect/span")
    private WebElement clearInputNewPrescription;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/nts-main/div[2]/div/div/div[2]/div[2]/div/div/versia-profile-selector/versia-kendo-multiselect/kendo-multiselect/span")
    private WebElement clearInputInventory;

    @FindBy(how = How.XPATH, using = "(//a[contains(.,'Go to notification center')])[1]")
    private WebElement optionBellNotificationCenter;

    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Heparina')])[3]")
    private WebElement optionHeparinaSealedCatheter ;

    // Legacy WebElements for existing methods
    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[1]")
    private WebElement dropDownAccessData;

    @FindBy(how = How.XPATH, using = "//span[@class='k-list-item-text'][contains(.,'Catéter percutáneo yugular (Muñeca izquierda) - 9/3/2024')]")
    private WebElement optionOfAccessData;

    @FindBy(how = How.XPATH, using = "//span[@class='k-list-item-text'][contains(.,'Prueba1')]")
    private WebElement optionTypeOfTreatmentPrueba1;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[5]")
    private WebElement dropDownAcidBath1;

    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Ca=2,25')])[1]")
    private WebElement optionAcidBath1Ca25;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Heparina sódica')]")
    private WebElement optionAnticoagulantType;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[10]")
    private WebElement dropDownDialyser;

    @FindBy(how = How.XPATH, using = "//li[@tabindex='-1'][contains(.,'APS 1.5')]")
    private WebElement optionDialyser;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[13]")
    private WebElement inputUfGoal;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[14]")
    private WebElement inputUfRatio;

    @FindBy(how = How.XPATH, using = "//button[@translate-once='Prescripcion_Label_Agregar_Orden']")
    private WebElement buttonAddSpecialOrder;
    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleHDPrescription);
        titleHDPrescription.isDisplayed();

        driver.switchTo().parentFrame();
    }

    public void checkTheInformationThatInTheFieldPrescribeBy() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePointsPrescription);
        pause(200);
        buttonNewPrescription.click();
        waitElements(fieldPrescribedBy);
        fieldPrescribedBy.isDisplayed();
        driver.switchTo().parentFrame();

    }

    // ---- Special Order granular methods ----

    public void clickAddSpecialOrder() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        moveScrollToElement(buttonAddSpecialOrder);
        waitElements(buttonAddSpecialOrder);
        pause(200);
        buttonAddSpecialOrder.click();
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickEditSpecialOrder() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        WebElement edit = driver.findElement(By.xpath("(//a[@title='Edit']//i[contains(@class,'fa-pencil')])[1]"));
        moveScrollToElement(edit);
        click(edit);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickDeleteSpecialOrder() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(300);
        WebElement delete = driver.findElement(By.xpath("(//a[@title='Delete']//i[contains(@class,'fa-trash')])[1]"));
        moveScrollToElement(delete);
        click(delete);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickPrescriptionHistory() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(buttonPrescriptionHistory);
        pause(500);
        click(buttonPrescriptionHistory);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectPrescriptionHistoryDate(String date) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        WebElement presc = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("(//table[contains(@class,'historico-table')]//a[contains(@ng-bind,'fechaCreacion') and contains(normalize-space(.),'" + date.trim() + "')])[1]")));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center', inline:'center'});", presc);
        pause(500);
        clickJS(presc);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    // ---- Delete HD Prescription modal (generic Modal_Button_OK/Cancelar) ----

    public void enterPasswordInDeletePrescriptionModal(String password) throws InterruptedException {
        driver.switchTo().parentFrame();
        WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
        click(pwd);
        pwd.sendKeys(Keys.CONTROL + "a");
        pwd.sendKeys(Keys.DELETE);
        write(pwd, password);
        pause(300);
    }

    public void enterReasonInDeletePrescriptionModal(String reason) throws InterruptedException {
        WebElement reasonInput = driver.findElement(By.xpath("(//input[@ng-model='modal.items.delete.motivo'])[1]"));
        click(reasonInput);
        reasonInput.sendKeys(Keys.CONTROL + "a");
        reasonInput.sendKeys(Keys.DELETE);
        write(reasonInput, reason);
        pause(300);
    }

    public void clickOkInDeletePrescriptionModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        WebElement ok = driver.findElement(By.xpath("//button[@translate-once='Modal_Button_OK']"));
        click(ok);
        pause(1500);
    }

    public void clickCancelInDeletePrescriptionModal() throws InterruptedException {
        driver.switchTo().parentFrame();
        WebElement cancel = driver.findElement(By.xpath("//button[@translate-once='Modal_Button_Cancelar']"));
        click(cancel);
        pause(500);
    }

    public void verifyDeletePrescriptionErrorIsDisplayed() {
        try { pause(1500); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//p[contains(@class,'errorMessage')] | //div[contains(@class,'errorMessage')]")).isEmpty();
        assert present : "Delete prescription error message should be displayed";
    }

    public void enterSpecialOrderDescription(String description) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@ng-model,'descripcionOrden')]"));
        click(textArea);
        textArea.sendKeys(Keys.CONTROL + "a");
        textArea.sendKeys(Keys.DELETE);
        write(textArea, description);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clearSpecialOrderDescription() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@ng-model,'descripcionOrden')]"));
        click(textArea);
        textArea.sendKeys(Keys.CONTROL + "a");
        textArea.sendKeys(Keys.DELETE);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterSpecialOrderStartDate(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        WebElement startDate = driver.findElement(By.xpath("//input[@k-ng-model='o.fechaInicio' and not(@disabled)]"));
        click(startDate);
        startDate.sendKeys(Keys.CONTROL + "a");
        startDate.sendKeys(Keys.DELETE);
        write(startDate, date);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void enterSpecialOrderEndDate(String date) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        WebElement endDate = driver.findElement(By.xpath("//input[@k-ng-model='o.fechaFin' and not(@disabled)]"));
        click(endDate);
        endDate.sendKeys(Keys.CONTROL + "a");
        endDate.sendKeys(Keys.DELETE);
        write(endDate, date);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickSaveSpecialOrder() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        WebElement save = driver.findElement(By.xpath("//a[@title='Save']//i[contains(@class,'fa-floppy-o')]"));
        click(save);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickCancelSpecialOrder() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        WebElement cancel = driver.findElement(By.xpath("//a[@title='Cancel']//i[contains(@class,'fa-times')]"));
        click(cancel);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void verifySaveSpecialOrderButtonIsNotDisplayed() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        pause(500);
        boolean present = !driver.findElements(By.xpath("//a[@title='Save']//i[contains(@class,'fa-floppy-o')]")).isEmpty();
        assert !present : "Save special order button should NOT be displayed when required fields are empty";
        driver.switchTo().parentFrame();
    }

    public void checkTheCurrentPrescriptionItIsInGreenAndTheClosedOnesAreInBlue() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonPrescriptionHistory);
        buttonPrescriptionHistory.isDisplayed();
        click(buttonPrescriptionHistory);
        pause(2000);
        click(buttonPrescriptionHistory);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void createANewSimplePrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonThreePointsPrescription);
        pause(200);
        waitElements(buttonNewPrescription);
        buttonNewPrescription.click();
        pause(200);
        waitElements(buttonThreePointsPrescription);
        buttonThreePointsPrescription.click();
        buttonSavePrescription.click();
        pause(200);

        driver.switchTo().parentFrame();
    }
    public void checkTheBellSymbolAndItsValueIncreasesByOne() throws InterruptedException{
        pause(500);
        waitElements(buttonBellNotification);
        buttonBellNotification.click();
        pause(200);
        optionBellNotificationUser.isDisplayed();
        click(optionBellNotificationUser);

    }
    public void checkTheBellSymbolAndItsValueDoesNotIncreaseByOne() throws InterruptedException{
        pause(500);
        waitElements(buttonBellNotification);
        buttonBellNotification.click();
        pause(200);
        if (optionBellNotificationCenter.isDisplayed()){
            click(optionBellNotificationCenter);
            System.out.println("Notification is not generate");
        }else {
            pause(200);
            optionBellNotificationUser.isDisplayed();
            click(optionBellNotificationUser);
        }

    }
    public void configureTheNotificationProfileToGenerateItWithNewHDPrescription() throws InterruptedException{
        pause(300);
        waitElements(buttonDropDownProfile);
        click(buttonDropDownProfile);
        pause(200);
        optionConfigurationMenu.isDisplayed();
        click(optionConfigurationMenu);
        driver.switchTo().frame("frmContenido");
        pause(5000);
        waitElements(optionNotificationSideBar);
        optionNotificationSideBar.isDisplayed();
        click(optionNotificationSideBar);


        driver.switchTo().parentFrame();
        pause(200);
        buttonArrowUp.click();
        pause(200);
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        waitElements(buttonThreePointsNotification);
        click(buttonThreePointsNotification);
        pause(300);
        click(optionEditNotification);
        waitElements(inputNewPrescription);
        click(inputNewPrescription);
        pause(200);
        optionInputNewPrescription.click();
        pause(200);
        click(titleContainNewPrescription);
        waitElements(inputInventory);
        inputInventory.click();
        waitElements(optionInputInventory);
        optionInputInventory.click();
        pause(200);
        waitElements(buttonThreePointsNotification);
        click(buttonThreePointsNotification);
        pause(300);
        waitElements(buttonSaveNotificationProfile);
        click(buttonSaveNotificationProfile);
        pause(4000);


        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void cleanTheNotificationProfileSettingsToGenerateItWithANewHDPrescription() throws InterruptedException{
        pause(300);
        waitElements(buttonDropDownProfile);
        click(buttonDropDownProfile);
        pause(200);
        optionConfigurationMenu.isDisplayed();
        click(optionConfigurationMenu);
        driver.switchTo().frame("frmContenido");
        pause(5000);
        waitElements(optionNotificationSideBar);
        optionNotificationSideBar.isDisplayed();
        click(optionNotificationSideBar);


        driver.switchTo().parentFrame();
        pause(200);
        buttonArrowUp.click();
        pause(200);
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(400);
        waitElements(buttonThreePointsNotification);
        click(buttonThreePointsNotification);
        pause(300);
        click(optionEditNotification);
        pause(200);
        waitElements(clearInputNewPrescription);
        click(clearInputNewPrescription);
        pause(200);
        waitElements(clearInputInventory);
        click(clearInputInventory);
        pause(200);
        waitElements(buttonThreePointsNotification);
        click(buttonThreePointsNotification);
        pause(300);
        waitElements(buttonSaveNotificationProfile);
        click(buttonSaveNotificationProfile);

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        pause(300);
    }

    public void createANewModifiedSimplePrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonThreePointsPrescription);
        pause(200);
        waitElements(buttonNewPrescription);
        buttonNewPrescription.click();
        pause(200);
        waitElements(dropDownSealedCatheter);
        click(dropDownSealedCatheter);
        pause(300);
        click(optionHeparinaSealedCatheter);
        pause(300);
        driver.switchTo().parentFrame();

        waitElements(buttonArrowUp);
        click(buttonArrowUp);

        driver.switchTo().frame("frmContenido");
        waitElements(buttonThreePointsPrescription);
        buttonThreePointsPrescription.click();
        buttonSavePrescription.click();
        pause(200);

        driver.switchTo().parentFrame();
    }


    // ===================== GRANULAR METHODS =====================

    // Navigation
    public void clickNewPrescription() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(buttonThreePointsPrescription);
        pause(500);
        click(buttonNewPrescription);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void selectMonitor(String monitor) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        String boxId = "box-ak98";
        if ("OTROS".equalsIgnoreCase(monitor) || "OTHERS".equalsIgnoreCase(monitor)) {
            boxId = "box-otras";
        } else if ("ARTIS".equalsIgnoreCase(monitor)) {
            boxId = "box-artis";
        }
        WebElement monitorBox = driver.findElement(By.xpath("//div[@id='" + boxId + "']"));
        clickJS(monitorBox);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void clickMenuOption(String option) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement menuOption = driver.findElement(By.xpath("//span[translate(normalize-space(.),'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz')='" + option.toLowerCase() + "']/.."));
        click(menuOption);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void clickThreePoints() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        click(buttonThreePointsPrescription);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void verifySeeComplicationLinkIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(1000); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//a[@translate-once='ControlPrescripcionHD_Label_Ver_problema__']")).isEmpty();
        assert present : "See complication link should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickSeeComplicationLink() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement link = driver.findElement(By.xpath("//a[@translate-once='ControlPrescripcionHD_Label_Ver_problema__']"));
        clickJS(link);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    public void verifyOtherInfectionsLinkIsDisplayed() {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        try { pause(1000); } catch (InterruptedException ignored) {}
        boolean present = !driver.findElements(By.xpath("//a[@translate-once='Infeccion_Label_Otras_infecciones']")).isEmpty();
        assert present : "Other infections link should be displayed";
        try { pause(500); } catch (InterruptedException ignored) {}
        driver.switchTo().parentFrame();
    }

    public void clickOtherInfectionsLink() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement link = driver.findElement(By.xpath("//a[@translate-once='Infeccion_Label_Otras_infecciones']"));
        clickJS(link);
        pause(3000);
        driver.switchTo().parentFrame();
    }

    // Treatment characteristics
    public void selectTypeOfTreatment(String type) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        pause(1000);
        WebElement comboBtn = driver.findElement(By.xpath("//div[@id='caractTratHD']//span[contains(@class,'k-combobox')]//button[@role='button']"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", comboBtn);
        pause(500);
        javascriptExecutor.executeScript("arguments[0].click();", comboBtn);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + type + "']"));
        javascriptExecutor.executeScript("arguments[0].click();", option);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void setHemocontrol(String state) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement toggle = driver.findElement(By.xpath("//input[@ng-model][contains(@ng-model,'.hemocontrol']"));
        boolean isOn = toggle.isSelected();
        if (("Yes".equalsIgnoreCase(state) && !isOn) || ("No".equalsIgnoreCase(state) && isOn)) {
            WebElement label = driver.findElement(By.xpath("//input[@ng-model][contains(@ng-model,'.hemocontrol']/following-sibling::div"));
            clickJS(label);
            pause(500);
        }
        driver.switchTo().parentFrame();
    }

    public void enterRatio(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputRatio, value);
        driver.switchTo().parentFrame();
    }

    public void enterHeight(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputHeight, value);
        driver.switchTo().parentFrame();
    }

    public void enterPerfusionVolume(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputPerfusionVol, value);
        driver.switchTo().parentFrame();
    }

    public void enterKConstant(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputKConstant, value);
        driver.switchTo().parentFrame();
    }

    public void enterKInput(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputKInput, value);
        driver.switchTo().parentFrame();
    }

    public void enterKOutput(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputKOutput, value);
        driver.switchTo().parentFrame();
    }

    public void enterKEquivalent(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputKEquivalent, value);
        driver.switchTo().parentFrame();
    }

    public void enterInfusionVolume(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputInfusionVol, value);
        driver.switchTo().parentFrame();
    }

    public void selectDilution(String dilution) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement radio = driver.findElement(By.xpath("//input[@name='iDilucion']/following-sibling::label[contains(@class,'radio-text') and normalize-space(.)='" + dilution + "']"));
        clickJS(radio);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void enterPTM(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputPTM, value);
        driver.switchTo().parentFrame();
    }

    public void enterNeedleVolume(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputNeedleVol, value);
        driver.switchTo().parentFrame();
    }

    public void enterAVPumpRatio(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputAVPumpRatio, value);
        driver.switchTo().parentFrame();
    }

    public void enterTidal(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputTidal, value);
        driver.switchTo().parentFrame();
    }

    // Anticoagulation
    public void selectAnticoagulantType(String type) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement ddSpan = driver.findElement(By.xpath("//div[contains(@class,'anticoagulacion-panel')]//span[contains(@class,'k-dropdownlist')][1]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", ddSpan);
        pause(500);
        click(ddSpan);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + type + "']"));
        javascriptExecutor.executeScript("arguments[0].click();", option);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void enterBolus(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputBolus, value);
        driver.switchTo().parentFrame();
    }

    public void enterContinuousInfusion(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputContinuousInfusion, value);
        driver.switchTo().parentFrame();
    }

    public void enterDisconnectionTime(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputDisconnectionTime, value);
        driver.switchTo().parentFrame();
    }

    // Adequacy
    public void enterBloodFlowRate(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputBloodFlowRate, value);
        driver.switchTo().parentFrame();
    }

    public void enterMaximumUF(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputMaximumUF, value);
        driver.switchTo().parentFrame();
    }

    public void enterMaximumUFRate(String value) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        writeInputField(inputMaximumUFRate, value);
        driver.switchTo().parentFrame();
    }

    public void selectDialyzer(String dialyzer) throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frmContenido");
        WebElement ddSpan = driver.findElement(By.xpath("//select[contains(@k-ng-model,'dializadorId')]/preceding-sibling::span[contains(@class,'k-dropdownlist')]"));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", ddSpan);
        pause(500);
        click(ddSpan);
        pause(1000);
        WebElement option = driver.findElement(By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]//*[self::li or @role='option'][normalize-space(.)='" + dialyzer + "']"));
        javascriptExecutor.executeScript("arguments[0].click();", option);
        pause(500);
        driver.switchTo().parentFrame();
    }

    // Helper method for writing to input fields
    private void writeInputField(WebElement input, String value) throws InterruptedException {
        scrollToElementMove(input);
        click(input);
        input.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        input.sendKeys(Keys.DELETE);
        write(input, value);
        pause(300);
    }

    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
