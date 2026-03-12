#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@Demographics
Feature: Modify lab tests
  @test @smoke @test_Case_3612
  Scenario:  Cancelling edited lab test result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I open options of user
    And   I enter into user configuration options
    Then  I verify the New patient x_title is visible with scroll
    And   I click the three points menu of New patient
    And   I click "New" option in the three points menu of New patient
    And   I enter the name "TestName"
    And   I enter the last name "TestLastName"
    And   I enter the surname 2 "TestSurname2"
    And   I enter the nombre de uso "TestNombreDeUso"
    And   I enter the date of birth "01/01/1990"
    And   I select the gender
    And   I select the blood group
    And   I select the referred by
    And   I enter the ID patient "12345"
    And   I enter the date of 1st dialysis "01/01/2020"
    And   I select the primary center
    And   I enter the date of admission "01/01/2024"
    And   I select the patient group
    And   I select the clinical status
    And   I select the method
    And   I select the submethod
    And   I select the location
    And   I select the attendance
    And   I select the monitor brand
    And   I enter the start date "01/01/2024"
    And   I select the modalidad referred by
    And   I select the reason for start



