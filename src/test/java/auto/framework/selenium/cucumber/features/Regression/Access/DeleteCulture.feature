#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Delete Culture

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3790 @ALM_VR_TC
  Scenario: Delete a Swab
    When   I click button implantation section
    Then  I click button three points swab
    And   I click button "Delete"
    Then   I select option action in modal "Yes"

  @test @TestCase_3944 @ALM_VR_TC
  Scenario: Cancel Deletion
    When   I click button implantation section
    Then  I click button three points swab
    And   I click button "Delete"
    Then   I select option action in modal "No"

