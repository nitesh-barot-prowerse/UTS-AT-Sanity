Feature: Verify Task Module Features


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on task icon on left tool bar

  @Sanity
  Scenario: User will redirect to manage task page after clicking on task icon on left tool bar
    Then User redirects to "Manage Task" page
    And User see concern data on manage task page

  @Sanity
  Scenario: To check whether Assign to dropdown on add task page appears with current user after clicking on add task button on add task page
    When user clicks on add task button
    Then User redirects to page with "Add Task" message
    And Assigned to dropdown appears with initial current user

  

