@regression
Feature: logged user could switch between currencies
  Background: user login first
    Given user goto login page
    When user enter "ahmedatef@gmail.com" and "3459781232"
    And user click on login BTN
    Then user login successfully


  Scenario: user could select currency
    When user select currency
    Then user change currency successfully

