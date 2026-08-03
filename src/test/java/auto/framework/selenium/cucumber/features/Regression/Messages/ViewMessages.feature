#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Messages
Feature: View Messages

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click messages icon
    And   I click see all messages


  @test @TestCase_17385 @ALM_VR_TC_265 
  Scenario: View sent messages
    And   I scroll to messages section
    And   I click sent messages tab
    Then  I verify sent messages displayed

  @test @TestCase_17386 @ALM_VR_TC_266
  Scenario: View received messages
    And   I scroll to messages section
    And   I click received messages tab
    Then  I verify received messages displayed



  @test @TestCase_17390 @ALM_VR_TC_267
  Scenario: View unread received message from messages icon
    And   I scroll to messages section
    And   I click received messages tab
    Then  I verify received messages displayed