#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Notification
Feature: Modify Notification

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click notification bell



  @test @TestCase_17377 @ALM_VR_TC_262
  Scenario: Cancel modify end date
    And   I click go to notification center in notification bell panel
    And   I click patient filter in notification center
    And   I click show all notifications
    When  I click edit notification by patient "Foianini Baggio, Pasquale - 00250"
    And   I enter the end date "07/15/2026" in notification form
    Then  I cancel the notification edit row
    And   I verify the notification list is displayed

  @test @TestCase_17378 @ALM_VR_TC_263
  Scenario: Modify notification with wrong date
    And   I click go to notification center in notification bell panel
    And   I click patient filter in notification center
    And   I click show all notifications
    When  I click edit notification by patient "Foianini Baggio, Pasquale - 00250"
    And   I enter the end date "01/01/2020" in notification form
    Then  I save the notification edit row
    And   I click button OK modal error
    Then  I cancel the notification edit row

  @test @TestCase_17379 @ALM_VR_TC_641
  Scenario: Modify notification successfully
    And   I click go to notification center in notification bell panel
    And   I click patient filter in notification center
    And   I click show all notifications
    When  I click edit notification by patient "Foianini Baggio, Pasquale - 00250"
    And   I enter the end date "07/15/2026" in notification form
    Then  I save the notification edit row
    And   I verify the action was performed successfully
    Then  I verify the notification for patient "Foianini Baggio, Pasquale - 00250" has end date "15/07/2026"