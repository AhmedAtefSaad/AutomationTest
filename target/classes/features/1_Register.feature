@regression
Feature: users could  make a registration on the website to create an account

  Background: user goto register page
    Given user goto register page

  Scenario: User could register with valid data
    When user fill personal details field
    And user fill company details
    And user fill password field
    And user click on register BTN
    Then user registration successfully