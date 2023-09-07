Feature: feature to test login functionality

  @smoketest_Login
  Scenario Outline: Check login is successful with valid credentials
    Given the user is on login page
    When the user enters the valid <username> and <password>
    And click on login button
    Then the user navigated to home page

    Examples: 
      | username | password    |
      | student  | Password123 |
      | Gaurav   | Password123 |
