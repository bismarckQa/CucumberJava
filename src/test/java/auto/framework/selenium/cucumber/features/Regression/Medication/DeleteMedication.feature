Feature: Smoke test Medication module
  @test @smoke
  Scenario: Unused Medication
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with, parameters startDate "6/25/2024", dosage "TestDelete", dosageSession "1", textArea "Qa observation"
    Then  I verify that the new medication was added
    And   I remove the added medication, confirm the reason "Qa Testing"

  @test @smoke
  Scenario: wrong confirmation password, wrong confirmation reason
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to Add new medication with, parameters startDate "6/25/2024", dosage "TestDelete", dosageSession "1", textArea "Qa observation"
    Then  I verify that the new medication was added
    And   I remove the added medication, with wrong password "admin123" and the wrong reason "Qa, wrong reason"
    And   I remove the added medication, confirm the reason "Qa Testing"