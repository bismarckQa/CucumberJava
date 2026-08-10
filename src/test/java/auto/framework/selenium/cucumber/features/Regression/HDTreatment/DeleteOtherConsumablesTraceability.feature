#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Delete traceability Other consumables

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

  @test @TestCase_4718 @ALM_VR_TC
  Scenario: Successful deleted Other consumables
    When  I click delete other consumables "Jeringa 3" in HD Treatment
    Then  I verify other consumables row "Jeringa 3" is not displayed in HD Treatment
