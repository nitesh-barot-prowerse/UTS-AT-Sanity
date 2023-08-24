Feature: Verify Setting Module Features

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    And User selects language option
    When User clicks on look up values icon on left tool bar

  @Sanity
  Scenario: All hyperlinks with icons on setting page should work
    When User clicks on icon on setting page
    Then User will able to redirect to respected page

 ##Pet Breed

  @Sanity
  Scenario: To verify whether Manage Pet Breed page displays with Pet Breed details by clicking on Pet Breed icon on setting page
    When User clicks on pet breed icon on setting page
    Then Manage pet breed page displays with all task details



#  @Sanity
#  Scenario:Edit Pet Breed page displays upon clicking on edit icon against pet breed name on manage pet breed page
#    When User clicks on pet breed icon on setting page
#    And User clicks on edit icon against pet breed  name on manage pet breed page
#    Then Edit pet breed page displays in editable format

   #Exclusion Page

  @Sanity
  Scenario: To verify whether Manage Exclusion page displays with exclusion details by clicking on exclusion icon on setting page
    When User clicks on exclusion icon on setting page
    Then Manage exclusion page displays with all task details

  @Sanity
  Scenario:Add exclusion page displays will all details when user clicks on add exclusion icon on manage exclusion page
    When User clicks on exclusion icon on setting page
    And User clicks on clicks on add exclusion icon on manage exclusion page
    Then Add exclusion page displays with all details

  @Sanity
  Scenario:Edit exclusion page displays upon clicking on edit icon against exclusion code on manage exclusion page
    When User clicks on exclusion icon on setting page
    And User clicks on edit icon against exclusion code on manage exclusion page
    Then Edit exclusion page displays in editable format

    #Regular Vet

  @Sanity
  Scenario: To verify whether Manage regular vet displays with vet details by clicking on regular vet icon on setting page
    When User clicks on regular vet icon on setting page
    Then Manage regular vet displays with all task details



      ##Hear About Us

  @Sanity
  Scenario: To verify whether Manage hear about us page displays with  details by clicking on hear about us icon on setting page
    When User clicks on hear about us icon on setting page
    Then Manage hear about us page displays with all task details


