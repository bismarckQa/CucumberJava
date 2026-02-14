#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Delete Exploration Data

  @test @TestCase_7270
  Scenario: Successful delete indicator
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Physical assessment area
    When  I See Indicator section all available
    And   I click button delete indicators
    And   I click button "Yes" in action modal
    Then  I click button OK modal error

  @test @TestCase_7271
  Scenario: Cancelling delete indicator
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Physical assessment area
    When  I See Indicator section all available
    And   I click button delete indicators
    And   I click button "No" in action modal
    Then  I click button arrow up

  @test @TestCase_3635
  Scenario: Successful delete Physical assessment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "Delete"
    Then  I filling in the data to delete the record, password: "renal2", reason: "Qa Test" and option: "OK"



  @test @TestCase_3636
  Scenario: Cancelling a deleted Physical Assessment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Physical assessment area
    And   I click button three points Physical Assessment
    And   I click button option "Delete"
    Then  I filling in the data to delete the record, password: "renal2", reason: "Qa Test" and option: "Cancel"
