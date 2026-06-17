#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: View Lab Test
  @test @test_Case_3614
  Scenario: Enter in laboratory results window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    Then  I click button "Select" option

  @test @test_Case_3646
  Scenario: Show none laboratory results
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I insert data into input start date analytics "12/06/2019"
    And   I insert data into input end date analytics "03/07/2020"
    Then  I click button "Select" option








