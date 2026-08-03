#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@ConfigurationUser
Feature: View User

  @test @TestCase_2365 @ALM_VR_TC_212
  Scenario: Data user view
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly

  @test @TestCase_2366 @ALM_VR_TC_213
  Scenario: Inactive users view
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into Configuration User module
    And   I open Users module in configuration user
    And   I verify that Users module opened correctly
    And   I click show inactive users
    And   I verify that inactive users filter is displayed correctly