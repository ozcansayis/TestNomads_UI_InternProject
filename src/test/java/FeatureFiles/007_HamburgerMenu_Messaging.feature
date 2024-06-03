Feature:

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And Checkout Hamburger Menu

  Scenario:Checkout Trash
    Given Click Trash button and See restore Icon
    When Click the Restore button and see success message
    Then Click on the delete button and see the success message
