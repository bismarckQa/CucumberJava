#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify Transport Method

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I click on the selected patient
    And   I verify that the demographic module opened correctly

  @test @test_Case_3035 @ALM_VR_TC_85
  Scenario: Cancelling edited transport method
    When  I click the edit button of the transport method row
    And   I enter the telephone in the transport method row "999999999"
    Then  I cancel the transport method row

  @test @test_Case_3036 @ALM_VR_TC_496
  Scenario: Fields are empty when editing transport method
    When  I click the edit button of the transport method row
    And   I enter the telephone in the transport method row ""
    Then  I save the transport method row
    And   I cancel the transport method row

  @test @test_Case_3039 @ALM_VR_TC_497
  Scenario: Successful edit means of transport
    When  I click the edit button of the transport method row
    And   I select a provided by in the transport method row
    And   I enter the telephone in the transport method row "600000"
    And   I enter the contact in the transport method row "Contact Modified"
    And   I enter the observations in the transport method row "QA Test Modified"
    Then  I save the transport method row
    And   I verify the action was performed successfully