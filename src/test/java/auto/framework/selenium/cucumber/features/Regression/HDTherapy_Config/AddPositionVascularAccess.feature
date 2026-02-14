#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add Image Position Vascular Access
  @test @TestCase_4736
  Scenario: Successful added Image Position Vascular Access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button Add New Laterality
    When  I click input position lateralities and select option
    And   I click input lateralities and select option
    Then  I click button save new Lateralities


  @test @TestCase_4737
  Scenario: Cancelling added Image Position Vascular Access
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button Add New Laterality
    When  I click input position lateralities and select option
    And   I click input lateralities and select option
    Then  I click cancel save new Lateralities
