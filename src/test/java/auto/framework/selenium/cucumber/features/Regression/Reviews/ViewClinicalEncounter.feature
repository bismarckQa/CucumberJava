Feature: Clinical Encounter Reviews
  @test @smoke
  Scenario: Enter in clinical encounter window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Reviews module
    Then  I check the module Reviews appear correctly
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    Then  I successfully delete the review created