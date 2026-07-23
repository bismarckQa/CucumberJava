#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Unlink hospitalization from an Access complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu

  @test @TestCase_3907 @ALM_VR_TC_
  Scenario: Delete an hospitalization assignation
    And   I click button three points hospitalizations
    And   I click button delete hospitalization
    Then  I click button "Yes" in action modal


  @test @TestCase_3908 @ALM_VR_TC_
  Scenario: Cancel deletion
    And   I click button three points hospitalizations
    And   I click button delete hospitalization
    Then  I click button "No" in action modal
