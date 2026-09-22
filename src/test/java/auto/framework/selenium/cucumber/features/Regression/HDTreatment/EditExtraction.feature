#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Edit Extraction

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_17436 @ALM_VR_TC_778
  Scenario: Edit extraction successful
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Extractions" section in HD Treatment
    And   I click extractions three points menu in HD Treatment
    And   I click show extraction in HD Treatment
    Then  I verify extraction is displayed in HD Treatment
    When  I click edit extraction in HD Treatment
    And   I enter extraction date "08/25/2026" in HD Treatment
    And   I enter sample code "AUTO-001" in HD Treatment
    And   I enter observations "Automated test - edit extraction" in HD Treatment extraction
    And   I click save extraction in HD Treatment
    Then  I verify extraction is displayed in HD Treatment

  @test @TestCase_17437 @ALM_VR_TC_779
  Scenario: Cancel edit extraction
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Extractions" section in HD Treatment
    And   I click extractions three points menu in HD Treatment
    And   I click show extraction in HD Treatment
    Then  I verify extraction is displayed in HD Treatment
    When  I click edit extraction in HD Treatment
    And   I enter extraction date "09/01/2026" in HD Treatment
    And   I enter sample code "CANCEL-001" in HD Treatment
    And   I enter observations "This should not be saved" in HD Treatment extraction
    And   I click cancel extraction in HD Treatment
    Then  I verify extraction is displayed in HD Treatment

  @test @TestCase_17438 @ALM_VR_TC_780
  Scenario: Edit extraction in finalized treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Extractions" section in HD Treatment
    Then  I verify extraction is read only in HD Treatment
