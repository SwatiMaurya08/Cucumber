Feature: Application Login
  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User login into application with "jin" and password "1234"
    Then  : Home page is populated
    And   : Cards are displayed "true"

  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User login into application with "john" and password "4321"
    Then  : Home page is populated
    And   : Cards are displayed "false"

  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User sign up with following details
    | swati | abed | swati@gmail.com | India | 8364238921 |
    Then  : Home page is populated
    And   : Cards are displayed "false"

