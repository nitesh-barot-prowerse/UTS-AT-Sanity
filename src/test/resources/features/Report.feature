Feature: Verify Report Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on reports icon on left tool bar

  @Sanity
  Scenario: Click on Report icon on the left tool bar.  Verify that the Report Page displays with six sections.
    Then User will able to see total six section of report category

  @Sanity
  Scenario: User will able to redirect on respected report page by clicking on report icon on report page
    When User clicks on reports icon
    Then Respected report page displays

    #26 and 27 report

  @Sanity
  Scenario:Add premium and claim adjustments window opens by clicking on adjustment button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on adjustment button on section report page
    Then Add premium and claim adjustments window opens with all details

  @Sanity
  Scenario:Payment window opens by clicking on payments button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on payments button on section report page
    Then Payments window opens with all details

  @Sanity
  Scenario:Opening and Closing bank balance window opens by clicking on bank button on section 26 and 27 report page
    When User clicks on Trust summary section button on report page
    And User clicks on bank button on section report page
    Then Opening and Closing bank balance window opens with all details

