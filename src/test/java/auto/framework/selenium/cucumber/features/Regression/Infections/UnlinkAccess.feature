#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Unlink Access

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3472 @ALM_VR_TC_306
  Scenario: Cancelling a delete Assoc Access
    When  I click the three points menu in associated access
    And   I click delete option in associated access menu
    And   I click button "No" in action modal
    Then  I verify associated access panel is displayed

  @test @TestCase_3474 @ALM_VR_TC_307
  Scenario: Successful delete assoc access
    When  I click the three points menu in associated access
    And   I click delete option in associated access menu
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully