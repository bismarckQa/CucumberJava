#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@PD_Prescription

Feature:  Delete Tidal Manual Exchange
  @test @Test_Case_4872 @ALM_VR_TC_681
  Scenario: Delete Tidal Manual Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module
    Then  I verify that the system will delete the selected manual exchange
