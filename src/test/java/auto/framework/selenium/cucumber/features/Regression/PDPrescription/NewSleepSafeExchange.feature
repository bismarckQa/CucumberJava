#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature: New Sleep Safe Exchange

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module

  @test @Test_Case_4926 @ALM_VR_TC_716
  Scenario:  Add a New Sleep Safe Exchange
    Then  I create new Exchange with system sleep safe

  @test @Test_Case_4927 @ALM_VR_TC_717
  Scenario:  Save a New Sleep Safe Exchange with at least one Required field empty
    Then  I try to create new Exchange with system sleep safe with required field empty

  @test @Test_Case_4928 @ALM_VR_TC_718
  Scenario:  Delete Sleep Safe Exchange
    Then  I successfully removed Sleep Safe Exchange
