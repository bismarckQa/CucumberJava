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
    And   I open Accesses module
    Then  I check the module Accesses appear correctly


    @test @TestCase_3540 @ALM_VR_TC_23
    Scenario: New Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I click location accesses
        When  I add all data correctly for add the Access: Access type "CatÃ©ter percutÃ¡neo femoral", Location "MuÃ±eca izquierda", Date of first use "06102024", comment "QATestAccess", implantation date "06102024", date of removal "06212024" and removal center "Sistemes Renals"
        Then  I save the Access Data Implantation

    @test @TestCase_3543 @ALM_VR_TC_332
    Scenario: Edit Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I click in edit all
        And   I can edit all parameters and change for example the Comment "QATestAccessEdit"
        When  I save the Access Data Implantation
        Then  I check the Comment changed

    @test @TestCase_3542 @ALM_VR_TC_333
    Scenario: Access Location
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I check the state of access is active with colour green
        When  I click in edit all
        And   I Change the date of removal to "06192024"
        And   I save the Access Data Implantation
        Then  I check the state of access is inactive with colour red

    @test @TestCase_3923 @ALM_VR_TC_334
    Scenario: Save with at least one of required  fields empty
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I click location accesses
        When  I add all data correctly for add the Access: Access type "CatÃ©ter percutÃ¡neo femoral", Location "MuÃ±eca izquierda", Date of first use "", comment "QATestAccess", implantation date "", date of removal "" and removal center "Sistemes Renals"
        Then  I click button cancel





