#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit All on an Access Complications

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    Given I Select the Group of patients "Paciente DP"
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly
    When  I select the Complications in main menu

@test @TestCase_4365 @ALM_VR_TC_390
Scenario:Cancel edited  Vascular Access Complication
    When  I click button three points complications
    And   I click in edit all
    And   I insert data into identification date "07/20/2026"
    And   I insert data into resolution date "07/20/2026"
    When  I click button arrow up
    And   I click button three points complications
    Then  I click button cancel


@test @TestCase_4363 @ALM_VR_TC_391
Scenario:Edit all of a  Vascular Access Complication
    When  I click button three points complications
    And   I click in edit all
    And   I insert data into identification date "07/21/2026"
    And   I insert data into resolution date "07/21/2026"
    When  I click button arrow up
    And   I click button three points complications
    Then  I click button cancel



@test @TestCase_4364 @ALM_VR_TC_392
Scenario:Save edited  Vascular Access Complication
    When  I click button three points complications
    And   I click in edit all
    And   I insert data into identification date "07/22/2026"
    And   I insert data into resolution date "07/22/2026"
    When  I click button arrow up
    And   I click button three points complications
    Then  I click button save
