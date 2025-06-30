
Feature: Smoke test HD Treatment module
  @test @smoke
  Scenario: Check HD Treatment module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly