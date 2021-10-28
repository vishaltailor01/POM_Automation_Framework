package com.virginmedia.step_Def;

import com.virginmedia.pages.Availability;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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

    @When("^User select the address from list$")
    public void userSelectTheAddressFromList() throws InterruptedException {
        new Availability().selectAddress();
        
    }

    @And("^click on next button$")
    public void clickOnNextButton() throws InterruptedException {
        new Availability().setNextButton();
        
    }

    @Then("^User can see the available Packages$")
    public void userCanSeeTheAvailablePackages() throws InterruptedException {
        new Availability().packageOption();
    }
}
