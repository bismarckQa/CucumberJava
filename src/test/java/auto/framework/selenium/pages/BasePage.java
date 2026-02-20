package auto.framework.selenium.pages;

import auto.framework.selenium.utils.LogUtil;
import jakarta.annotation.PostConstruct;
import lombok.SneakyThrows;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.openqa.selenium.TimeoutException;

import java.time.Duration;
import java.util.List;

public abstract class BasePage <P>{
    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @Autowired
    protected JavascriptExecutor javascriptExecutor;

    @Autowired
    protected LogUtil logUtil;

    @PostConstruct
    private void init() {
        PageFactory.initElements(this.driver, this);
    }

    public abstract boolean isAt() throws InterruptedException;

    /**
     * These Methods perform a WebDriver wait for the presence or visibility of an element depending on the type of
     * the type T of the attribute elementAttr. Given WebDriverWait returns the element/elements it is waiting for, we
     * can use this in other basic methods such as click or sendkeys to make sure the element can be interacted with.
     * @param elementAttr reference to the element or the element itself.
     * @param <T> By or WebElement.
     * @return reference to WebElement we waited for.
     */



    private <T> WebElement waitElement(T elementAttr) {
        if (elementAttr
            .getClass()
            .getName()
            .contains("By")) {
            return this.wait.until(ExpectedConditions.presenceOfElementLocated((By) elementAttr));
        } else {
            return this.wait.until(ExpectedConditions.elementToBeClickable((WebElement) elementAttr));
        }
    }

