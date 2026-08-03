#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: View in the Observations field


  @test @TestCase_3655 @ALM_VR_TC_662
  Scenario: Enter in Observations window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    And   I click in Assessment area and comments
    Then  I see observations window with all available information
