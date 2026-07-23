#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PDAccess

Feature: Edit a follow-up of PD access

 Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paciente DP"
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_4260 @ALM_VR_TC_41
  Scenario: Cancel Follow-up edition
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    Then  I click button "Edit"
    And   I insert data into input date: "07/15/2026"
    And   I select follow up evaluation "Prueba Activo"
    When  I select follow up appearance "Exudado"
    And   I select follow up tunnel evaluation "Inflamado"
    When  I select follow up care "Hipertónico"
    And   I click button three points follow up
    And   I click button cancel
    Then  I click button arrow up


  
  @test @TestCase_4261 @ALM_VR_TC_368
  Scenario: Edit a Follow-up
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "Edit"
    When  I insert data into input date: "07/15/2026"
    And   I select follow up evaluation "Prueba Activo"
    And   I select follow up appearance "Exudado"
    Then   I select follow up tunnel evaluation "Inflamado"
    And   I select follow up care "Hipertónico"
    When   I click button three points follow up
    And   I click button save
    Then  I click button arrow up

  
  @test @TestCase_4330 @ALM_VR_TC_369
  Scenario: Save selecting the Date out of range
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    When  I click button "Edit"
    And   I insert data into input date: "11/13/2000"
    And   I select follow up evaluation "Granuloma"
    Then  I select follow up appearance "Limpio"
    And   I select follow up tunnel evaluation "Bueno"
    And   I select follow up care "Agua y jabón"
    When  I click button three points follow up
    And   I click button save
    And   I click button OK modal error
    When  I click button three points follow up
    And   I click button cancel
    Then  I click button arrow up


  
  @test @TestCase_4263 @ALM_VR_TC_370
  Scenario: Save with required field empty
    When  I select the Evaluation in main menu
    And   I click button three points follow up
    And   I click button "Edit"
    And   I insert data into input date: ""
    And   I select follow up evaluation "Granuloma"
    And   I select follow up appearance "Limpio"
    And   I select follow up tunnel evaluation "Bueno"
    And   I select follow up care "Agua y jabón"
    And   I click button three points follow up
    And   I click button cancel
    Then  I click button arrow up
