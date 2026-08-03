#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: View Exploration Data section


  @test @TestCase_3654 @ALM_VR_TC_664
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