#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit an Assessment / Evaluation of an HD Access

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly
    When  I select the Evaluation in main menu

@test @TestCase_3961 @ALM_VR_TC_393
Scenario:Cancel Evaluation edition
    When  I click button three points evaluation
    And   I click button "Edit"
    And   I enter evaluation date "07/20/2026"
    And   I enter evaluation average VP "168"
    And   I enter evaluation average BP "-208"
    And   I enter evaluation SBP "126"
    And   I enter evaluation DBP "77"
    And   I enter evaluation arterial urea "56.4"
    And   I enter evaluation venous urea "31.2"
    And   I enter evaluation peripheral urea "59.1"
    And   I enter evaluation RT Mohan "71.8"
    And   I enter evaluation access flow "930"
    And   I enter evaluation recirculation "11.1"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Cancel HD evaluation edition"
    When  I click button three points evaluation
    Then  I click button cancel


@test @TestCase_3960 @ALM_VR_TC_
Scenario:Edit Evaluation  assessment
    When  I click button three points evaluation
    And   I click button "Edit"
    And   I enter evaluation date "07/21/2026"
    And   I enter evaluation average VP "170"
    And   I enter evaluation average BP "-210"
    And   I enter evaluation SBP "128"
    And   I enter evaluation DBP "78"
    And   I enter evaluation arterial urea "57.0"
    And   I enter evaluation venous urea "31.8"
    And   I enter evaluation peripheral urea "59.8"
    And   I enter evaluation RT Mohan "72.3"
    And   I enter evaluation access flow "945"
    And   I enter evaluation recirculation "11.6"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Edit HD evaluation assessment"
    When  I click button three points evaluation
    Then  I click button cancel



@test @TestCase_3962 @ALM_VR_TC_
Scenario:Save with required (date) field empty
    When  I click button three points evaluation
    And   I click button "Edit"
    And   I enter evaluation date ""
    And   I enter evaluation average VP "172"
    And   I enter evaluation average BP "-212"
    And   I enter evaluation SBP "129"
    And   I enter evaluation DBP "79"
    And   I enter evaluation arterial urea "57.4"
    And   I enter evaluation venous urea "32.1"
    And   I enter evaluation peripheral urea "60.2"
    And   I enter evaluation RT Mohan "72.9"
    And   I enter evaluation access flow "950"
    And   I enter evaluation recirculation "12.0"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Validation without evaluation date"
    When  I click button three points evaluation
    Then  I click button cancel
