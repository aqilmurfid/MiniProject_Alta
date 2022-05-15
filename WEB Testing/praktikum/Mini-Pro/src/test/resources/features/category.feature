Feature: Category

  Scenario: As a user i want to filter product
    Given I am in Homepage
    When I click category button
    And I choose kesehatan option
    Then Web show kesehatan stuff
