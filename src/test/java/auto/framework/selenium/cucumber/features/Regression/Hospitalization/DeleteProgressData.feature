#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Delete Progress Data
  
  Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
  

  @test @Test_case_3803 @ALM_VR_TC_600
  Scenario: Cancelling a deleted Progress Data
    And   I try to delete progress data but it cancels

  @test @Test_case_3804 @ALM_VR_TC_601
  Scenario: Successful deleted Progress Data
    And   I successfully deleted progress data

