#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Modify Address

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    
  @test @TestCase_2455 @ALM_VR_TC_250
  Scenario: Empty required fields
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I click button edit addresses row
    And   I enter the address in addresses row ""
    And   I enter the other field in addresses row ""
    Then  I save the addresses row
    And   I cancel the addresses row

  @test @TestCase_2456 @ALM_VR_TC_251
  Scenario: Cancelling an edited address
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I click button edit addresses row
    And   I select the address type "Trabajo" in addresses row
    And   I enter the address in addresses row "Calle QA Edit Cancel 789"
    And   I enter the number in addresses row "4"
    And   I enter the ZIP code in addresses row "28043"
    And   I select the country "España" in addresses row
    And   I select the province "Álava" in addresses row
    And   I enter the other field in addresses row "Edit cancel test"
    Then  I cancel the addresses row

  @test @TestCase_2457 @ALM_VR_TC_252
  Scenario: Successful edit address
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I click button edit addresses row
    And   I select the address type "Habitual" in addresses row
    And   I enter the address in addresses row "Calle QA Edit 999"
    And   I enter the number in addresses row "5"
    And   I enter the ZIP code in addresses row "01008"
    And   I select the country "España" in addresses row
    And   I select the province "Álava" in addresses row
    And   I enter the other field in addresses row "Edit test"
    Then  I save the addresses row
    And   I verify the action was performed successfully