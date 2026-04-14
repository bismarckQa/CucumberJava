#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Contact Addresses

  @test @regression @test_Case_3010
  Scenario: Cancelling delete contact address
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click button delete contact address
    Then  I click button "No" in action modal

  @test @regression @test_Case_3011
  Scenario: Successful delete contact address
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click button delete contact address
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully