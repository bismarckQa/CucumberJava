#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify Contact


  @test @regression @TestCase_2396
  Scenario: Edit contact
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Contacts section is displayed
    When  I click button edit contacts row
    And   I select the contact type "Prueba Centro 2" in contacts row
    And   I enter the value in contacts row "+3465998877"
    Then  I save the contacts row
    And   I verify the action was performed successfully
