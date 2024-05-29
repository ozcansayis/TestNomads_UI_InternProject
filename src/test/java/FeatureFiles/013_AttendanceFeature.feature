Feature: Attendance Feature

  Scenario: Sent excuse in writing
    Given the user navigates to the website and logs in
    And the user clicks the attendance button
    When the user clicks the attendance excuses
    Then the user clicks add attendance excuses button
    And the user fills in all the fields in the excuse section
    When the user clicks attach files and add his excuse files


