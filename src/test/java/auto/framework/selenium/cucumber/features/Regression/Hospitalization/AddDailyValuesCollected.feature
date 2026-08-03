#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization
Feature: Add Daily Values Collected

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly

  @test @Test_case_3845 @ALM_VR_TC_123
  Scenario: Cancelling an added daily values collected
    And   I try to create a new daily values but I cancel it

  @test @Test_case_3848 @ALM_VR_TC_589
  Scenario: Successful added daily values collected
    And   I create added values daily and successfully collect them

  @test @Test_case_3850 @ALM_VR_TC_590
  Scenario:Add daily values collected with empty required fields  