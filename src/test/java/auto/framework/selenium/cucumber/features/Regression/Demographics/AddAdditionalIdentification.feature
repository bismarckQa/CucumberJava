#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Additional Identification
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly


  @test @test_Case_2966 @ALM_VR_TC_66
  Scenario: Cancelling an added identification
    And   I click the New button at position 1
    And   I select the identification type
    And   I enter the identification value "12345678"
    And   I enter the identification observations "Test observation"
    And   I cancel the identification row


  @test @test_Case_2967 @ALM_VR_TC_453
  Scenario: Required fields are empty
    And   I click the New button at position 1
    And   I select the identification type
    And   I enter the identification value ""
    And   I enter the identification observations ""
    And   I save the identification row
    And   I cancel the identification row


  @test @test_Case_2968 @ALM_VR_TC_454
  Scenario: Successful Edited Identification
    When  I click the New button at position 1
    And   I select the identification type
    And   I enter the identification value "123456"
    Then  I enter the identification observations "Qa test "
    And   I save the identification row

