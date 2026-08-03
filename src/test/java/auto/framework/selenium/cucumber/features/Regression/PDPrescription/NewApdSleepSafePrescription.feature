#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature: New APD Sleep Safe Prescription

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module


  @test @Test_Case_4895 @ALM_VR_TC_685
  Scenario:  Create a New APD Sleep Safe Prescription
    Then  I saving a new prescription for APD Sleep Safe

  @test @Test_Case_4896 @ALM_VR_TC_686
  Scenario:  Cancel a new APD Sleep Safe Prescription
    Then  I try saving a new prescription for APD Sleep Safe, but I cancel

  @test @Test_Case_4897 @ALM_VR_TC_687
  Scenario:  Save a New APD Sleep Safe Prescription with the field "Total vol" and or "Last Infusion" and/or "Prescribed by" empty
    Then  I try saving a new prescription with empty Total vol and last infusion, but I cancel

  @test @Test_Case_4899 @ALM_VR_TC_688
  Scenario:  Save a New APD Sleep Safe Prescription with the field "Weekdays" empty.
    Then  I try saving a new prescription with weekdays empty, the system shall display the error message
