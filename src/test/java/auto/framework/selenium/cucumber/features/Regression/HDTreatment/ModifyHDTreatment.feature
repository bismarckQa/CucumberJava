#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Modify HD Treatment

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly


  @test @TestCase_3221 @ALM_VR_TC
  Scenario: Modify active Hd Treatment
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Preparation" section in HD Treatment
    When  I select arterial needle size "AG 8" in HD Treatment access data
    And   I fill reason for value changed modal "test arterial" and click "OK" in HD Treatment
    When  I select venous needle size "Ag 4" in HD Treatment access data
    And   I fill reason for value changed modal "test venous" and click "OK" in HD Treatment
    Then  I select the first access in HD Treatment access data
    And   I fill reason for value changed modal "test access" and click "OK" in HD Treatment
    When  I select acid bath 1 "Ca=3" in HD Treatment fluids
    And   I fill reason for value changed modal "test acid 1" and click "OK" in HD Treatment
    When  I select acid bath 2 "Ca=2,25" in HD Treatment fluids
    And   I fill reason for value changed modal "test acid 2" and click "OK" in HD Treatment
    When  I open "Session" section in HD Treatment
    And   I open "Admin. drugs/other" section in HD Treatment
    Then  I open "Final signature" section in HD Treatment
