@regression
Feature: user could log in to his\her account
  Background: user go to login page
    Given user goto login page

  Scenario: User could login with valid data
    When user enter "ahmedatef@gmail.com" and "3459781232"
    And user click on login BTN
    Then user login successfully
