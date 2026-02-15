#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy
Feature: Delete Dialyzer
  @test @TestCase_2690
  Scenario: Delete an used dialyzer
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_dialyzer_modified"
    And   I click button three points dialyzer
    Then  I try to delete dialyzer selected
    And   I click button arrow up
    And   I click button Yes Confirmation delete dialyzer

  @test @TestCase_2692
  Scenario: Cancelling deletion
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    When  I looking for the model to edit with the name: "Test_dialyzer_modified"
    And   I click button three points dialyzer
    Then  I try to delete dialyzer selected
    And   I click button arrow up
    And   I click button Cancel Confirmation delete dialyzer
