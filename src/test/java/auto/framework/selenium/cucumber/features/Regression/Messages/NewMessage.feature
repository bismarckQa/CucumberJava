#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Messages
Feature: New Message

  @test @regression @TestCase_17388
  Scenario: New message successfully sent
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click messages icon
    And   I click see all messages
    And   I select the recipient "Trasplante Ap1 Transplante Ap2, Trasplante N" in new message
    And   I enter the case "QA message" in new message
    And   I enter the message "QA message automation text" in new message
    And   I verify send message button is displayed
    Then  I click send message button