Feature: Verify Manage Claim Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on manage claims icon on left tool bar

  @Sanity
  Scenario: User will redirect to manage claims page after clicking on manage claim icon on left tool bar
    Then User will able see all data available on manage claim page

  @Sanity
  Scenario: All data under date column displays with dd-mm-yyyy format and data under amount should post fixed by £ sign on manage claim page
    Then All data under treatment and cliam first advised date column displays in dd-mm-yyyy format
    Then  All data under Amount paybale column post fixed  by € sign

  @Sanity
  Scenario: User will redirect to respected claim information page by clicking on claim number link on manage claim page
    When User clicks on claim number on manage claim page
    Then User will redirects to respected claim information page

  @Sanity
  Scenario: Add claim page displays all dropdowns with valid items and date appears with calender icon
    When User clicks on add claim button
    Then User will redirect to add claim page
    And Page has all dropdown with valid list items'

#  @Sanity
#  Scenario: Treatment status should reflect upon option selected from treatment status drop down on manage claim page
#    When User selects any options from treatment status dropdown on manage claim page
#    Then Appropriate treatment status will display on manage claim page under claim details



