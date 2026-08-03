#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Add Exploration Data
Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    

  @test @TestCase_3561 @ALM_VR_TC_137
  Scenario: Successful added Physical Assessment
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "New"
    Then  I insert date into inputs Seated BP "30", "35"
    And   I click button three points Physical Assessment
    And   I click button option "Save"

  @test @TestCase_3583 @ALM_VR_TC_644
  Scenario: Cancelling an added Physical Assessment
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "New"
    Then  I insert date into inputs Seated BP "30", "35"
    And   I click button three points Physical Assessment
    And   I click button option "Cancel"

  @test @TestCase_3584 @ALM_VR_TC_645
  Scenario: Add new Physical Assessment with empty required fields
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "New"
    Then  I insert date into inputs Seated BP "", ""
    And   I click button three points Physical Assessment
    And   I click button option "Cancel"
