package auto.framework.selenium.pages.baxter_page;
import org.openqa.selenium.JavascriptExecutor;
import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class HDPrescriptionPage extends BasePage<HDPrescriptionPage>{


    @FindBy(how = How.XPATH, using = "//label[contains(text(),'Prescription')]")
    private WebElement titleHDPrescription;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-three-points')]")
    private WebElement buttonThreePointsPrescription;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'New prescription')]")
    private WebElement buttonNewPrescription;

    @FindBy(how = How.XPATH, using = "//label[@translate-once='PrescripcionHD_Label_Prescrito_Por'][contains(.,'Prescribed by')]")
    private WebElement fieldPrescribedBy;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[1]")
    private WebElement dropDownAccessData;

    @FindBy(how = How.XPATH, using = "//span[@class='k-list-item-text'][contains(.,'Catéter percutáneo yugular (Muñeca izquierda) - 9/3/2024')]")
    private WebElement optionOfAccessData;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[6]")
    private WebElement dropDownTypeOfTreatment;

    @FindBy(how = How.XPATH, using = "//span[@class='k-list-item-text'][contains(.,'Prueba1')]")
    private WebElement optionTypeOfTreatmentPrueba1;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[5]")
    private WebElement dropDownAcidBath1;

    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Ca=2,25')])[1]")
    private WebElement optionAcidBath1Ca25;

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[7]")
    private WebElement dropDownAnticoagulantType;

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

    @FindBy(how = How.XPATH, using = "//a[@href='javascript:void(0);'][contains(.,'Save')]")
    private WebElement buttonSavePrescription;

    @FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')])[4]")
    private WebElement buttonAddSpecialOrder;

    @FindBy(how = How.XPATH, using = "(//label[contains(@for,'58')])[1]")
    private WebElement checkBoxSpecialOrderShowActive;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@ng-required,'true')]")
    private WebElement textAreaDescriptionSpecialOrder;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-floppy-o')]")
    private WebElement buttonSaveSpecialOrder;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-times']")
    private WebElement buttonCancelSpecialOrder;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Prescription history')]")
    private WebElement buttonPrescriptionHistory;

    @FindBy(how = How.XPATH, using = "(//div[contains(.,'- The prescription cannot be dellted because it already has associated treatment records.')])[5]")
    private WebElement modalWarningPrescription;

    @FindBy(how = How.XPATH, using = "(//button[contains(.,'OK')])[2]")
    private WebElement buttonOKModalWarningPrescription;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Delete')]")
    private WebElement buttonDeletePrescription;

    @FindBy(how = How.XPATH, using = "//input[contains(@type,'password')]")
    private WebElement inputPasswordDeleteHdPrescription;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[5]")
    private WebElement inputReasonDeleteHdPrescription;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Cancel')]")
    private WebElement buttonCancelModalDeleteHdPrescription;

    @FindBy(how = How.XPATH, using = "(//button[contains(.,'OK')])[2]")
    private WebElement buttonOKModalDeleteHdPrescription;


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

    @FindBy(how = How.XPATH, using = "(//span[contains(@role,'button')])[4]")
    private WebElement dropDownSealedCatheter ;

    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'][contains(.,'Heparina')])[3]")
    private WebElement optionHeparinaSealedCatheter ;


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

    public void successfullyCreatedANewSpecialOrder() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePointsPrescription);
        pause(200);
        buttonNewPrescription.click();
        pause(200);
        click(dropDownAccessData);
        waitElements(optionOfAccessData);
        click(optionOfAccessData);
        pause(200);
        click(dropDownTypeOfTreatment);
        waitElements(optionTypeOfTreatmentPrueba1);
        click(optionTypeOfTreatmentPrueba1);
        pause(200);
        click(dropDownAcidBath1);
        waitElements(optionAcidBath1Ca25);
        click(optionAcidBath1Ca25);
        pause(200);
        click(dropDownAnticoagulantType);
        waitElements(optionAnticoagulantType);
        click(optionAnticoagulantType);
        pause(200);
        dropDownDialyser.click();
        waitElements(optionDialyser);
        click(optionDialyser);
        pause(200);
        String unidad = "1";
        click(inputUfGoal);
        inputUfGoal.sendKeys(Keys.CONTROL + "a");
        inputUfGoal.sendKeys(Keys.DELETE);
        write(inputUfGoal, unidad);
        pause(200);
        click(inputUfRatio);
        inputUfRatio.sendKeys(Keys.CONTROL + "a");
        inputUfRatio.sendKeys(Keys.DELETE);
        write(inputUfRatio, unidad);


        driver.switchTo().parentFrame();
        pause(200);
        click(buttonArrowUp);

        driver.switchTo().frame("frmContenido");
        pause(300);
        waitElements(buttonThreePointsPrescription);
        click(buttonThreePointsPrescription);
        pause(200);
        waitElements(buttonSavePrescription);
        click(buttonSavePrescription);
        pause(5000);
        driver.switchTo().parentFrame();


    }

    public void createASpecialOrderByClickingOnTheAddSpecialOrderButton() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        moveScrollToElement(buttonAddSpecialOrder);
        waitElements(buttonAddSpecialOrder);
        pause(200);
        buttonAddSpecialOrder.isDisplayed();
        buttonAddSpecialOrder.click();
        String description = "Qa test";
        pause(300);
        textAreaDescriptionSpecialOrder.click();
        textAreaDescriptionSpecialOrder.sendKeys(Keys.CONTROL + "a");
        textAreaDescriptionSpecialOrder.sendKeys(Keys.DELETE);
        write(textAreaDescriptionSpecialOrder, description);
        pause(300);

        waitElements(buttonSaveSpecialOrder);
        buttonSaveSpecialOrder.isDisplayed();
        buttonSaveSpecialOrder.click();

        driver.switchTo().parentFrame();
        pause(200);
        buttonArrowUp.click();
    }
    public void cancelingToCreateASpecialOrderByClickingOnTheAddSpecialOrderButton() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        moveScrollToElement(buttonAddSpecialOrder);
        waitElements(buttonAddSpecialOrder);
        pause(200);
        buttonAddSpecialOrder.isDisplayed();
        buttonAddSpecialOrder.click();
        String description = "Qa test";
        pause(300);
        textAreaDescriptionSpecialOrder.click();
        textAreaDescriptionSpecialOrder.sendKeys(Keys.CONTROL + "a");
        textAreaDescriptionSpecialOrder.sendKeys(Keys.DELETE);
        write(textAreaDescriptionSpecialOrder, description);
        pause(300);

        waitElements(buttonCancelSpecialOrder);
        buttonCancelSpecialOrder.isDisplayed();
        buttonCancelSpecialOrder.click();

        driver.switchTo().parentFrame();
        pause(200);
        buttonArrowUp.click();
    }
    public void verifyThatTheSaveButtonDoesNotAppear() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(300);
        moveScrollToElement(buttonAddSpecialOrder);
        waitElements(buttonAddSpecialOrder);
        pause(200);
        buttonAddSpecialOrder.isDisplayed();
        buttonAddSpecialOrder.click();
        pause(1000);
        String descriptionRequiredField = textAreaDescriptionSpecialOrder.getAttribute("value");
        waitElements(textAreaDescriptionSpecialOrder);
        if (descriptionRequiredField.isEmpty() && !buttonSaveSpecialOrder.isDisplayed() ){
            buttonCancelSpecialOrder.click();
        }else {
            System.out.println("the required field is not empty");
        }
        driver.switchTo().parentFrame();
        pause(200);
        buttonArrowUp.click();

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

    public void tryToDeleteThePrescriptionBecauseItAlreadyHasTreatmentRecordsAssociatedWithIt() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePointsPrescription);
        pause(200);
        buttonDeletePrescription.click();

        driver.switchTo().parentFrame();
        pause(500);
        waitElements(modalWarningPrescription);
        modalWarningPrescription.isDisplayed();
        pause(200);
        click(buttonOKModalWarningPrescription);
        pause(300);
    }
    public void triedToDeleteTheActiveDescriptionButICanceled()throws InterruptedException{
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
        waitElements(buttonThreePointsPrescription);
        click(buttonThreePointsPrescription);
        pause(200);
        buttonDeletePrescription.click();

        driver.switchTo().parentFrame();

        pause(200);
        waitElements(buttonCancelModalDeleteHdPrescription);
    }
    public void successfullyDeleteTheActivePrescription()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        click(buttonThreePointsPrescription);
        pause(200);
        waitElements(buttonDeletePrescription);
        buttonDeletePrescription.click();

        driver.switchTo().parentFrame();

        String pswd = "renal2";
        String razon = "Qa test";
        waitElements(inputPasswordDeleteHdPrescription);
        inputPasswordDeleteHdPrescription.click();
        inputPasswordDeleteHdPrescription.sendKeys(Keys.CONTROL + "a");
        inputPasswordDeleteHdPrescription.sendKeys(Keys.DELETE);
        write(inputPasswordDeleteHdPrescription, pswd);
        pause(200);

        inputReasonDeleteHdPrescription.click();
        inputReasonDeleteHdPrescription.sendKeys(Keys.CONTROL + "a");
        inputReasonDeleteHdPrescription.sendKeys(Keys.DELETE);
        write(inputReasonDeleteHdPrescription, razon);
        pause(200);
        click(buttonOKModalWarningPrescription);
        pause(2000);

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


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
