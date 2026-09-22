#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add new HD reading

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3228 @ALM_VR_TC_113
  Scenario: Add new reading register to a closed HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    Then  I verify new reading button is not available in HD Treatment session

  @test @TestCase_3229 @ALM_VR_TC_745
  Scenario: Add new reading register to an active HD Treatment (empty registry)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    When  I add new observation
    And   I save the new observation
    Then  I verify reading row is saved in HD Treatment session

  @test @TestCase_3023 @ALM_VR_TC_746
  Scenario: Add new reading register to an active HD Treatment (full registry)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    When  I add new observation
    And   I enter SBP "120" in HD Treatment session reading
    And   I enter DBP "80" in HD Treatment session reading
    And   I enter HR "72" in HD Treatment session reading
    And   I enter blood flow rate "300" in HD Treatment session reading
    And   I enter arterial pressure "-150" in HD Treatment session reading
    And   I enter venous pressure "180" in HD Treatment session reading
    And   I enter TMP "50" in HD Treatment session reading
    And   I enter cond plasma "14.0" in HD Treatment session reading
    And   I save the new observation
    Then  I verify reading row is saved in HD Treatment session

  @test @TestCase_3265 @ALM_VR_TC_747
  Scenario: Cancelling an added reading register to an active treatment (empty registry)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    When  I add new observation
    And   I cancel the new observation
    Then  I verify reading row is not saved in HD Treatment session

  @test @TestCase_3266 @ALM_VR_TC_748
  Scenario: Cancelling an added reading register to an active treatment (full registry)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    When  I add new observation
    And   I enter SBP "120" in HD Treatment session reading
    And   I enter DBP "80" in HD Treatment session reading
    And   I enter HR "72" in HD Treatment session reading
    And   I enter blood flow rate "300" in HD Treatment session reading
    And   I enter arterial pressure "-150" in HD Treatment session reading
    And   I enter venous pressure "180" in HD Treatment session reading
    And   I enter TMP "50" in HD Treatment session reading
    And   I enter cond plasma "14.0" in HD Treatment session reading
    And   I cancel the new observation
    Then  I verify reading row is not saved in HD Treatment session
