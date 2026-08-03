#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization
Feature: Delete Daily Values Collected

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly


  @test @Test_case_3862 @ALM_VR_TC_596
  Scenario: Cancelling a deleted daily values collected
    And   I try to delete the collected daily values, but it cancels

  @test @Test_case_3863 @ALM_VR_TC_597
  Scenario: Successful deleted daily values collected
    And   I delete successfully collected daily values

