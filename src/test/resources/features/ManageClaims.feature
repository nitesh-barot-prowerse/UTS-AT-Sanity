Feature: Verify Manage Claim Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on manage claims icon on left tool bar

  @Sanity
  Scenario:Manage claims page should open with the claim details after clicking on manage claim icon on left tool bar
    Then User will able see all data available on manage claim page

  @Sanity
  Scenario: All data under date column displays with dd-mm-yyyy format and data under amount should post fixed by £ sign on manage claim page
    Then All data under treatment and cliam first advised date column displays in dd-mm-yyyy format
    Then  All data under Amount paybale column post fixed  by € sign

  @Sanity
  Scenario: User will redirect to respected claim information page by clicking on claim number link on manage claim page
    When User clicks on claim number on manage claim page
    Then User will redirects to respected claim information page

#  @Sanity
#  Scenario: Add claim page displays all dropdowns with valid items and date appears with calender icon
#    When User clicks on add claim button
#    Then User will redirect to add claim page
#    And Page has all dropdown with valid list items'

  @Sanity
  Scenario:Filter Claim details on manage claim page upon from and to date value of claim first advised on manage claim page
    When User enters value of from and to date value of claim first advised on manage claim page
    And User clicks on search button on manage claim page
    Then Details of claim on manage claim page filters upon value of from and to date value of claim first advised on manage claim page


