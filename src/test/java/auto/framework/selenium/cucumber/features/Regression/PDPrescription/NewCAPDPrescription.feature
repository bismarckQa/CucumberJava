#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription
Feature:New CAPD Prescription

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module



  @test @Test_Case_4905 @ALM_VR_TC_691
  Scenario: Cancel a New CAPD Prescription
    Then  I try to create a new CAPD prescription, but I get the option to cancel


  @test @Test_Case_4902 @ALM_VR_TC_692
  Scenario: Create a New CAPD prescription for Baxter Exchange
    Then  I successfully created a new CAPD prescription for Baxter exchange

  @test @Test_Case_4904 @ALM_VR_TC_693
  Scenario:Create a New CAPD prescription for Fresenius Exchange
    Then  I successfully created a new CAPD prescription with fresenius exchange

  @test @Test_Case_4903 @ALM_VR_TC_694
  Scenario: Create a New CAPD Prescription with, at least, one Required field empty
    Then  I try to create a new CAPD prescription with a Fresenius exchange with the required field empty
