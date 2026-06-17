#enviroment
@Environment_dev
#app_name
@versia_renal
#version
@3.2
#Module
@Search

@Environment_dev @versia_renal @3.2 @Search @regression
Feature: Search - View search

  Background:
    Given I open the Baxter website
    And   I try to login with "login_baxter" credentials
    And   I login successful

  Scenario: Open search
    When  I click search icon
