#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser

Feature: Add Additional Identification

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
   
  @test @TestCase_2400 @ALM_VR_TC_239
  Scenario: Add new add identification
   When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I click button new record in additional identifications
    And   I select the identification type "Ticket Telemedicina" in additional identifications row
    And   I enter the value in additional identifications row "40565441H"
    And   I enter the observations in additional identifications row "principal number"
    Then  I save the additional identifications row
    And   I verify the action was performed successfully

  @test  @TestCase_2402 @ALM_VR_TC_240
  Scenario: Cancelling add identification
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I click button new record in additional identifications
    And   I select the identification type "Ticket Telemedicina" in additional identifications row
    And   I enter the value in additional identifications row "40565441H"
    And   I enter the observations in additional identifications row "principal number"
    Then  I cancel the additional identifications row

  @test  @TestCase_2405 @ALM_VR_TC_241
  Scenario: Empty required fields
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Additional identifications section is displayed
    When  I click button new record in additional identifications
    Then  I save the additional identifications row
    And   I cancel the additional identifications row