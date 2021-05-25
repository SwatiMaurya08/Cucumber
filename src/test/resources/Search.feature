Feature: Search and Place order for the Vegetable
  Scenario: search for items and validates results
    Given user is on GreenKart landing page
    When  the user search for "cucumber" vegetable
    Then  "cucumber" results are displayed

  Scenario: search for items and validates results
    Given user is on GreenKart landing page
    When  the user search for "brinjal" vegetable
    Then  "brinjal" results are displayed
    And   added items to the cart
    And   click on the item price bag
    And   user proceed to click on proceed to checkout button
    Then  verify selected "brinjal" item are displayed in the checkout page
