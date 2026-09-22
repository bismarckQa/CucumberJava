#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Modify HD reading

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment

  @test @TestCase_3267 @ALM_VR_TC_114
  Scenario: Edit reading registry (closed treatment)
    And   I select treatment history date "08/05/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    Then  I verify session inputs are disabled in HD Treatment

  @test @TestCase_3268 @ALM_VR_TC_749
  Scenario: Edit reading registry (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    And   I scroll to session readings in HD Treatment
    When  I click edit reading row in HD Treatment session
    And   I enter SBP "140" in HD Treatment session reading
    And   I enter DBP "90" in HD Treatment session reading
    And   I enter HR "80" in HD Treatment session reading
    And   I save the new observation
    Then  I verify reading row is saved in HD Treatment session

  @test @TestCase_3269 @ALM_VR_TC_750
  Scenario: Cancelling Edit reading registry (active treatment)
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment
    When  I click edit reading row in HD Treatment session
    And   I enter SBP "999" in HD Treatment session reading
    And   I enter DBP "999" in HD Treatment session reading
    And   I enter HR "999" in HD Treatment session reading
    And   I cancel the new observation
    Then  I verify reading row is saved in HD Treatment session
