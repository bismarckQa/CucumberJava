Feature: Smoke test Medication module
  @test @smoke
  Scenario: Copy medication future start date
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to copy the selected medication with the new parameters, dosage "Postdialisis test", observations "closed test"

  @test @smoke
  Scenario: Copy medication past start date
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I try to copy the selected medication with the new parameters and past start date, dosage "Postdialisis test", observations "closed test", startDate "1/1/2020"
