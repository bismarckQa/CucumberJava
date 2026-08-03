#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Print lab tests

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly


  @test @test_Case_3591 @ALM_VR_TC_586
  Scenario: Lab tests print
    When  I click button lab test section
    And   I insert data into input start date analytics "01/23/2026"
    And   I click button "Select" option
    And   I click button three points lab test section
    Then  I click button "Print" option
    And   I click "Imprimir" button in print preview
    And   I click button arrow up

  @test @test_Case_3602 @ALM_VR_TC_587
  Scenario: Cancelling lab tests print
    When  I click button lab test section
    And   I insert data into input start date analytics "01/23/2026"
    And   I click button "Select" option
    And   I click button three points lab test section
    Then  I click button "Print" option
    And   I click "Cancelar" button in print preview
    And   I click button arrow up

