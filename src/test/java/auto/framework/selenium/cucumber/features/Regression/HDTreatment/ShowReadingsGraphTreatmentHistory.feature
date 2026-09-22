#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Show readings graph in Treatment History option

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click button three points HD Treatment
    And   I click Treatment history option in HD Treatment
    Then  I verify treatment history popup is displayed in HD Treatment

  @test @TestCase_3296 @ALM_VR_TC_784
  Scenario: Check treatment history graph fields
    Then  I verify treatment history filters are displayed in HD Treatment
    And   I verify treatment history grid is displayed in HD Treatment
    When  I click graph button in treatment history in HD Treatment
    Then  I verify treatment history graph view is displayed in HD Treatment
    When  I click columns button in treatment history in HD Treatment
    Then  I verify columns configuration is displayed in HD Treatment
    And   I click close button in treatment history in HD Treatment

  @test @TestCase_3297 @ALM_VR_TC_785
  Scenario: Show none grouped graph
    When  I click graph button in treatment history in HD Treatment
    And   I click select all variables in treatment history in HD Treatment
    Then  I verify treatment history graph view is displayed in HD Treatment
    And   I click close button in treatment history in HD Treatment

  @test @TestCase_3298 @ALM_VR_TC_786
  Scenario: Show grouped charts
    When  I click graph button in treatment history in HD Treatment
    And   I click select all variables in treatment history in HD Treatment
    And   I click group charts checkbox in treatment history in HD Treatment
    Then  I verify treatment history graph view is displayed in HD Treatment
    And   I click close button in treatment history in HD Treatment

  @test @TestCase_4764 @ALM_VR_TC_787
  Scenario: Show Treatment history columns
    When  I click columns button in treatment history in HD Treatment
    Then  I verify columns configuration is displayed in HD Treatment
    And   I click back button in treatment history columns in HD Treatment
    Then  I verify treatment history grid is displayed in HD Treatment
    And   I click close button in treatment history in HD Treatment
