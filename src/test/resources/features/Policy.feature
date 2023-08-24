Feature: Verify Policy Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on policy icon on left tool bar

  @Sanity
  Scenario: List of policies should display by clicking on policy icon on left tool bar
    Then User can see "Manage Policy" message with all policy data

  @Sanity
  Scenario: Verify dates under start date and end date should display with dd-mm-yyyy format on manage policy page
    Then All data under Start date and And date displays in dd-mm-yyyy format

  @Sanity
  Scenario:Respected policy information should displays by clicking on individual policy number on manage policy page
    When User clicks on policy number
    Then User will redirect to policy information page

  @Sanity
  Scenario: Check appropriate policy data should displays against option selected from status drop down on manage policy page
    When User selects any options from status dropdown
    Then Appropriate data displays on manage policy page depend on drop down option

  @Sanity
  Scenario:Filter policy details on manage policy page upon from and to date value of policy  on manage policy page
    When User enters value of from and to date value of policy on manage policy page
    And User clicks on search button on manage policy page
    Then Details of policy on manage policy page filters upon value of from and to date value of policy

  @sanity
  Scenario: Policy endorsement page displays with all details by clicking add endorsement icon of cog drop down on policy information page
    When User selects any active option from status dropdown on manage policy page
    When User clicks on policy number link on manage policy page
    And User selects add endorsement icon of cog drop down on policy information page
    Then Policy endorsement page displays with all details

  @sanity
  Scenario:Allocate payment page displays with all details by clicking add allocate payment icon of cog drop down on policy information page
    When User selects any active option from status dropdown on manage policy page
    And User clicks on policy number link on manage policy page
    And User selects add allocate payment icon of cog drop down on policy information page
    Then Add allocate payment page displays with all details



