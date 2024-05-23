Feature: Hamburger Menu Finance
  Scenario: Downloading payment info
    Given the user navigates to the website and logs in
    And the user reaches the payment page
    When the user downloads the report
    Then the user verifies that the report has downloaded