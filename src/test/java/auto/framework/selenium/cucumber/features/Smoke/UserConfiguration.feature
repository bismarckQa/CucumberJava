Feature: User Configuration
  @test @smoke
  Scenario: Check User Configuration
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open options of user
    And   I open configuration option of user
    Then  Configuration menu open correctly with new patient option

