#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Additional Identification

  @test @regression @test_Case_2970
  Scenario: Cancelling an Edited Identification
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit identifications
    And   I enter the identification value "99999999"
    And   I enter the identification observations "Edit observation"
    Then  I cancel the identification row

  @test @regression @test_Case_2971
  Scenario: Edit identification with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click button edit identifications
    And   I enter the identification value ""
    And   I enter the identification observations ""
    And   I cancel the identification row

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