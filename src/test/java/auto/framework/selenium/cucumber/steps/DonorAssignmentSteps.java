package auto.framework.selenium.cucumber.steps;


import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.AccessesPage;
import auto.framework.selenium.pages.baxter_page.DonorAssignmentPage;
import io.cucumber.java.en.When;

public class DonorAssignmentSteps {

    @LazyAutowired

    private DonorAssignmentPage DonorAssignmentPage;




    @When("I check the module Donor Assignment appear correctly")
    public void iCheckTheModuleDonorAssignmentAppearCorrectly() {
        DonorAssignmentPage.isDisplayedTheTittle();
    }













}
