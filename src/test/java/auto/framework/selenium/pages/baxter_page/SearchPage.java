package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

@LazyComponent
public class SearchPage extends BasePage<SearchPage> {

    @FindBy(how = How.XPATH, using = "//*[@id=\"searchButton\"]")
    private WebElement btnSearchIcon;

    @Override
    public boolean isAt() {
        return wait.until((d) -> btnSearchIcon.isDisplayed());
    }

    public void clickSearchIcon() throws InterruptedException {
        waitElements(btnSearchIcon);
        click(btnSearchIcon);
        pause(500);
    }
}