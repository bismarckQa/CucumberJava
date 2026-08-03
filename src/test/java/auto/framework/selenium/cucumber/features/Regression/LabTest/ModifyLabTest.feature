#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Modify lab tests

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly


  @test @test_Case_3610 @ALM_VR_TC_130
  Scenario:  Successful edited lab test result
    When   I click button lab test section
    And  I select a specific lab test listed: "10.00"
    And   I click button "Modify" option
    When   I insert data into unput value result selected: "15"
    And   I click button "Save" option
    Then   I click button arrow up

  @test @test_Case_3612 @ALM_VR_TC_584
  Scenario:  Cancelling edited lab test result
    When   I click button lab test section
    And  I select a specific lab test listed: "10.00"
    And   I click button "Modify" option
    When   I insert data into unput value result selected: "15"
    And   I click button "Cancel" option
    And   I click button "Cancel" option
    Then   I click button arrow up
