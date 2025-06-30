
Feature: Smoke test Waiting List module
  @test @smoke
  Scenario: Check Waiting List module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Waiting List module
    Then  I check the module Waiting List appear correctly
