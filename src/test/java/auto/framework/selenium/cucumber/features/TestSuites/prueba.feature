#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser

Feature: Create New User


  @test @regression @TestCase_2368
  Scenario: Successful user creation with all required data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I click button arrow up
    And   I verify that Users module opened correctly
    And   I click the three points menu in users module
    And   I click "New" option in users module menu
    And   I enter the last name in the user form "QA"
    And   I enter the first name in the user form "Test"
    And   I select the profession in the user form
    And   I select the user profile in the user form
    And   I select the treatment in the user form
    And   I select the center in the user form
    And   I enter the username in the user form "qatest_user"
    And   I enter the password in the user form "Test1234!"
    And   I enter the confirm password in the user form "Test1234!"
    When  I click "Save" option in users module menu
    And   I verify the action was performed successfully