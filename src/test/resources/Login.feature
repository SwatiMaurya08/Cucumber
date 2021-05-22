Feature: Application Login

  Background:
    Given Validate the Browser
    When  Browser is Triggered
    Then  Check if Browser is started

  @RegTest @SmokeTest
  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User login into application with "jin" and password "1234"
    Then  : Home page is populated
    And   : Cards are displayed "true"

  @SmokeTest
  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User login into application with "john" and password "4321"
    Then  : Home page is populated
    And   : Cards are displayed "false"

  @RegTest
  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User sign up with following details
      | swati | abed | swati@gmail.com | India | 8364238921 |
    Then  : Home page is populated
    And   : Cards are displayed "false"

  @RegTest
  Scenario Outline: Home page default Login
    Given : User is on NetBanking landing page
    When  : User login in to application with <username> and <password>
    Then  : Home page is populated
    And   : Cards are displayed "true"

    Examples:
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      | user3    | pass3    |


