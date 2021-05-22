Feature: Application Login
  @SmokeTest
  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User login into application with "jin" and password "1234"
    Then  : Home page is populated
    And   : Cards are displayed "true"
