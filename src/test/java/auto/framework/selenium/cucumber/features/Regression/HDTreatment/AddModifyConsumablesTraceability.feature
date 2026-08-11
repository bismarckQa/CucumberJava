#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add Modify traceability Consumables

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

  @test @TestCase_4733 @ALM_VR_TC
  Scenario: Cancelling an added edited consumable
    When  I fill traceability consumable row "Arterial needle size" with lot number "ART-NEF-2608" and expiry date "12/31/2026" in HD Treatment
    And   I fill traceability consumable row "Venous needle" with lot number "VEN-NEF-2608" and expiry date "12/31/2026" in HD Treatment
    And   I fill traceability consumable row "Dialyzer" with lot number "DIAL-APS15-2608" and expiry date "01/31/2027" in HD Treatment
    And   I fill traceability consumable row "Acid bath 1" with lot number "ACID1-HD-2608" and expiry date "02/28/2027" in HD Treatment
    And   I fill traceability consumable row "Acid bath 2" with lot number "ACID2-HD-2608" and expiry date "03/31/2027" in HD Treatment
    And   I click button arrow up in HD Treatment
    Then  I click top action button "Cancel" in HD Treatment

  @test @TestCase_4734 @ALM_VR_TC
  Scenario: Successful added edited consumable
    When  I fill traceability consumable row "Arterial needle size" with lot number "ART-SAVE-2608" and expiry date "12/31/2026" in HD Treatment
    And   I fill traceability consumable row "Venous needle" with lot number "VEN-SAVE-2608" and expiry date "12/31/2026" in HD Treatment
    And   I fill traceability consumable row "Dialyzer" with lot number "DIAL-SAVE-2608" and expiry date "01/31/2027" in HD Treatment
    And   I fill traceability consumable row "Acid bath 1" with lot number "ACID1-SAVE-2608" and expiry date "02/28/2027" in HD Treatment
    And   I fill traceability consumable row "Acid bath 2" with lot number "ACID2-SAVE-2608" and expiry date "03/31/2027" in HD Treatment
    And   I click button arrow up in HD Treatment
    Then  I click top action button "Save" in HD Treatment
