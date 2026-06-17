#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Import lab tests
  @test @test_Case_3582
  Scenario: Successful import lab tests
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I click button three points lab test section
    When  I click button "Import" option
    And   I insert data into id request import laboratory results "201813314"
    Then  I click button "Search for results" option
    And   I select check box primary identification
    Then  I click button "Import results" option
    And   I click button arrow up

  @test @test_Case_3600
  Scenario: Cancelling an import lab tests
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I click button three points lab test section
    Then  I click button "Import" option
    And   I insert data into id request import laboratory results "201813314"
    Then  I click button "Search for results" option
    And   I select check box primary identification
    And   I click button close modal import laboratory results
    And   I click button arrow up

  @test @test_Case_3585
  Scenario: Show none results to import
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I click button three points lab test section
    When  I click button "Import" option
    And   I insert data into id request import laboratory results "201813300"
    Then  I click button "Import results" option
    And   I click button OK modal error
    And   I click button close modal import laboratory results
    Then  I click button arrow up


