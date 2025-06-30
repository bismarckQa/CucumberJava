package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class DiagnosesModulePage extends BasePage<DiagnosesModulePage>{


    @FindBy(how = How.XPATH, using = "//*[@id=\"diagnosticos\"]/div[1]/h2")
    private WebElement titleDiagnoses;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleDiagnoses);
        titleDiagnoses.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
