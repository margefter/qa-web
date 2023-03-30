Feature: Go to empty cart

  Scenario: Click cart icon
    Given the user is authorized on the "url" with "username" and "password"
    And cart is empty
    When click on the cart icon
    Then cart popup is available
    When click Перейти в корзину
    Then cart page opens