#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create complication for an Access

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3599 @ALM_VR_TC_26
  Scenario: Add New Complication
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "New complication"
    Then  I select Type of problem complication
    And   I click button three points complications
    And   I click button save

  @test @TestCase_3933 @ALM_VR_TC_338
  Scenario: Cancel Complication
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "New complication"
    Then  I select Type of problem complication
    And   I click button three points complications
    And   I click button cancel

  @test @TestCase_3934 @ALM_VR_TC_339
  Scenario: Save with (at least one) of required  fields empty
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "New complication"
    When  I insert data into identification date "11/19/2025"
    And   I click button three points complications
    Then   I click button cancel

