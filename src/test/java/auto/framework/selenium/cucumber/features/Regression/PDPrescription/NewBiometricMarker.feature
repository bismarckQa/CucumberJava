#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription


Feature: New biometric marker

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I check the module PD Prescription appear correctly


  @test @Test_Case_4901 @ALM_VR_TC_689
  Scenario:  Save a New Biometric Marker with at least one Required field empty
    And   I try to save a new biometric marker with at least one required field empty


  @test @Test_Case_4900 @ALM_VR_TC_690
  Scenario:  Create a New Biometric Marker
    And   I successfully create and save the new Biometric Marker
