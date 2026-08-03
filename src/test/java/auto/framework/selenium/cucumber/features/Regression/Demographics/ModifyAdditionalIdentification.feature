#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Additional Identification

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_2970 @ALM_VR_TC_81
  Scenario: Cancelling an Edited Identification
    When  I click button edit identifications
    And   I enter the identification value "99999999"
    And   I enter the identification observations "Edit observation"
    Then  I cancel the identification row

  @test @test_Case_2971 @ALM_VR_TC_482
  Scenario: Edit identification with empty required fields
    And   I click button edit identifications
    And   I enter the identification value ""
    And   I enter the identification observations ""
    And   I cancel the identification row

  @test @test_Case_2972 @ALM_VR_TC_483
  Scenario: Successful edited identification
    And   I click button edit identifications
    And   I enter the identification value "9999"
    And   I enter the identification observations "Observation Modified"
    And   I save the identification row