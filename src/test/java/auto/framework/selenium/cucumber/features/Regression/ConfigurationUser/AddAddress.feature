#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: Add Address

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly


  @test @TestCase_2452 @ALM_VR_TC_247
  Scenario: Successful add address
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I click button new record in addresses
    And   I select the address type "Habitual" in addresses row
    And   I enter the address in addresses row "Calle QA Automation"
    And   I enter the number in addresses row "2"
    And   I enter the ZIP code in addresses row "28001"
    And   I select the country "España" in addresses row
    And   I select the province "Madrid" in addresses row
    And   I enter the other field in addresses row "Qa test"
    Then  I save the addresses row
    And   I verify the action was performed successfully

  @test @TestCase_2453 @ALM_VR_TC_248
  Scenario: Cancelling add address
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I click button new record in addresses
    And   I select the address type "Habitual" in addresses row
    And   I enter the address in addresses row "Calle QA Cancel 456"
    And   I enter the number in addresses row "3"
    And   I enter the ZIP code in addresses row "28002"
    And   I select the country "España" in addresses row
    And   I select the province "Madrid" in addresses row
    And   I enter the other field in addresses row "Cancel test"
    Then  I cancel the addresses row

  @test @TestCase_2454 @ALM_VR_TC_249
  Scenario: Empty required fields
    When  I click button arrow up
    And   I select the user "QA Automation, Test" in users module
    Then  I verify that Addresses section is displayed
    When  I click button new record in addresses
    Then  I save the addresses row
    And   I cancel the addresses row