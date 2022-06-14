@regression
Feature: logged user could hover categories and select subcategory
  Background: user login first
    Given user goto login page
    When user enter "ahmedatef@gmail.com" and "3459781232"
    And user click on login BTN
    Then user login successfully


  Scenario: user could hover categories
    When user Hover Cat and select subCat
    Then user could hover successfully




