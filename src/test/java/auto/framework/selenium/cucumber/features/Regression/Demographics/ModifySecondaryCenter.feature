#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Secondary Center
  @test @regression @test_Case_2983
  Scenario: Fields are empty
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit secondary centre
    And   I enter the start date of the secondary centre row ""
    Then  I save the secondary centre row

  @test @regression @test_Case_2986
  Scenario: Wrong dates
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit secondary centre
    And   I enter the end date of the secondary centre row "01/01/1900"
    Then  I save the secondary centre row
    And   I click button OK modal error
    And   I cancel the secondary centre row

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

  @test @regression @test_Case_2988
  Scenario: Cancelling an Edited Secondary Center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    When  I click button edit secondary centre
    And   I enter the end date of the secondary centre row "01/01/1900"
    Then  I cancel the secondary centre row