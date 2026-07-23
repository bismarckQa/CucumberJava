#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature:Edit All on a HD Access Evaluation/Assessment

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly
    When  I select the Evaluation in main menu

@test @TestCase_4372 @ALM_VR_TC_380
Scenario:Cancel edited Access Evaluation for HD patient
    When  I click button three points evaluation
    And   I click in edit all
    And   I enter evaluation date "07/20/2026"
    And   I enter evaluation average VP "174"
    And   I enter evaluation average BP "-214"
    And   I enter evaluation SBP "129"
    And   I enter evaluation DBP "79"
    And   I enter evaluation arterial urea "58.0"
    And   I enter evaluation venous urea "32.2"
    And   I enter evaluation peripheral urea "61.0"
    And   I enter evaluation RT Mohan "73.1"
    And   I enter evaluation access flow "955"
    And   I enter evaluation recirculation "12.2"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Cancel HD edit all evaluation"
    When  I click button three points evaluation
    Then  I click button cancel



@test @TestCase_4370 @ALM_VR_TC_381
Scenario:Edit alll of a  Access Evaluation for HD patient
    When  I click button three points evaluation
    And   I click in edit all
    And   I enter evaluation date "07/21/2026"
    And   I enter evaluation average VP "176"
    And   I enter evaluation average BP "-216"
    And   I enter evaluation SBP "130"
    And   I enter evaluation DBP "80"
    And   I enter evaluation arterial urea "58.4"
    And   I enter evaluation venous urea "32.6"
    And   I enter evaluation peripheral urea "61.5"
    And   I enter evaluation RT Mohan "73.6"
    And   I enter evaluation access flow "970"
    And   I enter evaluation recirculation "12.8"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Edit all HD evaluation"
    When  I click button three points evaluation
    Then  I click button cancel



@test @TestCase_4371 @ALM_VR_TC_382
Scenario:Save edited Access Evaluation for HD patient
    When  I click button three points evaluation
    And   I click in edit all
    And   I enter evaluation date "07/22/2026"
    And   I enter evaluation average VP "178"
    And   I enter evaluation average BP "-218"
    And   I enter evaluation SBP "131"
    And   I enter evaluation DBP "81"
    And   I enter evaluation arterial urea "58.8"
    And   I enter evaluation venous urea "33.0"
    And   I enter evaluation peripheral urea "61.9"
    And   I enter evaluation RT Mohan "74.0"
    And   I enter evaluation access flow "980"
    And   I enter evaluation recirculation "13.1"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Save edited HD evaluation"
    When  I click button three points evaluation
    Then  I click button save

 
