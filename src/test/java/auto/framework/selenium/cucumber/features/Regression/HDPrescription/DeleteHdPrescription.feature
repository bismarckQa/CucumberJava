#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription

Feature: Delete HD Prescription

Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
  
@test @Test_case_3214 @ALM_VR_TC_106
  Scenario: Cancelling a deleted active HD Prescription
    When  I click button three points HD Prescription
    And   I click button "Delete" in HD Prescription
    And   I click Cancel in delete prescription modal

@test @Test_case_3215 @ALM_VR_TC_544
  Scenario: Cancelling a deleted inactive HD Prescription
    When  I click prescription history in HD Prescription
    And   I select prescription history date "08/28/2026" in HD Prescription
    And   I click button three points HD Prescription
    And   I click button "Delete" in HD Prescription
    And   I click Cancel in delete prescription modal


@test @Test_case_3216 @ALM_VR_TC_545
  Scenario: Delete Active HD Prescription (empty reason or wrong password)
    When  I click prescription history in HD Prescription
    And   I select prescription history date "08/28/2026" in HD Prescription
    And   I click button three points HD Prescription
    And   I click button "Delete" in HD Prescription
    And   I enter password "wrongpass" in delete prescription modal
    And   I enter reason "QA wrong password test" in delete prescription modal
    And   I click OK in delete prescription modal
    Then  I verify delete prescription error is displayed
    And   I click Cancel in delete prescription modal


  @test @Test_case_3217 @ALM_VR_TC_546
  Scenario: Delete Active HD Prescription (prescription used in a treatment)
    When  I click button three points HD Prescription
    And   I click button "Delete" in HD Prescription
    Then  I click button OK modal error

  @test @Test_case_3218 @ALM_VR_TC_547
  Scenario: Successful delete active HD Prescription
    When  I click prescription history in HD Prescription
    And   I select prescription history date "08/31/2026" in HD Prescription
    And   I click button three points HD Prescription
    And   I click button "Delete" in HD Prescription
    And   I enter password "renal2" in delete prescription modal
    And   I enter reason "QA delete test" in delete prescription modal
    And   I click OK in delete prescription modal
