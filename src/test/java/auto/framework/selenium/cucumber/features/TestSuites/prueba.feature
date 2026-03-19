#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Additional Identification

  @test @regression @test_Case_2964
  Scenario: Cancelling an added identification
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the New button at position 1
    And   I select the identification type
    And   I enter the identification value "12345678"
    And   I enter the identification observations "Test observation"
    And   I cancel the identification row
