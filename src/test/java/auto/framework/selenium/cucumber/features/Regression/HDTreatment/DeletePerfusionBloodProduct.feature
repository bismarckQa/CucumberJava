#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Delete perfusion/Blood product (Administration Drugs/Other)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3285 @ALM_VR_TC_762
  Scenario: Delete Perfusion Blood product (finalized treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I verify perfusion block is read only in HD Treatment

  @test @TestCase_3284 @ALM_VR_TC_763
  Scenario: Delete Perfusion Blood Product (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    When  I drag prescribed perfusion to administered in HD Treatment
    Then  I verify perfusion modal is displayed in HD Treatment
    And   I enter quantity "5" in perfusion modal in HD Treatment
    And   I click add button in perfusion modal in HD Treatment
    Then  I verify administered perfusion is displayed in HD Treatment
    When  I drag administered perfusion to bin in HD Treatment
    Then  I verify administered perfusion is not displayed in HD Treatment
