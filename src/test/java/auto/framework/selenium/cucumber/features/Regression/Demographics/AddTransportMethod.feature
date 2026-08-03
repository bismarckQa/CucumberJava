#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Add Transport Method

Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly



  @test @test_Case_3013 @ALM_VR_TC_72
  Scenario: Cancelling an added transport method
    When  I click the New button at position 8
    And   I select a provided by in the transport method row
    And   I enter the telephone in the transport method row "600000000"
    Then  I cancel the transport method row

  @test @test_Case_3014 @ALM_VR_TC_468
  Scenario: Adding a transport method with empty fields
    When  I click the New button at position 8
    And   I enter the telephone in the transport method row "123456789"
    Then  I save the transport method row
    And   I cancel the transport method row


  @test @test_Case_3015 @ALM_VR_TC_469
  Scenario: Successful added transport method
    When  I click the New button at position 8
    And   I select a provided by in the transport method row
    And   I enter the telephone in the transport method row "123456789"
    And   I enter the contact in the transport method row "QA Contact"
    And   I enter the observations in the transport method row "QA Test"
    Then  I save the transport method row
    And   I verify the action was performed successfully