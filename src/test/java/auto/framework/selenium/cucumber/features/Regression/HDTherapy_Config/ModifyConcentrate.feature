#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Modify Concentrate
  @test @TestCase_2698
  Scenario: full Data
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button concentrates section
    And   I looking for the concentrate with the name: "Test case 1"
    When  I click button three points concentrates
    And   I click button edit concentrates
    And   I insert data into the name concentrates field "Test case 1 Modified"
    Then  I select the type of concentrates option
    And   I insert data into the input end sodium "141.0"
    And   I insert data into the input end bicarbonate "10.0"
    And   I insert data into the input end calcium "2.5"
    And   I insert data into the input end potassium "2.5"
    And   I insert data into the input end Magnesium "1.5"
    And   I insert data into the input end chloride "109.5"
    And   I insert data into the input end acetate "4.0"
    And   I insert data into the input end dextrose "1.0"
    Then  I insert data into the input sodium bicarbonate "1.0"
    And   I insert data into the input sodium chloride "1.0"
    And   I insert data into the text Area description concentrate "Test full data Modified"
    When  I click button three points concentrates
    And   I click button save new concentrate
    Then  I click button arrow up
    And   I looking for the concentrate with the name: "Test case 1 Modified"

  @test @TestCase_2699
  Scenario: No Name
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button concentrates section
    And   I looking for the concentrate with the name: "Test case 1 Modified"
    When  I click button three points concentrates
    And   I click button edit concentrates
    And   I insert data into the name concentrates field ""
    When  I click button three points concentrates
    And   I click button cancel add new concentrate
    Then  I click button arrow up
    And   I looking for the concentrate with the name: "Test case 1 Modified"

  @test @TestCase_2700
  Scenario: No Type
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button concentrates section
    And   I looking for the concentrate with the name: "Test case 1 Modified"
    When  I click button three points concentrates
    And   I click button edit concentrates
    And   I insert data into the name concentrates field ""
    And   I select the type of concentrates option
    When  I click button three points concentrates
    And   I click button cancel add new concentrate
    Then  I click button arrow up
    And   I looking for the concentrate with the name: "Test case 1 Modified"

  @test @TestCase_2701
  Scenario: Set concentrate to inactive
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button concentrates section
    And   I looking for the concentrate with the name: "Test case 1 Modified"
    When  I click button three points concentrates
    And   I click button edit concentrates
    And   I select or unselect the concentrate checkbox if it is "inactive"
    When  I click button three points concentrates
    And   I click button save new concentrate
    Then  I click button arrow up
    And   I click the checkbox to show all inactive concentrates
    And   I looking for the concentrate with the name: "Test case 1 Modified"

  @test @TestCase_2702
  Scenario: Set inactive concentrate to active
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    And   I click button concentrates section
    And   I click the checkbox to show all inactive concentrates
    And   I looking for the concentrate with the name: "Test case 1 Modified"
    When  I click button three points concentrates
    And   I click button edit concentrates
    And   I select or unselect the concentrate checkbox if it is "active"
    When  I click button three points concentrates
    And   I click button save new concentrate
    Then  I click button arrow up
    And   I click the checkbox to show all inactive concentrates
    And   I looking for the concentrate with the name: "Test case 1 Modified"
