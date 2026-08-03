
#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature:  New CCPD Manual Exchange

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    
  @test @Test_Case_4930  @ALM_VR_TC_695
  Scenario:  Save a New CCPD manual exchange with at least one Required field empty
    Then  I try to save a new CCPD Manual Exchange with one required field empty

  @test @Test_Case_4929  @ALM_VR_TC_696
  Scenario:  Add a New CCPD manual exchange
    Then  I create a new CCPD prescription with Manual Exchange


  @test @Test_Case_4931  @ALM_VR_TC_697
  Scenario:  Delete CCPD manual exchange
    Then  I delete a newly created CCPD Manual Exchange
