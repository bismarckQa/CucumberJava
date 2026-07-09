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

  @test @TestCase_3431 @ALM_VR_TC_315
  Scenario: Cancelling delete infection
    When  I click the three points menu in infections
    And   I click delete option in infections menu
    Then  I verify delete infection modal is displayed
    When  I enter password "renal2" in delete infection modal
    And   I enter reason "QA cancel delete infection" in delete infection modal
    And   I click cancel button in delete infection modal

  @test @TestCase_3432 @ALM_VR_TC_316
  Scenario: Successful deleted infection
    When  I click the three points menu in infections
    And   I click delete option in infections menu
    Then  I verify delete infection modal is displayed
    When  I enter password "renal2" in delete infection modal
    And   I enter reason "QA delete infection" in delete infection modal
    And   I click OK button in delete infection modal
    And   I click button OK modal error
    Then  I verify the action was performed successfully

  @test @TestCase_3433 @ALM_VR_TC_317
  Scenario: Can t delete infection without correct password
    When  I click the three points menu in infections
    And   I click delete option in infections menu
    Then  I verify delete infection modal is displayed
    When  I enter password "wrong-password" in delete infection modal
    And   I enter reason "QA wrong password delete infection" in delete infection modal
    And   I click OK button in delete infection modal
    And   I click cancel button in delete infection modal
    Then  I verify delete infection modal is displayed