#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Clinical_Encounter

Feature: Delete Clinical Encounter
Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Reviews module
    Then  I check the module Reviews appear correctly

  @test  @Test_case_3385 @ALM_VR_TC_669
  Scenario: Cancelling a deleted clinical encounter
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    And   I cancelling delete the review created
    Then  I successfully delete the review created

  @test @Test_case_3386 @ALM_VR_TC_670
  Scenario: Successful deleted clinical encounter
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    Then  I successfully delete the review created