#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create a New HD Access Follow-Up


 Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_4328 @ALM_VR_TC_348
  Scenario: New Follow Up
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "New follow-up"
    Then  I select evaluation in follow up
    And   I click button three points follow up
    And   I click button save

  @test @TestCase_4240 @ALM_VR_TC_349
  Scenario: Save new Follow up with required  fields empty
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "New follow-up"
    And   I insert data into input date: ""
    Then  I select evaluation in follow up
    And   I click button three points follow up
    And   I click button cancel

  @test @TestCase_4237 @ALM_VR_TC_350
  Scenario: Cancel a new Access Follow up
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "New follow-up"
    Then  I select evaluation in follow up
    And   I click button three points follow up
    And   I click button cancel



  @test @TestCase_4239 @ALM_VR_TC_351
  Scenario: Save a new Follow up with the Date outside of range
    And   I click button implantation section
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "New follow-up"
    And   I insert data into input date: "13/11/2000"
    Then  I select evaluation in follow up
    And   I click button three points follow up
    Then  I click button cancel
