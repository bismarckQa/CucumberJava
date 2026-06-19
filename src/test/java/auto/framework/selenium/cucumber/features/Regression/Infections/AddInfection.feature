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
    And   I enter resolution date "07/17/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation infection created successfully" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully

  @test @TestCase_3415
  Scenario: Cancelling an added infection
    When  I click the three points menu in infections
    And   I click new infection option in infections menu
    And   I enter presentation date "06/17/2026" in infection form
    And   I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "07/17/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation infection cancelled" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click cancel option in infections menu
    Then  I verify new infection form is closed

  @test @TestCase_3416
  Scenario: An added infection with a prior resolution date than presentation date
    When  I click the three points menu in infections
    And   I click new infection option in infections menu
    Then  I enter presentation date "06/17/2026" in infection form
    And   I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    When  I enter resolution date "06/2/2026" in infection form
    And   I select evaluation "HD" in infection form
    When  I enter observations "Automation infection wrong date" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    When  I click button OK modal error
    Then  I verify infection date validation is displayed
    And   I click the three points menu in infections
    And   I click cancel option in infections menu

  @test @TestCase_3417
  Scenario: Add new infection with empty required fields
    When  I click the three points menu in infections
    And   I click new infection option in infections menu
    Then  I verify new infection form is displayed
    And   I enter observations "Qa Test Observation" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    Then  I verify save option is not displayed in infections menu
    And   I click cancel option in infections menu
    Then  I verify new infection form is closed