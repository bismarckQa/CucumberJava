#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Assign Symptoms

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3476 @ALM_VR_TC_309
  Scenario: Cancelling an assigned signs symptoms
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    And   I click the three points menu in infections
    And   I click assign signs symptoms option in infections menu
    And   I select signs symptoms "Fiebre" in assign signs symptoms modal
    And   I click cancel button in assign signs symptoms modal
    And   I click the three points menu in infections
    And   I click cancel option in infections menu
    Then  I check the module Infections appear correctly

  @test @TestCase_3427 @ALM_VR_TC_308
  Scenario: Assign signs symptoms
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    And   I click the three points menu in infections
    And   I click assign signs symptoms option in infections menu
    And   I select signs symptoms "Fiebre" in assign signs symptoms modal
    And   I click add button in assign signs symptoms modal
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully