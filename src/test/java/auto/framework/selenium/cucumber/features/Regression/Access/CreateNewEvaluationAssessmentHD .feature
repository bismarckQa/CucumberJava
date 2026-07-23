#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create New evaluation/assessment (for HD Access)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3957 @ALM_VR_TC_22
  Scenario: New Evaluation
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When  I complete the evaluation form
    And   I enter evaluation date "07/17/2026"
    And   I enter evaluation average VP "180"
    And   I enter evaluation average BP "-220"
    And   I enter evaluation SBP "130"
    And   I enter evaluation DBP "80"
    And   I enter evaluation arterial urea "58.2"
    And   I enter evaluation venous urea "32.4"
    And   I enter evaluation peripheral urea "61.8"
    And   I enter evaluation RT Mohan "72.5"
    And   I enter evaluation access flow "950"
    And   I enter evaluation recirculation "12.5"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Dynamic HD evaluation created from automation"
    When  I click button three points evaluation
    And   I click button save
    Then  I click button arrow up

  @test @TestCase_3958 @ALM_VR_TC_352
  Scenario: Save with required  field empty
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When  I leave the evaluation date empty
    And   I enter evaluation date ""
    And   I enter evaluation average VP "180"
    And   I enter evaluation average BP "-220"
    And   I enter evaluation SBP "130"
    And   I enter evaluation DBP "80"
    And   I enter evaluation arterial urea "58.2"
    And   I enter evaluation venous urea "32.4"
    And   I enter evaluation peripheral urea "61.8"
    And   I enter evaluation RT Mohan "72.5"
    And   I enter evaluation access flow "950"
    And   I enter evaluation recirculation "12.5"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Validation without date"
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up

  @test @TestCase_3959 @ALM_VR_TC_353
  Scenario: Canceling a new Evaluation
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When  I complete the evaluation form
    And   I enter evaluation date "07/17/2026"
    And   I enter evaluation average VP "175"
    And   I enter evaluation average BP "-210"
    And   I enter evaluation SBP "128"
    And   I enter evaluation DBP "78"
    And   I enter evaluation arterial urea "57.1"
    And   I enter evaluation venous urea "31.6"
    And   I enter evaluation peripheral urea "60.9"
    And   I enter evaluation RT Mohan "70.4"
    And   I enter evaluation access flow "920"
    And   I enter evaluation recirculation "10.8"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Cancellation of HD evaluation"
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up
  @test @TestCase_4060 @ALM_VR_TC_354
  Scenario: Save with the date out of range
    When  I select the Evaluation in main menu
    And   I click button three points evaluation
    And   I click button "New evaluation"
    When  I enter an out of range evaluation date
    And   I enter evaluation date "12/22/1990"
    And   I enter evaluation average VP "180"
    And   I enter evaluation average BP "-220"
    And   I enter evaluation SBP "130"
    And   I enter evaluation DBP "80"
    And   I enter evaluation arterial urea "58.2"
    And   I enter evaluation venous urea "32.4"
    And   I enter evaluation peripheral urea "61.8"
    And   I enter evaluation RT Mohan "72.5"
    And   I enter evaluation access flow "950"
    And   I enter evaluation recirculation "12.5"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Validation with out of range date"
    When  I click button three points evaluation
    And   I click button save
    And   I click button OK modal error
    When  I click button three points evaluation
    And   I click button cancel
    Then  I click button arrow up
