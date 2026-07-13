#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Link hospitalization to an access complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3899 @ALM_VR_TC
  Scenario: Assign hospitalization to a Vascular Access Complication
    When  I select the Complications in main menu
    And   I click button three points hospitalizations
    And   I click button Link hospitalizations
    When  I select option hospitalizations in complications
    And   I click button "Add"

  @test @TestCase_3904 @ALM_VR_TC
  Scenario: Add without hospitalization selected
    When  I select the Complications in main menu
    And   I click button three points hospitalizations
    And   I click button Link hospitalizations
    Then  I click button "Add"
    And   I click button "Cancel"

  @test @TestCase_3905 @ALM_VR_TC
  Scenario: Cancel medication assignation
    When  I select the Complications in main menu
    And   I click button three points hospitalizations
    And   I click button Link hospitalizations
    When  I select option hospitalizations in complications
    And   I click button "Cancel"

