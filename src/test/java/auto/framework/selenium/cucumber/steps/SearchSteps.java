package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.SearchPage;
import io.cucumber.java.en.When;

public class SearchSteps {

    @LazyAutowired
    private SearchPage searchPage;

    @When("I click search icon")
    public void iClickSearchIcon() throws InterruptedException {
        searchPage.clickSearchIcon();
    }
}