#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Update Prescription option

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I click button arrow up in HD Treatment
    And   I click top action button "Update prescription" in HD Treatment
    Then  I verify Action modal is displayed in HD Treatment

  @test @TestCase_4748 @ALM_VR_TC
  Scenario: Successful updated prescription
    When  I click button "Yes" in Action modal in HD Treatment

  @test @TestCase_4749 @ALM_VR_TC
  Scenario: Cancelling an updated prescription
    When  I click button "No" in Action modal in HD Treatment
