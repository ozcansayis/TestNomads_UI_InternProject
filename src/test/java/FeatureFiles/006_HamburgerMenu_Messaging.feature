Feature:

  Background:
    Given Navigate to Campus
    When Enter valid username and password and click login button
    Then User should login successfully
    And Checkout Hamburger Menu

  Scenario:Checkout OutBox
    Given Click Outbox button
    When Delete Message
    Then Deleted Succes
