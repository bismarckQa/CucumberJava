#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Modify a change of extension

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly


  @test @TestCase_3808
  Scenario: Edit a Change of extension
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension "11/06/2025"
    When  I click button three points change of extension
    And   I click button cancel
    And    I click button arrow up

  @test @TestCase_3947
  Scenario: Canceling edited Change Extension
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension "09/21/2025"
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_3948
  Scenario: Save with required  fields, Date, empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension ""
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_4202
  Scenario: Save with Date outside the range
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension "10/21/1990"
    When  I click button three points change of extension
    And   I click button save
    And   I click button OK modal error
    And   I click button three points change of extension
    Then  I click button cancel
