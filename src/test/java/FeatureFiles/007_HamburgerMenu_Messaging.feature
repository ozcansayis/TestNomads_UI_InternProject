Feature:

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And Checkout Hamburger Menu

  Scenario:Checkout Trash
    Given Click Trash button and See Deleted Messages
    When Click the Delete button and back button
    Then Click the Restore button and see success message
    And Delete Message Permanent