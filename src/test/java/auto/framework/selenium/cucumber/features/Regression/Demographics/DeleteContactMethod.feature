#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Contact Method

  @test @regression @test_Case_3054
  Scenario: Cancelling a delete contact method
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the delete button of the contact method row
    Then  I click button "No" in action modal

  @test @regression @test_Case_3055
  Scenario: Successful deleted contact method
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the delete button of the contact method row
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully