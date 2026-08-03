#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization



Feature: Views Hospitalizations
   
  @test @Test_case_3689 @ALM_VR_TC_615
  Scenario: Enter in Hospitalization window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    And   I check the module Hospitalization appear correctly
    Then  I check the Hospitalization window with all the available information, filtering by admission date