#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Delete intervention of a access complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3921 @ALM_VR_TC
  Scenario: Delete intervention of Intervention
    When  I select the Complications in main menu
    And   I click button three points interventions actions
    And   I click button "Delete"
    When   I click button "Yes" in action modal
    Then  I click button arrow up

  @test @TestCase_3922 @ALM_VR_TC
  Scenario: Cancel deletion of Intervention
    When  I select the Complications in main menu
    And   I click button three points interventions actions
    And   I click button "Delete"
    When   I click button "No" in action modal
    Then  I click button arrow up

