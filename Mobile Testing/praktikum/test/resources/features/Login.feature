Feature: User be able to login

  Scenario: Android user want to login altashop
    Given android user on homescreen
    When  android user click button login
    And android user input valid email
    And android user input valid pasword
    And android user click login
    Then android user go to homepage