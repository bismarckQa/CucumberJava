#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription


Feature: View + Add HD Prescription


@test @Test_case_3195 @ALM_VR_TC_108
Scenario:View+Add (Standard therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3196 @ALM_VR_TC_554
Scenario:Add + View (Standard therapy hemocontrol fields)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "HDx" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription


@test @Test_case_3199 @ALM_VR_TC_555
Scenario:Add+View (AFBK constant K therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "AFBK K constant" in HD Prescription
    And   I enter perfusion volume "500" in HD Prescription
    And   I enter K constant "3.5" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3200 @ALM_VR_TC_556
Scenario:Add+View (AFBK K profile therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "AFBK profile of K" in HD Prescription
    And   I enter perfusion volume "500" in HD Prescription
    And   I enter K input "4.0" in HD Prescription
    And   I enter K output "3.0" in HD Prescription
    And   I enter K equivalent "3.5" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3201 @ALM_VR_TC_557
Scenario:Add+View (HDF therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I enter infusion volume "500" in HD Prescription
    And   I select dilution "Post" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3202 @ALM_VR_TC_558
Scenario:Add+View (HDFOL therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FOLHD" in HD Prescription
    And   I enter infusion volume "500" in HD Prescription
    And   I select dilution "Pre" in HD Prescription
    And   I enter PTM "150" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3203 @ALM_VR_TC_559
Scenario:Add+View (Dry UF therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "UF dry" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3204 @ALM_VR_TC_560
Scenario:Add+View (Unip1B therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "Unip one B" in HD Prescription
    And   I enter needle volume "0.5" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3205 @ALM_VR_TC_561
Scenario:Add+View (Unip2B therapy)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "Unip two B" in HD Prescription
    And   I enter needle volume "0.5" in HD Prescription
    And   I enter AV pump ratio "1.2" in HD Prescription
    And   I enter tidal "50" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3206 @ALM_VR_TC_562
Scenario:Add+View (Anticoagulation Epoprostenol)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I select anticoagulant type "Epoprostenol" in HD Prescription
    And   I enter initial bolus "20" in HD Prescription
    And   I enter continuous infusion "5" in HD Prescription
    And   I enter disconnection time "10" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription


@test @Test_case_3207 @ALM_VR_TC_563
Scenario:Add+View (Anticoagulation Low molecular weight heparin)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I select anticoagulant type "Heparina bajo peso molecular" in HD Prescription
    And   I enter initial bolus "50" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3208 @ALM_VR_TC_564
Scenario:Add+View (Anticoagulation Sodium heparin)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I select anticoagulant type "Heparina sódica" in HD Prescription
    And   I enter initial bolus "30" in HD Prescription
    And   I enter continuous infusion "10" in HD Prescription
    And   I enter disconnection time "15" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3209 @ALM_VR_TC_565
Scenario:Add+View (Anticoagulation Serum wash)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I select anticoagulant type "Lavados con suero" in HD Prescription
    And   I enter initial bolus "100" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription

@test @Test_case_3210 @ALM_VR_TC_566
Scenario:Add+View (Without anticoagulation)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I select anticoagulant type "Sin anticoagulación" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription



  @test @Test_case_3211 @ALM_VR_TC_567
  Scenario: Add+View (Accesses Complications)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open Accesses module
    Then  I check the module Accesses appear correctly
    When  I select the Complications in main menu
    And   I click button three points complications
    And   I click button "New complication"
    Then  I select Type of problem complication
    And   I click button three points complications
    And   I click button save
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription
    Then  I verify see complication link is displayed in HD Prescription
    When  I click see complication link in HD Prescription
    Then  I check the module Accesses appear correctly

  @test @Test_case_3212 @ALM_VR_TC_568
  Scenario: Add+View (Infections)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    Then  I login successful
    When  I select the patient "BisRic 1, ELVIRA"
    And   I open HD Prescription module
    And   I check the module HD Prescription appear correctly
    When  I click new prescription in HD Prescription
    And   I select monitor "AK98" in HD Prescription
    And   I select type of treatment "FHD" in HD Prescription
    And   I enter maximum UF "2500" in HD Prescription
    And   I enter maximum UF rate "1000" in HD Prescription
    And   I enter blood flow rate "300" in HD Prescription
    And   I click button arrow up
    And   I click button three points HD Prescription
    And   I click button "Save" in HD Prescription
    Then  I verify other infections link is displayed in HD Prescription
    When  I click other infections link in HD Prescription
    Then  I check the module Infections appear correctly
  