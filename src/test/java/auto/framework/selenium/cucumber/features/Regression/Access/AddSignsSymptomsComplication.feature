#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Add Signs or Symptoms to complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly


  @test @TestCase_3644 @ALM_VR_TC_20
  Scenario: Assign Signs or Symptoms
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "Assign signs/symptoms"
    Then  I select option in modal assign symptoms
    And   I click button "Add"

  @test @TestCase_3938 @ALM_VR_TC_328
  Scenario: Canceling a Signs or Symptoms assignation
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "Assign signs/symptoms"
    Then  I select option in modal assign symptoms
    And   I click button "Cancel"

  @test @TestCase_3939 @ALM_VR_TC_329
  Scenario: Add without (at least one) sign symptom selected
    Given I open the Baxter website
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "Assign signs/symptoms"
    And   I click button "Add"
    Then   I click button "Cancel"