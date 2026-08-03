#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Delete Contact Method

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly

  @test @test_Case_3054 @ALM_VR_TC_77
  Scenario: Cancelling a delete contact method
    And   I click the delete button of the contact method row
    Then  I click button "No" in action modal

  @test @test_Case_3055 @ALM_VR_TC_477
  Scenario: Successful deleted contact method
    And   I click the delete button of the contact method row
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully