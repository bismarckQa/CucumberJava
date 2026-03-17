#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Filters Options Laboratory Request

  @test @smoke @test_Case_3776
  Scenario: Filter options view
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button laboratory request section
    And   I select option in profiles in laboratory request
    Then  I click button search laboratory request

  @test @smoke @test_Case_3777
  Scenario: Show none laboratory request results
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    When  I click button laboratory request section
    And   I check a checkbox Show only unsent requests
    And   I select option in profiles in laboratory request
    Then  I click button search laboratory request








