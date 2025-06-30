
Feature: View Access

    @test @regression
    Scenario: New Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I click location accesses
        When  I add all data correctly for add the Access: Access type "Catéter percutáneo femoral", Location "Muñeca izquierda", Date of first use "06102024", comment "QATestAccess", implantation date "06102024", date of removal "06212024" and removal center "Sistemes Renals"
        Then  I save the Access Data Implantation


    @test @regression
    Scenario: Implantation for HD Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I check that the main manu showed with Implantation, Evaluation and Complications
        Then  I check that the sections Location, Access Data and Swab Showed

    @test @regression
    Scenario: Evaluation for HD Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I check that the main manu showed with Implantation, Evaluation and Complications
        When  I select the Evaluation in main menu
        Then  I check that the sections Location, Follow-Up, Evaluation and Historic Photographs of Accesses


    @test @regression
    Scenario: Complications
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I check that the main manu showed with Implantation, Evaluation and Complications
        When  I select the Complications in main menu
        Then  I check that the sections Location, Complications, Interventions, Observations, Medications and Hospitalisations

    @test @regression
    Scenario: Delete a vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I open the menu and delete access
        When  The confirmation windows open, I write password of "login_baxter" credentials and "Test"
        And   I accept delete access and accept information window
        Then  The access is deleted














