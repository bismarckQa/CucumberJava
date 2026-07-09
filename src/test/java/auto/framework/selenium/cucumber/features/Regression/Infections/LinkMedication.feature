#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Link Medication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3456 @ALM_VR_TC_296
  Scenario: Successful added assoc medication
    When  I click the three points menu in associated medication
    And   I click link option in associated medication menu
    And   I select first medication in assign medication modal
    And   I click add button in assign medication modal
    Then  I verify the action was performed successfully

  @test @TestCase_3457 @ALM_VR_TC_297
  Scenario: Cancelling an added assoc medication
    When  I click the three points menu in associated medication
    And   I click link option in associated medication menu
    And   I select first medication in assign medication modal
    And   I click cancel button in assign medication modal
    Then  I verify associated medication panel is displayed