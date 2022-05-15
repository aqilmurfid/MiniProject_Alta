Feature: Rating

  Scenario: As a user i can give a rating star to a product
    Given I am at the homepage
    When I click detail product cincin emas
    And I give a star
    Then Product show my rating

