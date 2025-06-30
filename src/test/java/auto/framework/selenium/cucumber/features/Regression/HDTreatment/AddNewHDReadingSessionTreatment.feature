Feature: Add New HD Reading Sessions HDTreatment

  @test @smoke
  Scenario: Add New HD Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Prescription module
    Then  I create a new simple prescription
    

  @test @smoke
  Scenario: New Treatment with active HD Treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then  I open three buttons menu and add new HD Treatment

  @test @smoke
  Scenario: Add new reading register to an active HD Treatment (empty registry)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    And   I open Session tab
    When  I add new observation
    And   I save the new observation
    Then  I check the data new observations is empty
    When  I click remove the last registry of new observations
    And   I accept the delete Alert windows, fill the data and the reason "TestRemove"
    Then  I check the data new observations is empty


  @test @smoke
  Scenario: Add new reading register to an active HD Treatment (Full registry)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Prescription module
    And   I open Session tab
    When  I add new observations and fill all the data, with "1"
    And   I save the new observation
    Then  I check the new observation is filled







