Feature: Application Login
  #We cannot use background keyword and Hooks together it will make soo much confussions
  #beacuse if it is common thing for each and every scenario we can  use Background keyword
  #but here we have hybrids apps  like mobile, smoke,web so in this case we cannot use this
  #if we have one common portal than use Background keyword.
  #But here we have different things so we will use hooks, it means you are basically telling
  # that for every scenario I want to write my own prerequisite rather than depending upon Background


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

  @Before
  @MobileTest
  Scenario: Home page default Login
    Given : User is on NetBanking landing page
    When  : User sign up with following details
      | swati | abed | swati@gmail.com | India | 8364238921 |
    Then  : Home page is populated
    And   : Cards are displayed "false"

  @MobileTest
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


