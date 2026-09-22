#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medical_History
Feature: View Medical History

  @test @Test_case_3403 @ALM_VR_TC_805
  Scenario: Enter in Personal Medical History window
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Medical History module
    Then  I check the module Medical History appear correctly
