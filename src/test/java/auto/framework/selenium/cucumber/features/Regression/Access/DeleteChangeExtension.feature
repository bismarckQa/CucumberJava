#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PDAccess

Feature: Delete a change of extension

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3950 @ALM_VR_TC_30
  Scenario: Delete a change extension
    When   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click button delete
    When   I check the alert box appear and click yes

  @test @TestCase_3949 @ALM_VR_TC_355
  Scenario: Cancel deletion
    When   I click button implantation section
    And   I verify section change of extension is displayed
    Then  I click button three points change of extension
    And   I click button delete
    When   I check the alert box appear and click No
