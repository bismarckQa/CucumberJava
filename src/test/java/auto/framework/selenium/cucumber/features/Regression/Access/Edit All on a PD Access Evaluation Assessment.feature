#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PDAccess

Feature:Edit All on a PD Access Evaluation/Assessment

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    Given I Select the Group of patients "Paciente DP"
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly
    When  I select the Evaluation in main menu

@test @TestCase_4368 @ALM_VR_TC_385
Scenario:Cancel edited Access Evaluation for Pd patient
    When  I click button three points evaluation
    And   I click in edit all
    And   I enter evaluation date "07/20/2026"
    And   I enter evaluation average VP "165"
    And   I enter evaluation average BP "-205"
    And   I enter evaluation SBP "124"
    And   I enter evaluation DBP "76"
    And   I enter evaluation arterial urea "48.3"
    And   I enter evaluation venous urea "29.1"
    And   I enter evaluation peripheral urea "51.2"
    And   I enter evaluation RT Mohan "68.4"
    And   I enter evaluation access flow "840"
    And   I enter evaluation recirculation "8.4"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Cancel PD evaluation edit"
    When  I click button three points evaluation
    Then  I click button cancel


@test @TestCase_4366 @ALM_VR_TC_386
Scenario:Edit all of PD Access Evaluation  
    When  I click button three points evaluation
    And   I click in edit all
    And   I enter evaluation date "07/21/2026"
    And   I enter evaluation average VP "170"
    And   I enter evaluation average BP "-210"
    And   I enter evaluation SBP "126"
    And   I enter evaluation DBP "78"
    And   I enter evaluation arterial urea "49.8"
    And   I enter evaluation venous urea "30.0"
    And   I enter evaluation peripheral urea "52.6"
    And   I enter evaluation RT Mohan "69.7"
    And   I enter evaluation access flow "860"
    And   I enter evaluation recirculation "9.1"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Edit all PD evaluation"
    When  I click button three points evaluation
    Then  I click button cancel



@test @TestCase_4367 @ALM_VR_TC_387
Scenario:Save edited Access Evaluation for PD patient
    When  I click button three points evaluation
    And   I click in edit all
    And   I enter evaluation date "07/22/2026"
    And   I enter evaluation average VP "172"
    And   I enter evaluation average BP "-212"
    And   I enter evaluation SBP "128"
    And   I enter evaluation DBP "79"
    And   I enter evaluation arterial urea "50.2"
    And   I enter evaluation venous urea "30.4"
    And   I enter evaluation peripheral urea "53.1"
    And   I enter evaluation RT Mohan "70.2"
    And   I enter evaluation access flow "875"
    And   I enter evaluation recirculation "9.6"
    And   I select evaluation method "Prueba Activo"
    And   I enter evaluation comments "Save edited PD evaluation"
    When  I click button three points evaluation
    Then  I click button save

 
