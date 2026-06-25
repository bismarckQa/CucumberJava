#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Delete Culture

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3442
  Scenario: Cancelling a deleted culture
    When  I click the three points menu in cultures
    And   I click delete culture option in cultures menu
    And   I click button "No" in action modal
    Then  I verify cultures panel is displayed

  @test @TestCase_3443
  Scenario: Successful delete culture
    When  I click the three points menu in cultures
    And   I click delete culture option in cultures menu
    And   I click button "Yes" in action modal
    Then  I verify the action was performed successfully