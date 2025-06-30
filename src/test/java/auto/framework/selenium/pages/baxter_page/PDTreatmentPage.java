package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class PDTreatmentPage extends BasePage<PDTreatmentPage>{


    @FindBy(how = How.XPATH, using = "//h2[contains(text(),'Treatment results')]")
    private WebElement titlePDTreatment;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titlePDTreatment);
        titlePDTreatment.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
