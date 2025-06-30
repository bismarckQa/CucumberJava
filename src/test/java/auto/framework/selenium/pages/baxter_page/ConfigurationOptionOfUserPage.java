package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class ConfigurationOptionOfUserPage extends BasePage<ConfigurationOptionOfUserPage>{


    @FindBy(how = How.ID, using = "ctl00_tsSecciones")
    private WebElement ConfigurationOptionMenu;

    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'New patient')]")
    private WebElement NewPatientTittle;




    //*********Page Methods*********




    @Override
    public boolean isAt() {
        return false;
    }
    public void isDisplayedNewPatientTittle(){
        driver.switchTo().frame("frmContenido");
        ConfigurationOptionMenu.isDisplayed();
        driver.switchTo().frame("iframeV2");
        waitElements(NewPatientTittle);
        NewPatientTittle.isDisplayed();
    }



}
