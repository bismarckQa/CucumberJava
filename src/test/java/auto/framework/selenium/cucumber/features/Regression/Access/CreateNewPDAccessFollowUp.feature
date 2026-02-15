#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create a New PD Access Follow-Up

  @test @TestCase_3840
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

  @test @TestCase_4144
  Scenario: Save new Follow up with required  fields empty
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
    And   I insert data into input date: ""
    Then  I select evaluation in follow up
    And   I click button three points follow up
    And   I click button cancel

  @test @TestCase_4145
  Scenario: Cancel a new Access Follow up
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
    And   I click button cancel



  @test @TestCase_4158
  Scenario: Save a new Follow up with the Date outside of range
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
    And   I insert data into input date: "13/11/2000"
    Then  I select evaluation in follow up
    And   I click button three points follow up
    Then  I click button cancel
