#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: View HD Treatment

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly

  @test @TestCase_3222 @ALM_VR_TC
  Scenario: Last Inactive Hd Treatment
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/02/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    When  I enter notes "qa inactive treatment" in HD Treatment final signature
    And   I set finalized checkbox to "checked" in HD Treatment final signature
    Then  I verify finalized checkbox is "checked" in HD Treatment final signature

  @test @TestCase_3223 @ALM_VR_TC
  Scenario: Last active HD Treatment
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify finalized checkbox is "unchecked" in HD Treatment final signature
