#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Add laboratory request (Laboratory request tab)


Background:
Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    
  @test @test_Case_3744 @ALM_VR_TC_125
  Scenario: Add laboratory request with empty required fields
    When  I click button laboratory request section
    And   I click button three points laboratory request section
    When  I click button "NEW" option in Laboratory request
    And   I insert data into input observations laboratory request "QA Test"
    And   I click button "Save" option in iframe laboratory request
    And   I click button "Cancel" option in iframe laboratory request

  @test @test_Case_3749 @ALM_VR_TC_569
  Scenario: Successful add laboratory request
    When  I click button laboratory request section
    And   I click button three points laboratory request section
    When  I click button "NEW" option in Laboratory request
    And   I insert data into input observations laboratory request "QA Test"
    And   I select check box adecuacion in laboratory request
    And   I click button "Save" option in iframe laboratory request
    Then  I click button arrow up


  @test @test_Case_3750 @ALM_VR_TC_570
  Scenario: Cancelling added laboratory request
    When  I click button laboratory request section
    And   I click button three points laboratory request section
    When  I click button "NEW" option in Laboratory request
    And   I insert data into input observations laboratory request "QA Test"
    And   I select check box adecuacion in laboratory request
    And   I click button "Cancel" option in iframe laboratory request




