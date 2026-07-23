#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Link hospitalization to an access complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    When  I select the Complications in main menu

  @test @TestCase_3899 @ALM_VR_TC_
  Scenario: Assign hospitalization to a Vascular Access Complication
    And   I click button three points hospitalizations
    And   I click button Link hospitalizations
    When  I select option hospitalizations in complications
    And   I click button "Add"

  @test @TestCase_3904 @ALM_VR_TC_
  Scenario: Add without hospitalization selected
    And   I click button three points hospitalizations
    And   I click button Link hospitalizations
    Then  I click button "Add"
    And   I click button "Cancel"

  @test @TestCase_3905 @ALM_VR_TC_
  Scenario: Cancel medication assignation
    And   I click button three points hospitalizations
    And   I click button Link hospitalizations
    When  I select option hospitalizations in complications
    And   I click button "Cancel"
