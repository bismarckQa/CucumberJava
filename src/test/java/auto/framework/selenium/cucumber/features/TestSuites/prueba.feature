#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Addresses


  @test @regression @test_Case_3003
  Scenario: Successful added Contact Addresses
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 7
    And   I select a contact address type in the new row
    And   I enter the address in the contact address row "duquesa 54"
    And   I select a country in the contact address row
    And   I select a province in the contact address row
    And   I select a city in the contact address row
    And   I enter the ZIP code in the contact address row "28001"
    And   I select a health zone in the contact address row
    And   I enter the start date of the contact address row "04/01/2026"
    And   I enter the end date of the contact address row "04/01/2027"
    And   I enter the other field in the contact address row "Qa Test"
    Then  I save the contact address row
    And   I verify the action was performed successfully