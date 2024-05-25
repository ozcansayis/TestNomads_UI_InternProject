Feature: Main Menu

  Scenario: Accessing main menu items
    Given User is logged in as a student
    When User checks the top navigation menu
    Then User should see all main menu items
    And User should be able to click each item correctly







