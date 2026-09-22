#environment
@Environment_Dev
#app_name
@Versia_Renal
#version
@2024R1a
#Module
@Modality
Feature: View Modality

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    And   I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open "Modality" module
    Then  I check the module Modality appear correctly

  @test @TestCase_3301
  Scenario: View Modality screen
    Then  I verify modality data is displayed in read-only mode

  @test @TestCase_3302
  Scenario: Patient already has an active modality
    When  I click new button in Modality
    Then  I verify warning message appears "Patient already has an active Modality"
