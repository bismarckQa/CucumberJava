#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: View Laboratory Request

@test @smoke @test_Case_3780
Scenario: Enter in laboratory request window
Given I open the Baxter website
And   I try to login with "login_baxter" credentials
And   I login successful
When  I select the patient "Foianini, Pasquale - 00250"
And   I open Lab Tests module
And   I check the module Lab Tests appear correctly
When  I click button laboratory request section
And   I verify the information saved by id request "696978"
