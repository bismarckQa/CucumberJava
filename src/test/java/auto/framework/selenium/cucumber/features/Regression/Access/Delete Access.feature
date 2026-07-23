#enviroment
@Environment_Dev
#app_namme
@Versia_Renal
#version
@2024R1a
#Module
@HDAccess 

Feature: Delete Access

  Background:
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        Then  I check the module Accesses appear correctly


    @test @TestCase_3928 @ALM_VR_TC_29
    Scenario: Cancel a vascular access deletion
        When   I open the menu and delete access
        When  The confirmation windows open, I write password of "login_baxter" credentials and "Test"
        And   I Cancel delete access and accept information window
        Then  The access not deleted

    @test @TestCase_3549 @ALM_VR_TC_357
    Scenario: Delete a vascular access
        When   I open the menu and delete access
        When  The confirmation windows open, I write password of "login_baxter" credentials and "Test"
        And   I accept delete access and accept information window
        Then  The access is deleted