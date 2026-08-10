#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Modify traceability Other consumables

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
    Then  I verify other consumables row "Jeringa 3" is displayed in HD Treatment

  @test @TestCase_4714 @ALM_VR_TC
  Scenario: Cancelling an edited Other consumables
    When  I click edit other consumables "Jeringa 3" in HD Treatment
    Then  I verify other consumables modal is displayed in HD Treatment
    When  I select other consumables name "Jeringa 2" in HD Treatment
    And   I enter other consumables lot number "HEMO-EDIT-2608" in HD Treatment
    And   I enter other consumables expiry date "10/31/2026" in HD Treatment
    Then  I click button "Cancel" in other consumables modal in HD Treatment

  @test @TestCase_4715 @ALM_VR_TC
  Scenario: Successful edited Other consumables
    When  I click edit other consumables "Jeringa 3" in HD Treatment
    Then  I verify other consumables modal is displayed in HD Treatment
    When  I select other consumables name "Jeringa 4" in HD Treatment
    And   I enter other consumables lot number "NEFRO-EDIT-2608" in HD Treatment
    And   I enter other consumables expiry date "09/30/2026" in HD Treatment
    Then  I click button "Save" in other consumables modal in HD Treatment

  @test @TestCase_4716 @ALM_VR_TC
  Scenario: Edit Other consumables with empty required fields
    When  I click edit other consumables "Jeringa 3" in HD Treatment
    Then  I verify other consumables modal is displayed in HD Treatment
    And   I click button "Cancel" in other consumables modal in HD Treatment
