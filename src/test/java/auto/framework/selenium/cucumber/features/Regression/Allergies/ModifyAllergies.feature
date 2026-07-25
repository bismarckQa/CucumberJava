#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Allergies

Feature: Modify Allergies

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly



  @test @TestCase_2735 @ALM_VR_TC_50
  Scenario: Edit Allergy with blank required fields
   When  I click edit allergy button
    And   I select allergy type "Otras" in allergy form
    Then  I cancel allergy edition


  @test @TestCase_2733 @ALM_VR_TC_418
  Scenario: Edit Allergy Canceled
    When  I click edit allergy button
    And   I select allergy type "Medicamento" in allergy form
    And   I select allergy "Abacavir" in allergy form
    When  I select severity "Grave" in allergy form
    And   I select reaction "Prueba Activo" in allergy form
    And   I enter identification date "07/24/2026" in allergy form
    When  I select active state "Yes" in allergy form
    And   I enter observations "New Data Qa test" in allergy form
    Then  I cancel allergy edition


  @test @TestCase_2734  @ALM_VR_TC_419
  Scenario: Successful edited allergy
    When  I click edit allergy button
    And   I select allergy type "Medicamento" in allergy form
    And   I select allergy "Abacavir" in allergy form
    When   I select severity "Grave" in allergy form
    And   I select reaction "Prueba Activo" in allergy form
    And   I enter identification date "07/24/2026" in allergy form
    When   I select active state "Yes" in allergy form
    And   I enter observations "New Data Qa test" in allergy form
    Then  I save allergy edition