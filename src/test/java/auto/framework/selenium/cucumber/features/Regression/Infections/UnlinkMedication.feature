#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Unlink Medication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3459 @ALM_VR_TC_298
  Scenario: Cancelling a deleted Assoc Medication
    When  I click the three points menu in associated medication
    And   I click delete option in associated medication menu
    And   I click button "No" in action modal
    Then  I verify associated medication panel is displayed

  @test @TestCase_3464 @ALM_VR_TC_299
  Scenario: Succesfull delete Assoc Medication
    When  I click the three points menu in associated medication
    And   I click delete option in associated medication menu
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully