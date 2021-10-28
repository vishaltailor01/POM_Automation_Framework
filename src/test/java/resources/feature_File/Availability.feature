Feature: Broadband and tv Packages  Availability Functionality
  User want to check which broadband and TV packages are available as per user postcode .

  @Smoke
  Scenario: User is on a HomePage
    When User Enter PostCode "Ha0 2hl" on Postcode field
    And Click on search button

