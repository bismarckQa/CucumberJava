#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Assign Main Center

  @test @regression @test_Case_2961
  Scenario: Cancelling an assigned centre
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the New button at position 1
    And   I select a centre in the new row
    And   I enter the start date of the centre row "01/01/2024"
    And   I enter the end date of the centre row "01/01/2025"
    And   I cancel the centre row

  @test @regression @test_Case_2962
  Scenario: Successful assigned centre
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the New button at position 1
    And   I select a centre in the new row
    And   I enter the start date of the centre row "01/01/2024"
    And   I enter the end date of the centre row "01/01/2025"
    And   I save the centre row

  @test @regression @test_Case_2963
  Scenario: Assign a centre with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the New button at position 1
    And   I save the centre row
