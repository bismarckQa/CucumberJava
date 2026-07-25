#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Allergies
Feature: View Allergies

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly

   @test @TestCase_2724 @ALM_VR_TC_51
  Scenario: Canceling check no known  allergies
    When  I canceling check no known allergies

    @test @TestCase_2726 @ALM_VR_TC_420
  Scenario: Successful check no known  allergies
    When  I checked successful no known allergies
    Then  I verified successfully, no known allergies
    And   I unchecked no known allergies

    @test @TestCase_2725 @ALM_VR_TC_421
  Scenario: Successful uncheck no known allergies
    When  I checked successful no known allergies
    Then  I verified successfully, no known allergies
    And   I unchecked no known allergies