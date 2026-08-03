#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization


Feature: Modify Progress Data

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    

  @test @Test_case_3800 @ALM_VR_TC_612
  Scenario: Cancelling an edited progress data
    #And   I complete the progress data and it is added successfully
    And   I try to edit progress data, but it cancels

  @test @Test_case_3801 @ALM_VR_TC_613
  Scenario: Successful edited progress data
    #And   I complete the progress data and it is added successfully
    And   I edited the Progress Data successfully

@test @Test_case_3802 @ALM_VR_TC_614
  Scenario: Edit progress data with empty required fields