package com.virginmedia.utility;


import com.virginmedia.base_Page.Base_Page;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;

public class Utility extends Base_Page {

    /*Utility Class extends to BasePage for the driver to finding locators
     *All common methods are fixed in the utility Class.
     *
     * This method will generate random number
     */
    public static int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);

    }

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    /**
     * This method will click on element
     */
    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will return text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element or field
     */
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * This method will used to hover mouse on element and click
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /**
     * This method will used to select drop down menu by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String str) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(str);
    }

    public void selectByVisibleTextFromDropDown(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    /**
     * This method will used to select drop down menu by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /**
     * This method will used to select drop down menu by value
     */
    public void selectByValueFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * This method will used to wait web driver until element become clickable
     */
    public void waitUntilElementToBeClickable(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
    }

    public void waitUntilElementToBeClickable(WebElement element,int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
                wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * This method will used to wait web driver until presence of element located by locator
     */
    public void waitUntilPresenceOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    /**
     * This method will used to wait web driver until visibility of element located by locator
     */
    public void waitUntilVisibilityOfElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilVisibilityOfElementLocated(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
    }

    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatElementIsDisplayed(By by) {
        WebElement element = driver.findElement(by);
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatElementIsDisplayed(WebElement element) {
        if (element.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void ifElementIsDisplayed(WebElement element) {
        try {
            if (element.isDisplayed()) {
                clickOnElement(element);
            }
        } catch (Exception e) {

        }

    }


    /**
     * This method will verify that element is displayed
     */
    public boolean verifyThatTextIsDisplayed(By by, String text) {
        WebElement element = driver.findElement(by);
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyThatTextIsDisplayed(WebElement element, String text) {
        if (text.equals(element.getText())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method will clear previous stored data
     */
    public void clearTextFromField(By by) {
        driver.findElement(by).sendKeys(Keys.CONTROL + "a");
        driver.findElement(by).sendKeys(Keys.DELETE);
    }

    public void sendTabAndEnterKey(By by) {
        driver.findElement(by).sendKeys(Keys.TAB);
        //driver.findElement(by).sendKeys(Keys.ENTER);
    }


    /**
     * This method will take screen shot
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/virginmedia/screen_shots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String currentTimeStamp() {
        Date d = new Date();
        return d.toString().replace(":", "_").replace(" ", "_");
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "Screenshots" under screenshot folder

        String destination = System.getProperty("user.dir") + "/src/main/java/com/virginmedia/screen_shots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    /*
     Screenshot methods
     */
    public static String takeScreenShot(String fileName) {
        String filePath = System.getProperty("user.dir") + "/test-output/html/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        String imageName = fileName + currentTimeStamp() + ".jpg";
        String destination = filePath + imageName;
        try {
            FileUtils.copyFile(scr1, new File(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }

    public void alertAccept() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    package utility;

// import org.openqa.selenium.*;
// import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.support.ui.ExpectedCondition;
// import org.openqa.selenium.support.ui.ExpectedConditions;
// import org.openqa.selenium.support.ui.Select;
// import org.openqa.selenium.support.ui.WebDriverWait;

// import java.time.Duration;
// import java.util.Locale;
// import java.util.NoSuchElementException;
//     New Libreary
public class SeleniumLibrary {
    WebDriver driver;
    WebDriverWait webDriverWait60Sec;

    public SeleniumLibrary(WebDriver driver) {
        this.driver = driver;
        webDriverWait60Sec = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    public WebElement getElement(String locator) {
        String strLocatorType = locator.split(":", 2)[0].toLowerCase();
        String strLocatorValue = locator.split(":", 2)[1];
        WebElement element;
        
        //waitUntilAngular5Ready();
        //waitForAngular5Load();
        //ajaxComplete();
        //waitForAngularLoad();
        //waitUntilJSReady();
        //waitForJQueryLoad();
        
        switch (strLocatorType) {
            case "xpath":
                By localXpathBy = By.xpath(strLocatorValue);
                webDriverWait60Sec
                        //.ignoring(ElementNotVisibleException.class)
                        .ignoring(NoSuchElementException.class)
                        .ignoring(StaleElementReferenceException.class)
                        .until(ExpectedConditions.elementToBeClickable(localXpathBy));
                //webDriverWait60Sec.until(ExpectedConditions.presenceOfElementLocated(localXpathBy));
                element = driver.findElement(localXpathBy);
                break;
            case "css":
                By localCSSBy = By.cssSelector(strLocatorValue);
                webDriverWait60Sec
                        //.ignoring(ElementNotVisibleException.class)
                        .ignoring(NoSuchElementException.class)
                        .ignoring(StaleElementReferenceException.class)
                        .until(ExpectedConditions.elementToBeClickable(localCSSBy));
                //webDriverWait60Sec.until(ExpectedConditions.presenceOfElementLocated(localCSSBy));
                element = driver.findElement(localCSSBy);
                break;
            default:
                throw new NoSuchElementException("Unknown Locator Type" + locator);
        }
        return element;
    }


    public void click(String locator) {
        try {
            WebElement element = getElement(locator);
            element.click();
            waitUntilJSReady();
            waitForJQueryLoad();

        } catch (Exception t) {
            System.out.println("unable to click on the element with locator string" + locator);
        }
    }

    public void chooseInDropDown(String locator,String value) {
        try {
            Select selectElement = new Select(getElement(locator));
            selectElement.selectByVisibleText(value);
            waitUntilJSReady();
            waitForJQueryLoad();

        } catch (Exception t) {
            System.out.println("unable to click on the element with locator string" + locator);
        }
    }

    public void enterText(String locator,String value) {
        try {
            WebElement element = getElement(locator);
            element.sendKeys(value);
            waitUntilJSReady();
            waitForJQueryLoad();

        } catch (Exception t) {
            System.out.println("unable to click on the element with locator string" + locator);
        }
    }

    public void hoverAround(String locator) {
        try {
            Actions actions = new Actions(driver);
            WebElement element = getElement(locator);
            actions.moveToElement(element).perform();

        } catch (Exception t) {
            System.out.println("unable to find or hover on the element with locator string" + locator);
        }
    }


    public void waitForElementToBeVisible(String locator) {
        try {
            WebElement element = getElement(locator);
            isElementVisible(element);
        } catch (Exception t) {
            System.out.println("unable to find 'visible' element using locator" + locator);

        }
    }

    public void waitForElementToBeInVisible(String locator) {
        try {
            WebElement element = getElement(locator);

        } catch (Exception t) {
            System.out.println("unable to find 'visible' element using locator" + locator);

        }
    }

    public boolean isElementVisible(WebElement element) {
        try {
            webDriverWait60Sec.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isElementInvisible(WebElement element) {
        try {
            webDriverWait60Sec.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.invisibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitForElementToBeClickable(String locator) {
        try {
            WebElement element = getElement(locator);
            isElementVisible(element);
            isElementClickable(element);
        } catch (Exception t) {
            System.out.println("unable to find 'visible' element using locator" + locator);

        }
    }

    public boolean isElementClickable(WebElement element) {
        try {
            webDriverWait60Sec.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean isElementClickable(String locator) {
        try {
            WebElement element = getElement(locator);
            webDriverWait60Sec.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private void waitUntilJSReady() {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        WebDriverWait jsWait = new WebDriverWait(driver,Duration.ofSeconds(60));
        try {
            ExpectedCondition<Boolean> jsLoad = driver -> ((JavascriptExecutor) this.driver)
                    .executeScript("return document.readyState").toString().equals("complete");
            boolean jsReady = jsExec.executeScript("return document.readyState").toString().equals("complete");
            if (!jsReady) {
                jsWait.until(jsLoad);
            }
        } catch (WebDriverException ignored) {
        }
    }
    private void ajaxComplete() {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript("var callback = arguments[arguments.length - 1];"
                + "var xhr = new XMLHttpRequest();" + "xhr.open('GET', '/Ajax_call', true);"
                + "xhr.onreadystatechange = function() {" + "  if (xhr.readyState == 4) {"
                + "    callback(xhr.responseText);" + "  }" + "};" + "xhr.send();");
    }
    private void waitForAngularLoad() {
        String angularReadyScript = "return angular.element(document).injector().get('$http').pendingRequests.length === 0";
        angularLoads(angularReadyScript);
    }

    private void waitForAngular5Load() {
        String angularReadyScript = "return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1";
        angularLoads(angularReadyScript);
    }
    private void angularLoads(String angularReadyScript) {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        WebDriverWait jsWait = new WebDriverWait(driver,Duration.ofSeconds(60));
        try {
            ExpectedCondition<Boolean> angularLoad = driver -> Boolean.valueOf(((JavascriptExecutor) driver)
                    .executeScript(angularReadyScript).toString());
            boolean angularReady = Boolean.valueOf(jsExec.executeScript(angularReadyScript).toString());
            if (!angularReady) {
                jsWait.until(angularLoad);
            }
        } catch (WebDriverException ignored) {
        }
    }
    public void waitUntilAngular5Ready() {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        WebDriverWait jsWait = new WebDriverWait(driver,Duration.ofSeconds(60));
        try {
            Object angular5Check = jsExec.executeScript("return getAllAngularRootElements()[0].attributes['ng-version']");
            if (angular5Check != null) {
                Boolean angularPageLoaded = (Boolean) jsExec.executeScript("return window.getAllAngularTestabilities().findIndex(x=>!x.isStable()) === -1");
                if (!angularPageLoaded) {
                    poll(20);
                    waitForAngular5Load();
                    poll(20);
                }
            }
        } catch (WebDriverException ignored) {
        }
    }

    private void poll(long milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void waitForJQueryLoad() {
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        WebDriverWait jsWait = new WebDriverWait(driver,Duration.ofSeconds(60));
        try {
            ExpectedCondition<Boolean> jQueryLoad = driver -> ((Long) ((JavascriptExecutor) this.driver)
                    .executeScript("return jQuery.active") == 0);
            boolean jqueryReady = (Boolean) jsExec.executeScript("return jQuery.active==0");
            if (!jqueryReady) {
                jsWait.until(jQueryLoad);
            }
        } catch (WebDriverException ignored) {
        }
    }
}


}
