#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Link complementary test
  
  Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly
    
  @test @Test_case_3778 @ALM_VR_TC_604
  Scenario: Cancelling an associated additional test
    And   I try to create an additional associated test, but I cancel it


  @test @Test_case_3779 @ALM_VR_TC_605
  Scenario: Successful associated additional test
    And   I create an additional associated Test that was successfully completed