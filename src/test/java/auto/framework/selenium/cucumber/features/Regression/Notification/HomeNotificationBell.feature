#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Notification
Feature: Home Notification Bell

  @test @regression @TestCase_17365
  Scenario: View the notification center bell panel
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click notification bell
    And   I click section tab in notification bell panel
    And   I click go to notification center in notification bell panel
    Then  I verify notification center opened correctly
    And   I verify section notifications displayed

  @test @regression @TestCase_17366
  Scenario: View the patient notification bell panel
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click notification bell
    And   I click go to notification center in notification bell panel
    And   I click patient filter in notification center
    Then  I verify patient notifications displayed