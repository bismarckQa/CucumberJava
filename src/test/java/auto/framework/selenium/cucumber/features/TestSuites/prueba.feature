#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Add Infection

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3414
  Scenario: Successful added infection
    When  I click the three points menu in infections
    And   I click new infection option in infections menu
    And   I enter presentation date "06/17/2026" in infection form
    And   I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "07/20/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation infection created successfully" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully
