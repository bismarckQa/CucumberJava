Feature:  Viewing Medication Administration History At Chair side


  @test @regression
  Scenario: Clone Add configuration for laboratory result options in "Hd Therapy" section
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open configuration option module of user
    Then  I select only one profile, from the list of all active laboratories

  @test @regression
  Scenario: Add medication administration history screen to HD treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then  I select a range from the last months and run the query to get the data. It will show theMedication administration history.
