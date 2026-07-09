#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Delete an Access Follow-up

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly


  @test @TestCase_3840 @ALM_VR_TC
  Scenario: New Follow Up
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "New follow-up"
    Then  I select evaluation in follow up
    And   I click button three points follow up
    And   I click button save


  @test @TestCase_3796 @ALM_VR_TC
  Scenario: Delete a Follow-up
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "Delete"
    Then   I click button "Yes" in action modal
