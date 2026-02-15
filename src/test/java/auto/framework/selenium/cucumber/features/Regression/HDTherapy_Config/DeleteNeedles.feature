#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Delete Needles
  @test @TestCase_2716
  Scenario: Unused needle
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    And   I looking for the needles with the name: "Test_Active"
    When  I click button three points needles
    And   I click button delete needles
    Then  I click button arrow up
    And   I click button Yes Confirmation delete needles

  @test @TestCase_2717
  Scenario: Used
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    And   I looking for the needles with the name: "Ag 1"
    When  I click button three points needles
    And   I click button delete needles
    Then  I click button arrow up
    And   I click button Yes Confirmation delete needles
    And   I click button OK  modal error
