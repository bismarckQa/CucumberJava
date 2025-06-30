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
public class ModalityModulePage extends BasePage<ModalityModulePage>{

    @Value("#{${application.2modality}}")
    private Map<String,String> submodality;
    @FindBy(how = How.XPATH, using = "//*[@id=\"aspnetForm\"]/div[3]/div[1]/div[4]/h2")
    private WebElement titleModality;
    @FindBy(how = How.XPATH, using = "//*[@id=\"ctl00_mainContent_divBotones\"]")
    private WebElement dotsOptions;

    @FindBy(how = How.ID, using = "ctl00_mainContent_btnNuevo")
    private WebElement newButton;
    @FindBy(how = How.ID, using = "ctl00_mainContent_btnEditar")
    private WebElement editButton;
    @FindBy(how = How.ID, using = "ctl00_mainContent_btnEliminar")
    private WebElement deleteButton;

    @FindBy(how = How.ID, using = "ctl00_mainContent_btnGuardar")
    private WebElement saveButton;

    @FindBy(how = How.ID, using = "ctl00_mainContent_btnCancelar")
    private WebElement cancelButton;


    @FindBy(how = How.ID, using = "ctl00_mainContent_fvDetalle_comboSubmodalidad_Arrow")
    private WebElement arrowSubmodality;



    //*********Page Methods*********



    public boolean isAt() {
        //return this.wait.until((d) -> this.tittleModality.isDisplayed());
        return isDisplayed(titleModality);
    }


    public void clickDotsButtonWithFrame(){

            driver.switchTo().frame("frmContenido");
            click(this.dotsOptions);

    }
    public void clickDotsButtonWithoutFrame(){
        click(this.dotsOptions);
    }



    public void clickNewButton(){
        click(this.newButton);
    }
    public void clickEditButton(){
        click(this.editButton);
    }
    public void clickDeleteButton(){
        click(this.deleteButton);
    }

    public void clickSaveButton(){
        click(this.saveButton);
    }

    public void clickCancelButton(){
        click(this.cancelButton);
    }

    public void clickArrowSubmodality(){
        click(this.arrowSubmodality);
    }
    public void selectSubmodality(String submodality){
        By loc = By.xpath("//div[@id='ctl00_mainContent_fvDetalle_comboSubmodalidad_DropDown']/div/ul/li[contains(text(),'"+submodality+"')]");
        click(loc);
    }


}
