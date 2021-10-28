package com.virginmedia.pages;

import com.virginmedia.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Vishal Tailor
 */
public class Availability extends Utility {

    // logger is class of log4j . log is object created
    private static final Logger log = LogManager.getLogger(Availability.class.getName());
    @FindBy(css = "#postcode-field")
    WebElement postcode;
    @FindBy(xpath = "//div[@class='button-container']")
    WebElement button;
    @FindBy(xpath = "//li[contains(text(),'Flat 10 Buckingham Court, 17 Linthorpe Avenue, Wem')]")
    WebElement address;
    @FindBy(id = "next")
    WebElement nextButton;
    By popup = By.id("consent_prompt_submit");
    @FindBy(className = "title")
    WebElement message;

    public void enterPostcode(String Postcode) throws InterruptedException {
        log.info("Enter Postcode " + postcode.toString());
        waitUntilElementToBeClickable(popup, 50);
        clickOnElement(popup);
        // Thread.sleep(5000);
        mouseHoverToElementAndClick(postcode);
        sendTextToElement(postcode, Postcode);
    }

    public void button() throws InterruptedException {
        log.info("Click on button " + button.toString());
        Thread.sleep(5000);
        clickOnElement(button);


    }

    public void selectAddress() throws InterruptedException {
        log.info("User select address" + address.toString());
        Thread.sleep(5000);
        clickOnElement(address);
    }

    public void setNextButton() throws InterruptedException {
        Thread.sleep(5000);
        log.info("Click on next button " + nextButton.toString());
        clickOnElement(nextButton);

    }

    // for failed the  test case  remove \n from Asset (Assertion will failed)
    public void packageOption() throws InterruptedException {
        Thread.sleep(500);
        log.info("User get the available Packages");
        Assert.assertEquals(message.getText(), "Great news," + "\nyou can get Virgin Media");
    }

}
