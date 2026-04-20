#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Emergency Contact

  @test @regression @test_Case_3093
  Scenario: Cancelling a delete emergency contact
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the delete button of the emergency contact row
    Then  I click button "No" in action modal

  @test @regression @test_Case_3094
  Scenario: Successful delete emergency contact
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly
    And   I click the delete button of the emergency contact row
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully