@regression
Feature: user could reset his\her password
  Background: user goto login page
    Given user open login page

  Scenario:user could reset his\her password successfully
    When user click on forget password
    And user write email "ahmedatef@gmail.com"
    And user click on recover button
    Then user get success massage
