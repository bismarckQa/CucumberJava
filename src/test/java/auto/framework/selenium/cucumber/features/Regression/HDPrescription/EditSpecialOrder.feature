#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@HD_Prescription


Feature:Edit Especial Order


Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Ape1_1838 Ape2_1838, Nom_1838 - 1838"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly


 @test @Test_case_4653 @ALM_VR_TC_539
  Scenario:Cancelling an edited special order

 @test @Test_case_4654 @ALM_VR_TC_540
  Scenario:Successful edited special order

 @test @Test_case_4655 @ALM_VR_TC_541
  Scenario:Edit special order with empty required fields

@test @Test_case_4658 @ALM_VR_TC_542
  Scenario:Edit special order with an earlier end date than start date

@test @Test_case_4662 @ALM_VR_TC_543
  Scenario: Edit special order with an later start date than end date     