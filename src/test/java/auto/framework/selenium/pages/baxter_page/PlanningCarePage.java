package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class PlanningCarePage extends BasePage<PlanningCarePage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Care plans')]")
    private WebElement titlePlanningCare;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titlePlanningCare);
        titlePlanningCare.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
