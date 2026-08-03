#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add Drugs


Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
  
  @test @TestCase_17201 @ALM_VR_TC_91
  Scenario: Add complete drugs data
    When  I click button drugs section
    And   I click button Add New drug types
    And   I insert data into the name drugs types field "Test_1"
    And   I insert data into the description drugs types field "new drugs added"
    Then  I click button save add new drug types
    And   I looking for the new drug created with the name: "Test_1"

  @test @TestCase_17202 @ALM_VR_TC_506
  Scenario: Name empty
    When  I click button drugs section
    And   I click button Add New drug types
    And   I insert data into the name drugs types field ""
    And   I insert data into the description drugs types field "new drugs added"
    Then  I click button cancel add new drug types

  @test @TestCase_17204 @ALM_VR_TC_507
  Scenario: Add new drug results
    When  I click button drugs section
    And   I looking for the new drug created with the name: "Test_1"
    And   I click button Add New drug result
    And   I insert data into the name drugs result field "sub_test"
    Then  I click button save new result

  @test @TestCase_17205 @ALM_VR_TC_508
  Scenario: Add new drug duplicate
    When  I click button drugs section
    And   I click button Add New drug types
    And   I insert data into the name drugs types field "Test_1"
    And   I insert data into the description drugs types field "duplicate"
    Then  I click button save add new drug types
    And   I click button OK  modal error
