#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Modify Infection

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3418 @ALM_VR_TC_272
  Scenario: Cancelling an edited infection
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    Then  I verify new infection form is displayed
    And   I enter presentation date "06/17/2026" in infection form
    And   I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "07/18/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation infection edit cancelled" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click cancel option in infections menu
    Then  I verify new infection form is closed

  @test @TestCase_3419 @ALM_VR_TC_273
  Scenario: Successful edited infection
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    Then  I verify new infection form is displayed
    And   I enter presentation date "06/22/2026" in infection form
    And   I select infection type "Infección orina" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "07/19/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation infection edited successfully" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully

  @test @TestCase_3420 @ALM_VR_TC_274
  Scenario: Edit infection with empty required fields
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    Then  I verify new infection form is displayed
    And   I enter presentation date "" in infection form
    And   I enter observations "Automation infection edit required fields" in infection form
    And   I click button arrow up
    And   I click the three points menu in infections
    Then  I verify save option is not displayed in infections menu
    And   I click cancel option in infections menu
    Then  I verify new infection form is closed

    @test @TestCase_3421 @ALM_VR_TC_275
  Scenario: Modify infection with a prior resolution date than presentation date
    When  I click the three points menu in infections
    And   I click edit option in infections menu
    Then  I verify new infection form is displayed
    And   I enter presentation date "06/17/2026" in infection form
    When  I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "06/16/2026" in infection form
    When  I select evaluation "HD" in infection form
    And   I enter observations "Automation infection edit wrong date" in infection form
    And   I click button arrow up
    When  I click the three points menu in infections
    And   I click save option in infections menu
    Then  I click button OK modal error
    And   I click the three points menu in infections
    Then  I click cancel option in infections menu