#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature: Modify Parameter adjustments
  
  @test @Test_Case_4887 @ALM_VR_TC_683
  Scenario:  Modify parameter Adjustments
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I successfully modified the parameter Adjustments
