Feature: Assignments feature
  Scenario: Share homework and opinions
    Given the user navigates to the website and logs in
    When the user clicks assignments
    Then the user clicks status and select results published
    And the user clicks semester and select all
    When the user clicks search button
    Then the user selects related class and stars discussion
    And the user adds files and starts conversation

