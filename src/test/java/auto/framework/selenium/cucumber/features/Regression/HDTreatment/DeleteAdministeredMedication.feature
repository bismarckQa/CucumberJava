#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Delete administered medication (Administration Drugs/Other)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3277 @ALM_VR_TC_756
  Scenario: Delete administered medication (finalized treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I verify session inputs are disabled in HD Treatment

  @test @TestCase_3278 @ALM_VR_TC_757
  Scenario: Delete administered medication (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I verify administered medication block is displayed in HD Treatment
    When  I drag administered medication to bin in HD Treatment
    And   I enter password "renal2" in delete modal in HD Treatment
    And   I enter reason "QA delete administered medication" in delete modal in HD Treatment
    And   I click accept in delete modal in HD Treatment
    Then  I verify administered medication is removed in HD Treatment
