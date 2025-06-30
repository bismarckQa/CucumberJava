Feature: View Medication module
  @test @smoke
  Scenario: Enter in medication window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with, parameters startDate "7/16/2024", dosage "TestModify", dosageSession "1", textArea "Qa observation modify"
    Then  I verify that the new medication was added


  @test @smoke
  Scenario: Clear all medication categories
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I uncheck all the categories at the top Categories of the medication module

  @test @smoke
  Scenario: Show inactive medications
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I Checked Show inactive checkbox


  @test @smoke
  Scenario: Show medications of only one category
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I Checked only one medication category in top combo box


  @test @smoke
  Scenario: Show only home medications
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I checked show only home check box

  @test @smoke
  Scenario: View allergies from medication
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
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I click on the Allergies link, under Penicillin
    Then  I check the module Allergies appear correctly
    And   I delete the allergy created
    And   I open Medication module
    And   I remove the added medication, confirm the reason "Qa Testing"
