Feature: View Allergies

  @test @smoke
  Scenario: Canceling check no known  allergies
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I canceling check no known allergies

  @test @smoke
  Scenario: Successful check no known  allergies
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I checked successful no known allergies
    And   I verified successfully, no known allergies

  @test @smoke
  Scenario: Successful uncheck no known  allergies
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    And   I verified successfully, no known allergies
    And   I unchecked no known allergies