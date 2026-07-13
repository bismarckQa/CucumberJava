#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit All on a HD Access Implantation

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly

  @test @TestCase_3762 @ALM_VR_TC
  Scenario: Edit all of an HD Access Implantation
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    When   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "10102025"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button cancel

  @test @TestCase_3924 @ALM_VR_TC
  Scenario: Cancel edited HD Access Implantation
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    When   I select Date of first use "10102025"
    And   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "12102025"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button cancel

  @test @TestCase_3925 @ALM_VR_TC
  Scenario: Save edited HD Access Implantation
    When   I click button implantation section
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    When   I select Date of first use "10102025"
    When  I insert data into text area comments "QATestAccess Modified"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button save

