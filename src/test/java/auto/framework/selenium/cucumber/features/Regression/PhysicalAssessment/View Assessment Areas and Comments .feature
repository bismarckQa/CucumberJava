#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: View Assessment Areas and Comments 


  @test @TestCase_3652 @ALM_VR_TC_665
  Scenario: Enter in Assessment area and Observations window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    Then  I click in Assessment area and comments
    And   I see observations window with all available information
