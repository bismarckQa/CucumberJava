package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


@LazyComponent
public class DonorAssignmentPage extends BasePage<DonorAssignmentPage>{


    @FindBy(how = How.XPATH, using = "//*[contains(text(),'Search for recipient')]")
    private WebElement titleDonorAssignment;



    public void isDisplayedTheTittle(){
        driver.switchTo().frame("frmContenido");
        waitElements(titleDonorAssignment);
        titleDonorAssignment.isDisplayed();
    }


    @Override
    public boolean isAt() {
        return false;
    }


    //*********Page Methods*********







}
