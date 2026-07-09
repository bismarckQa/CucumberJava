@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Delete Intervention

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3453 @ALM_VR_TC_294
  Scenario: Cancelling a delete intervention
    When  I click the three points menu in interventions
    And   I click delete intervention option in interventions menu
    And   I click button "No" in action modal
    Then  I verify interventions panel is displayed

  @test @TestCase_3454 @ALM_VR_TC_295
  Scenario: Successful delete intervention
    When  I click the three points menu in interventions
    And   I click delete intervention option in interventions menu
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully