#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Planning_Care
Feature: View Planning Care

  @test @Test_case_3477 @ALM_VR_TC_802
  Scenario: Enter in Planning Care window
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Planning Care module
    Then  I check the module Planning Care appear correctly
    When  I select period "Multi" in Planning Care
