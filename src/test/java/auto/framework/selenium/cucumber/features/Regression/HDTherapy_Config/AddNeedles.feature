#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add needles
  @test @TestCase_2705
  Scenario: Empty fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    When  I click button three points needles
    And   I click button new add needles
    When  I click button three points needles
    And   I click button cancel add new needles
    Then  I click button arrow up

  @test @TestCase_2706
  Scenario: No name
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    When  I click button three points needles
    And   I click button new add needles
    And   I insert data at name needles ""
    And   I insert data at Caliber needles "100"
    When  I click button three points needles
    And   I click button cancel add new needles
    Then  I click button arrow up

  @test @TestCase_2707
  Scenario: No Caliber
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    When  I click button three points needles
    And   I click button new add needles
    And   I insert data at name needles "Test Needles"
    And   I insert data at Caliber needles ""
    When  I click button three points needles
    And   I click button cancel add new needles
    Then  I click button arrow up

  @test @TestCase_2708
  Scenario: Full Data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    When  I click button three points needles
    And   I click button new add needles
    And   I insert data at name needles "Test_1"
    And   I insert data at Caliber needles "100"
    When  I click button three points needles
    And   I click button save add new needles
    Then  I click button arrow up
    And   I looking for the needles with the name: "Test_1"

  @test @TestCase_2709
  Scenario: Inactive needle
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button needles section
    When  I click button three points needles
    And   I click button new add needles
    And   I insert data at name needles "Test_inactive"
    And   I insert data at Caliber needles "100"
    And   I select or unselect needles checkbox if it is "inactive"
    When  I click button three points needles
    And   I click button save add new needles
    Then  I click button arrow up
    Then  I click the checkbox to show all inactive needles
    And   I looking for the needles with the name: "Test_inactive"
