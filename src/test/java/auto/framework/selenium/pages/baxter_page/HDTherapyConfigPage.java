package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@LazyComponent
public class HDTherapyConfigPage extends BasePage<HDTherapyConfigPage> {

    @FindBy(how = How.XPATH, using = "//a[text()=\"Configuration\"]")
    private WebElement buttonConfigurationUsers;

    @FindBy(how = How.XPATH, using = "//span[text()=\"Terapia HD\" and @class=\"rpText\"]")
    private WebElement buttonTherapyHD;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "//ul[@aria-orientation='horizontal']//li[1]")
    private WebElement dialyzerSection;

    @FindBy(how = How.XPATH, using = "//span[text()='New']")
    private WebElement buttonAddNewDialyzer;

    @FindBy(how = How.XPATH, using = "//input[@id='config-dialyzer-model-input' and @name='dialyzer-model-input']")
    private WebElement inputModelDialyzer;

    @FindBy(how = How.XPATH, using = "(//button[@unselectable='on' and @aria-label='Select'])[1]")
    private WebElement dropDownManufacturerDialyzer;

    @FindBy(how = How.XPATH, using = "(//label[@class='form-label'])[3]")
    private WebElement optionBaxterManufacturerSelect;

    @FindBy(how = How.XPATH, using = "//span[text()='Save']")
    private WebElement buttonSaveNewDialyzer;

    @FindBy(how = How.XPATH, using = "(//input[contains(@class,'d-block align-center')])[2]")
    private WebElement inputCheckBoxActiveOrInactive;

    @FindBy(how = How.XPATH, using = "//label[@for='config-dialyzer-show-inactive-input']/following-sibling::input[1]")
    private WebElement inputCheckBoxShowInactiveDialyzer;

    @FindBy(how = How.XPATH, using = "//input[@id='config-concentrate-show-inactive-input']")
    private WebElement inputCheckBoxShowInactiveConcentrate;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[1]")
    private WebElement inputKoaDialyzer;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[2]")
    private WebElement inputSurfaceDialyzer;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[3]")
    private WebElement inputPremierVolumeDialyzer;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[4]")
    private WebElement inputCoefficientDialyzer;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[5]")
    private WebElement inputMaximumQBDialyzer;

    @FindBy(how = How.XPATH, using = "(//span[@unselectable='on']/following-sibling::button)[2]")
    private WebElement dropDownTypeMembraneDialyzer;


    @FindBy(how = How.XPATH, using = "//label[text()='Membrane type']")
    private WebElement optionTypeMembraneDialyzer;

    @FindBy(how = How.XPATH, using = "//button[@type='button']//span[text()='Edit']")
    private WebElement buttonEditDialyzer;

    @FindBy(how = How.XPATH, using = "//input[@class='rcbInput radPreventDecorate' and @value='Baxter Healthcare']")
    private WebElement inputManufacturerDialyzer;

    @FindBy(how = How.XPATH, using = "//button[@class='dropdown-item']//span[text()='Delete']")
    private WebElement buttonDeleteDialyzer;

    @FindBy(how = How.XPATH, using = "(//ul[@class='nav three-points-menu']//li)[1]")
    private WebElement buttonThreePointsDialyzer;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary' and text()='Ok']")
    private WebElement buttonOkModalError;
    @FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
    private WebElement buttonCancelDialyzer;

    @FindBy(how = How.XPATH, using = "//span[text()='Save']")
    private WebElement buttonSaveDialyzer;

    @FindBy(how = How.XPATH, using = "//button[text()='Yes']")
    private WebElement buttonYesDeleteDialyzer;

    @FindBy(how = How.XPATH, using = "//button[text()='No']")
    private WebElement buttonNoDeleteDialyzer;

    @FindBy(how = How.XPATH, using = "//span[text()='Concentrates' and @class='k-link-text']")
    private WebElement buttonConcentratesSection;

    @FindBy(how = How.XPATH, using = "//a[@class='dropdown-toggle']//fa-icon[1]")
    private WebElement buttonThreePointsConcentrates;

    @FindBy(how = How.XPATH, using = "//label[@for='config-concentrate-name-input']/following-sibling::input[1]")
    private WebElement inputNameConcentrates;

    @FindBy(how = How.XPATH, using = "//span[@class='k-input-inner']/following-sibling::button[1]")
    private WebElement dropDownTypeConcentrates;

    @FindBy(how = How.XPATH, using = "//label[text()='Type']")
    private WebElement optionTypeConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[1]")
    private WebElement inputEndSodiumConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[2]")
    private WebElement inputEndBicarbonateConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[3]")
    private WebElement inputEndCalciumConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[4]")
    private WebElement inputEndPotassiumConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[5]")
    private WebElement inputEndMagnesiumConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[6]")
    private WebElement inputEndChlorideConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[7]")
    private WebElement inputEndAcetateConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[8]")
    private WebElement inputEndDextroseConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[9]")
    private WebElement inputSodiumBicarbonateConcentrates;

    @FindBy(how = How.XPATH, using = "(//input[@type='number'])[10]")
    private WebElement inputSodiumChlorideConcentrates;

    @FindBy(how = How.XPATH, using = "//div[@class='col']//textarea[1]")
    private WebElement textAreaDescriptionConcentrates;

    @FindBy(how = How.XPATH, using = "//span[text()='Save']")
    private WebElement buttonSaveNewConcentrate;

    @FindBy(how = How.XPATH, using = "//span[text()='Cancel']")
    private WebElement buttonCancelNewConcentrate;

    @FindBy(how = How.XPATH, using = "//button[@type='button']//span[text()='Edit']")
    private WebElement buttonEditConcentrate;

    @FindBy(how = How.XPATH, using = "//span[text()='Needles' and @class='k-link-text']")
    private WebElement buttonNeedlesSection;

    @FindBy(how = How.XPATH, using = "(//input[contains(@id,'config-needle-name-input')])[1]")
    private WebElement inputNameNeedles;

    @FindBy(how = How.XPATH, using = "//versia-ui-number[@id='config-needle-caliber-input']//input[1]")
    private WebElement inputCaliberNeedles;

    @FindBy(how = How.XPATH, using = "//input[@id='config-needle-show-inactive-input']")
    private WebElement checkBoxShowInactiveNeedles;

    @FindBy(how = How.XPATH, using = "(//span[@class='k-button-text' and text()='Add New'])")
    private WebElement buttonAddNewLateralities;

    @FindBy(how = How.XPATH, using = "(//span[@class='k-input-value-text'])[1]")
    private WebElement inputPositionLateralities;

    @FindBy(how = How.XPATH, using = "(//span[@class='k-input-value-text'])[2]")
    private WebElement inputLateralities;

    @FindBy(how = How.XPATH, using = "//span[text()='Position']")
    private WebElement labelPosition;

    @FindBy(how = How.XPATH, using = "//span[text()='Laterality']")
    private WebElement labelLaterality;

    @FindBy(how = How.XPATH, using = "(//button[@title='Save'])[1]")
    private WebElement buttonSaveLaterality;

    @FindBy(how = How.XPATH, using = "(//button[@title='Cancel'])[1]")
    private WebElement buttonCancelLaterality;

    @FindBy(how = How.XPATH, using = "(//button[@title='Delete'])[1]")
    private WebElement buttonDeleteLaterality;

    @FindBy(how = How.XPATH, using = "//span[text()='Anticlottings']")
    private WebElement buttonAnticlottingsSection;

    @FindBy(how = How.XPATH, using = "(//span[@unselectable='on']//span)[1]")
    private WebElement dropDownAnticlottingType;

    @FindBy(how = How.XPATH, using = "//label[@for='config-anticlotting-type-select']")
    private WebElement labelAnticlottingType;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'k-grid-table k-table')]/tbody[1]/tr[1]/td[1]/div[1]")
    private WebElement draggableElement;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/hd-config-main/div/div/div/kendo-tabstrip/div[2]/hd-config-anticlottings-tab/div/div/div/div[4]/div[2]/hd-config-category-medications-grid/kendo-grid/div[1]/kendo-grid-list/div/div/table/tbody/tr/td[1]/div")
    private WebElement draggableElement2;

    @FindBy(how = How.XPATH, using = "(//tbody[@class='k-table-tbody'])[2]")
    private WebElement zoneDroppable;

    @FindBy(how = How.XPATH, using = "//div[contains(@class,'alert alert-info')]//span[1]")
    private WebElement zoneDroppableDelete;

    @FindBy(how = How.XPATH, using = "(//span[@class='k-button-text' and text()='Add New'])[1]")
    private WebElement buttonAddNewDrugTypes;

    @FindBy(how = How.XPATH, using = "(//span[@class='k-button-text' and text()='Add New'])[2]")
    private WebElement buttonAddNewDrugResult;

    @FindBy(how = How.XPATH, using = "//span[text()='Perfusions']")
    private WebElement buttonDrugsSection;

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner'])[1]")
    private WebElement inputNameAddNewDrugTypes;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/hd-config-main/div/div/div/kendo-tabstrip/div[2]/hd-config-perfusions-tab/div/div/div/div[2]/div[2]/div/div[2]/hd-perfusion-results-grid/form/kendo-grid/div[1]/table/tbody/tr[1]/td[1]/kendo-textbox/input")
    private WebElement inputNameAddNewDrugResults;

    @FindBy(how = How.XPATH, using = "(//input[@class='k-input-inner'])[2]")
    private WebElement inputDescriptionAddNewDrugTypes;

    @FindBy(how = How.XPATH, using = "(//button[@title='Save'])[1]")
    private WebElement buttonSaveAddNewDrugTypes;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'k-grid-table k-table')]/tbody[1]/tr[7]/td[3]/button[3]")
    private WebElement buttonSaveEditDrugTypes;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/hd-config-main/div/div/div/kendo-tabstrip/div[2]/hd-config-perfusions-tab/div/div/div/div[2]/div[2]/div/div[2]/hd-perfusion-results-grid/form/kendo-grid/div[1]/table/tbody/tr[1]/td[3]/button[3]")
    private WebElement buttonSaveAddNewDrugResult;

    @FindBy(how = How.XPATH, using = "(//button[contains(@class,'k-button k-grid-cancel-command')])[1]")
    private WebElement buttonCancelAddNewDrugTypes;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'k-grid-table k-table')]/tbody[1]/tr[7]/td[3]/button[1]")
    private WebElement buttonEditDrugTypes;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'k-grid-table k-table')]/tbody[1]/tr[8]/td[3]/button[4]")
    private WebElement buttonCancelEditDrugTypes;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'k-grid-table k-table')]/tbody[1]/tr[7]/td[3]/button[2]")
    private WebElement buttonDeleteDrugTypes;

    @FindBy(how = How.XPATH, using = "//table[contains(@class,'k-grid-table k-table')]/tbody[1]/tr[6]/td[3]/button[2]")
    private WebElement buttonDeleteDrugTypes1;



    public void enterConfigurationUsers()throws InterruptedException{
        pause(200);
        click(buttonConfigurationUsers);
        pause(200);
    }
     public void successfullyOpenedTheHDTherapyModule()throws InterruptedException{
         driver.switchTo().frame("frmContenido");
         pause(500);
         scrollToElementMove(buttonTherapyHD);
         click(buttonTherapyHD);
         pause(1000);
         driver.switchTo().parentFrame();
         click(buttonArrowUp);
         pause(300);

     }
     public void clickButtonArrowUp()throws InterruptedException{
        pause(300);
        driver.switchTo().parentFrame();
        click(buttonArrowUp);
        pause(500);
     }
    public void clickButtonDialyzerSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        waitElements(dialyzerSection);
        click(dialyzerSection);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonAddNewDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(buttonAddNewDialyzer);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveNewDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        scrollToElementMove(buttonSaveNewDialyzer);
        click(buttonSaveNewDialyzer);
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void inputDataModelDialyzer(String modelDialyzer)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputModelDialyzer.sendKeys(Keys.CONTROL + "a");
        inputModelDialyzer.sendKeys(Keys.DELETE);
        inputModelDialyzer.sendKeys(Keys.ENTER);
        write(inputModelDialyzer,modelDialyzer);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void selectOptionBaxterManufacturer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(dropDownManufacturerDialyzer);
        pause(200);
        waitElements(optionBaxterManufacturerSelect);
        clickBelowElementByOffset(optionBaxterManufacturerSelect,120);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void checkOrUncheckChexboxStatus(String state)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        String normalized = state.trim().toLowerCase();
        switch (normalized){
            case "active":
                if(!inputCheckBoxActiveOrInactive.isSelected()){
                    inputCheckBoxActiveOrInactive.click();
                }
                break;
            case "inactive":
                if (inputCheckBoxActiveOrInactive.isSelected()){
                    inputCheckBoxActiveOrInactive.click();
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid state. Use 'active' or 'inactive'. Received value:  " +state);
        }
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickCheckBoxShowAllDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        waitElements(inputCheckBoxShowInactiveDialyzer);
        click(inputCheckBoxShowInactiveDialyzer);
        pause(1000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterDataInInputKoA(String koa)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputKoaDialyzer.sendKeys(Keys.CONTROL + "a");
        inputKoaDialyzer.sendKeys(Keys.DELETE);
        inputKoaDialyzer.sendKeys(Keys.ENTER);
        write(inputKoaDialyzer,koa);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterDataInInputSurface(String surface)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputSurfaceDialyzer.sendKeys(Keys.CONTROL + "a");
        inputSurfaceDialyzer.sendKeys(Keys.DELETE);
        inputSurfaceDialyzer.sendKeys(Keys.ENTER);
        write(inputSurfaceDialyzer,surface);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterDataInInputPrimerVolume(String volume)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputPremierVolumeDialyzer.sendKeys(Keys.CONTROL + "a");
        inputPremierVolumeDialyzer.sendKeys(Keys.DELETE);
        inputPremierVolumeDialyzer.sendKeys(Keys.ENTER);
        write(inputPremierVolumeDialyzer,volume);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterDataInInputCoefficient(String coefficient)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputCoefficientDialyzer.sendKeys(Keys.CONTROL + "a");
        inputCoefficientDialyzer.sendKeys(Keys.DELETE);
        inputCoefficientDialyzer.sendKeys(Keys.ENTER);
        write(inputCoefficientDialyzer,coefficient);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void enterDataInMaximumQB(String maximum)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputMaximumQBDialyzer.sendKeys(Keys.CONTROL + "a");
        inputMaximumQBDialyzer.sendKeys(Keys.DELETE);
        inputMaximumQBDialyzer.sendKeys(Keys.ENTER);
        write(inputMaximumQBDialyzer,maximum);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void selectOptionTypeOfMembraneDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(dropDownTypeMembraneDialyzer);
        pause(200);
        waitElements(optionTypeMembraneDialyzer);
        clickBelowElementByOffset(optionTypeMembraneDialyzer,130);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickModelSelectedDialyzer(String model)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        String xpath = String.format("//tr[td[1][normalize-space()='%s']]",model);
        WebElement row = driver.findElement(By.xpath(xpath));
        row.click();
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void  cleanInputDataModelDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputModelDialyzer.sendKeys(Keys.CONTROL + "a");
        inputModelDialyzer.sendKeys(Keys.DELETE);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void  cleanInputDataManufacturerDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(dropDownManufacturerDialyzer);
        pause(200);
        waitElements(optionBaxterManufacturerSelect);
        clickBelowElementByOffset(optionBaxterManufacturerSelect,230);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonEditDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        scrollToElementMove(buttonEditDialyzer);
        pause(200);
        click(buttonEditDialyzer);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void editTheNecessaryDataInDialyzer(String module)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputModelDialyzer.sendKeys(Keys.CONTROL + "a");
        inputModelDialyzer.sendKeys(Keys.DELETE);
        inputModelDialyzer.sendKeys(Keys.ENTER);
        write(inputModelDialyzer,module);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void clickButtonDeleteDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        click(buttonDeleteDialyzer);
        pause(500);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void clickButtonThreePointsDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        scrollToElementMove(buttonThreePointsDialyzer);
        click(buttonThreePointsDialyzer);

        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

    }
    public void clickButtonCancelDialyzer()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(buttonCancelDialyzer);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonYesConfirmationDelete()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(buttonYesDeleteDialyzer);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonNoConfirmationDelete()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(buttonNoDeleteDialyzer);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonConcentratesSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        click(buttonConcentratesSection);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonThreePointsConcentrates()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        scrollToElementMove(buttonThreePointsConcentrates);
        pause(200);
        click(buttonThreePointsConcentrates);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void inputDataNameConcentrates(String name)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputNameConcentrates.sendKeys(Keys.CONTROL + "a");
        inputNameConcentrates.sendKeys(Keys.DELETE);
        inputNameConcentrates.sendKeys(Keys.ENTER);
        write(inputNameConcentrates,name);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void selectTheTypeOfConcentratesOption()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(dropDownTypeConcentrates);
        pause(200);
        clickBelowElementByOffset(optionTypeConcentrates,150);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonOkInModalError()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(buttonOkModalError);
        click(buttonOkModalError);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void insertDataIntoTheInputEndSodium(String endSodium)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndSodiumConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndSodiumConcentrates.sendKeys(Keys.DELETE);
        inputEndSodiumConcentrates.sendKeys(Keys.ENTER);
        write(inputEndSodiumConcentrates,endSodium);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndBicarbonate(String endBicarbonate)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndBicarbonateConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndBicarbonateConcentrates.sendKeys(Keys.DELETE);
        inputEndBicarbonateConcentrates.sendKeys(Keys.ENTER);
        write(inputEndBicarbonateConcentrates,endBicarbonate);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndCalcium(String endCalcium)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndCalciumConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndCalciumConcentrates.sendKeys(Keys.DELETE);
        inputEndCalciumConcentrates.sendKeys(Keys.ENTER);
        write(inputEndCalciumConcentrates,endCalcium);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndPotassium(String endPotassium)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndPotassiumConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndPotassiumConcentrates.sendKeys(Keys.DELETE);
        inputEndPotassiumConcentrates.sendKeys(Keys.ENTER);
        write(inputEndPotassiumConcentrates,endPotassium);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndMagnesium(String endMagnesium)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndMagnesiumConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndMagnesiumConcentrates.sendKeys(Keys.DELETE);
        inputEndMagnesiumConcentrates.sendKeys(Keys.ENTER);
        write(inputEndMagnesiumConcentrates,endMagnesium);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndChloride(String endChloride)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndChlorideConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndChlorideConcentrates.sendKeys(Keys.DELETE);
        inputEndMagnesiumConcentrates.sendKeys(Keys.ENTER);
        write(inputEndChlorideConcentrates,endChloride);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndAcetate(String endAcetate)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndAcetateConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndAcetateConcentrates.sendKeys(Keys.DELETE);
        inputEndAcetateConcentrates.sendKeys(Keys.ENTER);
        write(inputEndAcetateConcentrates,endAcetate);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputEndDextrose(String endDextrose)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputEndDextroseConcentrates.sendKeys(Keys.CONTROL + "a");
        inputEndDextroseConcentrates.sendKeys(Keys.DELETE);
        inputEndDextroseConcentrates.sendKeys(Keys.ENTER);
        write(inputEndDextroseConcentrates,endDextrose);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputSodiumBicarbonate(String sodiumBicarbonate)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputSodiumBicarbonateConcentrates.sendKeys(Keys.CONTROL + "a");
        inputSodiumBicarbonateConcentrates.sendKeys(Keys.DELETE);
        inputSodiumBicarbonateConcentrates.sendKeys(Keys.ENTER);
        write(inputSodiumBicarbonateConcentrates,sodiumBicarbonate);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheInputSodiumChloride(String sodiumChloride)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputSodiumChlorideConcentrates.sendKeys(Keys.CONTROL + "a");
        inputSodiumChlorideConcentrates.sendKeys(Keys.DELETE);
        inputSodiumChlorideConcentrates.sendKeys(Keys.ENTER);
        write(inputSodiumChlorideConcentrates,sodiumChloride);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheTextAreaDescriptionConcentrate(String description)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        textAreaDescriptionConcentrates.sendKeys(Keys.CONTROL + "a");
        textAreaDescriptionConcentrates.sendKeys(Keys.DELETE);
        textAreaDescriptionConcentrates.sendKeys(Keys.ENTER);
        write(textAreaDescriptionConcentrates,description);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveNewConcentrate()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(buttonSaveNewConcentrate);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelAddNewConcentrate()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(buttonCancelNewConcentrate);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickCheckBoxShowAllConcentrates()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        waitElements(inputCheckBoxShowInactiveConcentrate);
        click(inputCheckBoxShowInactiveConcentrate);
        pause(1000);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickNameSelectedConcentrate(String name)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        String xpath = String.format("//tr[td[1][normalize-space()='%s']]",name);
        WebElement row = driver.findElement(By.xpath(xpath));
        row.click();
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonEditConcentrate()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        scrollToElementMove(buttonEditConcentrate);
        pause(200);
        click(buttonEditConcentrate);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonNeedlesSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        scrollToElementMove(buttonNeedlesSection);
        pause(200);
        click(buttonNeedlesSection);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataAtNameNeedles(String name)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputNameNeedles.sendKeys(Keys.CONTROL + "a");
        inputNameNeedles.sendKeys(Keys.DELETE);
        inputNameNeedles.sendKeys(Keys.ENTER);
        write(inputNameNeedles,name);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataAtCaliberNeedles(String caliber)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(500);
        inputCaliberNeedles.sendKeys(Keys.CONTROL + "a");
        inputCaliberNeedles.sendKeys(Keys.DELETE);
        inputCaliberNeedles.sendKeys(Keys.ENTER);
        write(inputCaliberNeedles,caliber);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickTheCheckboxToShowAllInactiveNeedles()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        click(checkBoxShowInactiveNeedles);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonAddNewLaterality()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonAddNewLateralities);
        click(buttonAddNewLateralities);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickInputPositionLateralitiesAndSelectOption()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(inputPositionLateralities);
        click(inputPositionLateralities);
        pause(200);
        clickBelowElementByOffset(labelPosition,160);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickInputLateralitiesAndSelectOption()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(inputLateralities);
        click(inputLateralities);
        pause(200);
        clickBelowElementByOffset(labelLaterality,120);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveNewLateralities()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonSaveLaterality);
        click(buttonSaveLaterality);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickCancelSaveNewLateralities()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonCancelLaterality);
        click(buttonCancelLaterality);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteLaterality() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonDeleteLaterality);
        click(buttonDeleteLaterality);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonAnticlottingsSection() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonAnticlottingsSection);
        click(buttonAnticlottingsSection);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButonAnticlottingTypeAndSelectOption()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(dropDownAnticlottingType);
        click(dropDownAnticlottingType);
        pause(1000);
        clickBelowElementByOffset(labelAnticlottingType,160);
        pause(300);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void dragAndDropAllMedication()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        scrollToElementMove(draggableElement);
        waitElements(draggableElement);
        dragAndDropVisible(draggableElement,zoneDroppable);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void deleteTheAntiCoagulantAdded()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(1000);
        scrollToElementMove(draggableElement2);
        waitElements(draggableElement2);
        dragAndDropVisible(draggableElement2,zoneDroppableDelete);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonDrugsSection()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonDrugsSection);
        click(buttonDrugsSection);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonAddNewDrugTypes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonAddNewDrugTypes);
        click(buttonAddNewDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonAddNewDrugResult()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonAddNewDrugResult);
        click(buttonAddNewDrugResult);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }


    public void insertDataIntoTheNameDrugsTypesField(String name)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputNameAddNewDrugTypes.sendKeys(Keys.CONTROL + "a");
        inputNameAddNewDrugTypes.sendKeys(Keys.DELETE);
        inputNameAddNewDrugTypes.sendKeys(Keys.ENTER);
        write(inputNameAddNewDrugTypes,name);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void insertDataIntoTheNameDrugsResultsField(String name)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        waitElements(inputNameAddNewDrugResults);
        inputNameAddNewDrugResults.sendKeys(Keys.CONTROL + "a");
        inputNameAddNewDrugResults.sendKeys(Keys.DELETE);
        inputNameAddNewDrugResults.sendKeys(Keys.ENTER);
        write(inputNameAddNewDrugResults,name);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void insertDataIntoTheDescriptionDrugsTypesField(String description)throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(200);
        inputDescriptionAddNewDrugTypes.sendKeys(Keys.CONTROL + "a");
        inputDescriptionAddNewDrugTypes.sendKeys(Keys.DELETE);
        inputDescriptionAddNewDrugTypes.sendKeys(Keys.ENTER);
        write(inputDescriptionAddNewDrugTypes,description);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveAddNewDrugTypes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonSaveAddNewDrugTypes);
        click(buttonSaveAddNewDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveAddNewDrugResult()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonSaveAddNewDrugResult);
        click(buttonSaveAddNewDrugResult);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelAddNewDrugTypes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonCancelAddNewDrugTypes);
        click(buttonCancelAddNewDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonEditDrugs()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonEditDrugTypes);
        click(buttonEditDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonCancelEditDrugTypes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonCancelEditDrugTypes);
        click(buttonCancelEditDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveEditDrugTypes()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonSaveEditDrugTypes);
        click(buttonSaveEditDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteDrugTypeSelected()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonDeleteDrugTypes);
        click(buttonDeleteDrugTypes);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteDrugTypeSelected1()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame("iframeV2");
        pause(300);
        waitElements(buttonDeleteDrugTypes1);
        click(buttonDeleteDrugTypes1);
        pause(200);
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }




    @Override
    public boolean isAt() {
        return false;
    }

}
