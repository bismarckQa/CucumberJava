
Feature: Smoke test HD Monitors module
  @test @smoke
  Scenario: Check HD Monitors module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Monitors module
    Then  I check the module HD Monitors appear correctly