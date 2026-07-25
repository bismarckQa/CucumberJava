#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess

Feature: Edit All on a PD Access Implantation

Background:
 Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini Baggio, Pasquale"
    And   I open Accesses module
    And   I click button implantation section


  @test @TestCase_4373 @ALM_VR_TC_37
  Scenario: Edit all of an PD Access Implantation
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    And   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "10102025"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button cancel

  @test @TestCase_4375 @ALM_VR_TC_388
  Scenario: Cancel edited PD Access Implantation
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    And   I select Date of first use "10102025"
    And   I insert data into text area comments "QATestAccess Modified"
    When  I select implantation date "12102025"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button cancel

  @test @TestCase_4374 @ALM_VR_TC_
  Scenario: Save edited PD Access Implantation
    And   I check the state of access is active with colour green
    Then  I click button three points Access
    And   I click in edit all
    And   I select Date of first use "10102025"
    When  I insert data into text area comments "QATestAccess Modified"
    And   I click button arrow up
    And   I click button three points Access
    Then  I click button save
