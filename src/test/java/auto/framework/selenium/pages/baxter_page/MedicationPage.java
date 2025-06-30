package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;


@LazyComponent
public class MedicationPage extends BasePage<MedicationPage>{

    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Medication')]")
    private WebElement titleMedication;

    @FindBy(how = How.XPATH, using = "//button[@class='float-options icon-three-points']")
    private WebElement buttonThreePoints;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'NEW')]")
    private WebElement buttonNewMedication;

    @FindBy(how = How.XPATH, using = "(//a[contains(@id,'Arrow')])[2]")
    private WebElement buttonCategoryDropDown;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'A01 - PREPARADOS ESTOMATOLÓGICOS')]")
    private WebElement optionCategoryA01;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'B01 - AGENTES ANTITROMBÓTICOS')]")
    private WebElement optionCategoryB01;

    @FindBy(how = How.XPATH, using = "(//a[contains(@id,'Arrow')])[5]")
    private WebElement buttonRouteDropDown;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Oral')]")
    private WebElement optionRouteOral;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Endovenosa')]")
    private WebElement optionRouteEndovenosa;

    @FindBy(how = How.XPATH, using = "(//input[contains(@id,'Input')])[3]")
    private WebElement buttonMedicationDropDown;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'A.A.S. 500 mg comprimidos , 500 comprimidos')]")
    private WebElement optionMedication500mg;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'A.A.S. 100MG 20 COMPRIMIDOS')]")
    private WebElement optionMedicationAAS;

    @FindBy(how = How.XPATH, using = "(//a[contains(@id,'Arrow')])[6]")
    private WebElement buttonFrequencyDropDown;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[6]")
    private WebElement optionFrequencyFriday;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'Semanal')]")
    private WebElement optionFrequencySemanal;

    @FindBy(how = How.XPATH, using = "(//label[contains(@for,'chkFrecuenciaDias')])[2]")
    private WebElement checkBoxMondayOption ;


    @FindBy(how = How.XPATH, using = "//a[contains(.,'SAVE')]")
    private WebElement buttonSaveMedication;
    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "//button[text()='Aceptar']")
    private WebElement buttonAceptarModal;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'checkbox')])[18]")
    private WebElement checkBoxIfNeeded ;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl00_mainContent_dvMedicacion_RDPFechaInicio_dateInput']")
    private WebElement inputStartDate ;

    @FindBy(how = How.XPATH, using = "//input[@id='ctl00_mainContent_dvMedicacion_RDPFechaParada_dateInput']")
    private WebElement inputStopDate ;


    @FindBy(how = How.XPATH, using = "(//a[contains(@id,'Arrow')])[4]")
    private WebElement buttonAdministrationLocationDropDown ;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Casa')]")
    private WebElement optionAdministrationLocationCasa ;

    @FindBy(how = How.XPATH, using = "//li[contains(.,'Tratamiento')]")
    private WebElement optionAdministrationLocationTratamiento ;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[19]")
    private WebElement checkBoxVariableDose ;

    @FindBy(how = How.XPATH, using = "//input[@name='ctl00$mainContent$dvMedicacion$rtbPosologia']")
    private WebElement inputDosage ;

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'rtbEPO')][@name='ctl00$mainContent$dvMedicacion$rtbEPO']")
    private WebElement inputDosagePerDose ;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[15]")
    private WebElement inputDosageSession ;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@id,'ctl00_mainContent_dvMedicacion_RTBObservaciones')]")
    private WebElement textAreaObservation ;

    @FindBy(how = How.XPATH, using = "(//td[contains(@class,'rgSorted')])[1]")
    private WebElement textMedicationWasAdded ;

    @FindBy(how = How.XPATH, using = "//span[contains(@id,'labelEliminación')][@class='align-center'][contains(.,'You are about to delete a medication. Confirm or cancel the deletion.')]")
    private WebElement textModalDeleteMedicationOptions ;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'IBTNEliminar')][@class='boton'][contains(.,'REMOVE')]")
    private WebElement buttonDeleteMedication ;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement inputPasswordDeleteMedication;

    @FindBy(how = How.XPATH, using = "//textarea[contains(@id,'TextMotivo')]")
    private WebElement textAreaReason ;

    @FindBy(how = How.XPATH, using = "//input[@value='Accept']")
    private WebElement buttonAcceptDeleteMedication;

    @FindBy(how = How.XPATH, using = "//input[@value='Cancel']")
    private WebElement buttonCancelDeleteMedication;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[18]")
    private WebElement inputVariableDoseMonday;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[19]")
    private WebElement inputVariableDoseTuesday;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[20]")
    private WebElement inputVariableDoseWednesday;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[21]")
    private WebElement inputVariableDoseThursday;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[22]")
    private WebElement inputVariableDoseFriday;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[23]")
    private WebElement inputVariableDoseSaturday;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'text')])[24]")
    private WebElement inputVariableDoseSunday;

    @FindBy(how = How.XPATH, using = "(//td[contains(.,'Oral')])[1]")
    private WebElement optionMedicationSelected;


    @FindBy(how = How.XPATH, using = "//a[contains(.,'COPY')]")
    private WebElement buttonCopyMedication ;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'EDIT')]")
    private WebElement buttonEditMedication ;

    @FindBy(how = How.XPATH, using = "(//input[@type='checkbox'])[1]")
    private WebElement checkBoxShowActive ;

    @FindBy(how = How.XPATH, using = "//a[contains(@id,'Arrow')]")
    private WebElement buttonCategoryDropDownTop ;

    @FindBy(how = How.XPATH, using = "(//input[contains(@id,'chk1')][@type='checkbox'])[1]")
    private WebElement checkBoxAllCategory ;

    @FindBy(how = How.XPATH, using = "//label[contains(.,'B03 - PREPARADOS ANTIANÉMICOS')]")
    private WebElement checkBoxPreparadosAntianemicos ;

    @FindBy(how = How.XPATH, using = "(//input[contains(@type,'checkbox')])[2]")
    private WebElement checkBoxShowHomeOnly ;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Penicilina G Benzatina')]")
    private WebElement linkAllergyPenicillin ;




    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleMedication);
        titleMedication.isDisplayed();
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********

    public void verifyThatTheFieldsToAddANewMedicationAreEmpty() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonRouteDropDown);
        click(buttonCategoryDropDown);
        pause(300);
        click(optionCategoryA01);
        pause(300);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);




    }
    public void tryToAddNewMedicationWithCategoryOnly() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonRouteDropDown);
        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryA01);
        click(optionCategoryA01);
        pause(300);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();

    }

    public void tryToCreateANewMedicationWithEmptyData() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonRouteDropDown);
        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryA01);
        pause(300);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();

    }

    public void tryToAddNewMedicationWithFrequencyOnly() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonRouteDropDown);
        click(buttonFrequencyDropDown);
        pause(300);
        waitElements(checkBoxMondayOption);
        click(checkBoxMondayOption);
        pause(300);
        click(buttonFrequencyDropDown);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();

    }
    public void tryToSaveIfNeededChecked() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonRouteDropDown);
        pause(300);
        waitElements(checkBoxIfNeeded);
        click(checkBoxIfNeeded);
        pause(300);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
    }

    public void tryToAddNewMedicationWithMedicationOnly() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonFrequencyDropDown);
        pause(300);
        click(buttonMedicationDropDown);
        pause(300);
        waitElements(optionMedication500mg);
        click(optionMedication500mg);

        pause(300);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
    }



    public void tryToAddNewMedicationWithRouteOnly() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);
        click(buttonRouteDropDown);
        pause(300);
        waitElements(optionRouteEndovenosa);
        click(optionRouteEndovenosa);

        pause(300);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
    }

    public void tryToSaveWithOverlappingDateDistinctLocationAndSameLocationParametersStart(String startData, String dosage, String dosagePerDose, String dosageSession, String textArea) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);


        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryA01);
        click(optionCategoryA01);
        pause(300);
        waitElements(buttonMedicationDropDown);
        click(buttonMedicationDropDown);
        pause(300);
        waitElements(optionMedication500mg);
        click(optionMedication500mg);
        pause(300);
        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryA01);
        click(optionCategoryA01);
        pause(300);
        click(inputStartDate);
        inputStartDate.sendKeys(Keys.CONTROL +"a");
        inputStartDate.sendKeys(Keys.DELETE);
        pause(200);
        write(inputStartDate, startData);
        click(buttonAdministrationLocationDropDown);
        pause(200);
        waitElements(optionAdministrationLocationCasa);
        click(optionAdministrationLocationCasa);
        pause(300);
        click(buttonRouteDropDown);
        waitElements(optionRouteOral);
        click(optionRouteOral);
        pause(300);
        click(buttonFrequencyDropDown);
        waitElements(optionFrequencyFriday);
        click(optionFrequencyFriday);

        pause(200);
        click(inputDosage);
        inputDosage.sendKeys(Keys.CONTROL + "a");
        inputDosage.sendKeys(Keys.DELETE);
        write(inputDosage, dosage);
        pause(200);
        click(inputDosageSession);
        inputDosageSession.sendKeys(Keys.CONTROL + "a");
        inputDosageSession.sendKeys(Keys.DELETE);
        write(inputDosageSession, dosageSession);
        pause(200);
        waitElements(inputDosagePerDose);
        click(inputDosagePerDose);
        inputDosagePerDose.sendKeys(Keys.CONTROL + "a");
        inputDosagePerDose.sendKeys(Keys.DELETE);
        write(inputDosagePerDose, dosagePerDose);
        pause(200);
        click(textAreaObservation);
        write(textAreaObservation, textArea);

        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);

        driver.switchTo().parentFrame();

    }

    public void tryToSaveWithOverlappingDateSameLocationAndSameLocationParametersStart(String startData, String dosage, String dosagePerDose, String dosageSession, String textArea) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);


        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryB01);
        click(optionCategoryB01);
        pause(300);
        waitElements(buttonMedicationDropDown);
        click(buttonMedicationDropDown);
        pause(300);
        waitElements(optionMedicationAAS);
        click(optionMedicationAAS);
        pause(300);
        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryB01);
        click(optionCategoryB01);
        pause(300);
        click(inputStartDate);
        inputStartDate.sendKeys(Keys.CONTROL +"a");
        inputStartDate.sendKeys(Keys.DELETE);
        pause(200);
        write(inputStartDate, startData);
        click(buttonAdministrationLocationDropDown);
        pause(200);
        waitElements(optionAdministrationLocationTratamiento);
        click(optionAdministrationLocationTratamiento);
        pause(300);
        click(buttonRouteDropDown);
        waitElements(optionRouteOral);
        click(optionRouteOral);
        pause(300);
        click(buttonFrequencyDropDown);
        waitElements(optionFrequencyFriday);
        click(optionFrequencyFriday);

        pause(200);
        click(inputDosage);
        inputDosage.sendKeys(Keys.CONTROL + "a");
        inputDosage.sendKeys(Keys.DELETE);
        write(inputDosage, dosage);
        pause(200);
        click(inputDosageSession);
        inputDosageSession.sendKeys(Keys.CONTROL + "a");
        inputDosageSession.sendKeys(Keys.DELETE);
        write(inputDosageSession, dosageSession);
        pause(200);
        waitElements(inputDosagePerDose);
        click(inputDosagePerDose);
        inputDosagePerDose.sendKeys(Keys.CONTROL + "a");
        inputDosagePerDose.sendKeys(Keys.DELETE);
        write(inputDosagePerDose, dosagePerDose);
        pause(200);
        click(textAreaObservation);
        write(textAreaObservation, textArea);

        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(3500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();

    }

    public void verifyThatTheNewMedicationWasAdded()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(textMedicationWasAdded);
        textMedicationWasAdded.isDisplayed();
        driver.switchTo().parentFrame();

    }

    public void removeTheAddedMedicationConfirmTheReason(String reason) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(textMedicationWasAdded);
        textMedicationWasAdded.isDisplayed();
        click(textMedicationWasAdded);
        pause(200);
        click(buttonThreePoints);
        pause(200);
        waitElements(buttonDeleteMedication);
        click(buttonDeleteMedication);
        pause(200);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("deleteWin")));

        pause(300);
        String contra = "renal2";
        write(inputPasswordDeleteMedication, contra);
        write(textAreaReason, reason);
        click(buttonAcceptDeleteMedication);
        pause(3000);
        driver.switchTo().defaultContent();
        click(buttonArrowUp);
        pause(500);

        driver.switchTo().parentFrame();
    }

    public void tryToAddNewMedicationWithVariableDosageParametersStartDateDosageDosagePerDoseDosageSessionTextArea(String startData, String dosage, String dosageSession, String textArea)throws  InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);


        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryB01);
        click(optionCategoryB01);
        pause(300);
        waitElements(buttonMedicationDropDown);
        click(buttonMedicationDropDown);
        pause(300);
        waitElements(optionMedicationAAS);
        click(optionMedicationAAS);
        pause(300);
        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryB01);
        click(optionCategoryB01);
        pause(300);

        click(inputStartDate);
        inputStartDate.sendKeys(Keys.CONTROL +"a");
        inputStartDate.sendKeys(Keys.DELETE);
        pause(200);
        write(inputStartDate, startData);
        click(buttonAdministrationLocationDropDown);
        pause(200);
        waitElements(optionAdministrationLocationTratamiento);
        click(optionAdministrationLocationTratamiento);
        pause(300);
        click(buttonRouteDropDown);
        waitElements(optionRouteEndovenosa);
        click(optionRouteEndovenosa);
        pause(300);
        click(buttonFrequencyDropDown);
        waitElements(optionFrequencySemanal);
        click(optionFrequencySemanal);

        pause(200);
        click(inputDosage);
        inputDosage.sendKeys(Keys.CONTROL + "a");
        inputDosage.sendKeys(Keys.DELETE);
        write(inputDosage, dosage);

        pause(200);
        waitElements(inputDosagePerDose);
        click(inputDosagePerDose);
        inputDosageSession.sendKeys(Keys.CONTROL + "a");
        inputDosageSession.sendKeys(Keys.DELETE);
        write(inputDosageSession, dosageSession);
        pause(200);
        click(textAreaObservation);
        write(textAreaObservation, textArea);
        pause(200);
        click(checkBoxVariableDose);
        pause(300);

        String monday = "1";
        click(inputVariableDoseMonday);
        inputVariableDoseMonday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseMonday.sendKeys(Keys.DELETE);
        write(inputVariableDoseMonday, monday);
        pause(300);
        String tuesday = "2";
        click(inputVariableDoseTuesday);
        inputVariableDoseTuesday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseTuesday.sendKeys(Keys.DELETE);
        write(inputVariableDoseTuesday, tuesday);
        pause(300);
        String wednesday = "3";
        click(inputVariableDoseWednesday);
        inputVariableDoseWednesday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseWednesday.sendKeys(Keys.DELETE);
        write(inputVariableDoseWednesday, wednesday);
        pause(300);
        String thursday = "4";
        click(inputVariableDoseThursday);
        inputVariableDoseThursday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseThursday.sendKeys(Keys.DELETE);
        write(inputVariableDoseThursday, thursday);
        pause(300);
        String friday = "5";
        click(inputVariableDoseFriday);
        inputVariableDoseFriday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseFriday.sendKeys(Keys.DELETE);
        write(inputVariableDoseFriday, friday);

        String saturday = "6";
        click(inputVariableDoseSaturday);
        inputVariableDoseSaturday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseSaturday.sendKeys(Keys.DELETE);
        write(inputVariableDoseSaturday, saturday);

        String sunday = "7";
        click(inputVariableDoseSunday);
        inputVariableDoseSunday.sendKeys(Keys.CONTROL + "a");
        inputVariableDoseSunday.sendKeys(Keys.DELETE);
        write(inputVariableDoseSunday, sunday);

        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);

        driver.switchTo().parentFrame();
    }
    public void tryToCopyTheSelectedMedicationWithTheNewParameters(String dosage, String observations) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
         waitElements(optionMedicationSelected);
         click(optionMedicationSelected);
         pause(500);
         click(buttonThreePoints);
        pause(300);
        click(buttonCopyMedication);
        pause(300);
        click(inputDosage);
        inputDosage.sendKeys(Keys.CONTROL + "a");
        inputDosage.sendKeys(Keys.DELETE);
        write(inputDosage, dosage);
        pause(300);
        click(textAreaObservation);
        textAreaObservation.sendKeys(Keys.CONTROL + "a");
        textAreaObservation.sendKeys(Keys.DELETE);
        write(textAreaObservation, observations);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);

        driver.switchTo().parentFrame();
    }

    public void tryToCopyTheSelectedMedicationWithTheNewParametersAndPastStartDateDosageObservationsStartDate(String dosage, String observations, String startDate) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        waitElements(optionMedicationSelected);
        click(optionMedicationSelected);
        pause(500);
        click(buttonThreePoints);
        pause(300);
        click(buttonThreePoints);
        pause(300);
        click(buttonCopyMedication);
        pause(300);
        click(inputDosage);
        inputDosage.sendKeys(Keys.CONTROL + "a");
        inputDosage.sendKeys(Keys.DELETE);
        write(inputDosage, dosage);
        pause(300);
        click(textAreaObservation);
        textAreaObservation.sendKeys(Keys.CONTROL + "a");
        textAreaObservation.sendKeys(Keys.DELETE);
        write(textAreaObservation, observations);
        pause(300);
        click(inputStartDate);
        inputStartDate.sendKeys(Keys.CONTROL + "a");
        inputStartDate.sendKeys(Keys.DELETE);
        write(inputStartDate, startDate);
        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        driver.switchTo().alert().accept();
        driver.switchTo().parentFrame();
    }

    public void tryToAddNewMedicationWithParameters(String startDate, String dosage,String dosageSession, String textArea ) throws  InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(500);
        click(buttonNewMedication);
        pause(300);


        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryB01);
        click(optionCategoryB01);
        pause(300);
        waitElements(buttonMedicationDropDown);
        click(buttonMedicationDropDown);
        pause(300);
        waitElements(optionMedicationAAS);
        click(optionMedicationAAS);
        pause(300);
        click(buttonCategoryDropDown);
        pause(300);
        waitElements(optionCategoryB01);
        click(optionCategoryB01);
        pause(300);

        click(inputStartDate);
        inputStartDate.sendKeys(Keys.CONTROL +"a");
        inputStartDate.sendKeys(Keys.DELETE);
        pause(200);
        write(inputStartDate, startDate);
        click(buttonAdministrationLocationDropDown);
        pause(200);
        waitElements(optionAdministrationLocationTratamiento);
        click(optionAdministrationLocationTratamiento);
        pause(300);
        click(buttonRouteDropDown);
        waitElements(optionRouteEndovenosa);
        click(optionRouteEndovenosa);
        pause(300);
        click(buttonFrequencyDropDown);
        waitElements(optionFrequencySemanal);
        click(optionFrequencySemanal);

        pause(200);
        click(inputDosage);
        inputDosage.sendKeys(Keys.CONTROL + "a");
        inputDosage.sendKeys(Keys.DELETE);
        write(inputDosage, dosage);

        pause(200);
        waitElements(inputDosagePerDose);
        click(inputDosagePerDose);
        inputDosageSession.sendKeys(Keys.CONTROL + "a");
        inputDosageSession.sendKeys(Keys.DELETE);
        write(inputDosageSession, dosageSession);
        pause(200);
        click(textAreaObservation);
        write(textAreaObservation, textArea);
        pause(200);


        driver.switchTo().parentFrame();

        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);

        driver.switchTo().parentFrame();
    }

    public void removeTheAddedMedicationWithWrongPasswordAndTheWrongReason(String pswd, String reason) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(800);
        waitElements(textMedicationWasAdded);
        textMedicationWasAdded.isDisplayed();
        click(textMedicationWasAdded);
        pause(200);
        click(buttonThreePoints);
        pause(350);
        click(buttonThreePoints);
        waitElements(buttonDeleteMedication);
        click(buttonDeleteMedication);
        pause(200);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("deleteWin")));

        pause(300);

        write(inputPasswordDeleteMedication, pswd);
        write(textAreaReason, reason);
        click(buttonAcceptDeleteMedication);
        pause(300);
        driver.switchTo().alert().accept();
        pause(500);
        waitElements(buttonCancelDeleteMedication);
        click(buttonCancelDeleteMedication);
        driver.switchTo().defaultContent();

        driver.switchTo().parentFrame();
        pause(300);
        click(buttonArrowUp);
    }

    public void checkIfTheFieldsAreEditableDateStoppedAndObservations(String dateSttoped, String observations) throws  InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonEditMedication);
        click(buttonEditMedication);
        pause(500);
        waitElements(inputStopDate);
        click(inputStopDate);
        inputStopDate.sendKeys(Keys.CONTROL + "a");
        inputStopDate.sendKeys(Keys.DELETE);
        write(inputStopDate, dateSttoped);
        pause(200);
        click(textAreaObservation);
        textAreaObservation.sendKeys(Keys.CONTROL + "a");
        textAreaObservation.sendKeys(Keys.DELETE);
        write(textAreaObservation, observations);

        driver.switchTo().parentFrame();
        pause(300);
        click(buttonArrowUp);
    }

    public void modifiedTheMedicationInTheEndDateAndObservationsAndClickedShowInactive(String dateSttoped, String observations) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonEditMedication);
        click(buttonEditMedication);
        pause(500);
        waitElements(inputStopDate);
        click(inputStopDate);
        inputStopDate.sendKeys(Keys.CONTROL + "a");
        inputStopDate.sendKeys(Keys.DELETE);
        write(inputStopDate, dateSttoped);
        pause(200);
        click(textAreaObservation);
        textAreaObservation.sendKeys(Keys.CONTROL + "a");
        textAreaObservation.sendKeys(Keys.DELETE);
        write(textAreaObservation, observations);

        driver.switchTo().parentFrame();

        pause(300);
        click(buttonArrowUp);

        driver.switchTo().frame("frmContenido");
        pause(500);
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        pause(500);
        waitElements(checkBoxShowActive);
        click(checkBoxShowActive);
        pause(3000);
        click(checkBoxShowActive);
        driver.switchTo().parentFrame();

    }
    public void modifyTheMedicationInTheEndDateAndObservations(String dateSttoped, String observations) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        waitElements(buttonEditMedication);
        click(buttonEditMedication);
        pause(500);
        waitElements(inputStopDate);
        click(inputStopDate);
        inputStopDate.sendKeys(Keys.CONTROL + "a");
        inputStopDate.sendKeys(Keys.DELETE);
        write(inputStopDate, dateSttoped);
        pause(200);
        click(textAreaObservation);
        textAreaObservation.sendKeys(Keys.CONTROL + "a");
        textAreaObservation.sendKeys(Keys.DELETE);
        write(textAreaObservation, observations);

        driver.switchTo().parentFrame();

        pause(300);
        click(buttonArrowUp);

        driver.switchTo().frame("frmContenido");
        pause(500);
        click(buttonThreePoints);
        waitElements(buttonSaveMedication);
        click(buttonSaveMedication);
        driver.switchTo().parentFrame();
    }

    public void uncheckAllTheCategoriesAtTheTopCategoriesOfTheMedicationModule() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        buttonCategoryDropDownTop.click();
        waitElements(checkBoxAllCategory);
        click(checkBoxAllCategory);
        pause(5000);
        driver.switchTo().parentFrame();
    }
    public void checkedShowInactiveCheckbox()throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(checkBoxShowActive);
        click(checkBoxShowActive);
        pause(5000);
        click(checkBoxShowActive);
        driver.switchTo().parentFrame();
    }
    public void checkedOnlyOneMedicationCategoryInTopCombobox() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        buttonCategoryDropDownTop.click();
        waitElements(checkBoxAllCategory);
        click(checkBoxAllCategory);
        pause(5000);
        waitElements(checkBoxPreparadosAntianemicos);
        click(checkBoxPreparadosAntianemicos);
        pause(4000);

        driver.switchTo().parentFrame();
    }

    public void checkedShowOnlyHomeCheckBox() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(checkBoxShowHomeOnly);
        click(checkBoxShowHomeOnly);
        pause(8000);
        waitElements(checkBoxShowHomeOnly);
        click(checkBoxShowHomeOnly);
        pause(5000);
        driver.switchTo().parentFrame();
    }
    public void clickOnTheAllergiesLinkUnderPenicillin() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(linkAllergyPenicillin);
        click(linkAllergyPenicillin);
        pause(5000);
        driver.switchTo().parentFrame();
    }



}
