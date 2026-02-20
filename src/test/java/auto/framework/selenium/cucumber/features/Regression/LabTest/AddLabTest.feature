#enviroment
@Environment_dev
#app_namme
@versia_renal
#version
@3.2
#Module
@LabTest
Feature: Add lab tests

  @test @smoke @test_Case_3565
  Scenario:  Successful add laboratory result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    When  I click button three points lab test section
    And   I click button "NEW" option
    And   I insert data into input date request "2/18/2026"
    And   I select profile option in lab test
    Then  I insert data into input date sample "2/18/2026"
    And   I insert data into input result test "10"
    Then  I click button "Save" option
    And   I select option action in modal "Yes"
    And   I click button arrow up

  @test @smoke @test_Case_3569
  Scenario:  Cancelling added laboratory result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    When  I click button three points lab test section
    And   I click button "NEW" option
    And   I insert data into input date request "2/15/2026"
    And   I select profile option in lab test
    Then  I insert data into input date sample "2/16/2026"
    And   I select test option in lab tests
    And   I click button "Save" option
    And   I click button OK modal error
    Then  I click button "Cancel" option
    And   I click button arrow up

  @test @smoke @test_Case_3570
  Scenario:  Add laboratory result with empty required fields
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    When  I click button three points lab test section
    And   I click button "NEW" option
    And   I insert data into input date request ""
    Then  I insert data into input date sample "2/16/2026"
    And   I click button "Save" option
    And   I click button OK modal error
    Then  I click button "Cancel" option
    And   I click button arrow up

  @test @smoke @test_Case_3572
  Scenario:  Remove added laboratory result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    When  I click button three points lab test section
    And   I click button "NEW" option
    And   I insert data into input date request "2/15/2026"
    And   I select profile option in lab test
    Then  I insert data into input date sample "2/16/2026"
    And   I select test option in lab tests
    And   I click on remove button on an existing result
    Then  I click button "Cancel" option
    And   I click button arrow up

  @test @smoke @test_Case_3578
  Scenario:  Add profiles of new result
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful
    When  I select the patient "Foianini, Pasquale - 00250"
    And   I open Lab Tests module
    And   I check the module Lab Tests appear correctly
    And   I click button lab test section
    When  I click button three points lab test section
    And   I click button "NEW" option
    And   I insert data into input date request "2/18/2026"
    And   I select profile option in lab test
    Then  I insert data into input date sample "2/18/2026"
    And   I insert data into input result test "1.0"
    Then  I click button "Save" option
    And   I select option action in modal "Yes"
    And   I click button arrow up
