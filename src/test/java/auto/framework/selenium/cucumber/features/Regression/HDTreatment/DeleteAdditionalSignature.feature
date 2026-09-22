#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Delete additional signature (Final signature)

  @test @TestCase_3295 @ALM_VR_TC_771
  Scenario: Delete additional signature (finalized treatment)
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

  @test @TestCase_3294 @ALM_VR_TC_772
  Scenario: Delete additional signature (active treatment)
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
    When  I click delete additional signature in HD Treatment
    And   I click button arrow up in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Save" in HD Treatment
    Then  I verify additional signature is not created in HD Treatment
