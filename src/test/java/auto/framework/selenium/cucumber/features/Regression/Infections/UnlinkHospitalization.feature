#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Unlink Hospitalization

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3467  @ALM_VR_TC_302
  Scenario: Cancelling a deleted Assoc hospitalization
    When  I click the three points menu in associated hospitalization
    And   I click delete option in associated hospitalization menu
    And   I click button "No" in action modal
    Then  I verify associated hospitalization panel is displayed

  @test @TestCase_3468  @ALM_VR_TC_303
  Scenario: Successful delete assoc hospitalization
    When  I click the three points menu in associated hospitalization
    And   I click delete option in associated hospitalization menu
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully