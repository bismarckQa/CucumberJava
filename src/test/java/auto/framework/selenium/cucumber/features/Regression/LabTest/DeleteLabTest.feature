#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Delete lab tests
  @test @smoke @test_Case_3597
  Scenario: Successful deleted laboratory result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I select a specific lab test listed: "15.00"
    And   I click button "Delete" option
    When  I click button "Yes" in action modal
    Then  I click button arrow up

  @test @smoke @test_Case_3601
  Scenario: Cancelling deleted laboratory result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button lab test section
    And   I select a specific lab test listed: "15.00"
    And   I click button "Delete" option
    When  I click button "No" in action modal
    And   I click button "Cancel" option
    Then  I click button arrow up
