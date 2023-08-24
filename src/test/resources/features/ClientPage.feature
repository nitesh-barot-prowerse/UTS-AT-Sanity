Feature:  Verify Client Module Features


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on client icon on left tool bar

  @Sanity
  Scenario:Ensure that the Manage Client page displays list of client data after clicking on client icon on left tool bar
    Then Manage client page displays with list of clients


  @Sanity
  Scenario:Add claim page should display with all details by clicking on add claim icon on cog dropdown menu on view client page
    When User clicks on client code on manage client page
    And User clicks on add claim icon on cog dropdown menu on view client page
    Then Add claim page should display with all details

  @Sanity
  Scenario:Client Refund Unallocated Balance page displays with all details by clicking on client refund unallocated balance icon on cog dropdown menu on view client page
    When User clicks on client code on manage client page
    And User clicks on client refund unallocated balance icon on cog dropdown menu on view client page
    Then Client Refund Unallocated Balance page displays with all details

  @Sanity
  Scenario:Client Refund Credit Note page displays with all details by clicking on client refund credit note icon on cog dropdown menu on view client page
    When User clicks on client code on manage client page
    And User clicks on client refund credit note icon on cog dropdown menu on view client page
    Then Client Refund Credit Note page displays with all details

  @Sanity
  Scenario:Client Allocate Payment page displays with all details by clicking on client allocate payment icon on cog dropdown menu on view client page
    When User clicks on client code on manage client page
    And User clicks on client allocate payment icon on cog dropdown menu on view client page
    Then Client Allocate Payment page displays with all details

  @Sanity
  Scenario:Client Account Maintenance page displays with all details by clicking on client account maintenance page icon on cog dropdown menu on view client page
    When User clicks on client code on manage client page
    And User clicks on client account maintenance page icon on cog dropdown menu on view client page
    Then Client Account Maintenance page displays with all details


  #  @Qa @Stage
#  Scenario: To add and verify new client details inside client module
#    When User clicks on add client icon on manage client page
#    And User enters all mandatory details on add client page
#    And User clicks on create button on add client page
#    Then View client page appears with the details of currently added client

#  @Qa
#  Scenario: Appropriate client data will display upon entering  code in search box
#    When User enters code number inside search box on manage client page
#    And User clicks on search button manage client page
#    Then Appropriate client information displays inside table on manage client page

#  @Qa @Stage
#  Scenario:Verify add contact feature of client
#    When User clicks on client code on manage client page
#    And User selects Add contact option from setting dropdown besides of active text on view client page
#    And User enters all details inside add client window
#    Then Contact details can view under contacts menu on view client page
#
#  @Qa @Stage
#  Scenario: Verify add notes feature of client
#    When User clicks on client code on manage client page
#    And User selects Add notes options from setting dropdown besides the active text on view client page
#    And User enters all details inside add notes window
#    Then Notes details can view under note menu tab on view client page
#
#  @Qa @Stage
#  Scenario: Verify add task feature of client
#    When User clicks on client code on manage client page
#    And User selects Add task options from setting dropdown besides the active text on view client page
#    And User enters all details inside add task window
#    Then Task details can view under task menu tab on view client page
#
#  @Qa @Stage
#  Scenario: To verify edit client functionality for existing client
#    When User clicks on client code on manage client page
#    And User selects edit client sections from setting dropdown besides the active text on view client page
#    And User enters all details of client on edit client window
#    Then Updated details can view on view client page

#  @Production
#  Scenario:Verify add primary contact feature of client on production
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects Add contact option from setting dropdown besides of active text on view client page
#    And User enters all details inside add client window
#    Then Contact details can view under contacts menu on view client page
#
#  @Production
#  Scenario: Verify add notes feature of client on production environment
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects Add notes options from setting dropdown besides the active text on view client page
#    And User enters all details inside add notes window
#    Then Notes details can view under note menu tab on view client page
#
#  @Production
#  Scenario: Verify add task feature of client on production environment
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects Add task options from setting dropdown besides the active text on view client page
#    And User enters all details inside add task window
#    Then Task details can view under task menu tab on view client page
#
#  @Production
#  Scenario: To verify edit client functionality for existing client on production environment
#    When User enters test client code inside search box on manage client page
#    And Uer clicks on search button on manage client page
#    And User clicks on client code on manage client page on production
#    And User selects edit client sections from setting dropdown besides the active text on view client page
#    And User enters all details of client on edit client window
#    Then Updated details can view on view client page









