Feature: Verify Task Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on task icon on left tool bar

  @Sanity
  Scenario: User will redirect to manage task page after clicking on task icon on left tool bar
    Then User redirects to "Manage Task" page
    And User see concern data on manage task page





