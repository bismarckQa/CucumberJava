#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@PhysicalAssessment

Feature: Modify Vaccines
  @test @TestCase_3633
  Scenario: Cancelling an edit Vaccine
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    When  I click button three points dose
    And   I click button option "Edit"
    And   I insert data into observations vaccines "Vaccines Modified"
    And   I insert data into input second dose "01/27/2026"
    And   I click button three points dose
    Then  I click button cancel


  @test @TestCase_3631
  Scenario: Successful edit Vaccine
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Physical Assessment module
    When  I check the module Physical Assessment appear correctly
    And   I click in vaccines area
    When  I click button three points dose
    And   I click button option "Edit"
    And   I insert data into observations vaccines "Vaccines Modified"
    And   I insert data into input second dose "01/27/2026"
    And   I click button three points dose
    Then  I click button save
