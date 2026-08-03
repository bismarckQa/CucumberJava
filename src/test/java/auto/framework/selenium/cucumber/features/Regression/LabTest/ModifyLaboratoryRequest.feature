#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Modify laboratory request

Background:
  Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly


  @test @test_Case_3765 @ALM_VR_TC_131
  Scenario: Successful edited laboratory request
    When  I click button laboratory request section
    And   I click button edit laboratory request
    And   I insert data into input extraction date in edit laboratory request "3/4/2026 12:00 AM"
    And   I insert data into input observations edit laboratory request "QA Test Modified"
    Then  I click button save edit laboratory request
    And   I click button arrow up

  @test @test_Case_3766 @ALM_VR_TC_583
  Scenario: Cancelling edited laboratory request
    When  I click button laboratory request section
    And   I click button edit laboratory request
    And   I insert data into input extraction date in edit laboratory request "3/4/2026 12:00 AM"
    And   I insert data into input observations edit laboratory request "QA Test Modified"
    Then  I click button cancel edit laboratory request
    And   I click button arrow up






