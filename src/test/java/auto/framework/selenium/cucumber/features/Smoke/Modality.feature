Feature: Modality Module
  @test @smoke
  Scenario: Check Modality module and edit sub-modality
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Modality module
    And   I open options and select edit
    And   I edit sub-modality and change "HD Center"
    Then  I save the changes in this patient


  @test @smoke
  Scenario: Check Modality module and Undo Changes
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Modality module
    And   I open options and select edit
    And   I edit sub-modality and change "HDDD"
    Then  I save the changes in this patient