#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Reopen HD Treatment option

  @test @TestCase_4762 @ALM_VR_TC_781
  Scenario: Reopened treatment with Nurse final signature
    Given I open the Baxter website
    And   I try to login with "login_baxter_bisnurse" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/25/2026" in HD Treatment
    And   I open "Final signature" section in HD Treatment
    When  I enter notes "Automated test - reopen treatment" in HD Treatment final signature
    And   I check finalized checkbox in HD Treatment final signature
    And   I click button arrow up in HD Treatment
    And   I click button three points HD Treatment
    And   I click button "Save" in HD Treatment
    Then  I verify finalized checkbox is "checked" in HD Treatment final signature
    And   I click button arrow up in HD Treatment
    When  I click button three points HD Treatment
    And   I click button "Reopen treatment" in HD Treatment
    Then  I verify finalized checkbox is "unchecked" in HD Treatment final signature
