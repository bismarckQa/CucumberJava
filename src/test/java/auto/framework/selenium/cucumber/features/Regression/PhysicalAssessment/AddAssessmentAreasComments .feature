#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Add Assessment areas and Comments


  @test @TestCase_3586
  Scenario: Successful added Observations in Physical Assessment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    Then  I click button option "New"
    And   I insert data into observations Assessment area "Qa Test"
    When  I click button arrow up
    And   I click button three points Assessment Area
    Then  I click button option "Save"

  @test @TestCase_3589
  Scenario: Cancelling an added Observations in Physical Assessment
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    Then  I click button option "New"
    And   I insert data into observations Assessment area "Qa Test"
    When  I click button arrow up
    And   I click button three points Assessment Area
    And   I click button option "Cancel"

  @test @TestCase_3590
  Scenario: Add new Observation in Physical Assessment with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    And   I click button three points Assessment Area
    Then  I click button option "New"
    And   I insert data into input date: ""
    And   I insert data into observations Assessment area "Qa Test"
    When  I click button arrow up
    And   I click button three points Assessment Area
    Then  I click button option "Cancel"
