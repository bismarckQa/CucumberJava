#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add new additional signature (Final Signature)

  @test @TestCase_3286 @ALM_VR_TC_112
  Scenario: Add additional signature (finalized treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter_bisnurse" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify final signature block is read only in HD Treatment

  @test @TestCase_3288 @ALM_VR_TC_764
  Scenario: Add additional signature (nurse profile)
    Given I open the Baxter website
    And   I try to login with "login_baxter_bisnurse" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    When  I enter notes "Automated test - additional signature" in HD Treatment final signature
    And   I click shift button in HD Treatment final signature
    Then  I verify additional signature is displayed in HD Treatment
    And   I click button arrow up in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Save" in HD Treatment
