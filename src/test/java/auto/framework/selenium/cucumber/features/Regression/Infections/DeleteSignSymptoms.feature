#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Delete Sign Symptoms

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3430 @ALM_VR_TC_310
  Scenario: Delete sign symptoms
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    And   I delete signs symptoms "Fiebre" in infection form
    When  I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully