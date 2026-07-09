#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Link medication to an access complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly



  @test @TestCase_3909 @ALM_VR_TC
  Scenario: Assign medication
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points medications
    And   I click button "Link"
    And  I select medication to assign in complication
    Then   I click button "Add"


  @test @TestCase_3910 @ALM_VR_TC
  Scenario: Cancel medication assignation
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points medications
    And   I click button "Link"
    Then  I select medication to assign in complication
    And   I click button "Cancel"

  @test @TestCase_3911 @ALM_VR_TC
  Scenario: Add without selected medication
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points medications
    And   I click button "Link"
    And   I click button "Add"
    Then   I click button "Cancel"
