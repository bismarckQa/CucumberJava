#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add type of anticoagulant
  @test @TestCase_4745
  Scenario: Successful added anticoagulant
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    When  I click button anticlottings section
    And   I click buton Anticlotting Type and select option
    And   I try to do a drag drop to insert a medication into the anticoagulant area
