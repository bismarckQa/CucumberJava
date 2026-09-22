package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class ModalityModulePage extends BasePage<ModalityModulePage>{

    @FindBy(how = How.XPATH, using = "//*[@id=\"aspnetForm\"]/div[3]/div[1]/div[4]/h2")
    private WebElement titleModality;

    public boolean isAt() {
        return isDisplayed(titleModality);
    }

    public void verifyModalityModuleAppears() {
        isAt();
    }
}
