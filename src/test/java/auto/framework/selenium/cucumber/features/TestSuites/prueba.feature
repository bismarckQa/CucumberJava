#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Prueba Access PD

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open "Accesses" module
    Then  I check the module Accesses appear correctly

  @test
  Scenario: Create New Access PD
    When  I click button implantation section
    And   I click button three points Access
    And   I click button new access
    And   I select access type "Catetere peritoneale di cruz" in access data
    And   I select access location "Peritoneal" in access data
    And   I enter first use date "07162026" in access data
    And   I enter access comment "QATestPDAccess"
    And   I enter implantation date "07162026" in access data
    And   I set omentectomy to yes in access data
    And   I select implantation center "Sistemes Renals" in access data
    And   I select implantation method "Tradizionale" in access data
    And   I select reason for implantation "Prueba Activo" in access data
    When  I enter removal date "" in access data
    And   I select removal center "Sistemes Renals" in access data
    When  I click button arrow up
    And   I click button three points Access
    Then  I save the Access Data Implantation
