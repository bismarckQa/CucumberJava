#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Add Vaccines

  @test @TestCase_3630
  Scenario: Successful added Vaccine
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    And   I click button three points vaccines
    Then  I click button option "New"
    And   I select option vaccine name
    And   I insert data into observations vaccines "Qa Test"
    And   I click button three points vaccines
    Then  I click button option "Save"

  @test @TestCase_3632
  Scenario: Cancelling an added Vaccine
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    And   I click button three points vaccines
    Then  I click button option "New"
    And   I select option vaccine name
    And   I insert data into observations vaccines "Qa Test"
    And   I click button three points vaccines
    Then  I click button option "Cancel"

  @test @TestCase_3634
  Scenario: Add new Vaccine with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    And   I click button three points vaccines
    Then  I click button option "New"
    And   I insert data into observations vaccines "Qa Test"
    And   I click button three points vaccines
    Then  I click button option "Cancel"

  @test @TestCase_10685
  Scenario: Add dose
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    And   I click button three points dose
    When  I click button option "Add dose"
    And   I insert data into input second dose "01/25/2026"
    And   I click button three points dose
    Then  I click button option "Save"

  @test @TestCase_10686
  Scenario: Cancelling an added dose
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    And   I click button three points dose
    When  I click button option "Add dose"
    And   I click button three points dose
    Then  I click button option "Cancel"
