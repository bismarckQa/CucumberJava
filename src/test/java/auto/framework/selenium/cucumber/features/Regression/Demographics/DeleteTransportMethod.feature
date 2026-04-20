#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Transport Method

  @test @regression @test_Case_3042
  Scenario: Cancelling a delete transport method
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the delete button of the transport method row
    Then  I click button "No" in action modal

  @test @regression @test_Case_3043
  Scenario: Successful deleted transport method
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the delete button of the transport method row
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully