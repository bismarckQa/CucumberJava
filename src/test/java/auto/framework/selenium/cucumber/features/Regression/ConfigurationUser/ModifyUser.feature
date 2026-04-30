#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify User

  @test @regression @TestCase_2372
  Scenario: All data correct
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA , Test" in users module
    And   I click the three points menu in users module
    When  I click "Edit" option in users module menu
    When  I enter the license number in the user form "111111111"
    And   I enter the NID in the user form "18091071F"
    And   I enter the second surname in the user form "Automation"
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I verify the action was performed successfully

  @test @regression @TestCase_2373
  Scenario: No data required
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    And   I click the three points menu in users module
    When  I click "Edit" option in users module menu
    And   I enter the last name in the user form ""
    And   I enter the first name in the user form ""
    Then  I enter the username in the user form ""
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I click button OK modal error
    And   I click the three points menu in users module
    Then  I click "Cancel" option in users module menu

  @test @regression @TestCase_2374
  Scenario: Password must coincide
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    And   I click the three points menu in users module
    When  I click "Edit" option in users module menu
    And   I enter the password in the user form "Test1234!"
    And   I enter the confirm password in the user form "Different999!"
    Then  I verify the passwords do not match error is displayed
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I click button OK modal error
    And   I click the three points menu in users module
    Then  I click "Cancel" option in users module menu

  @test @regression @TestCase_11207
  Scenario: The password must meet the requirements
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    And   I click the three points menu in users module
    When  I click "Edit" option in users module menu
    And   I enter the password in the user form "12345"
    And   I enter the confirm password in the user form "12345"
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I verify the action was performed successfully

  @test @regression @TestCase_11208
  Scenario: The password does not meet the requirements
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA , Test" in users module
    And   I click the three points menu in users module
    When  I click "Edit" option in users module menu
    And   I enter the password in the user form "password"
    And   I enter the confirm password in the user form "password"
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    Then  I verify the password does not meet requirements error is displayed