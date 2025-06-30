package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class RRTPage extends BasePage<RRTPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Eligibility Criteria')]")
    private WebElement titleRRT;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleRRT);
        titleRRT.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
