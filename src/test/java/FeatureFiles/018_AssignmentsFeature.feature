Feature: Assignments Feature

  Scenario: Accessing Assigned Tasks
    Given Navigate to Campus
    Given The student is logged in to the campus system
    Then The student should see the total number of assigned tasks
    When The student clicks on the Assignments link
    Then The student should be able to view all the assigned tasks