#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add Dialyzer

Background: 
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    
  @test @TestCase_2678 @ALM_VR_TC_90    
  Scenario: Full Data
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I insert data into the model field "Test_full_data"
    Then  I select a manufacturer option
    And   I select option type of membrane
    And   I enter data in input KoA "2"
    And   I enter data in input Surface "3"
    And   I enter data in input Primer Volume "50"
    And   I enter data in input Coefficient "5"
    And   I enter data in maximum QB "100"
    And   I click button three points dialyzer
    And   I click button save new dialyzer
    And   I click button arrow up

  @test @TestCase_2679 @ALM_VR_TC_502
  Scenario: Empty field
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2680 @ALM_VR_TC_503
  Scenario: Only Model Value
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I insert data into the model field "Test_1"
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2681 @ALM_VR_TC_504
  Scenario: Model and Manufacturer
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I insert data into the model field "Test_1"
    Then  I select a manufacturer option
    And   I click button three points dialyzer
    And   I click button save new dialyzer


  @test @TestCase_2682 @ALM_VR_TC_505
  Scenario: Add Inactive Dialyzer
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I insert data into the model field "Test_inactive"
    Then  I select a manufacturer option
    And   I select or unselect the dialyzer checkbox if it is "inactive"
    And   I click button three points dialyzer
    And   I click button save new dialyzer
    And   I click button arrow up
    Then  I click the checkbox to show all inactive dialyzers
