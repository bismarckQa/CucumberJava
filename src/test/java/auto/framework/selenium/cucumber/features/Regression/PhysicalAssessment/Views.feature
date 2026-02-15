#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Views Physical Assessment

  @test @TestCase_3653
  Scenario: Enter in Indicators window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    Then  I See Indicator section all available

  @test @TestCase_3655
  Scenario: Enter in Observations window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    Then  I see observations window with all available information


  @test @TestCase_3656
  Scenario: Enter in vaccines window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    Then  I see vaccines window with all available information

  @test @TestCase_3654
  Scenario: Enter in Physical Assessment window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    And   I click in Physical assessment area
    Then  I see Physical assessment window with information about physical exam
    And   I See Indicator section all available

  @test @TestCase_3652
  Scenario: Enter in Assessment area and Observations window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    Then  I click in Assessment area and comments
    And   I see observations window with all available information
