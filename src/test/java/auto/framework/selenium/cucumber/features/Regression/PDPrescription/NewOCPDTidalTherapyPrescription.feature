#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature: New OCPD Tidal Therapy prescription

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module


  @test @Test_Case_4917 @ALM_VR_TC_706
  Scenario:  Cancel  a New OCPD Tidal Prescription
    Then  I trying to create a new OCPD Tidal prescription, but I get the option to cancel

  @test @Test_Case_4916 @ALM_VR_TC_707
  Scenario: Create a New OCPD  Tidal Prescription with, at least, one Required field empty
    Then  I trying to create a new OCPD Tidal prescription, with one required field empty

  @test @Test_Case_4919 @ALM_VR_TC_708
  Scenario: Create a New OCPD  Tidal Prescription
    Then  I successfully created a new Tidal prescription
