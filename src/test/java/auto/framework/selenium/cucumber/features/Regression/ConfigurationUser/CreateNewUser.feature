#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Create New User

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user


  @test @TestCase_2368 @ALM_VR_TC_214
  Scenario: Successful user creation with all required data
    When   I click button arrow up
    And   I verify that Users module opened correctly
    And   I click the three points menu in users module
    When  I click "New" option in users module menu
    And   I enter the last name in the user form "QA"
    And   I enter the first name in the user form "Test"
    And   I select the profession in the user form
    When  I select the user profile in the user form
    And   I select the treatment in the user form
    And   I select the center in the user form
    Then  I enter the username in the user form "QaTestUser"
    And   I enter the password in the user form "Test1234!"
    And   I enter the confirm password in the user form "Test1234!"
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I verify the action was performed successfully

  @test @TestCase_2369 @ALM_VR_TC_215
  Scenario: Required fields are empty
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I click the three points menu in users module
    And   I click "New" option in users module menu
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I click button OK modal error
    And   I click the three points menu in users module
    Then  I click "Cancel" option in users module menu

  @test @TestCase_2370 @ALM_VR_TC_216
  Scenario: Duplicate username error
    And   I verify that Users module opened correctly
    When   I click button arrow up
    And   I click the three points menu in users module
    When  I click "New" option in users module menu
    And   I enter the last name in the user form "QA"
    And   I enter the first name in the user form "Test"
    And   I select the profession in the user form
    When  I select the user profile in the user form
    And   I select the treatment in the user form
    And   I select the center in the user form
    Then  I enter the username in the user form "QaTestUser"
    And   I enter the password in the user form "Test1234!"
    And   I enter the confirm password in the user form "Test1234!"
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I verify the action was performed successfully

  @test @TestCase_2371 @ALM_VR_TC_217
  Scenario: Password and confirm password do not match
   And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I click the three points menu in users module
    And   I click "New" option in users module menu
    And   I enter the last name in the user form "QA"
    And   I enter the first name in the user form "Test"
    And   I select the profession in the user form
    And   I select the user profile in the user form
    And   I select the treatment in the user form
    And   I select the center in the user form
    And   I enter the username in the user form "qatest_new"
    And   I enter the password in the user form "Test1234!"
    And   I enter the confirm password in the user form "Different999!"
    Then  I verify the passwords do not match error is displayed