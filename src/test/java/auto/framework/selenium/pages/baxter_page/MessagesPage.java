package auto.framework.selenium.pages.baxter_page;

import auto.framework.selenium.annotations.LazyComponent;
import auto.framework.selenium.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

@LazyComponent
public class MessagesPage extends BasePage<MessagesPage> {

    @FindBy(how = How.XPATH, using = "//ul[@id='MensajeriaHome']//li[@id='alertasMensajeria']//i[contains(@class,'fa-envelope')]/ancestor::a")
    private WebElement btnMessagesIcon;

    @FindBy(how = How.XPATH, using = "//ul[@id='menuMensajeria']//a[contains(normalize-space(.),'See all messages')]")
    private WebElement linkSeeAllMessages;

    @FindBy(how = How.XPATH, using = "//div[@id='MensajeriaInbox']")
    private WebElement messagesInbox;

    @FindBy(how = How.XPATH, using = "//div[@id='MensajeriaCreate']//h2[normalize-space(.)='New message']")
    private WebElement titleNewMessage;

    @FindBy(how = How.XPATH, using = "//div[@id='MensajeriaCreate']//selector-perfiles-personales//div[contains(@class,'k-input-values')]")
    private WebElement dropDownMessageRecipient;

    @FindBy(how = How.XPATH, using = "//div[@id='MensajeriaCreate']//label[normalize-space(.)='Case']/following::input[1]")
    private WebElement inputMessageCase;

    @FindBy(how = How.XPATH, using = "//div[@id='MensajeriaCreate']//label[normalize-space(.)='Message *']/following::textarea[1]")
    private WebElement textAreaMessage;

    @FindBy(how = How.XPATH, using = "//div[@id='MensajeriaCreate']//button[contains(@class,'msj-send-message') and normalize-space(.)='Send Message']")
    private WebElement btnSendMessage;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Messages']/ancestor::div[contains(@class,'x_panel')][1]")
    private WebElement messagesPanel;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Messages']")
    private WebElement titleMessages;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Messages']/ancestor::div[contains(@class,'x_panel')][1]//li[@role='tab' and normalize-space(.)='Received']")
    private WebElement tabReceivedMessages;

    @FindBy(how = How.XPATH, using = "//h2[normalize-space(.)='Messages']/ancestor::div[contains(@class,'x_panel')][1]//li[@role='tab' and normalize-space(.)='Sent']")
    private WebElement tabSentMessages;

    @FindBy(how = How.XPATH, using = "//div[@id='inbox-msj-detalle']")
    private WebElement messageDetail;

    public boolean isAt() {
        return this.wait.until((d) -> this.btnMessagesIcon.isDisplayed());
    }

    public boolean isMessagesIconBadgeDisplayed(String count) {
        driver.switchTo().defaultContent();
        By messagesBadgeBy = By.xpath("//ul[@id='MensajeriaHome']//li[@id='alertasMensajeria']//span[contains(@class,'badge') and normalize-space(.)='" + count + "']");
        WebElement messagesBadge = wait.until((d) -> driver.findElement(messagesBadgeBy));
        return messagesBadge.isDisplayed();
    }

    public boolean isMessagesIconBadgeGreaterThan(int minimumCount) {
        driver.switchTo().defaultContent();
        By messagesBadgeBy = By.xpath("//ul[@id='MensajeriaHome']//li[@id='alertasMensajeria']//span[contains(@class,'badge')]");
        return wait.until((d) -> {
            WebElement messagesBadge = driver.findElement(messagesBadgeBy);
            if (!messagesBadge.isDisplayed()) {
                return false;
            }
            int currentCount = Integer.parseInt(messagesBadge.getText().trim());
            return currentCount > minimumCount;
        });
    }

    public void clickMessagesIcon() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(btnMessagesIcon);
        clickJS(btnMessagesIcon);
        waitElements(linkSeeAllMessages);
        pause(300);
    }

    public void clickSeeAllMessages() throws InterruptedException {
        driver.switchTo().defaultContent();
        waitElements(linkSeeAllMessages);
        scrollToElementMove(linkSeeAllMessages);
        clickJS(linkSeeAllMessages);
        pause(1000);
        driver.switchTo().frame("frmContenido");
        waitElements(messagesInbox);
        driver.switchTo().parentFrame();
    }

    public void scrollToMessagesSection() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(messagesInbox);
        waitElements(titleNewMessage);
        waitElements(messagesPanel);
        scrollToElementMove(messagesPanel);
        pause(500);
        driver.switchTo().parentFrame();
    }

    public void selectRecipientInNewMessage(String recipient) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleNewMessage);
        waitElements(dropDownMessageRecipient);
        selectKendoDropdownOption(dropDownMessageRecipient, recipient);
        driver.switchTo().parentFrame();
    }

    public void enterCaseInNewMessage(String messageCase) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(inputMessageCase);
        scrollToElementMove(inputMessageCase);
        inputMessageCase.clear();
        write(inputMessageCase, messageCase);
        driver.switchTo().parentFrame();
    }

    public void enterMessageTextInNewMessage(String messageText) throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(textAreaMessage);
        scrollToElementMove(textAreaMessage);
        textAreaMessage.clear();
        write(textAreaMessage, messageText);
        driver.switchTo().parentFrame();
    }

    public boolean isSendMessageButtonDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(btnSendMessage);
        boolean isDisplayed = btnSendMessage.isDisplayed();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public void clickSendMessageButton() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(btnSendMessage);
        scrollToElementMove(btnSendMessage);
        click(btnSendMessage);
        pause(1000);
        driver.switchTo().parentFrame();
    }

    public void clickSentMessagesTab() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleMessages);
        waitElements(tabSentMessages);
        scrollToElementMove(tabSentMessages);
        click(tabSentMessages);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public void clickReceivedMessagesTab() throws InterruptedException {
        driver.switchTo().frame("frmContenido");
        waitElements(titleMessages);
        waitElements(tabReceivedMessages);
        scrollToElementMove(tabReceivedMessages);
        click(tabReceivedMessages);
        pause(700);
        driver.switchTo().parentFrame();
    }

    public boolean isSentMessagesDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleMessages);
        waitElements(tabSentMessages);
        boolean isDisplayed = titleMessages.isDisplayed() && tabSentMessages.isDisplayed() && hasVisibleMessageRow();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    public boolean isReceivedMessagesDisplayed() {
        driver.switchTo().frame("frmContenido");
        waitElements(titleMessages);
        waitElements(tabReceivedMessages);
        boolean isDisplayed = titleMessages.isDisplayed() && tabReceivedMessages.isDisplayed() && hasVisibleMessageRowOrDetail();
        driver.switchTo().parentFrame();
        return isDisplayed;
    }

    private boolean hasVisibleMessageRowOrDetail() {
        By messageRowsBy = By.xpath("//div[@id='MensajeriaInbox']//div[contains(@class,'inbox-msj-item')]");
        return wait.until((d) -> {
            List<WebElement> messageRows = driver.findElements(messageRowsBy);
            if (messageRows.stream().anyMatch(WebElement::isDisplayed)) {
                return true;
            }
            return messageDetail.isDisplayed();
        });
    }

    private boolean hasVisibleMessageRow() {
        By messageRowsBy = By.xpath("//div[@id='MensajeriaInbox']//div[contains(@class,'inbox-msj-item')]");
        return wait.until((d) -> {
            List<WebElement> messageRows = driver.findElements(messageRowsBy);
            return messageRows.stream().anyMatch(WebElement::isDisplayed);
        });
    }
}