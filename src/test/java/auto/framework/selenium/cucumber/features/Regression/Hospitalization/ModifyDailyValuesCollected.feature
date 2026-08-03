#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Modify daily values collected
  Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    
  
  
  @test @Test_case_3857 @ALM_VR_TC_606
  Scenario: Cancelling an edited daily values collected
    And   I try to edit the daily values collected, but it cancels

  @test @Test_case_3858 @ALM_VR_TC_607
  Scenario: Successful edited daily values collected
    And   I edit the daily values collected successfully

@test @Test_case_3860 @ALM_VR_TC_608
  Scenario:Edit daily values collected with empty required fields