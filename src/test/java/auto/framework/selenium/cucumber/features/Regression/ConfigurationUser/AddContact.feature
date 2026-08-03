#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser

Feature: Add Contact

Background: 
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    
  @test @TestCase_2390 @ALM_VR_TC_231
  Scenario: Cancelling an added contact
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I click button new record in contacts
    And   I select the contact type "E-mail" in contacts row
    And   I enter the value in contacts row "qa.contact@test.com"
    Then  I cancel the contacts row

  @test @TestCase_2391 @ALM_VR_TC_232
  Scenario: Add contact
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I click button new record in contacts
    And   I select the contact type "E-mail" in contacts row
    And   I enter the value in contacts row "qa.contact@test.com"
    Then  I save the contacts row
    And   I verify the action was performed successfully

  @test @TestCase_2394 @ALM_VR_TC_233
  Scenario: Empty required fields
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I click button new record in contacts
    And   I select the contact type "E-mail" in contacts row
    Then  I save the contacts row
    And   I cancel the contacts row