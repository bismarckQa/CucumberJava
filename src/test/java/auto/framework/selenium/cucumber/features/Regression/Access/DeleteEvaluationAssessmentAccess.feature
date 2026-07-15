#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess 

Feature: Delete an evaluation / assessment of a  vascular access (for HD Patient)

 Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente HD"
    When  I select the patient "Ape1_1841 Ape2_1841, Nom_1841 - 6"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3957 @ALM_VR_TC
  Scenario: New Evaluation
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When  I click button three points evaluation
    And   I click button save
    Then  I click button arrow up

  @test @TestCase_3988 @ALM_VR_TC_359
  Scenario: Cancel deletion
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "Delete"
    When  I click button "No" in action modal
    Then  I click button arrow up

  @test @TestCase_3989 @ALM_VR_TC_360
  Scenario: Delete an evaluation/assessment
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "Delete"
    When  I click button "Yes" in action modal
    Then  I click button arrow up
