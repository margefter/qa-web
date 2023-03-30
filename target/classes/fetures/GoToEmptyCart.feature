Feature: Сart

  Scenario: Open empty cart
    Given the user is authorized on the "url" with "username" and "password"
    And "0" is visible near cart
    When click on the cart icon
    Then cart popup is available
    When click Перейти в корзину
    Then cart page opens

  Scenario: Open cart with 1 non-promotional item
    Given the user is authorized on the "url" with "username" and "password"
    And "0" is visible near cart
    When add "1" non-promotional item to cart
    Then "1" is visible near cart
    When click on the cart icon
    Then cart popup is available
    And item name, cost, total amount should be visible
    When click Перейти в корзину
    Then cart page opens

  Scenario: Open cart with 1 promotional item
    Given the user is authorized on the "url" with "username" and "password"
    And "0" is visible near cart
    When add "1" promotional item to cart
    Then "1" is visible near cart
    When click on the cart icon
    Then cart popup is available
    And item name, cost, total amount should be visible
    When click Перейти в корзину
    Then cart page opens

  Scenario: Open cart with 9 different items
    Given the user is authorized on the "url" with "username" and "password"
    And "0" is visible near cart
    And add "1" promotional item to cart
    When add "8" items to cart
    Then "9" is visible near cart
    When click on the cart icon
    Then cart popup is available
    And item name, cost, total amount should be visible
    When click Перейти в корзину
    Then cart page opens

  Scenario: Open cart with 9 the same promotional items
    Given the user is authorized on the "url" with "username" and "password"
    And "0" is visible near cart
    When add "9" promotional item to cart
    Then "1" is visible near cart
    When click on the cart icon
    Then cart popup is available
    And item name, cost, total amount should be visible
    When click Перейти в корзину
    Then cart page opens