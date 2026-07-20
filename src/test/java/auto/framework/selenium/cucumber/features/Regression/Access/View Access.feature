
Feature: View Access

  Background:
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        Then  I login successful

    @test @regression @TestCase_3553 @ALM_VR_TC
    Scenario: Implantation for HD Access
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open "Accesses" module
        Then  I check the module Accesses appear correctly
        When  I check that the main manu showed with Implantation, Evaluation and Complications
        Then  I check that the sections Location, Access Data and Swab Showed

    @test @regression @TestCase_3895 @ALM_VR_TC
    Scenario: Implantation for PD Access
        Given I Select the Group of patients "Paciente DP"
        When  I select the patient "Foianini Baggio, Pasquale"
        And   I open "Accesses" module
        Then  I check the module Accesses appear correctly
        When  I check that the main manu showed with Implantation, Evaluation and Complications
        Then  I check that the sections Location, Access Data and Swab Showed

    @test @regression @TestCase_3554 @ALM_VR_TC
    Scenario: Evaluation for HD Access
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open "Accesses" module
        Then  I check the module Accesses appear correctly
        When  I select the Evaluation in main menu
        Then  I check that the sections Location, Follow-Up, Evaluation and Historic Photographs of Accesses

    @test @regression @TestCase_4458 @ALM_VR_TC
    Scenario: Evaluation for PD Access
        Given I Select the Group of patients "Paciente DP"
        When  I select the patient "Foianini Baggio, Pasquale"
        And   I open "Accesses" module
        Then  I check the module Accesses appear correctly
        When  I select the Evaluation in main menu
        Then  I check that the sections Location, Follow-Up, Evaluation and Historic Photographs of Accesses

    @test @regression @TestCase_3555 @ALM_VR_TC
    Scenario: Complications
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open "Accesses" module
        Then  I check the module Accesses appear correctly
        When  I select the Complications in main menu
        Then  I check that the sections Location, Complications, Interventions, Observations, Medications and Hospitalisations

    @test @regression @TestCase_3896 @ALM_VR_TC
    Scenario: Zoom the Vascular Access Location
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open "Accesses" module
        Then  I check the module Accesses appear correctly
        When  I click the removed vascular access in location
