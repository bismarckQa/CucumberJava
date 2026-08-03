#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature:  View Vaccines section


  @test @TestCase_3656 @ALM_VR_TC_663
  Scenario: Enter in vaccines window
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    And   I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    Then  I see vaccines window with all available information