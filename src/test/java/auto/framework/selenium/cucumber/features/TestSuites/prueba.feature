#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Secondary Center

  @test @regression @test_Case_2987
  Scenario: Successful edited Secondary center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit secondary centre
    And   I enter the end date of the secondary centre row "04/30/2026"
    Then  I save the secondary centre row