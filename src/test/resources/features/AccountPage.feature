Feature: Verify Account Module Functionalities

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on account icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on account page should work
    When User clicks on icon
    Then User will redirect to respected page


 ##Policy review

  @Sanity
  Scenario: Filter Policy review information upon policy end date and to date
    When User clicks on policy review button on account page
    And User enters policy end date and to date value on policy review page
    And User clicks on search button on policy review page
    Then Appropriate data displays on policy review page upon date values

     ##Process Credit Card Payment

