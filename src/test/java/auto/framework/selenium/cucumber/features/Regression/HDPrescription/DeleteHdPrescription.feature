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
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
  
@test @Test_case_3214 @ALM_VR_TC_106
  Scenario: Cancelling a deleted active HD Prescription
    And   I tried to delete the active description but I canceled

@test @Test_case_3215 @ALM_VR_TC_544
  Scenario: Cancelling a deleted inactive HD Prescription


@test @Test_case_3216 @ALM_VR_TC_545
  Scenario: Delete Active HD Prescription (empty reason or wrong password)


  @test @Test_case_3217 @ALM_VR_TC_546
  Scenario: Delete Active HD Prescription (prescription used in a treatment)
    And   I try to delete the prescription because it already has treatment records associated with it

  @test @Test_case_3218 @ALM_VR_TC_547
  Scenario: Successful delete active HD Prescription
    And   I successfully delete the active prescription
