#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription


Feature: New OCPD Therapy Prescription

Background: 
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    
  @test @Test_Case_4912 @ALM_VR_TC_703
  Scenario:  Create a New OCPD therapy Prescription for Baxter Exchange
    Then  I Save new OCPD Therapy Prescription for Manual Exchange

  @test @Test_Case_4913 @ALM_VR_TC_704
  Scenario:  Cancel a New OCPD therapy Prescription
    Then  I try to create a new OCPD therapy prescription for manual exchange, but it gets canceled

  @test @Test_Case_4915 @ALM_VR_TC_705
  Scenario:  Create a New OCPD therapy Prescription with, at least, one Required field empty
    Then  I try to create a new OCPD therapy prescription for manual exchange, with required field empty
