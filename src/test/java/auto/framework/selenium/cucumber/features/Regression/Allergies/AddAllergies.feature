
Feature: Add Allergies
  @test @smoke
  Scenario: New Allergy Canceled
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data "Qa test data"
    Then  I cancel the creation of a new allergy

  @test @smoke
  Scenario: Successful added Allergy
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
  Scenario: Save new allergy with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data with empty required field "QA test Data"


  @test @smoke
  Scenario: Creating a new record with Active Filter the new data shall not disappear from screen
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I open the menu and add new allergy
    And   I fill in the new allergy data with active field "Qa test data active"
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    And   I verify filter allergy is active
    And   I delete the allergy created



