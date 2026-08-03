#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Modify Exploration Data

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    

  @test @TestCase_3648 @ALM_VR_TC_143
  Scenario: Successful edit Physical assessment
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "Edit"
    When  I insert date into inputs Seated BP "35", "55"
    And   I click button three points Physical Assessment
    Then  I click button save

  @test @TestCase_3649 @ALM_VR_TC_658
  Scenario: Cancelling an edited Physical assessment
    And   I click button three points Physical Assessment
    And   I click button option "Edit"
    When  I See Indicator section all available
    And   I click button arrow up
    And   I click button three points Physical Assessment
    Then  I click button cancel

  @test @TestCase_7274 @ALM_VR_TC_659
  Scenario: Cancelling edit indicator
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "Edit"
    When  I See Indicator section all available
    And   I insert data into value indicator "25"
    Then  I click button cancel indicators
    And   I click button arrow up

  @test @TestCase_7273 @ALM_VR_TC_660
  Scenario: Successful edit indicator
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "Edit"
    When  I See Indicator section all available
    And   I insert data into value indicator "25"
    Then  I click button save indicators
    And   I click button arrow up
