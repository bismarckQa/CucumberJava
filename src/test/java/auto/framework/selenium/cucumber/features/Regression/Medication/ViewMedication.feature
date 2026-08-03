#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medication
Feature: View Medication

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly


  @test @Test_case3095 @ALM_VR_TC_635
  Scenario: Enter in medication window
    And   I try to Add new medication with, parameters startDate "7/16/2024", dosage "TestModify", dosageSession "1", textArea "Qa observation modify"
    Then  I verify that the new medication was added


  @test @Test_case_3096 @ALM_VR_TC_636
  Scenario: Clear all medication categories
    And   I uncheck all the categories at the top Categories of the medication module

  @test @Test_case_3099 @ALM_VR_TC_637
  Scenario: Show inactive medications
    And   I Checked Show inactive checkbox


  @test @Test_case_3097 @ALM_VR_TC_638
  Scenario: Show medications of only one category
    And   I Checked only one medication category in top combo box


  @test @Test_case_3098 @ALM_VR_TC_639
  Scenario: Show only home medications
    And   I checked show only home check box

  @test @Test_case_3100 @ALM_VR_TC_640
  Scenario: View allergies
    And   I open the menu and add new allergy
    And   I fill in the new allergy data "Qa test data"
    Then  I save the new allergy entry
    And   I check the new Allergies was created correctly
    And   I open Medication module
    Then  I check the module Medication appear correctly
    And   I click on the Allergies link, under Penicillin
    Then  I check the module Allergies appear correctly
    And   I delete the allergy created
    And   I open Medication module
    And   I remove the added medication, confirm the reason "Qa Testing"
