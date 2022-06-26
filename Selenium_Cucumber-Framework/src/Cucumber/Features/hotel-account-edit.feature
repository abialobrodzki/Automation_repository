@hotel
Feature: Hotel account edit

  @edit
  Scenario: User adds first address to the account
    Given I'm on main page
    When I go to login page
    And I login using "testowyuser@gmail.com" and "secretpass"
    And I go to my addresses page
    # krok opcjonalny nr 1
    Then I can see there is no addresses
    When I add new address
    And I enter new address "First address", "Street", "12-666", "City", "123456789"
    Then I can see new address
    # krok opcjonalny nr 4
    And I verify created address "First address", "Street", "12-666", "City", "123456789"
    # krok opcjonalny nr 2
    And I remove the address
    # krok opcjonalny nr 3
    And I can see that address was removed

    # close browser - kroki opcjonalne