    protected  <T> List<WebElement> waitElements(T elementAttr) {
        if (elementAttr
            .getClass()
            .getName()
            .contains("By")) {
            return this.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) elementAttr));
        } else {
            return this.wait.until(ExpectedConditions.visibilityOfAllElements((WebElement) elementAttr));
        }
    }

    /**
     * Click of an element using waitElement to make sure element can be interacted with.
     * @param elementAttr element to be clicked.
     * @param <T> type can be By or WebElement.
     * @return this
     */
    protected <T> P click(T elementAttr) {
        System.out.println("Clicking element "+elementAttr.toString());
        try{
            waitElement(elementAttr).click();
        } catch (org.openqa.selenium.StaleElementReferenceException e){
            waitElement(elementAttr).click();
        }
        return (P)this;
    }
    public void moveToMidView(WebElement we) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) driver).executeScript(scrollElementIntoMiddle, we);
    }
    public void moveScrollToElement(WebElement we) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", we);
        Thread.sleep(500);
    }

    public void scrollToElementMove(WebElement element) throws InterruptedException {
        String scrollScript = "const element = arguments[0];" +
                "element.scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });";
        ((JavascriptExecutor) driver).executeScript(scrollScript, element);
        pause(1000);
    }
    public void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
    }
    public void scrollWithinElement(WebElement element, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop += arguments[1];", element, pixels);
    }
    public void scrollToElementAndClick(WebElement element) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void clickJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    public void hoverOverElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    protected P clickInTableByTextInIframe(String value)throws InterruptedException{
        pause(200);
        String xp = String.format("//table//td[normalize-space(.)='%s']", value);
        WebElement cell = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xp)));
        cell.click();
        return (P) this;
    }

    public void dragAndDrop(WebElement from, WebElement to) throws InterruptedException {
        Actions actions = new Actions(driver);
        waitElement(from);
        actions.clickAndHold(from).perform();
        pause(1000);
        actions.moveByOffset(10, 10).pause(Duration.ofSeconds(1)).perform();
        pause(1000);
        waitElement(to);
        actions.moveToElement(to).release().build().perform();
    }

    public void dragAndDrop2(WebElement from, WebElement to) throws InterruptedException {
        Actions actions = new Actions(driver);

        waitElement(from);
        actions.clickAndHold(from).perform();
        pause(1000);

        // Usar JS para mover al centro del target
        String script = "var rect = arguments[0].getBoundingClientRect();" +
                "window.scrollTo(rect.left + rect.width/2, rect.top + rect.height/2);";
        ((JavascriptExecutor) driver).executeScript(script, to);

        waitElement(to);
        actions.moveToElement(to).pause(Duration.ofMillis(500)).release().build().perform();
    }

    public void dragAndDropVisible(WebElement from, WebElement to) throws InterruptedException {
        String jsDragAndDrop = """
    function triggerDragAndDrop(source, target) {
        const dataTransfer = new DataTransfer();

        const dragStartEvent = new DragEvent('dragstart', {
            bubbles: true,
            cancelable: true,
            dataTransfer
        });
        source.dispatchEvent(dragStartEvent);

        const dragOverEvent = new DragEvent('dragover', {
            bubbles: true,
            cancelable: true,
            dataTransfer
        });
        target.dispatchEvent(dragOverEvent);

        const dropEvent = new DragEvent('drop', {
            bubbles: true,
            cancelable: true,
            dataTransfer
        });
        target.dispatchEvent(dropEvent);

        const dragEndEvent = new DragEvent('dragend', {
            bubbles: true,
            cancelable: true,
            dataTransfer
        });
        source.dispatchEvent(dragEndEvent);
    }

    triggerDragAndDrop(arguments[0], arguments[1]);
""";

        // Scroll to both elements to make the action visible
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", from);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", to);
        pause(1000); // visual pause

        // Execute the drag and drop via JavaScript
        ((JavascriptExecutor) driver).executeScript(jsDragAndDrop, from, to);
        pause(1000); // give time for any UI changes to apply
    }




    protected <T> P doubleClick(T elementAttr) {
        System.out.println("DoubleClicking element "+elementAttr.toString());
        try{
            waitElement(elementAttr).click();
            waitElement(elementAttr).click();
        } catch (org.openqa.selenium.StaleElementReferenceException e){
            waitElement(elementAttr).click();
            waitElement(elementAttr).click();
        }
        return (P)this;
    }

    /**
     * JavaScript click using a By reference to the element and a visibility WebDriverWait.
     * @param by reference to the element.
     */
    protected void jsClick(By by) {
        javascriptExecutor.executeScript("arguments[0].click();", this.wait.until(ExpectedConditions.visibilityOfElementLocated(by)));
    }

    /**
     * Writes text into the element.
     * @param elementAttr reference to the element.
     * @param text text to be written.
     * @param <T> type can be By or WebElement.
     * @return this
     */
    protected <T> P write(T elementAttr, String text) {
        if (text == null || text.equalsIgnoreCase("")){
            this.keyboard(elementAttr, Keys.ENTER);
        }else{
            waitElement(elementAttr).sendKeys(text);
        }
        return (P)this;
    }

    /**
     * Sends keyboard press to an input element.
     * @param elementAttr reference to the element.
     * @param k Key to be sent.
     * @param <T> type can be By or WebElement.
     * @return this
     */
    protected <T> P keyboard(T elementAttr, Keys k) {
        waitElement(elementAttr).sendKeys(k);
        return (P)this;
    }

    /**
     * Gets text from referenced element.
     * @param elementAttr reference to the element to get text from.
     * @param <T> type can be By or WebElement.
     * @return text from the referenced element.
     */
    protected <T> String readText(T elementAttr) {
        return waitElement(elementAttr).getText();
    }

    protected <T> boolean isDisplayed(T elementAttr){
        return waitElement(elementAttr).isDisplayed();
    }

    @SneakyThrows
    protected <T> String readTextErrorMessage(T elementAttr) {
//        Thread.sleep(2000); //This needs to be improved.
        return waitElement(elementAttr).getText();
    }

    //Close popup if exists
    protected P handlePopup(By by) throws InterruptedException {
        waitElements(by);
        List<WebElement> popup = driver.findElements(by);
        if (!popup.isEmpty()) {
            popup
                .get(0)
                .click();
            Thread.sleep(200);
        }
        return (P)this;
    }

    protected <T> P pause(int i) throws InterruptedException {
        Thread.sleep(1000);
        return (P)this;
    }

    public void scrollByPixels(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);",pixels);
    }

    public void clickBelowElementByOffset(WebElement referenceElement, int offsetY) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = """
        var rect = arguments[0].getBoundingClientRect();
        var x = rect.left + (rect.width / 2);
        var y = rect.top + (rect.height / 2) + arguments[1];

        var clickEvent = new MouseEvent('click', {
            view: window,
            bubbles: true,
            cancelable: true,
            clientX: x,
            clientY: y
        });

        document.elementFromPoint(x, y).dispatchEvent(clickEvent);
    """;
        js.executeScript(script, referenceElement, offsetY);
    }
    protected P clickOption(String action) {
        String t = action.trim();

        // 1) Exacto (mejor)
        String xpExact =
                String.format("//*[self::button or self::a or self::span or self::i or self::div or @role='button' or @ng-click]" +
                        "[normalize-space(.)='%s' or .//text()[normalize-space(.)='%s']]", t, t);

        // 2) Fallback contains (si el texto viene con iconos/espacios extra)
        String xpContains =
                String.format("//*[self::button or self::a or self::span or self::i or self::div or @role='button' or @ng-click]" +
                        "[contains(normalize-space(.), '%s')]", t);

        for (String xp : new String[]{xpExact, xpContains}) {
            List<WebElement> els = driver.findElements(By.xpath(xp));
            for (WebElement el : els) {
                if (!el.isDisplayed() || !el.isEnabled()) continue;

                try {
                    wait.until(ExpectedConditions.elementToBeClickable(el)).click();
                } catch (ElementClickInterceptedException e) {
                    javascriptExecutor.executeScript("arguments[0].click();", el);
                }
                return (P) this;
            }
        }

        throw new NoSuchElementException("No clickable element found with text: " + action);
    }


}
