#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Modify Hospitalization

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    

  @test @Test_case_3706 @ALM_VR_TC_609
  Scenario: Cancelling an edited Hospitalization
    And   I try to modify the created hospitalization, but cancel it

@test @Test_case_3705 @ALM_VR_TC_610
  Scenario:Successful edited Hospitalization


  @test @Test_case_3711 @ALM_VR_TC_611
  Scenario:Edit Hospitalization with empty required fields