#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Filters options
  @test @smoke @test_Case_3658
  Scenario: Filter options view
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I click in drop down profiles analytics
    When  I click button "Discard all" option
    When  I click button "Select all" option
    And   I click in drop down profiles analytics
    And   I insert data into input start date analytics "02/02/2026"
    And   I insert data into input end date analytics "02/26/2026"
    When  I click button "Select" option

  @test @smoke @test_Case_3675
  Scenario: Show none lab tests results
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I click in drop down profiles analytics
    When  I click button "Discard all" option
    When  I click button "Select all" option
    And   I click in drop down profiles analytics
    And   I insert data into input start date analytics "02/02/2020"
    And   I insert data into input end date analytics "02/26/2020"
    When  I click button "Select" option

