Feature: Add New HDTreatment


  @test @smoke
  Scenario: New Treatment without active HD Prescription
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    And   I open three buttons menu and add new HD Treatment
    Then  I Check Alert window and close it

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
    And   I open three buttons menu and add new HD Treatment
    Then  I Check Preparation and Admin drug other Tabs

  @test @smoke
  Scenario: In HD Treatment - Treatment History, the value for "Convection Volume" must be the last observation value
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    And   I open Session tab
    When  I add new observation
    And   I save the new observation
    Then  I open treatment history and check data




