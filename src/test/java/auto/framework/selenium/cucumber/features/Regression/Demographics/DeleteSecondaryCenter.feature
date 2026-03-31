#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Secondary Center

  @test @regression @test_Case_2990
  Scenario: Cancelling delete secondary center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click button delete secondary centre
    Then  I click button "No" in action modal

  @test @regression @test_Case_2991
  Scenario: Successful delete secondary center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click button delete secondary centre
    Then  I click button "Yes" in action modal