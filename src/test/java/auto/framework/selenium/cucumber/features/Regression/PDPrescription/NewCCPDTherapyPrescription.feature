#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature: New CCPD therapy Prescription

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    

  @test @Test_Case_4908 @ALM_VR_TC_698
  Scenario:  Create a New CCPD Prescription for Baxter Exchange
  Then  I am trying to create a new CCPD prescription using the Housing Choice System

  @test @Test_Case_4909 @ALM_VR_TC_699
  Scenario:  Cancel a New CCPD Prescription
    Then  I try to create a new CCPD prescription using the Home Choice System, but it keeps getting canceled
