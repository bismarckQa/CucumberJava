Feature: Modify Progress Data
  @test @smoke
  Scenario: Cancelling an edited progress data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    #And   I complete the progress data and it is added successfully
    And   I try to edit progress data, but it cancels

  @test @smoke
  Scenario: Successful edited progress data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    #And   I complete the progress data and it is added successfully
    And   I edited the Progress Data successfully

