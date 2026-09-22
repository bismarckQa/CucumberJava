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
    When  I select the patient "BisRic 1, ELVIRA"
    When  I open HD Prescription module
    And   I check the module HD Prescription appear correctly


 @test @Test_case_4653 @ALM_VR_TC_539
  Scenario:Cancelling an edited special order
    When  I click edit special order in HD Prescription
    And   I enter special order description "QA edit test" in HD Prescription
    And   I click button "Cancel" in special order

 @test @Test_case_4654 @ALM_VR_TC_540
  Scenario:Successful edited special order
    When  I click edit special order in HD Prescription
    And   I enter special order description "QA edit test" in HD Prescription
    And   I click button "Save" in special order

 @test @Test_case_4655 @ALM_VR_TC_541
  Scenario:Edit special order with empty required fields
    When  I click edit special order in HD Prescription
    And   I clear special order description in HD Prescription
    Then  I verify save special order button is not displayed in HD Prescription
    And   I click button "Cancel" in special order

@test @Test_case_4658 @ALM_VR_TC_542
  Scenario:Edit special order with an earlier end date than start date
    When  I click edit special order in HD Prescription
    And   I enter special order end date "01/01/2020" in HD Prescription
    And   I click button "Save" in special order
    Then  I click button OK modal error
    And   I click button "Cancel" in special order

@test @Test_case_4662 @ALM_VR_TC_543
  Scenario: Edit special order with an later start date than end date
    When  I click edit special order in HD Prescription
    And   I enter special order start date "12/31/2030" in HD Prescription
    And   I enter special order end date "01/01/2025" in HD Prescription
    And   I click button "Save" in special order
    Then  I click button OK modal error
    And   I click button "Cancel" in special order