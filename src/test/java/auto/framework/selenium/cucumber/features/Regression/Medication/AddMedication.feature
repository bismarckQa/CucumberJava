#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Medication

Feature: Add Medication

Background: 
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Medication module
    Then  I check the module Medication appear correctly

  @test @Test_case_3102 @ALM_VR_TC_616
  Scenario: Add new medication with empty fields
    And   I verify that the fields to add a new medication are empty

  @test @Test_case_3104 @ALM_VR_TC_617
  Scenario: Category only
    And   I try to Add new medication with category only

  @test @Test_case_3103 @ALM_VR_TC_618
  Scenario: Empty data medication
    And   I try to create a new medication with empty data

  @test @Test_case_3108 @ALM_VR_TC_619
  Scenario: Frequency only
    And   I try to Add new medication with frequency only

  @test @Test_case_3109 @ALM_VR_TC_620
  Scenario: If Needed Checked
    And   I try to save if needed checked

  @test @Test_case3105 @ALM_VR_TC_621
  Scenario: Medication Only
    And   I try to Add new medication with medication only

  @test @Test_case_3107 @ALM_VR_TC_622
  Scenario: Route Only
    And   I try to Add new medication with route only

  @test @Test_case_3111 @ALM_VR_TC_623
  Scenario: overlapping date, distinct location and same location
    And   I try to save with overlapping date, distinct location and same location, parameters startDate "6/25/2024", dosage "TestDosage", dosagePerDose "1.00", dosageSession "1", textArea "Qa observation"
    Then  I verify that the new medication was added
    And   I remove the added medication, confirm the reason "Qa Testing"

  @test @Test_case_3110 @ALM_VR_TC_624
  Scenario: overlapping date, same location and same location
    And   I try to save with overlapping date, same location and same location, parameters startDate "6/25/2024", dosage "TestDosage", dosagePerDose "1.00", dosageSession "1", textArea "Qa observation"

  @test @Test_case_3112 @ALM_VR_TC_625
  Scenario: Variable dosage
    And   I try to Add new medication with variable dosage, parameters startDate "6/25/2024", dosage "Test", dosageSession "1", textArea "Qa observation"
    Then  I verify that the new medication was added
    And   I remove the added medication, confirm the reason "Qa Testing"