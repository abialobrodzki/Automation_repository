@hotel
Feature: Hotel account creation

  Scenario: User can create an account
    Given I'm on hotel main page
    When I sign in
    And I enter unique email address on authentication page
    And I enter name John surname Doe and password secretpass
    Then I can see success message with text "Your account has been created."
    And I close hotel browser


  Scenario Outline: User can create an account
    Given I'm on hotel main page
    When I sign in
    And I enter unique email address on authentication page
    And I enter name <name> surname <surname> and password <password>
    Then I can see success message with text "Your account has been created."
    And I close hotel browser
    Examples:
      | name   | surname  | password |
      | Joanna | Doe      | passs    |
      | Jan    | Kowalski | secret   |

  @create
  Scenario: User can create an account
    Given I'm on hotel main page
    When I sign in
    And I enter unique email address on authentication page
    And I enter name John surname Doe and password secretpass
    Then I can see success message with text "Your account has been created."
    And I close hotel browser