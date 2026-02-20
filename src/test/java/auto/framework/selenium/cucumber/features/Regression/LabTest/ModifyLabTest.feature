#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Modify lab tests
  @test @smoke @test_Case_3612
  Scenario:  Cancelling edited lab test result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    When  I select a specific lab test listed: "Volumen Orina - (ml/día)"
    And   I insert data into input date request "2/19/2026"
    And   I select profile option in lab test
    Then  I insert data into input date sample "2/19/2026"
    And   I insert data into input result test "15"
    And   I click button "Cancel" option
    And   I click button arrow up
