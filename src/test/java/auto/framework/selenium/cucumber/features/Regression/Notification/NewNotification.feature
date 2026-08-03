#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Notification
Feature: New Notification

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I click notification bell


  @test @TestCase_17369 @ALM_VR_TC_259
  Scenario: Create new notification with empty required fields
    And   I click go to notification center in notification bell panel
    And   I click the three points menu in notification form
    When  I click "NEW" option in notification form menu
    Then  I verify notification required fields validation is displayed
    And   I click the three points menu in notification form
    Then  I click "CANCEL" option in notification form menu

  @test @TestCase_17370 @ALM_VR_TC_260
  Scenario: Cancel create new notification
    And   I click go to notification center in notification bell panel
    And   I click the three points menu in notification form
    When  I click "NEW" option in notification form menu
    And   I select the patient "Foianini Baggio, Pasquale - 00250" in notification form
    And   I select available for "Trasplante Ap1 Transplante Ap2, Trasplante N" in notification form
    And   I enter the text "QA notification cancel test" in notification form
    And   I click the three points menu in notification form
    Then  I click "CANCEL" option in notification form menu
    And   I verify the notification list is displayed

  @test @TestCase_17375 @ALM_VR_TC_261
  Scenario: Create new notification successfully
    And   I click go to notification center in notification bell panel
    And   I click the three points menu in notification form
    When  I click "NEW" option in notification form menu
    And   I select the patient "Foianini Baggio, Pasquale - 00250" in notification form
    And   I select available for "Trasplante Ap1 Transplante Ap2, Trasplante N" in notification form
    And   I enter the text "QA notification automation 17375" in notification form
    And   I click the three points menu in notification form
    When  I click "SAVE" option in notification form menu
    And   I verify the action was performed successfully
    Then  I verify the notification "QA notification automation 17375" was created


  @test @TestCase_17380 @ALM_VR_TC_264
  Scenario: Create a new notification with a selected section
    And   I click go to notification center in notification bell panel
    And   I click the three points menu in notification form
    When  I click "NEW" option in notification form menu
    And   I select the section "Accesses" in notification form
    And   I select available for "Trasplante Ap1 Transplante Ap2, Trasplante N" in notification form
    And   I enter the text "QA notification section test" in notification form
    And   I click the three points menu in notification form
    When  I click "SAVE" option in notification form menu
    And   I verify the action was performed successfully
