#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Delete HD reading

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3270 @ALM_VR_TC_116
  Scenario: Delete reading register (closed treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    Then  I verify session inputs are disabled in HD Treatment

  @test @TestCase_3271 @ALM_VR_TC_751
  Scenario: Delete reading register (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    And   I scroll to session readings in HD Treatment
    When  I click delete reading row in HD Treatment session
    And   I enter password "login_baxter" in delete modal in HD Treatment
    And   I enter reason "QA delete reading" in delete modal in HD Treatment
    And   I click accept in delete modal in HD Treatment
    Then  I verify reading row is not saved in HD Treatment session

  @test @TestCase_3272 @ALM_VR_TC_752
  Scenario: Cancelling delete reading register (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    And   I scroll to session readings in HD Treatment
    When  I click delete reading row in HD Treatment session
    And   I enter password "login_baxter" in delete modal in HD Treatment
    And   I enter reason "QA cancel delete reading" in delete modal in HD Treatment
    And   I click cancel in delete modal in HD Treatment
    Then  I verify reading row is saved in HD Treatment session
