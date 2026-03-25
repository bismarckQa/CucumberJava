#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify additional identification

  @test @regression @test_Case_2972
  Scenario: Successful edited identification
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click button edit identifications
    And   I enter the identification value "9999"
    And   I enter the identification observations "Observation Modified"
    And   I save the identification row