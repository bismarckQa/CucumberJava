#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Feature: Add Secondary Center


  @test @regression @test_Case_2979
  Scenario: Successful added secondary centre
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click the New button at position 4
    And   I select a secondary centre in the new row
    And   I enter the start date of the secondary centre row "03/01/2026"
    And   I select a category in the secondary centre row
    Then  I save the secondary centre row
