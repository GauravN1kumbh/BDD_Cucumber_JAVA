Feature: Google Search

  @smoketest_Google
  Scenario: Search contect on google & user should land on search result page
    Given the user is on chrome browser
    When the user search for google page
    When the user enter some data to search bar
    And the user hit enter
    Then the user navigated to search result page
