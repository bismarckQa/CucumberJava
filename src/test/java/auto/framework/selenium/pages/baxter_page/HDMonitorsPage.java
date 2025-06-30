package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class HDMonitorsPage extends BasePage<HDMonitorsPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Session tracking')]")
    private WebElement titleHDMonitors;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleHDMonitors);
        titleHDMonitors.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
