
Feature: Ability to create pre and post treatment assessment of access

    @test @regression
    Scenario: Add pre-treatment in Evaluation section of Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I click location accesses
        When  I add all data correctly for add the Access: Access type "Catéter percutáneo femoral", Location "Muñeca izquierda", Date of first use "06062024", comment "QATestAccess", implantation date "01062024", date of removal "12212024" and removal center "Sistemes Renals"
        And   I save the Access Data Implantation
        And   I select the Evaluation in main menu
        And   I click three dots and select Pre-Assessment
        When  I add all data correctly for add the Pre-Treatment: Date "06072024", Text Field "TestQA", mark check box and mark select boxes
        And   I save Pre-Assessment
        And   I click three dots and select Pre-Assessment
        When  I add all data correctly for add the Pre-Treatment: Date "06072024", Text Field "TestQA2" and mark select boxes
        And   I save Pre-Assessment
        Then  I check the alert and accept
        And   I cancel Pre-Assessment
        Then  I check the second Pre-Assessment is canceled


    @test @regression
    Scenario: Modify individual pre-treatment to the vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        When  I click three dots and edit Pre-Assessment
        And   I add all data correctly for add the Pre-Treatment: Text Field "TestQA2" and unmark select boxes
        And   I save Pre-Assessment
        Then  I check Pre-Assessment is edited
        When  I click three dots and edit Pre-Assessment
        And   I cancel Pre-Assessment
        Then  I check Pre-Assessment not edited

    @test @regression
    Scenario: Global edit mode for pre-treatment to the vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        And   I click three dots and select Pre-Assessment
        When  I add all data correctly for add the Pre-Treatment: Date "11072024", Text Field "TestQA", mark check box and mark select boxes
        And   I save Pre-Assessment
        When  I click three dots and select Edit all
        And   I add all data correctly for add the Pre-Treatment: Text Field "TestQAEdit1" and unmark select boxes
        And   I change the Pre-Assessment page
        And   I add all data correctly for add the Pre-Treatment: Text Field "TestQAEdit2"
        When  I click save all Pre-Assessments
        And   I check the changes is applied
        When  I click three dots and select Edit all
        And   I click three dots and select cancel
        Then  I check the changes not applied

    @test @regression
    Scenario: Remove a pre-treatment to the vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        When  I click three dots and delete Pre-Assessments
        And   I check the alert box appear and click yes
        When  I click three dots and delete Pre-Assessments
        And   I check the alert box appear and click No
        Then  I check the last one not deleted


    @test @regression
    Scenario: Add post-treatment in Evaluation section of Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        And   I click three dots and select Post-Assessment
        When  I add all data correctly for add the Post-Treatment: Date "06072024", Text Area "PruebaQA" Text Field "TestQA" and number "1"
        And   I save Post-Assessment
        And   I click three dots and select Post-Assessment
        When  I add all data correctly for add the Post-Treatment: Date "06072024", Text Area "PruebaQA1" Text Field "TestQA1" and number "2"
        And   I save Post-Assessment
        Then  I check the alert and accept
        And   I cancel Post-Assessment
        Then  I check the second Post-Assessment is canceled



    @test @regression
    Scenario: Modify individual post-treatment to the vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        And   I select the Post-Treatment tab
        When  I click three dots and edit Post-Assessment
        And   I add all data correctly for add the Post-Treatment: Text Area "PruebaQAEdit" Text Field "TestQAEdit", number "11" and mark checkbox
        And   I save Post-Assessment
        And   I check the Post-Treatment was edited correctly
        When  I click three dots and edit Post-Assessment
        And   I cancel Post-Assessment
        Then  I check the Post-Treatment wasn´t edited correctly

    @test @regression
    Scenario: Global edit mode for post-treatment to the vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        And   I click three dots and select Post-Assessment
        When  I add all data correctly for add the Post-Treatment: Date "07072024", Text Area "PruebaQA1" Text Field "TestQA1" and number "2"
        And   I save Post-Assessment
        When  I click three dots and select Edit all
        And   I add all data correctly for add the Post-Treatment: Text Field "TestQAEdit1" and mark select boxes
        And   I change the Post-Assessment page
        And   I add all data correctly for add the Post-Treatment: Text Field "TestQAEdit2" and mark select boxes
        When  I click save all Post-Assessments
        And   I check the changes is applied
        When  I click three dots and select Edit all
        And   I click three dots and select cancel
        Then  I check the changes not applied

    @test @regression
    Scenario: Remove a post-treatment to the vascular access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        And   I select the Evaluation in main menu
        When  I click three dots and delete Post-Assessments
        And   I check the alert box appear and click yes
        When  I click three dots and delete Post-Assessments
        And   I check the alert box appear and click No
        Then  I check the last one not deleted

    @test @regression
    Scenario: View pre-treatment in Evaluation section of Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        When  I select the Evaluation in main menu
        Then  I check Pre-Assessment is appear


    @test @regression
    Scenario: View post-treatment in Evaluation section of Access
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
        When  I select the Evaluation in main menu
        Then  I check Post-Assessment is appear


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




















