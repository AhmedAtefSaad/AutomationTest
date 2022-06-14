@regression
Feature: logged user could add products to wishlist

  Scenario: success massage is visible after adding product to wishlist
    When user add product to wishlist
    Then wishlist success notification is visible

  Scenario: number of wishlist item in home page is increased
    When user add product to wishlist
    When user click on wishlist link
    Then number of wishlist items increased