Feature: HD Water Quality Module
  @test @smoke
  Scenario: Check HD Water Quality module
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open HD Water Quality module
    Then  I check the module HD Water Quality appear correctly
