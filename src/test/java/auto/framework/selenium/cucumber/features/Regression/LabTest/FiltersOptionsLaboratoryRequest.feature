#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Filters options (Laboratory Request tab) 

Background:

  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly

  @test @test_Case_3776 @ALM_VR_TC_129
  Scenario: Filter options view
    When  I click button laboratory request section
    And   I select option in profiles in laboratory request
    Then  I click button search laboratory request

  @test @test_Case_3777 @ALM_VR_TC_577
  Scenario: Show none laboratory request results
    When  I click button laboratory request section
    And   I check a checkbox Show only unsent requests
    And   I select option in profiles in laboratory request
    Then  I click button search laboratory request








