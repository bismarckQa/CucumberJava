#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Delete Hospitalization
  
  Background:
   Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    


  @test @Test_case_3767 @ALM_VR_TC_598
  Scenario: Cancelling a deleted Infection
   And   I cancel remove the Hospitalization created

  @test @Test_case_3768 @ALM_VR_TC_599
  Scenario: Successful deleted Infection
  And   I remove the Hospitalization created