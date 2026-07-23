#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PDAccess

Feature: Edit a change of extension (for PD access)

 Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3947 @ALM_VR_TC_364
  Scenario: Canceling edited Change Extension
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension "09/21/2025"
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up

  
  @test @TestCase_3808 @ALM_VR_TC_365
  Scenario: Edit a Change of extension
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension "11/06/2025"
    When  I click button three points change of extension
    And   I click button cancel
    And    I click button arrow up

  
  @test @TestCase_4202 @ALM_VR_TC_366
  Scenario: Save with Date outside the range
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

  
  @test @TestCase_3948 @ALM_VR_TC_367
  Scenario: Save with required  fields, Date, empty
    And   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click in edit extension
    And   I insert data into date change of extension ""
    When  I select option type of configuration for change extension
    And   I click button three points change of extension
    And   I click button cancel
    Then  I click button arrow up
