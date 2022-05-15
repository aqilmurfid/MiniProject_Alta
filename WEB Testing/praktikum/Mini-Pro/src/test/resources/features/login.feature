Feature: Login

  Scenario: As a user i have be able to success login
    Given I am on the login page
    When  I input my username and password correctly
    And I click login button
    Then I am on the homepage

  Scenario: As a user i have failed to login
    Given I am on login page
    When  I input my username correctly and wrong password
    And I click login
    Then Show error message
