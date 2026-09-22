#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDTreatment
Feature: Add Modify PRE-POST session (Session)

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Treatment module
    Then  I check the module HD Treatment appear correctly
    When  I click Treatment history in HD Treatment
    And   I select treatment history date "08/13/2026" in HD Treatment
    And   I open "Session" section in HD Treatment

  @test @TestCase_4751 @ALM_VR_TC_773
  Scenario: Successful added modified PRE-POST session
    When  I enter weight pre "70.5" in HD Treatment session
    And   I enter systolic BP pre "125" in HD Treatment session
    And   I enter diastolic BP pre "78" in HD Treatment session
    And   I enter pulse pre "72" in HD Treatment session
    And   I enter temperature pre "36.5" in HD Treatment session
    And   I enter glycemia pre "95" in HD Treatment session
    And   I enter programmed loss pre "2500" in HD Treatment session
    And   I enter hematocrit pre "38" in HD Treatment session
    And   I enter BCM-OH pre "1.2" in HD Treatment session
    And   I enter fluid intake post "500" in HD Treatment session
    And   I enter weight post "68.2" in HD Treatment session
    And   I enter systolic BP post "118" in HD Treatment session
    And   I enter diastolic BP post "72" in HD Treatment session
    And   I enter pulse post "68" in HD Treatment session
    And   I enter temperature post "36.3" in HD Treatment session
    And   I enter glycemia post "88" in HD Treatment session
    And   I enter real loss post "2300" in HD Treatment session
    And   I enter hematocrit post "40" in HD Treatment session
    And   I enter blood remains post "50" in HD Treatment session
    And   I click button three points HD Treatment
    And   I click button "Save" in HD Treatment
    Then  I verify HD Treatment form is displayed

  @test @TestCase_4752 @ALM_VR_TC_774
  Scenario: Cancelling an added modified PRE-POST session
    When  I enter weight pre "99" in HD Treatment session
    And   I enter systolic BP pre "999" in HD Treatment session
    And   I enter diastolic BP pre "999" in HD Treatment session
    And   I enter pulse pre "999" in HD Treatment session
    And   I enter temperature pre "99.9" in HD Treatment session
    And   I enter glycemia pre "999" in HD Treatment session
    And   I enter programmed loss pre "9.9" in HD Treatment session
    And   I enter hematocrit pre "99" in HD Treatment session
    And   I enter BCM-OH pre "9.9" in HD Treatment session
    And   I enter fluid intake post "999" in HD Treatment session
    And   I enter weight post "99" in HD Treatment session
    And   I enter systolic BP post "999" in HD Treatment session
    And   I enter diastolic BP post "999" in HD Treatment session
    And   I enter pulse post "999" in HD Treatment session
    And   I enter temperature post "99.9" in HD Treatment session
    And   I enter glycemia post "999" in HD Treatment session
    And   I enter real loss post "9.9" in HD Treatment session
    And   I enter hematocrit post "99" in HD Treatment session
    And   I enter blood remains post "9.9" in HD Treatment session
    And   I click button three points HD Treatment
    And   I click button "Cancel" in HD Treatment
    Then  I verify HD Treatment form is displayed
