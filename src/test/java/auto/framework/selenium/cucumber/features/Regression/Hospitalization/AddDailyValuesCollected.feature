Feature: Add Daily Values Collected
  @test @smoke
  Scenario: Cancelling an added daily values collected
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    And   I try to create a new daily values but I cancel it

  @test @smoke
  Scenario: Successful added daily values collected
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    And   I create added values daily and successfully collect them