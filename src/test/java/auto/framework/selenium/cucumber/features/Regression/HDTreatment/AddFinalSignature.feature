#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add Final Signature

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_4756 @ALM_VR_TC_765
  Scenario: Add final signature with Nephrologist profile (finalized treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify final signature block is read only in HD Treatment

  @test @TestCase_4757 @ALM_VR_TC_766
  Scenario: Add final signature with Nephrologist profile
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Preparation" section in HD Treatment
    And   I select room "Test" in HD Treatment location
    And   I select shift "Tardes" in HD Treatment location
    And   I select location "Test1" in HD Treatment location
    And   I select monitor "AK98" in HD Treatment location
    And   I open "Final signature" section in HD Treatment
    When  I enter notes "Automated test - final signature" in HD Treatment final signature
    And   I select nephrologist in HD Treatment final signature
    And   I check finalized checkbox in HD Treatment final signature
    And   I click button arrow up in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Save" in HD Treatment
    Then  I verify finalized checkbox is "unchecked" in HD Treatment final signature

  @test @TestCase_4759 @ALM_VR_TC_767
  Scenario: Cancelling an added final signature with Nurse profile
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify finalized checkbox is "unchecked" in HD Treatment final signature
    When  I enter notes "Automated test - cancel signature" in HD Treatment final signature
    And   I select nephrologist in HD Treatment final signature
    And   I check finalized checkbox in HD Treatment final signature
    And   I click button arrow up in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Cancel" in HD Treatment
    Then  I verify finalized checkbox is "unchecked" in HD Treatment final signature
