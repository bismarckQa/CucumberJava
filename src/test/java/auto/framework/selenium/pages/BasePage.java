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

    public void waitForActionComplete() {
        try {
            Thread.sleep(4000);
            wait.until(ExpectedConditions.invisibilityOfElementLocated(
                    By.cssSelector(".k-loading-mask")
            ));
        } catch (InterruptedException | TimeoutException e) {
            Thread.currentThread().interrupt();
        }
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

    public void clickAboveElementByOffset(WebElement referenceElement, int offsetY) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = """
        var rect = arguments[0].getBoundingClientRect();
        var x = rect.left + (rect.width / 2);
        var y = rect.top + (rect.height / 2) - arguments[1];

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

    protected void selectKendoDropdownOption(WebElement dropdownElement, String optionText) throws InterruptedException {
        if (optionText == null || optionText.trim().isEmpty()) {
            throw new IllegalArgumentException("Kendo dropdown option text cannot be empty");
        }
        scrollToElementMove(dropdownElement);
        click(dropdownElement);
        pause(500);

        String optionLiteral = xpathLiteral(optionText.trim());
        By exactOption = By.xpath("//div[contains(@class,'k-animation-container') and not(contains(@style,'display: none'))]" +
                "//*[self::li or @role='option'][normalize-space(.)=" + optionLiteral + "]");
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(exactOption));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", option);
        try {
            option.click();
        } catch (ElementClickInterceptedException e) {
            javascriptExecutor.executeScript("arguments[0].click();", option);
        }
        pause(500);
    }

    private String xpathLiteral(String s) {
        if (s.contains("'") && s.contains("\"")) {
            StringBuilder sb = new StringBuilder("concat(");
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                String part = String.valueOf(chars[i]);
                if (part.equals("'")) {
                    sb.append("\"'\"");
                } else if (part.equals("\"")) {
                    sb.append("'\"'");
                } else {
                    sb.append("'").append(part).append("'");
                }
                if (i < chars.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append(")");
            return sb.toString();
        }
        if (s.contains("'")) {
            return "\"" + s + "\"";
        }
        return "'" + s + "'";
    }

    private String lowerExpr(String expr) {
        return "translate(" + expr + ", 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', 'abcdefghijklmnopqrstuvwxyz')";
    }

    private String[] buildClickOptionXPaths(String t, String tLower, String tLit, String tLowerLit) {
        String exactText = "normalize-space(.)=%s and not(contains(@class,'ng-hide'))";
        String partialText = "contains(normalize-space(.),%s) and not(contains(@class,'ng-hide'))";
        String exactTextCI = lowerExpr("normalize-space(.)") + "=%s and not(contains(@class,'ng-hide'))";
        String partialTextCI = "contains(" + lowerExpr("normalize-space(.)") + ",%s) and not(contains(@class,'ng-hide'))";
        String exactAttr = "normalize-space(@%s)=%s and not(contains(@class,'ng-hide'))";
        String partialAttr = "contains(normalize-space(@%s),%s) and not(contains(@class,'ng-hide'))";
        String exactAttrCI = lowerExpr("normalize-space(@%s)") + "=%s and not(contains(@class,'ng-hide'))";
        String partialAttrCI = "contains(" + lowerExpr("normalize-space(@%s)") + ",%s) and not(contains(@class,'ng-hide'))";

        String[] tags = {
                "button",
                "a",
                "div",
                "span",
                "li",
                "*[@role='button']",
                "input[@type='button' or @type='submit']"
        };

        String[] attrNames = {"aria-label", "title", "value"};

        int size = (tags.length * 4) + (tags.length * attrNames.length * 4);
        String[] candidates = new String[size];
        int i = 0;
        for (String tag : tags) {
            candidates[i++] = String.format("//%s[%s]", tag, String.format(exactText, tLit));
        }
        for (String tag : tags) {
            candidates[i++] = String.format("//%s[%s]", tag, String.format(exactTextCI, tLowerLit));
        }
        for (String tag : tags) {
            candidates[i++] = String.format("//%s[%s]", tag, String.format(partialText, tLit));
        }
        for (String tag : tags) {
            candidates[i++] = String.format("//%s[%s]", tag, String.format(partialTextCI, tLowerLit));
        }
        for (String tag : tags) {
            for (String attr : attrNames) {
                candidates[i++] = String.format("//%s[%s]", tag, String.format(exactAttr, attr, tLit));
                candidates[i++] = String.format("//%s[%s]", tag, String.format(exactAttrCI, attr, tLowerLit));
                candidates[i++] = String.format("//%s[%s]", tag, String.format(partialAttr, attr, tLit));
                candidates[i++] = String.format("//%s[%s]", tag, String.format(partialAttrCI, attr, tLowerLit));
            }
        }
        return candidates;
    }

    protected P clickOptionInContainer(By containerBy, String action) {
        String t = action == null ? "" : action.trim();
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Action text cannot be empty");
        }
        String tLower = t.toLowerCase();
        String tLit = xpathLiteral(t);
        String tLowerLit = xpathLiteral(tLower);

        WebElement container = wait.until(ExpectedConditions.visibilityOfElementLocated(containerBy));
        String[] candidates = buildClickOptionXPaths(t, tLower, tLit, tLowerLit);

        for (String xp : candidates) {
            String rel = ".//" + xp.substring(2); // convert //tag[...] to .//tag[...]
            List<WebElement> els = container.findElements(By.xpath(rel));
            for (WebElement el : els) {
                if (!el.isDisplayed() || !el.isEnabled()) {
                    continue;
                }
                javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", el);
                try {
                    el.click();
                } catch (ElementClickInterceptedException e) {
                    javascriptExecutor.executeScript("arguments[0].click();", el);
                }
                return (P) this;
            }
        }

        throw new NoSuchElementException("No clickable element found with text in container: " + action);
    }

    protected P clickOption(String action) {
        String t = action == null ? "" : action.trim();
        if (t.isEmpty()) {
            throw new IllegalArgumentException("Action text cannot be empty");
        }
        String tLower = t.toLowerCase();
        String tLit = xpathLiteral(t);
        String tLowerLit = xpathLiteral(tLower);

        String[] candidates = buildClickOptionXPaths(t, tLower, tLit, tLowerLit);

        for (String xp : candidates) {
            List<WebElement> els = driver.findElements(By.xpath(xp));
            for (WebElement el : els) {
                try {
                    if (!el.isDisplayed() || !el.isEnabled()) continue;
                    javascriptExecutor.executeScript("arguments[0].scrollIntoView({block:'center'});", el);
                    try {
                        el.click();
                    } catch (ElementClickInterceptedException e) {
                        javascriptExecutor.executeScript("arguments[0].click();", el);
                    }
                    return (P) this;
                } catch (StaleElementReferenceException e) {
                    continue;
                }
            }
        }

        throw new NoSuchElementException("No clickable element found with text: " + action);
    }

    /**
     * Waits for a native browser alert/confirm dialog and clicks the positive button (OK / Aceptar).
     */
    public void acceptBrowserAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.alertIsPresent()).accept();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    /**
     * Waits for a native browser alert/confirm dialog and clicks the negative button (Cancel / Denegar).
     */
    public void dismissBrowserAlert() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.alertIsPresent()).dismiss();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
    }

    protected void clickPrintPreviewButton(String action) throws InterruptedException {
        pause(1000);
        String mainHandle = driver.getWindowHandle();
        String printHandle = mainHandle;
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainHandle)) {
                printHandle = handle;
                driver.switchTo().window(printHandle);
                break;
            }
        }
        pause(500);
        String script =
                "function clickInShadow(root, text) {" +
                        "  for (const el of root.querySelectorAll('*')) {" +
                        "    if ((el.tagName === 'CR-BUTTON' || el.tagName === 'BUTTON') &&" +
                        "        el.textContent.trim().toLowerCase().includes(text.toLowerCase())) {" +
                        "      el.click(); return true;" +
                        "    }" +
                        "    if (el.shadowRoot && clickInShadow(el.shadowRoot, text)) return true;" +
                        "  }" +
                        "  return false;" +
                        "}" +
                        "return clickInShadow(document, arguments[0]);";
        Boolean clicked = (Boolean) javascriptExecutor.executeScript(script, action);
        if (clicked == null || !clicked) {
            throw new NoSuchElementException("Print preview button not found: " + action);
        }
        pause(500);
        driver.switchTo().window(mainHandle);
    }
}