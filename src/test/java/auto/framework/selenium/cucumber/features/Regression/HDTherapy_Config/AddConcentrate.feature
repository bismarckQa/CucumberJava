#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add Concentrate

Background: 
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module

  @test @TestCase_2693 @ALM_VR_TC_89
  Scenario: full Data
    And   I click button concentrates section
    When  I click button three points concentrates
    And   I click button new add concentrates
    And   I insert data into the name concentrates field "Test case 1"
    Then  I select the type of concentrates option
    And   I insert data into the input end sodium "40"
    And   I insert data into the input end bicarbonate "40"
    And   I insert data into the input end calcium "40"
    And   I insert data into the input end potassium "40"
    And   I insert data into the input end Magnesium "40"
    And   I insert data into the input end chloride "40"
    And   I insert data into the input end acetate "40"
    And   I insert data into the input end dextrose "40"
    And   I insert data into the input end dextrose "40"
    Then  I insert data into the input sodium bicarbonate "40"
    And   I insert data into the input sodium chloride "40"
    And   I insert data into the text Area description concentrate "Note text area test"
    When  I click button three points concentrates
    And   I click button save new concentrate
    Then  I click button arrow up

  @test @TestCase_2694 @ALM_VR_TC_498
  Scenario: Empty Data
    And   I click button concentrates section
    When  I click button three points concentrates
    And   I click button new add concentrates
    When  I click button three points concentrates
    Then  I click button cancel add new concentrate

  @test @TestCase_2695 @ALM_VR_TC_499
  Scenario: Name and Type Only
    And   I click button concentrates section
    When  I click button three points concentrates
    And   I click button new add concentrates
    And   I insert data into the name concentrates field "Test_case_2"
    Then  I select the type of concentrates option
    And   I click button three points concentrates
    And   I click button save new concentrate
    Then  I click button arrow up
    Then  I looking for the concentrate with the name: "Test_case_2"

  @test @TestCase_2696 @ALM_VR_TC_500
  Scenario: Inactive concentrate
    And   I click button concentrates section
    When  I click button three points concentrates
    And   I click button new add concentrates
    And   I insert data into the name concentrates field "Test_case_inactive"
    Then  I select the type of concentrates option
    And   I select or unselect the concentrate checkbox if it is "inactive"
    And   I click button three points concentrates
    And   I click button save new concentrate
    Then  I click button arrow up
    And   I click the checkbox to show all inactive concentrates
    Then  I looking for the concentrate with the name: "Test_case_inactive"

  @test @TestCase_2697 @ALM_VR_TC_501
  Scenario: Name only
    And   I click button concentrates section
    When  I click button three points concentrates
    And   I click button new add concentrates
    And   I insert data into the name concentrates field "Test_case_3"
    And   I click button three points concentrates
    Then  I click button cancel add new concentrate
