#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Link Access

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly


  @test @TestCase_3471 @ALM_VR_TC_304
  Scenario: Cancelling an added assoc access
    When  I click the three points menu in associated access
    And   I click link option in associated access menu
    And   I select first access in assign access modal
    And   I click cancel button in assign access modal
    Then  I verify associated access panel is displayed  

  @test @TestCase_3470 @ALM_VR_TC_305
  Scenario: Successful added assoc access
    When  I click the three points menu in associated access
    And   I click link option in associated access menu
    And   I select first access in assign access modal
    And   I click add button in assign access modal
    Then  I verify the action was performed successfully

