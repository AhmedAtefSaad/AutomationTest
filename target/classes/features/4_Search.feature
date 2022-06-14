@regression
Feature: logged users will be able to search for products with different parameters
  Background: user login first
    Given user goto login page
    When user enter "ahmedatef@gmail.com" and "3459781232"
    And user click on login BTN
    Then user login successfully



  Scenario: user could search using product name
    When user write product name "Apple"
    And user click on search BTN
    Then the search completed successfully and get "Apple"

  Scenario: user could search using product sku
    When user write product sku "AP_MBP_13"
    And user click on search BTN
    And user select product
    Then the search completed successfully and get sku "AP_MBP_13"


