package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class ReviewsModulePage extends BasePage<ReviewsModulePage>{


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/div/ng-form/div/div/div/div[1]/h2")
    private WebElement titleReviews;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'icon-three-points')]")
    private WebElement buttonThreePoints;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'New review')]")
    private WebElement buttonNewReview;

    @FindBy(how = How.XPATH, using = "//span[contains(@type,'button')]")
    private WebElement buttonDropDownTypeOfConsultation;

    @FindBy(how = How.XPATH, using = "(//li[contains(.,'Consulta alta precoz')])[3]")
    private WebElement optionTypeOfConsultation;

    @FindBy(how = How.XPATH, using = "(//li[contains(.,'Consulta enfermería')])[4]")
    private WebElement optionTypeOfConsultation2;

    @FindBy(how = How.XPATH, using = "(//li[@tabindex='-1'])[48]")
    private WebElement optionTypeOfConsultationEmpty;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'see list')]")
    private WebElement buttonSeeListReasonOfConsultation;

    @FindBy(how = How.XPATH, using = "//h4[@class='modal-title'][contains(.,'Reason for consultation')]")
    private WebElement titleModalReasonOfConsultation;

    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'check-box')])[1]")
    private WebElement checkboxSelectItem;
    @FindBy(how = How.XPATH, using = "(//label[contains(@class,'check-box')])[3]")
    private WebElement checkboxSelectItem2;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Select')]")
    private WebElement buttonSelectReason;

    @FindBy(how = How.CSS, using = "iframe.k-content")
    private WebElement iframeReviewData;

    @FindBy(how = How.XPATH, using = "/html/body")
    private WebElement TextAreaReviewData;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-save')]")
    private WebElement buttonSaveNewReview;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-undo')]")
    private WebElement buttonCancelNewReview;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-undo']")
    private WebElement buttonCancelEditReview;

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'Review')]")
    private WebElement titleReviewCreated;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-trash')]")
    private WebElement buttonDeleteReview;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'Yes')]")
    private WebElement buttonYesDeleteReview;

    @FindBy(how = How.XPATH, using = "//button[contains(.,'No')]")
    private WebElement buttonNoDeleteReview;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'There is no data to show')]")
    private WebElement messageNoDataToShow;

    @FindBy(how = How.XPATH, using = "//i[@class='fa fa-pencil']")
    private WebElement buttonEditReview;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Top')]")
    private WebElement buttonArrowUp;

    @FindBy(how = How.XPATH, using = "//a[contains(.,'Filter')]")
    private WebElement buttonFiltersOptions;

    @FindBy(how = How.XPATH, using = "//span[contains(.,'Filter reviews:')]")
    private WebElement titleFilterReviews;

    @FindBy(how = How.XPATH, using = "//i[contains(@class,'fa fa-close')]")
    private WebElement buttonCloseFilterReviews;

    @FindBy(how = How.XPATH, using = "(//label[@class='radio-text'])[1]")
    private WebElement checkBoxLast3Months;

    @FindBy(how = How.XPATH, using = "(//label[@class='radio-text'])[2]")
    private WebElement checkBoxLast6Months;

    @FindBy(how = How.XPATH, using = "(//label[@class='radio-text'])[5]")
    private WebElement checkBoxNursing;

    @FindBy(how = How.XPATH, using = "(//label[@class='radio-text'])[6]")
    private WebElement checkBoxPhysicians;

    @FindBy(how = How.XPATH, using = "(//button[@role='button'])[1]")
    private WebElement buttonDropDownPerformedBy;

    @FindBy(how = How.XPATH, using = "(//span[contains(@class,'k-list-item-text')])[1]")
    private WebElement optionPerformedBy;

    @FindBy(how = How.XPATH, using = "(//button[@role='button'])[2]")
    private WebElement buttonDropDownTypeOfConsultationFilters;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Consulta DP')])[2]")
    private WebElement optionTypeOfConsultationFilters1;

    @FindBy(how = How.XPATH, using = "(//span[contains(.,'Consulta alta precoz')])[2]")
    private WebElement optionTypeOfConsultationFilters2;

    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleReviews);
        titleReviews.isDisplayed();
        driver.switchTo().parentFrame();
    }


    @Override
    public boolean isAt() {
        return false;
    }

    //*********Page Methods*********

    public void createNewReview(String data) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(200);
        click(buttonNewReview);
        pause(500);
        click(buttonDropDownTypeOfConsultation);
        waitElements(optionTypeOfConsultation);
        click(optionTypeOfConsultation);
        pause(500);
        click(buttonSeeListReasonOfConsultation);
        waitElements(titleModalReasonOfConsultation);
        isDisplayed(titleModalReasonOfConsultation);
        click(checkboxSelectItem);
        pause(500);
        click(buttonSelectReason);

        driver.switchTo().frame(iframeReviewData);

        write(TextAreaReviewData, data);
        driver.switchTo().parentFrame();

        pause(500);
        click(buttonSaveNewReview);
        driver.switchTo().parentFrame();

    }
    public void verifyThatTheNewReviewWasCreated() throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        pause(500);
        waitElements(titleReviewCreated);
        titleReviewCreated.isDisplayed();
        driver.switchTo().parentFrame();

    }
    public void successfullyDeleteTheReviewCreated()  throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonDeleteReview);
        driver.switchTo().parentFrame();

        pause(500);
        click(buttonYesDeleteReview);
        pause(300);

        driver.switchTo().frame("frmContenido");
        waitElements(messageNoDataToShow);
        isDisplayed(messageNoDataToShow);
        driver.switchTo().parentFrame();

    }
    public void cancellingDeleteTheReviewCreated()  throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonDeleteReview);
        driver.switchTo().parentFrame();

        pause(500);
        click(buttonNoDeleteReview);
        pause(300);


    }

    public void cancelCreatingNewReview(String data) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(200);
        click(buttonNewReview);
        pause(500);
        click(buttonDropDownTypeOfConsultation);
        waitElements(optionTypeOfConsultation);
        click(optionTypeOfConsultation);
        pause(500);
        click(buttonSeeListReasonOfConsultation);
        waitElements(titleModalReasonOfConsultation);
        isDisplayed(titleModalReasonOfConsultation);
        click(checkboxSelectItem);
        pause(500);
        click(buttonSelectReason);

        driver.switchTo().frame(iframeReviewData);

        write(TextAreaReviewData, data);
        driver.switchTo().parentFrame();

        pause(500);
        click(buttonCancelNewReview);

        waitElements(messageNoDataToShow);
        isDisplayed(messageNoDataToShow);

        driver.switchTo().parentFrame();

    }
    public void tryToCreateNewReviewWithEmptyRequiredFields(String data) throws InterruptedException{
        driver.switchTo().frame("frmContenido");
        click(buttonThreePoints);
        pause(200);
        click(buttonNewReview);
        pause(500);
        driver.switchTo().frame(iframeReviewData);
        pause(3000);
        write(TextAreaReviewData, data);
        driver.switchTo().parentFrame();
        click(buttonSeeListReasonOfConsultation);
        waitElements(titleModalReasonOfConsultation);
        isDisplayed(titleModalReasonOfConsultation);
        click(checkboxSelectItem);
        pause(500);
        click(buttonSelectReason);

        driver.switchTo().parentFrame();
    }

    public void tryToEditTheReviewCreatedButICancelIt(String data) throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        click(buttonEditReview);
        pause(400);

        click(buttonSeeListReasonOfConsultation);
        pause(500);
        waitElements(titleModalReasonOfConsultation);
        isDisplayed(titleModalReasonOfConsultation);
        click(checkboxSelectItem2);
        pause(500);
        click(buttonSelectReason);
        pause(500);
        driver.switchTo().parentFrame();
        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");

        click(buttonDropDownTypeOfConsultation);
        waitElements(optionTypeOfConsultation2);
        click(optionTypeOfConsultation2);


        driver.switchTo().frame(iframeReviewData);

        pause(300);
        TextAreaReviewData.sendKeys(Keys.CONTROL + "a");
        TextAreaReviewData.sendKeys(Keys.DELETE);
        write(TextAreaReviewData, data);

        driver.switchTo().parentFrame();


        pause(500);
        waitElements(buttonCancelEditReview);
        click(buttonCancelEditReview);

        driver.switchTo().parentFrame();

    }

    public void successfulEditedClinicalEncounter(String data) throws InterruptedException {

        driver.switchTo().frame("frmContenido");
        click(buttonEditReview);
        pause(400);

        click(buttonSeeListReasonOfConsultation);
        pause(500);
        waitElements(titleModalReasonOfConsultation);
        isDisplayed(titleModalReasonOfConsultation);
        click(checkboxSelectItem2);
        pause(500);
        click(buttonSelectReason);
        pause(500);
        driver.switchTo().parentFrame();
        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");

        click(buttonDropDownTypeOfConsultation);
        waitElements(optionTypeOfConsultation2);
        click(optionTypeOfConsultation2);


        driver.switchTo().frame(iframeReviewData);

        pause(300);
        TextAreaReviewData.sendKeys(Keys.CONTROL + "a");
        TextAreaReviewData.sendKeys(Keys.DELETE);
        write(TextAreaReviewData, data);

        driver.switchTo().parentFrame();


        pause(500);
        waitElements(buttonSaveNewReview);
        click(buttonSaveNewReview);

        driver.switchTo().parentFrame();
    }

    public void tryToEditReviewWithTheRequiredFieldsEmpty(String data) throws InterruptedException{

        driver.switchTo().frame("frmContenido");
        click(buttonEditReview);
        pause(400);

        click(buttonSeeListReasonOfConsultation);
        pause(500);
        waitElements(titleModalReasonOfConsultation);
        isDisplayed(titleModalReasonOfConsultation);
        click(checkboxSelectItem2);
        pause(500);
        click(buttonSelectReason);
        pause(500);
        driver.switchTo().parentFrame();
        click(buttonArrowUp);
        pause(500);

        driver.switchTo().frame("frmContenido");

        click(buttonDropDownTypeOfConsultation);
        waitElements(optionTypeOfConsultationEmpty);
        click(optionTypeOfConsultationEmpty);


        driver.switchTo().frame(iframeReviewData);

        pause(300);
        TextAreaReviewData.sendKeys(Keys.CONTROL + "a");
        TextAreaReviewData.sendKeys(Keys.DELETE);
        write(TextAreaReviewData, data);

        driver.switchTo().parentFrame();


        pause(500);
        waitElements(buttonCancelEditReview);
        click(buttonCancelEditReview);

        driver.switchTo().parentFrame();

    }




     public void useSelectionWithFilters() throws InterruptedException{
         click(buttonArrowUp);
         pause(500);
         driver.switchTo().frame("frmContenido");
         click(buttonThreePoints);
         pause(500);
         click(buttonFiltersOptions);
         waitElements(titleFilterReviews);
         titleFilterReviews.isDisplayed();
         pause(500);
         click(checkBoxLast3Months);
         pause(200);
         click(checkBoxLast6Months);
         pause(200);
         click(checkBoxNursing);
         pause(300);
         click(checkBoxPhysicians);
         pause(200);
         click(buttonDropDownPerformedBy);
         pause(300);
         click(optionPerformedBy);
         click(buttonDropDownTypeOfConsultationFilters);
         pause(200);
         click(optionTypeOfConsultationFilters1);
         pause(200);
         click(buttonDropDownTypeOfConsultationFilters);
         pause(200);
         click(optionTypeOfConsultationFilters2);
         driver.switchTo().parentFrame();
         pause(200);
         click(buttonArrowUp);

         driver.switchTo().frame("frmContenido");
         click(buttonCloseFilterReviews);
         driver.switchTo().parentFrame();

     }

}
