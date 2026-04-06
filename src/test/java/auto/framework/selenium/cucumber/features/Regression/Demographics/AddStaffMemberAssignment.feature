#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Staff Member Assignment

  @test @regression @test_Case_2993
  Scenario: Adding a staff member with empty fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 3
    Then  I save the staff row
    And   I cancel the staff row

  @test @regression @test_Case_2994
  Scenario: Cancelling an assigned staff member
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 3
    And   I select a profession in the staff row
    And   I select a staff name in the staff row
    And   I enter the start date of the staff row "03/01/2026"
    Then  I cancel the staff row

  @test @regression @test_Case_2995
  Scenario: Successful assigned staff member
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 3
    And   I select a profession in the staff row
    And   I select a staff name in the staff row
    And   I enter the start date of the staff row "03/01/2026"
    Then  I save the staff row