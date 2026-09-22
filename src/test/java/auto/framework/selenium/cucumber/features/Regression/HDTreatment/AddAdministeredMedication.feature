#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add administered medication (Administration Drugs/Other)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3273 @ALM_VR_TC_111
  Scenario: View administered medication window info (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I verify prescribed medication block is displayed in HD Treatment
    And   I verify administered medication block is displayed in HD Treatment

  @test @TestCase_3274 @ALM_VR_TC_753
  Scenario: Add administered medication (finalized treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I verify session inputs are disabled in HD Treatment

  @test @TestCase_3276 @ALM_VR_TC_754
  Scenario: Cancelling add administered medication (open treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    When  I drag prescribed medication to administered in HD Treatment
    Then  I verify administer medication modal is displayed in HD Treatment
    And   I click cancel button in administer medication modal in HD Treatment

  @test @TestCase_3275 @ALM_VR_TC_755
  Scenario: Add administered medication (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    When  I drag prescribed medication to administered in HD Treatment
    Then  I verify administer medication modal is displayed in HD Treatment
    And   I click add button in administer medication modal in HD Treatment
