#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Delete type of anticoagulant
  @test @TestCase_4746 @ALM_VR_TC_92
  Scenario: Successful remove anticoagulant
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    When  I click button anticlottings section
    And   I click buton Anticlotting Type and select option
    And   I try to delete the added anticoagulant
    Then  I click button arrow up
    And   I click button Yes Confirmation delete
