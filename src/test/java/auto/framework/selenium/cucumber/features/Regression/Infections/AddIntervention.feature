#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Add Intervention

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3444 @ALM_VR_TC_286
  Scenario: Successful added intervention
    When  I click the three points menu in interventions
    And   I click new intervention option in interventions menu
    And   I enter intervention date "06/25/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click the three points menu in interventions
    And   I click save option in interventions menu
    Then  I verify the action was performed successfully

  @test @TestCase_3445 @ALM_VR_TC_287
  Scenario: Cancelling an added intervention
    When  I click the three points menu in interventions
    And   I click new intervention option in interventions menu
    And   I enter intervention date "06/25/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click the three points menu in interventions
    And   I click cancel option in interventions menu
    Then  I verify interventions panel is displayed

  @test @TestCase_3446 @ALM_VR_TC_288
  Scenario: Add new intervention with empty required fields
    When  I click the three points menu in interventions
    And   I click new intervention option in interventions menu
    And   I click the three points menu in interventions
    Then  I verify save option is not displayed in interventions menu
    And   I click cancel option in interventions menu

  @test @TestCase_3447  @ALM_VR_TC_288
  Scenario: Add new intervention with an earlier date than presentation
    When  I click the three points menu in interventions
    And   I click new intervention option in interventions menu
    When  I enter intervention date "06/01/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    When  I select result "Prueba Activo" in intervention form
    And   I click the three points menu in interventions
    And   I click save option in interventions menu
    Then  I click button OK modal error 
    And   I click the three points menu in interventions
    Then  I click cancel option in interventions menu