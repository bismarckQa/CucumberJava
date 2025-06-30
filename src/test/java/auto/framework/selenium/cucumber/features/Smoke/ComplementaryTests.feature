
Feature: Smoke test Additional Studies (Complementary Test module)
  @test @smoke
  Scenario: Check Complementary tests module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Complementary tests module
    And   I check the module Complementary tests appear correctly