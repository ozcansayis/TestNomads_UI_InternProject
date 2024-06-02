Feature: Make Payment

  Scenario: Making Payment from the Hamburger Menu
    Given Navigate to CampusS
    When click  Hamburger Menu > Finance > My Finance link
    And complete the payment
    Then verify that a installment of the debt has been paid



