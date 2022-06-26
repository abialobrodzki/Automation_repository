@Main01
Feature: Zadanie 1 Gherkin

  @scenariusz_1
  Scenario: Szukanie frazy w Google
    Given Użytkownik znajduje się na stronie www.google.pl
    When W polu wyszukiwania na stronie użytkownik wpisuje dowolne słowo i potwierdza
    Then Widoczna jest strona z wynikami wyszukiwania

  @scenariusz_2
  Scenario: Logowanie do portalu edukacyjnego Coders Lab
    Given Użytkownik jest na stronie logowania portalu
    When Wprowadzono i zatwierdzono poprawne dane logowane (email, hasło)
    Then Zalogowano użytkownika do portalu

  @scenariusz_3
  Scenario: Uruchomienie pierwszej prezentacji z preworku Java na kursie testera automatyzującego
    Given Użytkownik jest zalogowany do platformy https://lms.coderslab.pl
    And ma dostęp do kursu tester automatyzujący
    When Z widniejących kursów wybiera kurs „Tester automatyzujący”
    When Z pośród rozdziałów wybiera Prework
    When Użytkownik wybiera pierwszą prezentację
    Then Użytkownik ma otwartą pierwszą prezentację z rozdziału Prework

    # można też pisać w pierwszej osobie
  @scenario_1
  Scenario: I want to search something in Google
    Given I'm on page www.google.pl
    When I enter keyword to be searched
    Then I can see a list of results containg this keyword

  @scenario_2
  Scenario: I want to login to LMS Coderslab
    Given I'm on login page of lms.coderslab.pl
    When I enter valid username and password
    Then I'm logged in

  @scenario_3
  Scenario: I want to open first presentation from prework on auto qa course
    Given I'm logged in to lms.coderslab.pl
    When I choose auto qa course
    When I choose Prework module
    When I choose Prework - Java presentation
    Then I can see the presentation
