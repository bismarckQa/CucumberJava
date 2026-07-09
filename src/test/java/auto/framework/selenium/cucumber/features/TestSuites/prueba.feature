#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Infections
Feature: Delete Infection

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Infections module
    Then  I check the module Infections appear correctly

  @test @TestCase_3433
  Scenario: Can't delete infection without correct password
    When  I click the three points menu in infections
    And   I click delete option in infections menu
    Then  I verify delete infection modal is displayed
    When  I enter password "wrong-password" in delete infection modal
    And   I enter reason "QA wrong password delete infection" in delete infection modal
    And   I click OK button in delete infection modal
    Then  I verify delete infection modal is displayed


