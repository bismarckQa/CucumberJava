#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Modify additional signature (Final signature)

  @test @TestCase_3293 @ALM_VR_TC_768
  Scenario: Edit additional signature (finalized treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify final signature block is read only in HD Treatment

  @test @TestCase_3290 @ALM_VR_TC_769
  Scenario: Edit additional signature (active treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter_bisnurse" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify additional signature is displayed in HD Treatment
    When  I click edit additional signature in HD Treatment
    Then  I verify additional signature modal is displayed in HD Treatment
    And   I enter notes "Automated test - edited signature" in additional signature modal in HD Treatment
    And   I click save in additional signature modal in HD Treatment
    And   I click button arrow up in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Save" in HD Treatment

  @test @TestCase_3291 @ALM_VR_TC_770
  Scenario: Cancelling edit additional signature (active treatment)
    Given I open the Baxter website
    And   I try to login with "login_baxter_bisnurse" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    Then  I verify additional signature is displayed in HD Treatment
    When  I click edit additional signature in HD Treatment
    Then  I verify additional signature modal is displayed in HD Treatment
    And   I enter notes "This should not be saved" in additional signature modal in HD Treatment
    And   I click cancel in additional signature modal in HD Treatment
    Then  I verify additional signature is displayed in HD Treatment
