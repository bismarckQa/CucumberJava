#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@Planning_Care
Feature: Delete Planning Care

  Background:
    Given I open the Baxter website
    And   I try to login with "login_core" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Planning Care module
    Then  I check the module Planning Care appear correctly

  @test @Test_case_3484 @ALM_VR_TC_803
  Scenario: Cancelling a deleted Planning Care
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click delete in Planning Care
    Then  I click button "No" in confirmation modal Planning Care

  @test @Test_case_3485 @ALM_VR_TC_804
  Scenario: Successful deleted Planning Care
    When  I select period "Multi" in Planning Care
    And   I click button three points Planning Care
    And   I click delete in Planning Care
    Then  I click button "Yes" in confirmation modal Planning Care
