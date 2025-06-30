Feature: Add Hospitalization
  @test @smoke
  Scenario: Cancelling an added Hospitalization
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    And   I open the menu and add new line of Hospitalization
    Then  I enter all the necessary data to create a new hospitalization
    And   I cancel saving the new hospitalization

  @test @smoke
  Scenario: Successful added Hospitalization
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    And   I open the menu and add new line of Hospitalization
    Then  I enter all the necessary data to create a new hospitalization
    And   I save the new Hospitalization
