Feature: feature to test login functionality


  Scenario: Check login is successful with valid credentials
    Given the user is on login page
    When the user enters the valid username and password
    And click on login button
    Then the user navigated to home page