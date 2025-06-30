Feature: Add Medication
  @test @smoke
  Scenario: Add new medication with empty fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I verify that the fields to add a new medication are empty

  @test @smoke
  Scenario: Category only
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with category only

  @test @smoke
  Scenario: Empty data medication
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to create a new medication with empty data

  @test @smoke
  Scenario: Frequency only
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with frequency only

  @test @smoke
  Scenario: If Needed Checked
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to save if needed checked

  @test @smoke
  Scenario: Medication Only
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with medication only

  @test @smoke
  Scenario: Route Only
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with route only

  @test @smoke
  Scenario: overlapping date, distinct location and same location
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to save with overlapping date, distinct location and same location, parameters startDate "6/25/2024", dosage "TestDosage", dosagePerDose "1.00", dosageSession "1", textArea "Qa observation"
    Then  I verify that the new medication was added
    And   I remove the added medication, confirm the reason "Qa Testing"

  @test @smoke
  Scenario: overlapping date, same location and same location
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to save with overlapping date, same location and same location, parameters startDate "6/25/2024", dosage "TestDosage", dosagePerDose "1.00", dosageSession "1", textArea "Qa observation"

  @test @smoke
  Scenario: Variable dosage
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with variable dosage, parameters startDate "6/25/2024", dosage "Test", dosageSession "1", textArea "Qa observation"
    Then  I verify that the new medication was added
    And   I remove the added medication, confirm the reason "Qa Testing"