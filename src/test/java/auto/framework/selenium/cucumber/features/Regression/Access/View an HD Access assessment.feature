#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: View an HD Access assessment

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful

  @test @TestCase_4195 @ALM_VR_TC_412
  Scenario: View vascular access assessment
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open "Accesses" module
    Then  I check the module Accesses appear correctly
    When  I select the Evaluation in main menu
    Then  I check that the sections Location, Follow-Up, Evaluation and Historic Photographs of Accesses
