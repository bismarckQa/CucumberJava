#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: View Type in Session Readings (Session graph)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment

  @test @TestCase_4818 @ALM_VR_TC_775
  Scenario: View graph
    When  I click show graph toggle in HD Treatment session
    Then  I verify graph view is displayed in HD Treatment session
