#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Create a New Access

  Background:
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open "Accesses" module
    Then  I check the module Accesses appear correctly

    @test @TestCase_3540 @ALM_VR_TC_23
    Scenario: New Access
        When   I click button three points Access
        And   I click button new access
        When  I click button implantation section
        And   I select access type "Catéter percutáneo femoral" in access data
        And   I select access location "Muñeca izquierda" in access data
        And   I enter first use date "06102024" in access data
        And   I enter access comment "QATestAccess"
        And   I enter implantation date "06102024" in access data
        When  I enter removal date "06212024" in access data
        And   I select removal center "Sistemes Renals" in access data
        When  I click button arrow up
        And   I click button three points Access
        Then  I save the Access Data Implantation

    @test @TestCase @ALM_VR_TC
    Scenario: Create New Access PD
        Given I Select the Group of patients "Paciente DP"
        When  I select the patient "Foianini Baggio, Pasquale"
        And   I open "Accesses" module
        When  I click button arrow up
        And   I click button three points Access
        And   I click button new access
        When  I click button implantation section
        And   I select access type "Catetere peritoneale di cruz" in access data
        And   I select access location "Peritoneal" in access data
        And   I enter first use date "06102024" in access data
        And   I enter access comment "QATestPDAccess"
        And   I enter implantation date "06102024" in access data
        And   I set omentectomy to yes in access data
        And   I select implantation center "Sistemes Renals" in access data
        And   I select implantation method "Tradizionale" in access data
        And   I select reason for implantation "Prueba Activo" in access data
        When  I enter removal date "06212024" in access data
        And   I select removal center "Sistemes Renals" in access data
        And   I select removal method "Prueba Activo" in access data
        When  I click button arrow up
        And   I click button three points Access
        Then  I save the Access Data Implantation

    @test @TestCase_3543 @ALM_VR_TC_332
    Scenario: Edit Access
        When   I click in edit all
        And   I can edit all parameters and change for example the Comment "QATestAccessEdit"
        When  I save the Access Data Implantation
        Then  I check the Comment changed

    @test @TestCase_3542 @ALM_VR_TC_333
    Scenario: Access Location
        When   I check the state of access is active with colour green
        When  I click in edit all
        And   I Change the date of removal to "06192024"
        And   I click button arrow up
        And   I save the Access Data Implantation
        Then  I check the state of access is inactive with colour red

    @test @TestCase_3923 @ALM_VR_TC_334
    Scenario: Save with at least one of required  fields empty
        When   I click button three points Access
        And   I click button new access
        When  I click location accesses
        And   I select access type "Catéter percutáneo femoral" in access data
        And   I select access location "Muñeca izquierda" in access data
        And   I enter first use date "" in access data
        And   I enter access comment "QATestAccess"
        And   I enter implantation date "" in access data
        And   I enter removal date "" in access data
        And   I select removal center "Sistemes Renals" in access data
        Then  I click button cancel
