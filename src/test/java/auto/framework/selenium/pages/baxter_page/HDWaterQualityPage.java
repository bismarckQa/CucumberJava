package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class HDWaterQualityPage extends BasePage<HDWaterQualityPage>{


    @FindBy(how = How.XPATH, using = "//*[@id=\"mainDiv\"]/div/pagina-calidad-agua-hd/selector-planta-calidad-agua-hd/div/div/div/div[1]/h2")
    private WebElement titleHDWaterQuality;



    public void isDisplayedTheTittleHDWaterQuality(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleHDWaterQuality);
        titleHDWaterQuality.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
