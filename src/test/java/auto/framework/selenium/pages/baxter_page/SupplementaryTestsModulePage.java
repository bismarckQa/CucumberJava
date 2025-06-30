package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class SupplementaryTestsModulePage extends BasePage<SupplementaryTestsModulePage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Complementary tests')]")
    private WebElement titleSupplementaryTests;

    @FindBy(how = How.XPATH, using = "//*[@id=\"dropDownMenuTp\"]")
    private WebElement MenuButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[1]/ct-three-points-menu/versia-ui-three-points-menu/ul/li/ul/ul/li[1]/button")
    private WebElement CreateButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[1]/ct-three-points-menu/versia-ui-three-points-menu/ul/li/ul/ul/li[2]/button")
    private WebElement FilterButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div[1]/ct-test/div/form/div[1]/div[2]/div[1]/versia-kendo-datepicker/kendo-datepicker/kendo-dateinput/input")
    private WebElement InputReception;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div/ct-test/div/form/div[1]/div[1]/div[1]/versia-kendo-datepicker/kendo-datepicker/kendo-dateinput/input")
    private WebElement InputDateOfRecord;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div" +
            "/div/div[1]/ct-test/div/form/div[1]/div[1]/div[2]/versia-codes/versia-kendo-dropdownlist/kendo-dropdownlist/button")
    private WebElement MenuTestButton;

    @FindBy(how = How.XPATH, using = "/html/body/div")
    private WebElement inputTextDescription;

    @FindBy(how = How.XPATH, using = "//*[contains(@title, 'Save')]")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div/ct-test/div/form/div[3]/div/div/button[1]")
    private WebElement editButton;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'<p>QATest</p>')]")
    private WebElement descriptionQA;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'<p>QATestEdit</p>')]")
    private WebElement descriptionQAEdit;

    @FindBy(how = How.XPATH, using = "//*[contains(@value,'<p>QATestAttached</p>')]")
    private WebElement descriptionQATestAttached;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/kendo-popup/div/div/kendo-list/div/ul/li[1]/span")
    private WebElement anemiaTest;

    @FindBy(how = How.XPATH, using ="(//*[name()='path'][@fill='currentColor'])[6]")
    private WebElement buttonDeleteLastCreation;
    @FindBy(how = How.XPATH, using ="//*[contains(@data-icon, 'trash')]")
    private WebElement buttonDeleteLastCreationWithAccesses;

    @FindBy(how = How.XPATH, using ="//*[contains(@class,'btn btn-primary') and contains(text(),'Yes')]")
    private WebElement buttonConfirmDelete;

    @FindBy(how = How.XPATH, using ="//*[contains(@title, 'Cancel')]")
    private WebElement buttonCancelTestCreation;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/div/div/ct-main/div[2]/div/div/div[2]/ct-tests-list/div/div/div/ct-test/div/form/div[1]/div[1]/div[1]/versia-kendo-datepicker/kendo-datepicker/kendo-actionsheet")
    private WebElement alertDateOfRecord;

    @FindBy(how = How.XPATH, using ="//span[contains(text(),'No data found.')]")
    private WebElement noDataFoundText;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/div/div/ct-main/versia-ui-hidden-side-nav/div/ct-category-filter/div/div/div/versia-kendo-multiselect/kendo-multiselect/div/kendo-searchbar/input")
    private WebElement categoryDropdown;

    @FindBy(how = How.XPATH, using ="/html/body/app-root/kendo-popup/div/div/kendo-list/div/ul/li[1]/span")
    private WebElement test1Filter;

    @FindBy(how = How.XPATH, using ="//*[contains(text(),'Error')]")
    private WebElement errorAlertCantBeDeleted;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'Ok')]")
    private WebElement errorAlertCantBeDeletedAcceptButton;

    @FindBy(how = How.XPATH, using ="//h4[contains(text(),'Confirmation')]")
    private WebElement confirmationWindowsOpenTittle;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'No')]")
    private WebElement confirmationWindowsOpenNoButton;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'Yes')]")
    private WebElement confirmationWindowsOpenYesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"menuRepeaterPanel\"]/div/div/div[1]")
    private WebElement leftButton;
    @FindBy(how = How.XPATH, using = "//span[@class='rpText'][contains(.,'P. Complementarias')]")
    private WebElement buttonComplementaryTestOption;

    @FindBy(how = How.XPATH, using = "//a[@href='#0'][contains(.,'Top')]")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "//span[contains(@id,'lblnomCat')][contains(.,'Test1')]")
    private WebElement categoryTest1;

    @FindBy(how = How.XPATH, using = "(//span[@class='rtsTxt'][contains(.,'Tests')])[1]")
    private WebElement buttonTests;

    @FindBy(how = How.XPATH, using = "//span[@class='rtsTxt'][contains(.,'Categories - Tests')]")
    private WebElement buttonCategoriesTests;

    @FindBy(how = How.XPATH, using = "(//input[contains(@id,'ImageButton5')])[1]")
    private WebElement buttonAddCategory;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[1]")
    private WebElement inputNameAddCategory;

    @FindBy(how = How.XPATH, using = "(//input[@type='text'])[1]")
    private WebElement inputNameAddTest;

    @FindBy(how = How.XPATH, using = "//input[contains(@name,'descripcion')]")
    private WebElement inputDescriptionAddCategory;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[2]")
    private WebElement inputDescriptionAddTest;

    @FindBy(how = How.XPATH, using = "//input[@alt='Cancelar']")
    private WebElement buttonCancelAddNewCategory;

    @FindBy(how = How.XPATH, using = "//input[contains(@alt,'Guardar')]")
    private WebElement buttonSaveAddNewCategory;

    @FindBy(how = How.XPATH, using = "(//input[@alt='Editar'])[2]")
    private WebElement buttonEditCategory;
    @FindBy(how = How.XPATH, using = "(//input[@alt='Editar'])[4]")
    private WebElement buttonEditCategoryTest3;

    @FindBy(how = How.XPATH, using = "(//input[contains(@alt,'Eliminar')])[4]")
    private WebElement buttonDeleteCategory;

    @FindBy(how = How.XPATH, using = "(//input[contains(@alt,'Eliminar')])[2]")
    private WebElement buttonDeleteTest1;

    @FindBy(how = How.XPATH, using = "(//input[@alt='Nuevo Registro'])[2]")
    private WebElement buttonAddNewTest;

    @FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[2]/div[4]/div[2]/div/table/tfoot/tr[2]/td/table/tbody/tr/td/div[1]/div[1]/div/a[2]")
    private WebElement buttonIncrease;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'ATestQA')]")
    private WebElement testNameQaTest;

    @FindBy(how = How.XPATH, using = "(//input[contains(@alt,'Eliminar')])[5]")
    private WebElement buttonDeleteQaTest;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'ATestQA')]")
    private WebElement nameEditTest;

    @FindBy(how = How.XPATH, using = "(//input[@alt='Editar'])[5]")
    private WebElement buttonEditTestSelected;

    @FindBy(how = How.XPATH, using = "//input[contains(@value,'Qa test')]")
    private WebElement inputDescriptionTestSelected;

    @FindBy(how = How.XPATH, using = "//td[@class='rcbArrowCell rcbArrowCellRight']//a[1]")
    private WebElement dropDownTestCategory;

    @FindBy(how = How.XPATH, using = "(//ul[@class='rcbList']//li)[2]")
    private WebElement optionTestCategory;

    @FindBy(how = How.XPATH, using = "(//td[@class='rgSorted'])[2]")
    private WebElement citologiaExamination;

    @FindBy(how = How.XPATH, using = "//tr[@class='rgNoRecords']//div[1]")
    private WebElement areaDrop;

    @FindBy(how = How.XPATH, using = "//tr[@id='ctl00_mainContent_rgPruebasRelacionadas_ctl00__0']//td[1]")
    private WebElement citologiaInAreaDrop;
    /*Methods*/


    public void isDisplayedTheTittle(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        titleSupplementaryTests.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedMenuButton(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        MenuButton.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void openMenu(){
        driver.switchTo().frame(0);
        click(MenuButton);
        driver.switchTo().parentFrame();
    }
    public void createComplementaryTest(){
        driver.switchTo().frame(0);
        click(CreateButton);
        driver.switchTo().parentFrame();
    }
    public void filterComplementaryTest(){
        driver.switchTo().frame(0);
        click(FilterButton);
        driver.switchTo().parentFrame();
    }
    public void filterDropDownButton(){
        driver.switchTo().frame(0);
        click(categoryDropdown);
        driver.switchTo().parentFrame();
    }
    public void filterDropDownTest1(){
        driver.switchTo().frame(0);
        click(test1Filter);
        driver.switchTo().parentFrame();
    }

    public void writeReceptionDate(String receptionDate){
        driver.switchTo().frame("frmContenido");
        InputReception.sendKeys(Keys.HOME);
        write(InputReception,receptionDate);
        driver.switchTo().parentFrame();

    }

    public void writeDateOfRecord(String dateOfRecord){
        driver.switchTo().frame("frmContenido");
        InputDateOfRecord.sendKeys(Keys.HOME);
        write(InputDateOfRecord,dateOfRecord);
        driver.switchTo().parentFrame();

    }

    public void resetReceptionDate(){
        driver.switchTo().frame("frmContenido");
        InputDateOfRecord.sendKeys(Keys.CONTROL + "a");
        InputDateOfRecord.sendKeys(Keys.DELETE);
        InputDateOfRecord.sendKeys(Keys.ENTER);
        driver.switchTo().parentFrame();

    }

    public void clickMenuTestButton(){
        driver.switchTo().frame("frmContenido");
        click(MenuTestButton);
        driver.switchTo().parentFrame();
    }
    public void selectTest(){
        driver.switchTo().frame("frmContenido");
        click(anemiaTest);
        driver.switchTo().parentFrame();
    }

    public void writeDescription(String description){
        driver.switchTo().frame("frmContenido");
        driver.switchTo().frame(0);
        inputTextDescription.sendKeys(Keys.CONTROL + "a");
        inputTextDescription.sendKeys(Keys.DELETE);
        write(inputTextDescription,description);
        driver.switchTo().parentFrame();
    }
    public void clickSaveButton() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(this.saveButton);
        driver.switchTo().parentFrame();
        pause(100);
        click(leftButton);

    }
    public void isDisplayedDescription() throws InterruptedException {
        pause(2000);
        driver.switchTo().frame("frmContenido");
        descriptionQA.isDisplayed();
        driver.switchTo().parentFrame();
    }



    public void clickEditButton() throws InterruptedException {
        pause(200);
        driver.switchTo().frame(0);
        click(this.editButton);
        driver.switchTo().parentFrame();
    }

    public void deleteLastCreationTest() throws InterruptedException {

            driver.switchTo().parentFrame();
            driver.switchTo().frame(0);
            click(buttonDeleteLastCreation);
            pause(1000);
            buttonConfirmDelete.click();
            waitElements(noDataFoundText);
            driver.switchTo().parentFrame();

    }

    public void NoDataFoundTextDisplayed(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        waitElements(noDataFoundText);
        driver.switchTo().parentFrame();

    }
    public void pushDeleteSupplementaryTestButton(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonDeleteLastCreation);
        driver.switchTo().parentFrame();

    }
    public void confirmationWidowOpenAndPushNo(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        confirmationWindowsOpenTittle.isDisplayed();
        click(confirmationWindowsOpenNoButton);
        driver.switchTo().parentFrame();

    }
    public void confirmationWidowOpenAndPushYes(){

        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        confirmationWindowsOpenTittle.isDisplayed();
        click(confirmationWindowsOpenYesButton);
        driver.switchTo().parentFrame();

    }

    public void deleteTwoLastCreationTest() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonDeleteLastCreation);
        pause(1000);
        buttonConfirmDelete.click();
        pause(1000);
        click(buttonDeleteLastCreation);
        pause(1000);
        buttonConfirmDelete.click();
        pause(1000);
        waitElements(noDataFoundText);
        driver.switchTo().parentFrame();
    }
    public void deleteSupplementaryTestCreation() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonDeleteLastCreationWithAccesses);
        pause(1000);
        buttonConfirmDelete.click();
    }
    public void errorCantBeDeletedIsVisible() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(1000);
        errorAlertCantBeDeleted.isDisplayed();
        click(errorAlertCantBeDeletedAcceptButton);
        driver.switchTo().parentFrame();
    }

    public void clickCancelButton(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonCancelTestCreation);
        driver.switchTo().parentFrame();
    }
    public void noDataFoundDisplayed() throws InterruptedException {
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        pause(3000);
        noDataFoundText.isDisplayed();
        driver.switchTo().parentFrame();
    }



    public void isDisplayedDescriptionEdit() throws InterruptedException {
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        descriptionQAEdit.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void isDisplayedDescriptionAttached() throws InterruptedException {
        pause(2000);
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        descriptionQATestAttached.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void isDisplayedAlert(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        alertDateOfRecord.isDisplayed();
        driver.switchTo().parentFrame();
    }
    public void acceptLinkComplementaryTestToThisAccess(){
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);
        click(buttonConfirmDelete);
        driver.switchTo().parentFrame();
    }
    public void clickButtonTestComplementaryConfig()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        scrollToElementMove(buttonComplementaryTestOption);
        click(buttonComplementaryTestOption);
        pause(200);

        driver.switchTo().parentFrame();
    }
    public void clickButtonArrowUp()throws InterruptedException{
        driver.switchTo().parentFrame();
        pause(500);
        waitElements(buttonArrowUp);
        click(buttonArrowUp);
        System.out.println("Controlando aqui");
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void verifyTest1IsDisplayed()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(categoryTest1);
        isDisplayed(categoryTest1);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonTests()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonTests);
        isDisplayed(buttonTests);
        click(buttonTests);
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonCategoriesTests()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCategoriesTests);
        isDisplayed(buttonCategoriesTests);
        click(buttonCategoriesTests);
        pause(3000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonAddCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonAddCategory);
        isDisplayed(buttonAddCategory);
        click(buttonAddCategory);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void inputDataAddCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String name = "CategoryTest";
        String description = "Qa test";

        waitElements(inputNameAddCategory);
        inputNameAddCategory.sendKeys(Keys.CONTROL + "a");
        inputNameAddCategory.sendKeys(Keys.DELETE);
        inputNameAddCategory.sendKeys(Keys.ENTER);
        write(inputNameAddCategory,name);
        pause(200);
        waitElements(inputDescriptionAddCategory);
        inputDescriptionAddCategory.sendKeys(Keys.CONTROL + "a");
        inputDescriptionAddCategory.sendKeys(Keys.DELETE);
        inputDescriptionAddCategory.sendKeys(Keys.ENTER);
        write(inputDescriptionAddCategory,description);


        driver.switchTo().parentFrame();
    }
    public void inputDataEditCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String name = "CategoryTest";
        String description = "Test Modified";

        waitElements(inputNameAddCategory);
        inputNameAddCategory.sendKeys(Keys.CONTROL + "a");
        inputNameAddCategory.sendKeys(Keys.DELETE);
        inputNameAddCategory.sendKeys(Keys.ENTER);
        write(inputNameAddCategory,name);
        pause(200);
        waitElements(inputDescriptionAddCategory);
        inputDescriptionAddCategory.sendKeys(Keys.CONTROL + "a");
        inputDescriptionAddCategory.sendKeys(Keys.DELETE);
        inputDescriptionAddCategory.sendKeys(Keys.ENTER);
        write(inputDescriptionAddCategory,description);


        driver.switchTo().parentFrame();
    }

    public void inputDataEditedCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String name = "Test4";
        String description = "Test Modified";

        waitElements(inputNameAddCategory);
        inputNameAddCategory.sendKeys(Keys.CONTROL + "a");
        inputNameAddCategory.sendKeys(Keys.DELETE);
        inputNameAddCategory.sendKeys(Keys.ENTER);
        write(inputNameAddCategory,name);
        pause(200);
        waitElements(inputDescriptionAddCategory);
        inputDescriptionAddCategory.sendKeys(Keys.CONTROL + "a");
        inputDescriptionAddCategory.sendKeys(Keys.DELETE);
        inputDescriptionAddCategory.sendKeys(Keys.ENTER);
        write(inputDescriptionAddCategory,description);


        driver.switchTo().parentFrame();
    }

    public void clickButtonCancelAddNewCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonCancelAddNewCategory);
        isDisplayed(buttonCancelAddNewCategory);
        click(buttonCancelAddNewCategory);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickButtonSaveAddNewCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonSaveAddNewCategory);
        isDisplayed(buttonSaveAddNewCategory);
        click(buttonSaveAddNewCategory);
        pause(1500);
        driver.switchTo().parentFrame();
    }
    public void clickButtonSaveAddNewCategoryAcceptAlert()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonSaveAddNewCategory);
        isDisplayed(buttonSaveAddNewCategory);
        click(buttonSaveAddNewCategory);
        pause(1000);
        driver.switchTo().alert().accept();
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void clickButtonEditCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonEditCategory);
        isDisplayed(buttonEditCategory);
        click(buttonEditCategory);
        pause(500);
        driver.switchTo().parentFrame();
    }
    public void clickButtonEditCategoryTest3()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonEditCategoryTest3);
        isDisplayed(buttonEditCategoryTest3);
        click(buttonEditCategoryTest3);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void clickButtonDeleteCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDeleteCategory);
        isDisplayed(buttonDeleteCategory);
        click(buttonDeleteCategory);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteCategoryAndCancel()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDeleteCategory);
        isDisplayed(buttonDeleteCategory);
        click(buttonDeleteCategory);
        pause(2000);
        driver.switchTo().alert().dismiss();
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteCategoryAndAccept()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDeleteCategory);
        isDisplayed(buttonDeleteCategory);
        click(buttonDeleteCategory);
        pause(2000);
        driver.switchTo().alert().accept();
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteCategoryAndDismiss()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDeleteCategory);
        isDisplayed(buttonDeleteCategory);
        click(buttonDeleteCategory);
        pause(2000);
        driver.switchTo().alert().dismiss();
        pause(1000);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteCategoryTest1()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(buttonDeleteTest1);
        isDisplayed(buttonDeleteTest1);
        click(buttonDeleteTest1);
        pause(1500);
        driver.switchTo().alert().accept();
        pause(1500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
    }

    public void clickButtonAddTest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(buttonAddNewTest);
        waitElements(buttonAddNewTest);
        isDisplayed(buttonAddNewTest);
        click(buttonAddNewTest);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonIncrease()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(buttonIncrease);
        waitElements(buttonIncrease);
        pause(200);
        click(buttonIncrease);
        pause(300);
        click(buttonIncrease);
        pause(300);
        click(buttonIncrease);
        pause(300);
        click(buttonIncrease);
        pause(300);

        driver.switchTo().parentFrame();
    }

    public void inputDataAddTest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String name = "ATestQA";
        String description = "Qa test";
        pause(300);

        waitElements(inputNameAddTest);
        inputNameAddTest.sendKeys(Keys.CONTROL + "a");
        inputNameAddTest.sendKeys(Keys.DELETE);
        inputNameAddTest.sendKeys(Keys.ENTER);
        write(inputNameAddTest,name);
        pause(200);
        waitElements(inputDescriptionAddTest);
        inputDescriptionAddTest.sendKeys(Keys.CONTROL + "a");
        inputDescriptionAddTest.sendKeys(Keys.DELETE);
        inputDescriptionAddTest.sendKeys(Keys.ENTER);
        write(inputDescriptionAddTest,description);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteQaTestAndCancel()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        scrollToElementMove(buttonDeleteQaTest);
        isDisplayed(buttonDeleteQaTest);
        click(buttonDeleteQaTest);
        pause(200);
        driver.switchTo().alert().dismiss();
        pause(300);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDeleteQaTestAndAccept()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        scrollToElementMove(buttonDeleteQaTest);
        pause(200);
        isDisplayed(buttonDeleteQaTest);
        click(buttonDeleteQaTest);
        pause(200);
        driver.switchTo().alert().accept();
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
    }

    public void clickButtonEditTestSelected()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(nameEditTest);
        click(buttonEditTestSelected);
        pause(300);
        driver.switchTo().parentFrame();
    }

    public void inputDataEditTest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String name = "ATestQA Modified";
        String description = "Test Modified";
        pause(300);

        waitElements(inputNameAddTest);
        inputNameAddTest.sendKeys(Keys.CONTROL + "a");
        inputNameAddTest.sendKeys(Keys.DELETE);
        inputNameAddTest.sendKeys(Keys.ENTER);
        write(inputNameAddTest,name);
        pause(200);

        waitElements(inputDescriptionTestSelected);
        inputDescriptionTestSelected.sendKeys(Keys.CONTROL + "a");
        inputDescriptionTestSelected.sendKeys(Keys.DELETE);
        inputDescriptionTestSelected.sendKeys(Keys.ENTER);
        write(inputDescriptionTestSelected,description);
        pause(200);
        driver.switchTo().parentFrame();
    }

    public void inputDataDoubletTest()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        String name = "Urodinámica";
        String description = "Test Modified";
        pause(300);

        waitElements(inputNameAddTest);
        inputNameAddTest.sendKeys(Keys.CONTROL + "a");
        inputNameAddTest.sendKeys(Keys.DELETE);
        inputNameAddTest.sendKeys(Keys.ENTER);
        write(inputNameAddTest,name);
        pause(200);

        waitElements(inputDescriptionTestSelected);
        inputDescriptionTestSelected.sendKeys(Keys.CONTROL + "a");
        inputDescriptionTestSelected.sendKeys(Keys.DELETE);
        inputDescriptionTestSelected.sendKeys(Keys.ENTER);
        write(inputDescriptionTestSelected,description);
        pause(200);
        driver.switchTo().parentFrame();
    }
    public void clickButtonDropDownTestCategory()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        isDisplayed(dropDownTestCategory);
        click(dropDownTestCategory);
        pause(300);
        waitElements(optionTestCategory);
        click(optionTestCategory);
        driver.switchTo().parentFrame();
    }
    public void dragAndDropFromLeft()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        dragAndDrop(citologiaExamination,areaDrop);
        pause(2000);
        driver.switchTo().parentFrame();
    }

    public void dragAndDropLeftToRight()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(200);
        dragAndDrop(citologiaInAreaDrop,citologiaExamination);
        pause(2000);
        driver.switchTo().parentFrame();
    }
    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
