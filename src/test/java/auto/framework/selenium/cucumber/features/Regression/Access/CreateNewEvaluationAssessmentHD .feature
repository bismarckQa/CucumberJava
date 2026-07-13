#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create New evaluation/assessment (for HD Access)

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

  @test @TestCase_3958 @ALM_VR_TC
  Scenario: Save with required  field empty
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When   I insert data into input date: ""
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_3959 @ALM_VR_TC
  Scenario: Canceling a new Evaluation
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When   I click button three points evaluation
    Then  I click button cancel
    And   I click button arrow up

  @test @TestCase_4060 @ALM_VR_TC
  Scenario: Save with the date out of range
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When   I insert data into input date: "12/22/1990"
    When  I click button three points evaluation
    And   I click button save
    And   I click button OK modal error
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up

