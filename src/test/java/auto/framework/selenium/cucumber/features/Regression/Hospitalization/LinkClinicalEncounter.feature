#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Hospitalization

Feature: Link Clinical Encounter

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Hospitalization module
    Then  I check the module Hospitalization appear correctly


  @test @Test_case_3774 @ALM_VR_TC_602
  Scenario: Cancelling an associated review
    And   I trying to create an associated review, but it gets cancelled

  @test @Test_case_3775 @ALM_VR_TC_603
  Scenario: Successful associated review
    And   I successfully create the associated review

