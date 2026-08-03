#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization
Feature: Add Progress Data
  
  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    
  
  @test @Test_case_3783 @ALM_VR_TC_593
  Scenario: cancelling an added progress data
  And   I try to add progress data, but it gets cancelled

  @test @Test_case_3784 @ALM_VR_TC_594
  Scenario: Successful added Progress Data
    And   I complete the progress data and it is added successfully

@test @Test_case_3792 @ALM_VR_TC_595
  Scenario:Add new progress data with empty required fields