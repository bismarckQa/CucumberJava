#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Delete laboratory request

  @test @smoke @test_Case_3758
  Scenario: Successful deleted laboratory request
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button laboratory request section
    And   I click button delete laboratory request and accept it

  @test @smoke @test_Case_3759
  Scenario: Cancelling deleted laboratory request
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button laboratory request section
    And   I click button delete laboratory request and cancel it








