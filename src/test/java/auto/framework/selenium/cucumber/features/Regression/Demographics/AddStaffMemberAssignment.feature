#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Staff Member Assignment

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_2993 @ALM_VR_TC_68
  Scenario: Adding a staff member with empty fields
    When  I click the New button at position 3
    Then  I save the staff row
    And   I cancel the staff row

  @test @test_Case_2994 @ALM_VR_TC_466
  Scenario: Cancelling an assigned staff member
    When  I click the New button at position 3
    And   I select a profession in the staff row
    And   I select a staff name in the staff row
    And   I enter the start date of the staff row "03/01/2026"
    Then  I cancel the staff row

  @test @test_Case_2995 @ALM_VR_TC_467
  Scenario: Successful assigned staff member
    When  I click the New button at position 3
    And   I select a profession in the staff row
    And   I select a staff name in the staff row
    And   I enter the start date of the staff row "03/01/2026"
    Then  I save the staff row