#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Notification
Feature: New Notification

  @test @regression @TestCase_17380
  Scenario: Create a new notification with a selected section
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click notification bell
    And   I click go to notification center in notification bell panel
    And   I click the three points menu in notification form
    When  I click "NEW" option in notification form menu
    And   I select the section "Accesses" in notification form
    And   I select available for "Trasplante Ap1 Transplante Ap2, Trasplante N" in notification form
    And   I enter the text "QA notification section test" in notification form
    And   I click the three points menu in notification form
    When  I click "SAVE" option in notification form menu
    And   I verify the action was performed successfully



