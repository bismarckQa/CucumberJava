#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add perfusion/Blood product (Administration Drugs/Other)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3279 @ALM_VR_TC_758
  Scenario: Add perfusion Blood product (finalized treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I verify perfusion block is read only in HD Treatment

  @test @TestCase_3280 @ALM_VR_TC_759
  Scenario: Add perfusion blood product (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    When  I drag prescribed perfusion to administered in HD Treatment
    Then  I verify perfusion modal is displayed in HD Treatment
    And   I enter quantity "5" in perfusion modal in HD Treatment
    And   I enter expiry date "09/01/2026" in perfusion modal in HD Treatment
    And   I enter comments "Automated test - add perfusion" in perfusion modal in HD Treatment
    And   I click add button in perfusion modal in HD Treatment
    Then  I verify administered perfusion is displayed in HD Treatment

  @test @TestCase_3282 @ALM_VR_TC_760
  Scenario: Add new perfusion Blood product (no quantity)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    When  I drag prescribed perfusion to administered in HD Treatment
    Then  I verify perfusion modal is displayed in HD Treatment
    And   I verify add button is disabled in perfusion modal in HD Treatment

  @test @TestCase_3283 @ALM_VR_TC_761
  Scenario: Cancelling add new Perfusion Blood product (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    When  I drag prescribed perfusion to administered in HD Treatment
    Then  I verify perfusion modal is displayed in HD Treatment
    And   I enter quantity "5" in perfusion modal in HD Treatment
    And   I enter expiry date "09/01/2026" in perfusion modal in HD Treatment
    And   I enter comments "Automated test - cancel perfusion" in perfusion modal in HD Treatment
    And   I click cancel button in perfusion modal in HD Treatment
    Then  I verify administered perfusion is not displayed in HD Treatment
