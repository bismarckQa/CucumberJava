#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit Access Data

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3544 @ALM_VR_TC
  Scenario: Edit Access Data
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    And   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "11012025"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button cancel

  @test @TestCase_3548 @ALM_VR_TC
  Scenario: Add a New additional test
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access Data
    And   I select option new additional test
    And   I select associate additional study
    Then  I click button "Add" associate additional study

  @test @TestCase_3551 @ALM_VR_TC
  Scenario: Save with (at least one) of required  fields empty
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access Data
    And   I select option Edit
    And   I select Date of first use "11152025"
    And   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "11152025"
    And   I click button arrow up
    And  I click button three points Access Data
    Then  I click button cancel

  @test @TestCase_3926 @ALM_VR_TC
  Scenario: Cancel a New additional test
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access Data
    And   I select option new additional test
    And   I select associate additional study
    Then  I click button "Cancel" associate additional study

  @test @TestCase_3927 @ALM_VR_TC
  Scenario: Cancel edition of Access Data
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    And   I select Date of first use "11152025"
    And   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "11172025"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button cancel

