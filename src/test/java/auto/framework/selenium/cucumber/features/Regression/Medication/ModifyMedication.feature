Feature: Smoke test Modify Medication module
  @test @smoke
  Scenario: Check editable fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with, parameters startDate "7/15/2024", dosage "TestModify", dosageSession "1", textArea "Qa observation modify"
    Then  I verify that the new medication was added
    And   I check if the fields are editable: date stopped "11/25/2025" and Observations "test edit observations"

  @test @smoke
  Scenario: Set stopped date and Observations: inactivate medication treatment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I modified the medication in the end date "6/26/2025" and observations "Observations change test" and clicked show inactive

  @test @smoke
  Scenario: Successful edit medication
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I modify the medication in the end date "8/26/2025" and observations "Observations change test 1"
    And   I remove the added medication, confirm the reason "Qa Testing"