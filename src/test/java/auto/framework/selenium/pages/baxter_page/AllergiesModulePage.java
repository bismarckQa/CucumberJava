package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class AllergiesModulePage extends BasePage<AllergiesModulePage>{


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







    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleAllergies);
        titleAllergies.isDisplayed();
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }



    //*********Page Methods*********




    public void openMenuNewAllergies() throws InterruptedException {
        driver.switchTo().frame(0);
        click(MenuButtonNewAllergies);
        click(ButtonNewAllergy);
        driver.switchTo().parentFrame();
        pause(5000);
    }

    public void enterAllergyData(String observation) throws InterruptedException {
        driver.switchTo().frame(0);

        click(DropDownTypeAllergy);
        waitElements(SelectTheTypeOption);
        pause(500);
        click(SelectTheTypeOption);

        click(DropDownAllergy);
        click(SelectAllergyOption);

        click(DropDownSeverityAllergy);
        click(SelectTheSeverityOption);



        click(DropDownReaction);
        click(SelectReactionOption);


        driver.switchTo().frame(iframeObservations);
        write(TextAreaObservations, observation);
        driver.switchTo().parentFrame();

        pause(5000);


        driver.switchTo().parentFrame();


    }

    public void canceledCreateNewAllergy() throws InterruptedException {

        driver.switchTo().frame(0);
        click(CancelButtonAllergy);
        driver.switchTo().parentFrame();
        pause(5000);
    }

    public void successCreateNewAllergy() throws InterruptedException {

        driver.switchTo().frame(0);
        click(SaveButtonAllergy);
        driver.switchTo().parentFrame();
        pause(500);

    }

    public void checkNewAllergyCreated() throws InterruptedException {

        driver.switchTo().frame("frmContenido");
        waitElements(titlePageAllergiesAdded);
        titlePageAllergiesAdded.isDisplayed();
        driver.switchTo().parentFrame();
        pause(10000);

    }

    public void cancelRemoveAllergy() throws InterruptedException {
        driver.switchTo().frame("frmContenido");

        click(DeleteButtonAllergy);

        driver.switchTo().parentFrame();

        pause(500);
        driver.switchTo().parentFrame();

        waitElements(TitleModalDeleteAllergy);
        TitleModalDeleteAllergy. isDisplayed();

        click(CancelDeleteButtonAllergy);
        pause(500);

    }

    public void deleteAllergy() throws InterruptedException {

        driver.switchTo().frame("frmContenido");

        click(DeleteButtonAllergy);
        driver.switchTo().parentFrame();
        pause(1000);

        driver.switchTo().parentFrame();

        waitElements(TitleModalDeleteAllergy);
        TitleModalDeleteAllergy.isDisplayed();

        click(AcceptDeleteButtonAllergy);
        waitElements(mesaggeAllergyHasEliminated);
        mesaggeAllergyHasEliminated.isDisplayed();
        click(buttonOkDeleteAllergy);

        driver.switchTo().frame("frmContenido");
        pause(500);
        noDataAllergyTitle.isDisplayed();
        driver.switchTo().parentFrame();
    }

    public void enterAllergyDataFieldsEmpty(String observation) throws InterruptedException {
        driver.switchTo().frame(0);

        click(DropDownSeverityAllergy);
        click(SelectTheSeverityOption);

        click(DropDownReaction);
        click(SelectReactionOption);

        driver.switchTo().frame(iframeObservations);
        write(TextAreaObservations, observation);
        driver.switchTo().parentFrame();

        pause(5000);

        driver.switchTo().parentFrame();

    }

    public void enterAllergyDataActiveYes(String observation) throws InterruptedException{

        driver.switchTo().frame(0);

         click(DropDownTypeAllergy);
         waitElements(SelectTheTypeOption);
         pause(500);
        click(SelectTheTypeOption);

        click(DropDownAllergy);
        waitElements(SelectAllergyOption);
        click(SelectAllergyOption);

        click(DropDownSeverityAllergy);
        click(SelectTheSeverityOption);



        click(DropDownReaction);
        click(SelectReactionOption);

        click(buttonNoActiveAllergy);
        pause(500);
        click(buttonYesActiveAllergy);


        driver.switchTo().frame(iframeObservations);
        write(TextAreaObservations, observation);
        driver.switchTo().parentFrame();

        pause(5000);

        driver.switchTo().parentFrame();

    }


    public void verifyFilterActiveAllergy() throws InterruptedException {
        driver.switchTo().frame(0);

        click(MenuButtonNewAllergies);
        pause(500);

        click(buttonFilter);
        pause(500);

        waitElements(selectRadioInactiveWindowsFilterAllergies);
        click(selectRadioInactiveWindowsFilterAllergies);
        pause(500);
        waitElements(selectRadioActiveWindowsFilterAllergies);
        click(selectRadioActiveWindowsFilterAllergies);

        pause(500);
        waitElements(buttonCloseWindowsFilterAllergies);
        pause(500);
        click(buttonCloseWindowsFilterAllergies);

        waitElements(textFilterSelectedActive);
        textFilterSelectedActive.isDisplayed();


        driver.switchTo().parentFrame();
        pause(500);
    }


    public void tryEditAllergyWithBlankRequiredFields() throws InterruptedException{
        driver.switchTo().frame("frmContenido");

        click(buttonEditAllergy);
        pause(500);

        waitElements(titlePageAllergiesAdded);
        titlePageAllergiesAdded.isDisplayed();

        click(DropDownTypeAllergy);
        pause(500);

        waitElements(SelectOtrasTypeOption);
        click(SelectOtrasTypeOption);
        pause(3000);

        click(CancelButtonAllergy);
        pause(500);

        driver.switchTo().parentFrame();

    }

    public void tryEditAllergyButICancelIt(String observation) throws InterruptedException{

        driver.switchTo().frame("frmContenido");

        click(buttonEditAllergy);
        pause(500);

        waitElements(titlePageAllergiesAdded);
        titlePageAllergiesAdded.isDisplayed();


        click(DropDownAllergy);
        waitElements(SelectAllergyOption2);
        click(SelectAllergyOption2);


        click(DropDownTypeAllergy);
        pause(500);
        waitElements(SelectTheTypeOptionMedi);
        click(SelectTheTypeOptionMedi);

        click(DropDownSeverityAllergy);
        waitElements(SelectTheSeverityOption2);
        click(SelectTheSeverityOption2);
        pause(500);


        click(DropDownReaction);
        waitElements(SelectReactionOption2);
        pause(500);
        click(SelectReactionOption2);

        pause(500);

        write(TextAreaObservations, observation);
        driver.switchTo().parentFrame();


        driver.switchTo().frame("frmContenido");
        click(CancelButtonAllergy);
        driver.switchTo().parentFrame();
    }

    public void editTheAllergySuccessfully(String observation) throws InterruptedException{

        driver.switchTo().frame("frmContenido");

        click(buttonEditAllergy);
        pause(500);

        waitElements(titlePageAllergiesAdded);
        titlePageAllergiesAdded.isDisplayed();


        click(DropDownAllergy);
        waitElements(SelectAllergyOption2);
        click(SelectAllergyOption2);



        click(DropDownTypeAllergy);
        pause(500);
        waitElements(SelectTheTypeOptionMedi);
        click(SelectTheTypeOptionMedi);

        click(DropDownSeverityAllergy);
        waitElements(SelectTheSeverityOption2);
        click(SelectTheSeverityOption2);
        pause(500);


        click(DropDownReaction);
        waitElements(SelectReactionOption2);
        pause(500);
        click(SelectReactionOption2);

        pause(500);

        write(TextAreaObservations, observation);
        driver.switchTo().parentFrame();


        driver.switchTo().frame("frmContenido");
        click(SaveButtonAllergy);
        driver.switchTo().parentFrame();
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

        driver.switchTo().frame("frmContenido");
        pause(500);
        click(buttonYesNoKnownAllergies);
        driver.switchTo().parentFrame();
        pause(400);
        waitElements(messageConfirmKnownAllergies);
        messageConfirmKnownAllergies.isDisplayed();
        click(buttonYesConfirmKnownAllergies);
        pause(500);
    }

    public void verifiedSuccessfullyNoKnownAllergies() throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(messageConfirmPatientHasNoKnownAllergies);
        isDisplayed(messageConfirmPatientHasNoKnownAllergies);
        driver.switchTo().parentFrame();
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

}
