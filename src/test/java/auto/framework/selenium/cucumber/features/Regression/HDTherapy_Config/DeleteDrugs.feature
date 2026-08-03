#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Delete Drugs

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module

  @test @TestCase_17214  @ALM_VR_TC_97
  Scenario: Delete the drug in use
    When  I click button drugs section
    And   I looking for the new drug created with the name: "Test_Modified"
    And   I click button delete drug type selected
    Then  I click button arrow up
    And   I click button Yes Confirmation delete
    And   I click button arrow up
    And   I click button OK  modal error

  @test @TestCase_17216 @ALM_VR_TC_517
  Scenario: Delete Successful
    When  I click button drugs section
    And   I looking for the new drug created with the name: "Heparina 2"
    And   I click button delete drug type selected
    Then  I click button arrow up
    And   I click button Yes Confirmation delete
