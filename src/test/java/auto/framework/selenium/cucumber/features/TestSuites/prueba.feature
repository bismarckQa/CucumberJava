#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Messages
Feature: View Messages

  @test @regression @TestCase_17385
  Scenario: View sent messages
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click messages icon
    And   I click see all messages
    And   I scroll to messages section
    And   I click sent messages tab
    Then  I verify sent messages displayed