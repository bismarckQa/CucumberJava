package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.NotificationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotificationSteps {

    @LazyAutowired
    private NotificationPage notificationPage;

    @When("I click notification bell")
    public void iClickNotificationBell() throws InterruptedException {
        notificationPage.clickNotificationBell();
    }

    @And("I click section tab in notification bell panel")
    public void iClickSectionTabInNotificationBellPanel() throws InterruptedException {
        notificationPage.clickSectionTabInNotificationBellPanel();
    }

    @And("I click patient tab in notification bell panel")
    public void iClickPatientTabInNotificationBellPanel() throws InterruptedException {
        notificationPage.clickPatientTabInNotificationBellPanel();
    }

    @And("I click go to notification center in notification bell panel")
    public void iClickGoToNotificationCenterInNotificationBellPanel() throws InterruptedException {
        notificationPage.clickGoToNotificationCenterInBellPanel();
    }

    @Then("I verify notification center opened correctly")
    public void iVerifyNotificationCenterOpenedCorrectly() {
        notificationPage.verifyNotificationCenterOpenedCorrectly();
    }

    @And("I click patient filter in notification center")
    public void iClickPatientFilterInNotificationCenter() throws InterruptedException {
        notificationPage.clickPatientFilterInNotificationCenter();
    }

    @And("I click section filter in notification center")
    public void iClickSectionFilterInNotificationCenter() throws InterruptedException {
        notificationPage.clickSectionFilterInNotificationCenter();
    }

    @Then("I verify patient notifications displayed")
    public void iVerifyPatientNotificationsDisplayed() {
        notificationPage.verifyPatientNotificationsDisplayed();
    }

    @Then("I verify section notifications displayed")
    public void iVerifySectionNotificationsDisplayed() {
        notificationPage.verifySectionNotificationsDisplayed();
    }

    @When("I click the three points menu in notification form")
    public void iClickTheThreePointsMenuInNotificationForm() throws InterruptedException {
        notificationPage.clickThreePointsMenuInNotificationForm();
    }

    @When("I click {string} option in notification form menu")
    public void iClickOptionInNotificationFormMenu(String option) throws InterruptedException {
        notificationPage.clickOptionInNotificationFormMenu(option);
    }

    @And("I select the patient {string} in notification form")
    public void iSelectThePatientInNotificationForm(String patient) throws InterruptedException {
        notificationPage.selectPatientInNotificationForm(patient);
    }

    @And("I select the section {string} in notification form")
    public void iSelectTheSectionInNotificationForm(String section) throws InterruptedException {
        notificationPage.selectSectionInNotificationForm(section);
    }

    @And("I select available for {string} in notification form")
    public void iSelectAvailableForInNotificationForm(String availableFor) throws InterruptedException {
        notificationPage.selectAvailableForInNotificationForm(availableFor);
    }

    @And("I enter the text {string} in notification form")
    public void iEnterTheTextInNotificationForm(String notificationText) throws InterruptedException {
        notificationPage.enterTextInNotificationForm(notificationText);
    }

    @Then("I verify notification required fields validation is displayed")
    public void iVerifyNotificationRequiredFieldsValidationIsDisplayed() throws InterruptedException {
        assertTrue(notificationPage.isNotificationRequiredFieldsValidationDisplayed());
    }

    @Then("I verify the notification {string} was created")
    public void iVerifyTheNotificationWasCreated(String notificationText) {
        assertTrue(notificationPage.isNotificationCreated(notificationText));
    }

    @Then("I verify the notification list is displayed")
    public void iVerifyTheNotificationListIsDisplayed() {
        assertTrue(notificationPage.isFirstNotificationRowDisplayed());
    }

    @And("I click show all notifications")
    public void iClickShowAllNotifications() throws InterruptedException {
        notificationPage.clickShowAllNotifications();
    }

    @When("I click edit notification by patient {string}")
    public void iClickEditNotificationByPatient(String patientName) throws InterruptedException {
        notificationPage.clickEditNotificationByPatient(patientName);
    }

    @And("I enter the end date {string} in notification form")
    public void iEnterTheEndDateInNotificationForm(String endDate) throws InterruptedException {
        notificationPage.enterEndDateInNotificationForm(endDate);
    }

    @Then("I save the notification edit row")
    public void iSaveTheNotificationEditRow() throws InterruptedException {
        notificationPage.saveNotificationEditRow();
    }

    @Then("I cancel the notification edit row")
    public void iCancelTheNotificationEditRow() throws InterruptedException {
        notificationPage.cancelNotificationEditRow();
    }

    @Then("I verify the notification for patient {string} has end date {string}")
    public void iVerifyTheNotificationForPatientHasEndDate(String patientName, String endDate) {
        assertTrue(notificationPage.isNotificationEndDateDisplayed(patientName, endDate));
    }
}