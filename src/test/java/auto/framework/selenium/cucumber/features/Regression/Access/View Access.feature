
Feature: View Access

  Background:
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
    Then  I check the module Accesses appear correctly

    @test @regression @ALM_VR_TC
    Scenario: New Access
        When   I click location accesses
        And   I select access type "Catéter percutáneo femoral" in access data
        And   I select access location "Muñeca izquierda" in access data
        And   I enter first use date "06102024" in access data
        And   I enter access comment "QATestAccess"
        And   I enter implantation date "06102024" in access data
        And   I enter removal date "06212024" in access data
        And   I select removal center "Sistemes Renals" in access data
        Then  I save the Access Data Implantation

    @test @regression @ALM_VR_TC
    Scenario: Implantation for HD Access
        When   I check that the main manu showed with Implantation, Evaluation and Complications
        Then  I check that the sections Location, Access Data and Swab Showed

    @test @regression @ALM_VR_TC
    Scenario: Evaluation for HD Access
        When   I check that the main manu showed with Implantation, Evaluation and Complications
        When  I select the Evaluation in main menu
        Then  I check that the sections Location, Follow-Up, Evaluation and Historic Photographs of Accesses

    @test @regression @ALM_VR_TC
    Scenario: Complications
        When   I check that the main manu showed with Implantation, Evaluation and Complications
        When  I select the Complications in main menu
        Then  I check that the sections Location, Complications, Interventions, Observations, Medications and Hospitalisations

    @test @regression @ALM_VR_TC
    Scenario: Delete a vascular access
        When   I open the menu and delete access
        When  The confirmation windows open, I write password of "login_baxter" credentials and "Test"
        And   I accept delete access and accept information window
        Then  The access is deleted
