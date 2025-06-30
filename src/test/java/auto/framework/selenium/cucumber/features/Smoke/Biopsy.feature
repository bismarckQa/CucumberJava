
Feature: Smoke test Biopsy module
  @test @smoke
  Scenario: Check Biopsy module
    Given I open the Baxter website
    And   I try to login with "login_baxter_t" credentials
    And   I login successful
    And   I Select the Group of patients "Pacientes en HD"
    When  I select the patient "M16 M17, M15 - 5216135"
    And   I open Biopsy module
    Then  I check the module Biopsy appear correctly