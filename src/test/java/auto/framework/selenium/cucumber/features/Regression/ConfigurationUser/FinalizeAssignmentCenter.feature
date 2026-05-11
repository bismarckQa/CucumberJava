#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Finalize Assignment Center

  @test @regression @TestCase_2388
  Scenario: Cancelling delete center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I cancel delete center assignment row
    Then  I verify the action was performed successfully

  @test @regression @TestCase_2389
  Scenario: Delete a center
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Center assignment section is displayed
    When  I accept delete center assignment row
    Then  I verify the action was performed successfully