#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Allergies

Feature: Delete Allergies

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Allergies module
    Then  I check the module Allergies appear correctly

  @test @TestCase_2737 @ALM_VR_TC_49
  Scenario: Successful Deleted Allergy
       When  I click delete allergy button
    Then  I confirm delete allergy modal


  @test @TestCase_2738  @ALM_VR_TC_417
  Scenario: Cancelling a deleted Allergy
   When  I click delete allergy button
    Then  I cancel delete allergy modal



