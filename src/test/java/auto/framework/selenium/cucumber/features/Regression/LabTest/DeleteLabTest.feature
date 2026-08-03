#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Delete lab tests

Background: 
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly


  @test @test_Case_3597 @ALM_VR_TC_128
  Scenario: Successful deleted laboratory result
    When  I click button lab test section
    And   I select a specific lab test listed: "15.00"
    And   I click button "Delete" option
    When  I click button "Yes" in action modal
    Then  I click button arrow up

  @test @test_Case_3601 @ALM_VR_TC_576
  Scenario: Cancelling deleted laboratory result
    When  I click button lab test section
    And   I select a specific lab test listed: "15.00"
    And   I click button "Delete" option
    When  I click button "No" in action modal
    And   I click button "Cancel" option
    Then  I click button arrow up
