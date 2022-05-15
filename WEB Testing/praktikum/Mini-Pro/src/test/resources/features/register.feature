Feature: Register

  Scenario: As a user i want register at altashop
    Given I am at homePage
    When  I click login item
    And I click register
    And I fill my full name "<nama>", email "<email>", password "<password>"
    And I click register button
    Then I succes and move to login page
    Example:
      |nama|email|password|
      |aqil|aqil@yahoo.com|123456|