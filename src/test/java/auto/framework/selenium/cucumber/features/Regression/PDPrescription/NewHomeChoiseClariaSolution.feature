#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription


Feature: New Home Choose Claria Solution

Background:  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    

  @test @Test_Case_4932 @ALM_VR_TC_700
  Scenario:  Add a HomeChoice  Claria solution
  Then  I trying to add a Home Choice Claria solution

  @test @Test_Case_4933 @ALM_VR_TC_701
  Scenario:  Save a new home choise Claria Solution to a prescription
   Then  I am trying to save a new Home Choice Claria solution successfully

  @test @Test_Case_4934 @ALM_VR_TC_702
  Scenario:Remove home choise Claria solution