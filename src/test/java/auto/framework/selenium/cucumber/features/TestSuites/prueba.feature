#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify User

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
    And   I select the user "QA Automation, Test" in users module
    And   I click the three points menu in users module
    When  I click "Edit" option in users module menu
    And   I enter the password in the user form "123"
    And   I enter the confirm password in the user form "123"
    And   I click button arrow up
    And   I click the three points menu in users module
    When  I click "Save" option in users module menu
    And   I click button OK modal error
    And   I click the three points menu in users module
    Then  I click "Cancel" option in users module menu
    And   I verify the action was performed successfully


