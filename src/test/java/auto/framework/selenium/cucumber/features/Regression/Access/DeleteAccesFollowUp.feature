#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Delete an Access Follow-up

 Background:
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        Then  I check the module Accesses appear correctly

  @test @TestCase_3951 @ALM_VR_TC_33
  Scenario: Cancel a follow up deletion
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "Delete"
    Then   I click button "No" in action modal


  @test @TestCase_3796 @ALM_VR_TC_357
  Scenario: Delete a Follow-up
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "Delete"
    Then   I click button "Yes" in action modal
