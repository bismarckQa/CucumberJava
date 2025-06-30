Feature: Modify Allergies


  @test @smoke
  Scenario: Edit Allergy with blank required fields
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
    And   I try edit allergy with blank required fields
    And   I delete the allergy created

  @test @smoke
  Scenario: Edit Allergy Canceled
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data "Qa test data allergy canceled"
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    And   I try edit allergy but I cancel it "New Data Qa test"
    And   I delete the allergy created


  @test @smoke
  Scenario: Successful edited allergy
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data "Qa test data allergy edited"
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    And   I edited the allergy successfully with the new data "New Data Qa test"
    And   I delete the allergy created