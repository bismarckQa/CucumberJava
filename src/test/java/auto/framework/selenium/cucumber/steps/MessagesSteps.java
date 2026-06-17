package auto.framework.selenium.cucumber.steps;

import auto.framework.selenium.annotations.LazyAutowired;
import auto.framework.selenium.pages.baxter_page.MessagesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MessagesSteps {

    @LazyAutowired
    private MessagesPage messagesPage;

    @When("I click messages icon")
    public void iClickMessagesIcon() throws InterruptedException {
        messagesPage.clickMessagesIcon();
    }

    @Then("I verify messages icon badge {string} is displayed")
    public void iVerifyMessagesIconBadgeIsDisplayed(String count) {
        assertTrue(messagesPage.isMessagesIconBadgeDisplayed(count));
    }

    @Then("I verify messages icon badge is greater than {int}")
    public void iVerifyMessagesIconBadgeIsGreaterThan(int minimumCount) {
        assertTrue(messagesPage.isMessagesIconBadgeGreaterThan(minimumCount));
    }

    @And("I click see all messages")
    public void iClickSeeAllMessages() throws InterruptedException {
        messagesPage.clickSeeAllMessages();
    }

    @And("I scroll to messages section")
    public void iScrollToMessagesSection() throws InterruptedException {
        messagesPage.scrollToMessagesSection();
    }

    @And("I select the recipient {string} in new message")
    public void iSelectTheRecipientInNewMessage(String recipient) throws InterruptedException {
        messagesPage.selectRecipientInNewMessage(recipient);
    }

    @And("I enter the case {string} in new message")
    public void iEnterTheCaseInNewMessage(String messageCase) throws InterruptedException {
        messagesPage.enterCaseInNewMessage(messageCase);
    }

    @And("I enter the message {string} in new message")
    public void iEnterTheMessageInNewMessage(String messageText) throws InterruptedException {
        messagesPage.enterMessageTextInNewMessage(messageText);
    }

    @And("I click sent messages tab")
    public void iClickSentMessagesTab() throws InterruptedException {
        messagesPage.clickSentMessagesTab();
    }

    @And("I click received messages tab")
    public void iClickReceivedMessagesTab() throws InterruptedException {
        messagesPage.clickReceivedMessagesTab();
    }

    @Then("I verify sent messages displayed")
    public void iVerifySentMessagesDisplayed() {
        assertTrue(messagesPage.isSentMessagesDisplayed());
    }

    @Then("I verify received messages displayed")
    public void iVerifyReceivedMessagesDisplayed() {
        assertTrue(messagesPage.isReceivedMessagesDisplayed());
    }

    @Then("I verify send message button is displayed")
    public void iVerifySendMessageButtonIsDisplayed() {
        assertTrue(messagesPage.isSendMessageButtonDisplayed());
    }

    @When("I click send message button")
    public void iClickSendMessageButton() throws InterruptedException {
        messagesPage.clickSendMessageButton();
    }
}