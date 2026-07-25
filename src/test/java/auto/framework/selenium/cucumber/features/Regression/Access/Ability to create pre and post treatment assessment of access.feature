#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Access
Feature: Ability to create pre and post treatment assessment of access

  Background:
        Given I open the Baxter website
        And   I try to login with "login_baxter" credentials
        And   I login successful
        When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
        And   I open Accesses module
    Then  I check the module Accesses appear correctly

    @test  @ALM_VR_TC_19
    Scenario: Add pre-treatment in Evaluation section of Access
        When   I click location accesses
        And   I select access type "Catéter percutáneo femoral" in access data
        And   I select access location "Muñeca izquierda" in access data
        And   I enter first use date "06062024" in access data
        And   I enter access comment "QATestAccess"
        And   I enter implantation date "01062024" in access data
        And   I enter removal date "12212024" in access data
        And   I select removal center "Sistemes Renals" in access data
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

    @test @ALM_VR_TC_318
    Scenario: Modify individual pre-treatment to the vascular access
        When   I select the Evaluation in main menu
        When  I click three dots and edit Pre-Assessment
        And   I add all data correctly for add the Pre-Treatment: Text Field "TestQA2" and unmark select boxes
        And   I save Pre-Assessment
        Then  I check Pre-Assessment is edited
        When  I click three dots and edit Pre-Assessment
        And   I cancel Pre-Assessment
        Then  I check Pre-Assessment not edited

    @test  @ALM_VR_TC_319
    Scenario: Global edit mode for pre-treatment to the vascular access
        When   I select the Evaluation in main menu
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

    @test @ALM_VR_TC_320
    Scenario: Remove a pre-treatment to the vascular access
        When   I select the Evaluation in main menu
        When  I click three dots and delete Pre-Assessments
        And   I check the alert box appear and click yes
        When  I click three dots and delete Pre-Assessments
        And   I check the alert box appear and click No
        Then  I check the last one not deleted

    @test @ALM_VR_TC_321
    Scenario: Add post-treatment in Evaluation section of Access
        When   I select the Evaluation in main menu
        And   I click three dots and select Post-Assessment
        When  I add all data correctly for add the Post-Treatment: Date "06072024", Text Area "PruebaQA" Text Field "TestQA" and number "1"
        And   I save Post-Assessment
        And   I click three dots and select Post-Assessment
        When  I add all data correctly for add the Post-Treatment: Date "06072024", Text Area "PruebaQA1" Text Field "TestQA1" and number "2"
        And   I save Post-Assessment
        Then  I check the alert and accept
        And   I cancel Post-Assessment
        Then  I check the second Post-Assessment is canceled

    @test @ALM_VR_TC_322
    Scenario: Modify individual post-treatment to the vascular access
        When   I select the Evaluation in main menu
        And   I select the Post-Treatment tab
        When  I click three dots and edit Post-Assessment
        And   I add all data correctly for add the Post-Treatment: Text Area "PruebaQAEdit" Text Field "TestQAEdit", number "11" and mark checkbox
        And   I save Post-Assessment
        And   I check the Post-Treatment was edited correctly
        When  I click three dots and edit Post-Assessment
        And   I cancel Post-Assessment
  
    @test @ALM_VR_TC_323
    Scenario: Global edit mode for post-treatment to the vascular access
        When   I select the Evaluation in main menu
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

    @test @ALM_VR_TC_324
    Scenario: Remove a post-treatment to the vascular access
        When   I select the Evaluation in main menu
        When  I click three dots and delete Post-Assessments
        And   I check the alert box appear and click yes
        When  I click three dots and delete Post-Assessments
        And   I check the alert box appear and click No
        Then  I check the last one not deleted

    @test @ALM_VR_TC_325
    Scenario: View pre-treatment in Evaluation section of Access
        When  I select the Evaluation in main menu
        Then  I check Pre-Assessment is appear

    @test @ALM_VR_TC_326
    Scenario: View post-treatment in Evaluation section of Access
        When  I select the Evaluation in main menu
        Then  I check Post-Assessment is appear

    @test @ALM_VR_TC_327
    Scenario: Delete a vascular access
        When   I open the menu and delete access
        When  The confirmation windows open, I write password of "login_baxter" credentials and "Test"
        And   I accept delete access and accept information window
        Then  The access is deleted