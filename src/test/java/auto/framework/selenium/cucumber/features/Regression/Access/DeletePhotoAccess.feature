#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Delete Photo Access

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_4443 @ALM_VR_TC
  Scenario: Cancel image deletion
    When   I select the Evaluation in main menu
    Then  I verify Historic Photographs of Accesses
    And   I click button image evaluation
    And   I click button delete image
    Then  I select option action in modal "No"

  @test @TestCase_3799 @ALM_VR_TC
  Scenario: Delete photo / image
    When   I select the Evaluation in main menu
    Then  I verify Historic Photographs of Accesses
    And   I click button image evaluation
    And   I click button delete image
    Then  I select option action in modal "Yes"

