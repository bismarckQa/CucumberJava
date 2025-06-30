package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Value;

import java.util.Map;


@LazyComponent
public class ReportsAndConsultationsPage extends BasePage<ReportsAndConsultationsPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Reports and consultations')]")
    private WebElement ReportsAndConsultations;




    //*********Page Methods*********




    @Override
    public boolean isAt() {
        driver.switchTo().frame("frmContenido");
        //return this.wait.until((d) -> this.tittleModality.isDisplayed());
        return isDisplayed(ReportsAndConsultations);
    }
}
