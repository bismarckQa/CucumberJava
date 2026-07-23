#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit an intervention of a access complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu

  @test @TestCase_3918 @ALM_VR_TC_44
  Scenario: Edit Modify intervention
    And   I click button three points interventions actions
    And   I click button "Edit"
    Then  I insert data into date interventions "11/27/1990"
    And   I click button three points interventions actions
    And   I click button cancel

  @test @TestCase_3919 @ALM_VR_TC_390
  Scenario: Canceling edited  intervention
    And   I click button three points interventions actions
    And   I click button "Edit"
    And   I click button three points interventions actions
    Then  I click button cancel

  @test @TestCase_3920 @ALM_VR_TC_390
  Scenario: Save with (at least one) required  fields empty
    And   I click button three points interventions actions
    And   I click button "Edit"
    And   I delete type of intervention selected
    And   I click button three points interventions actions
    Then  I click button cancel
