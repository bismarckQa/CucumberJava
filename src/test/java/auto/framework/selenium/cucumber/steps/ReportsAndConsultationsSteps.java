package auto.framework.selenium.cucumber.steps;




import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.ModalityModulePage;
import auto.framework.selenium.pages.baxter_page.ReportsAndConsultationsPage;
import io.cucumber.java.en.When;

public class ReportsAndConsultationsSteps {

    @LazyAutowired

    private ReportsAndConsultationsPage ReportsAndConsultationsSteps;


    @When("Reports and Consultations open correctly")
    public void reportsAndConsultationsOpenCorrectly(){
        ReportsAndConsultationsSteps.isAt();

    }

}
