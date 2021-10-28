$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/feature_File/Availability.feature");
formatter.feature({
  "line": 1,
  "name": "Broadband and tv Packages  Availability Functionality",
  "description": "User want to check which broadband and TV packages are available as per user postcode .",
  "id": "broadband-and-tv-packages--availability-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10130876900,
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
  "duration": 3760193700,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.clickOnSearchButton()"
});
formatter.result({
  "duration": 5455995500,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.userSelectTheAddressFromList()"
});
formatter.result({
  "duration": 6471118500,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.clickOnNextButton()"
});
formatter.result({
  "duration": 18294389900,
  "status": "passed"
});
formatter.match({
  "location": "AvailabilityStepdefs.userCanSeeTheAvailablePackages()"
});
formatter.result({
  "duration": 1861348500,
  "status": "passed"
});
formatter.after({
  "duration": 1475536800,
  "status": "passed"
});
});