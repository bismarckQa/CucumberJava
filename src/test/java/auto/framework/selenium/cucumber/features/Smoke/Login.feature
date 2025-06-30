Feature: Login Feature


  @test @smoke @login @Happy_path
  Scenario: I Login with the correct user
    Given I open the Baxter website
    When  I try to login with "login_baxter" credentials
    Then  I login successful



  @test @smoke @login @Unhappy_path
  Scenario: I Login with wrong user
    Given I open the Baxter website
    When  I try to login with now "login_baxter_false" credentials
    Then  Wrong credentials message appear