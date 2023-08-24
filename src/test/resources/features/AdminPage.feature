Feature: Verify Admin Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on administration icon on left tool bar

  @Sanity
  Scenario:The Letter Templates page should open with the list of existing Letter Templates.
    And User clicks on letter template icon on administration page
    Then User will able to see list of existing letters

  @Sanity
  Scenario:To check Edit Letter Template page should open with the template data in editable format.
    And User clicks on letter template icon on administration page
    And User clicks on edit icon against letter letter template name in list
    Then User will redirects to edit letter template page
    And User will able to edit available fields on page

  @Sanity
  Scenario:Verify that the Administration page displays with a set of icons and corresponding page should  opens on clicking individual icon.
    Then Admin page displays with icons and corresponding page displays by clicking on icon.






