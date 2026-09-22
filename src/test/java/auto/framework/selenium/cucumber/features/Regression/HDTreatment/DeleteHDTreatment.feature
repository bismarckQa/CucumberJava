#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Delete HD Treatment

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_4707 @ALM_VR_TC_788
  Scenario: Cancelling a finalized HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I enter password "renal2" in delete modal in HD Treatment
    And   I enter reason "Automated test - cancel delete" in delete modal in HD Treatment
    And   I click cancel in delete modal in HD Treatment
    Then  I check the module HD Treatment appear correctly

  @test @TestCase_4708 @ALM_VR_TC_789
  Scenario: Cancelling a deleted active HD Treatment
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I enter password "renal2" in delete modal in HD Treatment
    And   I enter reason "Automated test - cancel delete active" in delete modal in HD Treatment
    And   I click cancel in delete modal in HD Treatment
    Then  I check the module HD Treatment appear correctly

  @test @TestCase_3226 @ALM_VR_TC_790
  Scenario: Delete an active HD Treatment (without password and reason)
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I click accept in delete modal in HD Treatment
    Then  I verify alert window is displayed in HD Treatment
    And   I click button OK in HD Treatment alert
    And   I click cancel in delete modal in HD Treatment

  @test @TestCase_3227 @ALM_VR_TC_791
  Scenario: Delete an active HD Treatment (without password)
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I enter reason "Automated test - no password" in delete modal in HD Treatment
    And   I click accept in delete modal in HD Treatment
    Then  I verify alert window is displayed in HD Treatment
    And   I click button OK in HD Treatment alert
    And   I click cancel in delete modal in HD Treatment

  @test @TestCase_4709 @ALM_VR_TC_792
  Scenario: Delete an active HD Treatment (without reason)
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I enter password "renal2" in delete modal in HD Treatment
    And   I click accept in delete modal in HD Treatment
    Then  I verify alert window is displayed in HD Treatment
    And   I click button OK in HD Treatment alert
    And   I click cancel in delete modal in HD Treatment

  @test @TestCase_3224 @ALM_VR_TC_793
  Scenario: Delete a finalized HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I enter password "renal2" in delete modal in HD Treatment
    And   I enter reason "Automated test - delete finalized" in delete modal in HD Treatment
    And   I click accept in delete modal in HD Treatment

  @test @TestCase_3225 @ALM_VR_TC_794
  Scenario: Delete an active HD Treatment
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Delete" in HD Treatment
    And   I enter password "renal2" in delete modal in HD Treatment
    And   I enter reason "Automated test - delete active" in delete modal in HD Treatment
    And   I click accept in delete modal in HD Treatment
