#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Add Dialyzer
  @test @TestCase_2678
  Scenario: Full Data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
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

  @test @TestCase_2679
  Scenario: Empty field
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I click button Ok in modal error
    And   I open options of user
    Then  I enter into user configuration options
    And   I click button Ok in modal error
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2680
  Scenario: Only Model Value
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I click button Ok in modal error
    And   I open options of user
    Then  I enter into user configuration options
    And   I click button Ok in modal error
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I insert data into the model field "Test_1"
    And   I click button three points dialyzer
    Then  I click button cancel add new dialyzer

  @test @TestCase_2681
  Scenario: Model and Manufacturer
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I click button Ok in modal error
    And   I open options of user
    Then  I enter into user configuration options
    And   I click button Ok in modal error
    And   I successfully opened the HD Therapy module
    And   I click button dialyzer section
    And   I click button three points dialyzer
    When  I click button New dialyzer
    And   I insert data into the model field "Test_1"
    Then  I select a manufacturer option
    And   I click button three points dialyzer
    And   I click button save new dialyzer


  @test @TestCase_2682
  Scenario: Add Inactive Dialyzer
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
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
