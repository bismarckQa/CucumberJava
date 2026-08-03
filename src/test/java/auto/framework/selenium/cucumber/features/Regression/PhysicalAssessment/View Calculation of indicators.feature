#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: View Calculation of indicators

  @test @TestCase_3653 @ALM_VR_TC_145
  Scenario: Enter in Indicators window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    Then  I See Indicator section all available