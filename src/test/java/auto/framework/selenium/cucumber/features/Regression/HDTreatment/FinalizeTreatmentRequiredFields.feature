#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Finalize HD Treatment with required fields validation

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_17442 @ALM_VR_TC_795
  Scenario: Finalize treatment with empty required fields shows warning
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    And   I set finalized checkbox to "checked" in HD Treatment final signature
    Then  I verify required fields signature warning is displayed in HD Treatment
    And   I click OK in required fields signature warning in HD Treatment
