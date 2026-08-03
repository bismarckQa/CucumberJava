#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify User

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly



  @test @TestCase_2372 @ALM_VR_TC_218
  Scenario: All data correct
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

  @test @TestCase_2373 @ALM_VR_TC_219
  Scenario: No data required
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

  @test @TestCase_2374 @ALM_VR_TC_220
  Scenario: Password must coincide
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

  @test @TestCase_11207 @ALM_VR_TC_221
  Scenario: The password must meet the requirements
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

  @test @TestCase_11208 @ALM_VR_TC_222
  Scenario: The password does not meet the requirements
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