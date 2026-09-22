#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Show Treatment History report

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

  @test @TestCase_3299 @ALM_VR_TC_782
  Scenario: Show Treatment History report (Default values)
    Then  I verify treatment history filters are displayed in HD Treatment
    And   I verify treatment history grid is displayed in HD Treatment
    When  I click export button in treatment history in HD Treatment
    And   I click close button in treatment history in HD Treatment

  @test @TestCase_3300 @ALM_VR_TC_783
  Scenario: Show Treatment History report (Date filters)
    When  I select last filter in treatment history in HD Treatment
    And   I select "Weeks" in last filter combo in treatment history in HD Treatment
    And   I check see treatments in columns in treatment history in HD Treatment
    And   I check see minimum maximum in treatment history in HD Treatment
    And   I click export button in treatment history in HD Treatment
    And   I click close button in treatment history in HD Treatment
