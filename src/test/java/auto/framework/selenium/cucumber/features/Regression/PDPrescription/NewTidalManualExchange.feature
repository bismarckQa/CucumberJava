#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature:  New Tidal Manual Exchange

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    
  @test @Test_Case_4924 @ALM_VR_TC_719
  Scenario: Save a New Tidal manual exchange with at least one Required field empty
    Then  I try to Save a New Tidal manual exchange with one Required field empty

  @test @Test_Case_4923 @ALM_VR_TC_720
  Scenario: Add a New Tidal manual exchange
    Then  I successfully saved a new Tidal manual exchange.

  @test @Test_Case_4925 @ALM_VR_TC_721
  Scenario: Delete a Tidal manual exchange
    Then  I create tidal treatment without manual exchange
