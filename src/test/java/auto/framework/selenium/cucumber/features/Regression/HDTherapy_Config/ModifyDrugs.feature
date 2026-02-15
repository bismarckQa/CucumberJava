#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTherapy

Feature: Modify Drugs

  @test @TestCase_17211
  Scenario: Cancel modify
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    When  I click button drugs section
    And   I looking for the new drug created with the name: "Test_1"
    When  I click button edit drugs
    And   I insert data into the name drugs types field "Test_Modified"
    And   I insert data into the description drugs types field "Modified"
    Then  I click button cancel edit drug types


  @test @TestCase_17212
  Scenario: Modify successfully
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    When  I click button drugs section
    And   I looking for the new drug created with the name: "Test_1"
    When  I click button edit drugs
    And   I insert data into the name drugs types field "Test_Modified"
    And   I insert data into the description drugs types field "drug Modified"
    Then  I click button save edit drug types
    And   I looking for the new drug created with the name: "Test_Modified"

  @test @TestCase_17213
  Scenario: Modify to duplicate
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I open options of user
    Then  I enter into user configuration options
    And   I successfully opened the HD Therapy module
    When  I click button drugs section
    And   I looking for the new drug created with the name: "Test_Modified"
    When  I click button edit drugs
    And   I insert data into the name drugs types field "Heparina 2"
    And   I insert data into the description drugs types field "drug Modified"
    Then  I click button save edit drug types
    And   I click button OK  modal error
