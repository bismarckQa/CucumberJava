#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Allergies
Feature: Add Allergies

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly
    
  @test @TestCase_2729  @ALM_VR_TC_48
  Scenario: New Allergy Canceled
    When  I open the menu and add new allergy
    And   I select allergy type "Medicamento" in allergy form
    And   I select allergy "Abacavir" in allergy form
    When   I select severity "Grave" in allergy form
    And   I select reaction "Prueba Activo" in allergy form
    And   I enter identification date "07/24/2026" in allergy form
    Then  I select active state "Yes" in allergy form
    And   I enter observations "Qa test data" in allergy form
    Then  I cancel the creation of a new allergy

  @test @TestCase_2728 @ALM_VR_TC_414
  Scenario: Successful added Allergy
   When  I open the menu and add new allergy
    And   I select allergy type "Medicamento" in allergy form
    When   I select allergy "Abacavir" in allergy form
    And   I select severity "Grave" in allergy form
    And   I select reaction "Prueba Activo" in allergy form
    Then   I enter identification date "07/24/2026" in allergy form
    And   I select active state "Yes" in allergy form
    And   I enter observations "Qa test data" in allergy form
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    Then   I delete the allergy created

  @test @TestCase_2731  @ALM_VR_TC_415
  Scenario: Save new allergy with empty required fields
    When  I open the menu and add new allergy
    And   I select severity "Grave" in allergy form
    And   I select reaction "Prueba Activo" in allergy form
    And   I enter identification date "07/24/2026" in allergy form
    And   I select active state "Yes" in allergy form
    And   I enter observations "QA test Data" in allergy form
    Then  I cancel the creation of a new allergy

  @test @TestCase_2729 @ALM_VR_TC_416
  Scenario: Creating a new record with Active Filter the new data shall not disappear from screen
     When  I checked successful no known allergies
    Then  I verified successfully, no known allergies
    And   I unchecked no known allergies



