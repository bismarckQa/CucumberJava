#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Edit All Blocks Option

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3423 @ALM_VR_TC_311
  Scenario: Cancelling edited infection/culture/interventions
    When  I click the three points menu in infections
    And   I click edit all option in infections menu
    Then  I verify new infection form is displayed
    When  I enter presentation date "06/17/2026" in infection form
    And   I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "07/18/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation edit all cancelled" in infection form
    And   I click page "1" in cultures pagination
    And   I enter culture date "07/03/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa edit all culture page 1 cancelled" in culture form
    And   I click page "2" in cultures pagination
    And   I enter culture date "07/03/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa edit all culture page 2 cancelled" in culture form
    And   I click page "1" in interventions pagination
    And   I enter intervention date "07/03/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click page "2" in interventions pagination
    And   I enter intervention date "07/03/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click cancel option in infections menu
    Then  I verify new infection form is closed

  @test @TestCase_3424 @ALM_VR_TC_312
  Scenario: Successful edited infection/cultures/interventions
    When  I click the three points menu in infections
    And   I click edit all option in infections menu
    Then  I verify new infection form is displayed
    When  I enter presentation date "06/17/2026" in infection form
    And   I select infection type "Peritonitis" in infection form
    And   I select treatment location "Hospital/Urgencias" in infection form
    And   I enter resolution date "07/19/2026" in infection form
    And   I select evaluation "HD" in infection form
    And   I enter observations "Automation edit all successfully" in infection form
    And   I click page "1" in cultures pagination
    And   I enter culture date "07/03/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa edit all culture page 1 successfully" in culture form
    And   I click page "2" in cultures pagination
    And   I enter culture date "07/03/2026" in culture form
    And   I select laboratory "Test2" in culture form
    And   I select culture type "Cultivo líquido DP" in culture form
    And   I select result "No growth (NG)" in culture form
    And   I select sample method "Prueba Activo" in culture form
    And   I enter comments "Qa edit all culture page 2 successfully" in culture form
    And   I click page "1" in interventions pagination
    And   I enter intervention date "07/03/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click page "2" in interventions pagination
    And   I enter intervention date "07/03/2026" in intervention form
    And   I select type of intervention "Prueba Activo" in intervention form
    And   I select result "Prueba Activo" in intervention form
    And   I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully

  @test @TestCase_3425 @ALM_VR_TC_313
  Scenario: Edit all blocks with empty required fields
    When  I click the three points menu in infections
    And   I click edit all option in infections menu
    Then  I verify new infection form is displayed
    When  I enter presentation date "" in infection form
    And   I enter observations "Qa edit all infection empty required field" in infection form
    And   I click page "1" in cultures pagination
    And   I enter culture date "" in culture form
    And   I click page "1" in interventions pagination
    And   I enter intervention date "" in intervention form
    And   I click button arrow up
    And   I click the three points menu in infections
    Then  I verify save option is not displayed in infections menu
    When  I click cancel option in infections menu
    Then  I verify new infection form is closed

  @test @TestCase_3426 @ALM_VR_TC_314
  Scenario: Delete edited infection cultures interventions
    When  I click the three points menu in infections
    And   I click edit all option in infections menu
    Then  I verify new infection form is displayed
    When  I click page "1" in cultures pagination
    And   I click delete culture icon in edit all
    And   I click delete culture icon in edit all
    Then  I verify cultures panel is empty
    When  I click page "1" in interventions pagination
    And   I click delete intervention icon in edit all
    And   I click delete intervention icon in edit all
    Then  I verify interventions panel is empty
    When  I click button arrow up
    And   I click the three points menu in infections
    And   I click save option in infections menu
    Then  I verify the action was performed successfully