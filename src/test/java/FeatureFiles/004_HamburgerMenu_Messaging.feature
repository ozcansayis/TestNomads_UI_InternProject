Feature: Hamburger Menu Function

  Scenario: Navigate to the website and login
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And Checkout Hamburger Menu