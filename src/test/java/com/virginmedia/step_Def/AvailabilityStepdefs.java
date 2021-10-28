package com.virginmedia.step_Def;

import com.virginmedia.pages.Availability;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

/**
 * @author Vishal Tailor
 */
public class AvailabilityStepdefs {
   



    @And("^Click on search button$")
    public void clickOnSearchButton() throws InterruptedException {
        new Availability().button();

    }

    @When("^User Enter PostCode \"([^\"]*)\" on Postcode field$")
    public void userEnterPostCodeOnPostcodeField(String Postcode) throws InterruptedException {
        new Availability().enterPostcode(Postcode);

    }
}
