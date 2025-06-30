#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@PDPrescription
Feature: Create an Initial PD Prescription for a Patient
  @test @smoke
  Scenario:  Delete Exchange
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    And   I Select the Group of patients "Paziente PD"
    When  I select the patient "Test 11, Sharesource - SHS11911"
    And   I open PD Prescription module

