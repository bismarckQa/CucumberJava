Feature: Delete Allergies

  @test @smoke
  Scenario: Successful Deleted Allergy
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data "Qa test data"
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    And   I delete the allergy created


  @test @smoke
  Scenario: Cancelling a deleted Allergy
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data "Qa test data"
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    And   I canceling deleted allergy
    And   I delete the allergy created



