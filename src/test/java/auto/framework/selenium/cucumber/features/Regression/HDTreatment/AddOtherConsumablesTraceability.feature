#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add traceability Other consumables

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Preparation" section in HD Treatment

  @test @TestCase_4710 @ALM_VR_TC
  Scenario: Add Other consumables
    When  I click add other consumables in HD Treatment
    Then  I verify other consumables modal is displayed in HD Treatment
    When  I select other consumables name "Jeringa 3" in HD Treatment
    And   I enter other consumables lot number "DIAL-LOTE-2608" in HD Treatment
    And   I enter other consumables expiry date "12/31/2026" in HD Treatment
    Then  I click button "Save" in other consumables modal in HD Treatment

  @test @TestCase_4711 @ALM_VR_TC
  Scenario: Cancelling an added Other consumables
    When  I click add other consumables in HD Treatment
    Then  I verify other consumables modal is displayed in HD Treatment
    When  I select other consumables name "Jeringa 2" in HD Treatment
    And   I enter other consumables lot number "HEMO-LOTE-2608" in HD Treatment
    And   I enter other consumables expiry date "11/30/2026" in HD Treatment
    Then  I click button "Cancel" in other consumables modal in HD Treatment

  @test @TestCase_4712 @ALM_VR_TC
  Scenario: Add Other consumables with empty required fields
    When  I click add other consumables in HD Treatment
    Then  I verify other consumables modal is displayed in HD Treatment
    And   I click button "Cancel" in other consumables modal in HD Treatment
