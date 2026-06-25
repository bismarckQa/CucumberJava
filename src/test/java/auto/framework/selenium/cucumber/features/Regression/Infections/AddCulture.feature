#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Add Culture

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3434
  Scenario: Successful added culture
    When  I click the three points menu in cultures
    And   I click new culture option in cultures menu
    And   I enter culture date "06/23/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa test" in culture form
    And   I click the three points menu in cultures
    And   I click save option in cultures menu
    Then  I verify the action was performed successfully

  @test @TestCase_3435
  Scenario: Cancelling an added culture
    When  I click the three points menu in cultures
    And   I click new culture option in cultures menu
    And   I enter culture date "06/23/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa test" in culture form
    And   I click the three points menu in cultures
    And   I click cancel option in cultures menu
    Then  I verify cultures panel is displayed

  @test @TestCase_3436
  Scenario: Add new culture with empty required fields
    When  I click the three points menu in cultures
    And   I click new culture option in cultures menu
    And   I click the three points menu in cultures
    Then  I verify save option is not displayed in cultures menu
    And   I click cancel option in cultures menu