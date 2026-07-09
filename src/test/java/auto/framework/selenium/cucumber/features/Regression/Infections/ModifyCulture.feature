#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Modify Culture

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3439 @ALM_VR_TC_280
  Scenario: Cancelling an edited culture
    When  I click the three points menu in cultures
    And   I click edit culture option in cultures menu
    And   I enter culture date "06/23/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa test culture edit cancelled" in culture form
    And   I click the three points menu in cultures
    And   I click cancel option in cultures menu
    Then  I verify cultures panel is displayed

  @test @TestCase_3440 @ALM_VR_TC_281
  Scenario: Successful edited culture
    When  I click the three points menu in cultures
    And   I click edit culture option in cultures menu
    And   I enter culture date "06/23/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa test culture edited successfully" in culture form
    And   I click the three points menu in cultures
    And   I click save option in cultures menu
    Then  I verify the action was performed successfully

  @test @TestCase_3441 @ALM_VR_TC_282
  Scenario: Edit culture with empty required fields
    When  I click the three points menu in cultures
    And   I click edit culture option in cultures menu
    And   I enter culture date "" in culture form
    And   I enter comments "Qa test culture edit required fields" in culture form
    And   I click the three points menu in cultures
    Then  I verify save option is not displayed in cultures menu
    And   I click cancel option in cultures menu