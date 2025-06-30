
Feature: Smoke test HD Calendar module
  @test @smoke
  Scenario: Check HD Calendar module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Calendar module
    Then  I check the module HD Calendar appear correctly