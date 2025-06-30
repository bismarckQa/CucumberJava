package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class PhysicalAssessmentPage extends BasePage<PhysicalAssessmentPage>{


    @FindBy(how = How.XPATH, using = "//*[@id=\"ExploracionFisicaView\"]/exploracion-fisica-comp/ng-form/div[1]/div/div[1]/h2")
    private WebElement titlePhysicalAssessment;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titlePhysicalAssessment);
        titlePhysicalAssessment.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
