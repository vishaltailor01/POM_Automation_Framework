$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/feature_File/Availability.feature");
formatter.feature({
  "line": 1,
  "name": "Broadband and tv Packages  Availability Functionality",
  "description": "User want to check which broadband and TV packages are available as per user postcode .",
  "id": "broadband-and-tv-packages--availability-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10061749700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User is on a HomePage",
  "description": "",
  "id": "broadband-and-tv-packages--availability-functionality;user-is-on-a-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Enter PostCode \"Ha0 2hl\" on Postcode field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User select the address from list",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User can see the available Packages",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ha0 2hl",
      "offset": 21
    }
  ],
  "location": "AvailabilityStepdefs.userEnterPostCodeOnPostcodeField(String)"
});
formatter.result({
  "duration": 13573834400,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.clickOnSearchButton()"
});
formatter.result({
  "duration": 5373747800,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.userSelectTheAddressFromList()"
});
formatter.result({
  "duration": 5660487300,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.clickOnNextButton()"
});
formatter.result({
  "duration": 11292291200,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.userCanSeeTheAvailablePackages()"
});
formatter.result({
  "duration": 586504200,
  "status": "passed"
});
formatter.after({
  "duration": 1663280200,
  "status": "passed"
});
});