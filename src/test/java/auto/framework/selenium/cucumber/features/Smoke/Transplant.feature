
Feature: Smoke test Transplant module
  @test @smoke
  Scenario: Check Transplant module
    Given I open the Baxter website
    And   I try to login with "login_baxter_t" credentials
    And   I login successful
    And   I Select the Group of patients "Pacientes en HD"
    When  I select the patient "M16 M17, M15 - 5216135"
    And   I open Transplant module
    Then  I check the module Transplant appear correctly