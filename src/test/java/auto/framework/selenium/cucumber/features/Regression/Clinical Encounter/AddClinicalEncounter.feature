#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Clinical_Encounter


Feature: Add clinical encounter

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Reviews module
    Then  I check the module Reviews appear correctly


  @test @Test_case_3379 @ALM_VR_TC_666
  Scenario: Successful added clinical encounter (Physician profile)
    And   I create successful new review "Qa test case"
    And   I verify that the new review was created
    Then  I successfully delete the review created


  @test @Test_case_3380 @ALM_VR_TC_667
  Scenario: Canceling added clinical encounter (Physician profile)
    And   I cancel creating a new review "Qa test case"

  @test @Test_case_3381 @ALM_VR_TC_668
  Scenario: Add new clinical encounter with empty required fields
    And   I try to create new review with empty required fields "Qa test case"


