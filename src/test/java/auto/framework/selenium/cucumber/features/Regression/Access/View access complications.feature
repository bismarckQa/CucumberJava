#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: View access complications

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful

  @test @TestCase_3798 @ALM_VR_TC_411
  Scenario: View complications
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open "Accesses" module
    Then  I check the module Accesses appear correctly
    When  I select the Complications in main menu
    Then  I check that the sections Location, Complications, Interventions, Observations, Medications and Hospitalisations
