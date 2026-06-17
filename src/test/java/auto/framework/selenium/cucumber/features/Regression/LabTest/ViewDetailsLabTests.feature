#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: View details lab tests
  @test @test_Case_3613
  Scenario: Enter in laboratory results detail window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    And   I insert data into input start date analytics "12/09/2025"
    And   I insert data into input end date analytics "03/09/2026"
    Then  I click button "Select" option








