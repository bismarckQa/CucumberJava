#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Link Hospitalization

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3465 @ALM_VR_TC_300
  Scenario: Success added assoc hospitalization
    When  I click the three points menu in associated hospitalization
    And   I click link option in associated hospitalization menu
    And   I select first hospitalization in assign hospitalization modal
    And   I click add button in assign hospitalization modal
    Then  I verify the action was performed successfully

  @test @TestCase_3466 @ALM_VR_TC_301
  Scenario: Cancelling an added assoc hospitalization
    When  I click the three points menu in associated hospitalization
    And   I click link option in associated hospitalization menu
    And   I select first hospitalization in assign hospitalization modal
    And   I click cancel button in assign hospitalization modal
    Then  I verify associated hospitalization panel is displayed