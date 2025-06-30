package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ReviewsModulePage;
import auto.framework.selenium.pages.baxter_page.SupplementaryTestsModulePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReviewsSteps {

    @LazyAutowired

    private ReviewsModulePage ReviewsModulePage;




    @Then("I check the module Reviews appear correctly")
    public void iCheckTheModuleReviewsAppearCorrectly() {
        ReviewsModulePage.isDisplayedTheTittle();

    }
    @And("I create successful new review {string}")
    public void iCreateSuccessfulNewReview(String data) throws InterruptedException {
        ReviewsModulePage.createNewReview(data);
    }
    @And("I verify that the new review was created")
    public void iVerifyThatTheNewReviewWasCreated() throws InterruptedException {
        ReviewsModulePage.verifyThatTheNewReviewWasCreated();
    }

    @Then("I successfully delete the review created")
    public void iSuccessfullyDeleteTheReviewCreated() throws InterruptedException{
        ReviewsModulePage.successfullyDeleteTheReviewCreated();
    }
    @And("I cancel creating a new review {string}")
    public void iCancelCreatingNewReview(String data) throws InterruptedException {
        ReviewsModulePage.cancelCreatingNewReview(data);
    }

    @And("I try to create new review with empty required fields {string}")
    public void iTryToCreateNewReviewWithEmptyRequiredFields(String data) throws InterruptedException{
        ReviewsModulePage.tryToCreateNewReviewWithEmptyRequiredFields(data);
    }

    @And("I try to edit the review created but I cancel it {string}")
    public void iTryToEditTheReviewCreatedButICancelIt(String data) throws InterruptedException{
        ReviewsModulePage.tryToEditTheReviewCreatedButICancelIt(data);
    }


    @And("I edit the review created successful {string}")
    public void iEditTheReviewCreatedSuccessful(String data) throws InterruptedException{
        ReviewsModulePage.successfulEditedClinicalEncounter(data);
    }

    @And("I try to edit review with the required fields empty {string}")
    public void iTryToEditReviewWithTheRequiredFieldsEmpty(String data) throws InterruptedException{
        ReviewsModulePage.tryToEditReviewWithTheRequiredFieldsEmpty(data);
    }

    @And("I cancelling delete the review created")
    public void iCancellingDeleteTheReviewCreated() throws InterruptedException{
        ReviewsModulePage.cancellingDeleteTheReviewCreated();
    }


    @And("I use selection with filters")
    public void iUseSelectionWithFilters() throws InterruptedException{
        ReviewsModulePage.useSelectionWithFilters();
    }

}
