#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: View Extraction

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_17432 @ALM_VR_TC_776
  Scenario: View extraction in active treatment
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Extractions" section in HD Treatment
    And   I click extractions three points menu in HD Treatment
    And   I click show extraction in HD Treatment
    Then  I verify extraction is displayed in HD Treatment
    And   I verify edit extraction button is available in HD Treatment

  @test @TestCase_17434 @ALM_VR_TC_777
  Scenario: View extraction in finalized treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Extractions" section in HD Treatment
    Then  I verify extraction is displayed in HD Treatment
    And   I verify extraction is read only in HD Treatment
