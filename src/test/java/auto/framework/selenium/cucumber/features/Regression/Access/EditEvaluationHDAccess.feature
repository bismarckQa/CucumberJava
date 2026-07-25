#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit evaluation/assessment (for HD Access)

  @test @TestCase_3961
  Scenario: Cancel Evaluation edition
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente HD"
    When  I select the patient "ERCA ERCA, CKD - 123456789"
    And   I open Accesses module
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "Edit"
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up


  @test @TestCase_3962
  Scenario: Save with required (date) field empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente HD"
    When  I select the patient "ERCA ERCA, CKD - 123456789"
    And   I open Accesses module
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "Edit"
    And   I insert data into input date: ""
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up
