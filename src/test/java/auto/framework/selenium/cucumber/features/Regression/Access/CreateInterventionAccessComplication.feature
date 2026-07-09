#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create intervention to an access Complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly


Run_Peponcita1206_Today!!
  @test @TestCase_3915 @ALM_VR_TC_27
  Scenario: Create intervention
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points interventions
    And   I click button "New intervention"
    And   I select type of intervention
    Then  I select result of interventions
    And   I click button three points interventions actions
    And   I click button save
    Then  I click button arrow up



  @test @TestCase_3916 @ALM_VR_TC_342
  Scenario: Canceling  intervention
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points interventions
    And   I click button "New intervention"
    And   I select type of intervention
    Then  I select result of interventions
    And   I click button three points interventions actions
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_3917 @ALM_VR_TC_343
  Scenario: Save with required  fields empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points interventions
    And   I click button "New intervention"
    Then  I select result of interventions
    And   I click button three points interventions actions
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_3979 @ALM_VR_TC_344
  Scenario: Save with wrong date
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu
    And   I click button three points interventions
    And   I click button "New intervention"
    When  I insert data into date interventions "11/27/1990"
    And   I select type of intervention
    Then  I select result of interventions
    And   I click button three points interventions actions
    And   I click button save
    Then  I click button OK modal error
    And   I click button three points interventions actions
    And   I click button cancel
