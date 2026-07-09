#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Modify Intervention

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3449 @ALM_VR_TC_290
  Scenario: Cancelling an edited intervention
    When  I click the three points menu in interventions
    And   I click edit intervention option in interventions menu
    And   I enter intervention date "06/25/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click the three points menu in interventions
    And   I click cancel option in interventions menu
    Then  I verify interventions panel is displayed

  @test @TestCase_3450 @ALM_VR_TC_291
  Scenario: Successful edited intervention
    When  I click the three points menu in interventions
    And   I click edit intervention option in interventions menu
    When  I enter intervention date "06/28/2026" in intervention form
    And   I select type of intervention "Prueba Hospital 1" in intervention form
    And   I select result "Resuelto" in intervention form
    When   I click the three points menu in interventions
    And   I click save option in interventions menu
    Then  I verify the action was performed successfully

  @test @TestCase_3451 @ALM_VR_TC_292
  Scenario: Edit intervention with empty required fields
    When  I click the three points menu in interventions
    And   I click edit intervention option in interventions menu
    And   I enter intervention date "" in intervention form
    And   I click the three points menu in interventions
    Then  I verify save option is not displayed in interventions menu
    And   I click cancel option in interventions menu

  @test @TestCase_3452 @ALM_VR_TC_293
  Scenario: Edit intervention with an earlier date than presentation
    When  I click the three points menu in interventions
    And   I click edit intervention option in interventions menu
    When  I enter intervention date "06/01/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    Then  I click the three points menu in interventions
    And   I click save option in interventions menu
    And   I click button OK modal error
    Then  I click the three points menu in interventions
    And I click cancel option in infections menu