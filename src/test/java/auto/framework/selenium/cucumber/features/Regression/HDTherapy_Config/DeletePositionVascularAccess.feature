#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Delete Image Position Vascular Access
  @test @TestCase_4741
  Scenario: Cancelling deleted Image Position Vascular Access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I looking for the position lateralities with the name: "Muñeca derecha"
    And   I click button delete Laterality
    When  I click button Cancel Confirmation delete Laterality

  @test @TestCase_4740
  Scenario: Successful deleted Image Position Vascular Access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I looking for the position lateralities with the name: "Muñeca derecha"
    And   I click button delete Laterality
    Then  I click button yes Confirmation delete Laterality
