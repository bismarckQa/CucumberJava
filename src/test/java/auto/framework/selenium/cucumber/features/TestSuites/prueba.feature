#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Add Signs or Symptoms to complication

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
   And   I open "Accesses" module
    Then  I check the module Accesses appear correctly

@test @TestCase @ALM_VR_TC
    Scenario: Create New Access PD
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