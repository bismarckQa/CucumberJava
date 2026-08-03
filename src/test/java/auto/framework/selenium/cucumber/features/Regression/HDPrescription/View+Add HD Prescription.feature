#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription


Feature: View + Add HD Prescription


@test @Test_case_3595 @ALM_VR_TC_108
Scenario:View+Add (Standard therapy)

@test @Test_case_3196 @ALM_VR_TC_554
Scenario:Add + View (Standard therapy hemocontrol fields)


@test @Test_case_3199 @ALM_VR_TC_555
Scenario:Add+View (AFBK constant K therapy)

@test @Test_case_3200 @ALM_VR_TC_556
Scenario:Add+View (AFBK K profile therapy)

@test @Test_case_3201 @ALM_VR_TC_557
Scenario:Add+View (HDF therapy)

@test @Test_case_3202 @ALM_VR_TC_558
Scenario:Add+View (HDFOL therapy)

@test @Test_case_3203 @ALM_VR_TC_559
Scenario:Add+View (Dry UF therapy)

@test @Test_case_3204 @ALM_VR_TC_560
Scenario:Add+View (Unip1B therapy)

@test @Test_case_3205 @ALM_VR_TC_561
Scenario:Add+View (Unip2B therapy)

@test @Test_case_3206 @ALM_VR_TC_562
Scenario:Add+View (Anticoagulation Epoprostenol)


@test @Test_case_3207 @ALM_VR_TC_563
Scenario:Add+View (Anticoagulation Low molecular weight heparin)

@test @Test_case_3208 @ALM_VR_TC_564
Scenario:Add+View (Anticoagulation Sodium heparin)

@test @Test_case_3209 @ALM_VR_TC_565
Scenario:Add+View (Anticoagulation Serum wash)

@test @Test_case_3210 @ALM_VR_TC_566
Scenario:Add+View (Without anticoagulation)



  @test @Test_case_3211 @ALM_VR_TC_567
  Scenario: Add+View (Accesses Complications)
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    And   I open Accesses module
    And   I click location accesses
    When  I create a new jugular catheter type access: Access Type "Catéter percutáneo yugular", Location "Muñeca izquierda", Comment "QA test"
    Then  I save the Access Data Implantation

  @test @Test_case_3212 @ALM_VR_TC_568
  Scenario: Add+View (Infections)
  