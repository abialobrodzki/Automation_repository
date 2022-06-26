![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


# Gherkin

Przygotuj opisy scenariuszy:
- wyszukiwanie dowolnej frazy w wyszukiwarce Google,
- logowanie do portalu edukacyjnego Coders Lab [https://lms.coderslab.pl](https://lms.coderslab.pl)
- uruchomienie pierwszej prezentacji z preworku Java na kursie testera automatyzującego.

# Cucumber

Z wykorzystaniem Cucumber przygotuj test, który będzie zakładał konto na stronie [https://hotel-testlab.coderslab.pl/](https://hotel-testlab.coderslab.pl/).

Wykonana powinna być następująca sekwencja kroków:
- strona główna 
- przycisk **'Sign in'**
- przycisk **Create an account**
- wypełnienie formularza
- przycisk **Register**


# Cucumber - parametryzacja

Do zadania 2 należy dodać parametry w następujących polach w formularzu:

- first name
- last name
- email (pole e-mail wykorzystywane jest już na ekranie **'Sign in'**)
- password

Dodanie parametrów pozwoli tworzyć wielu użytkowników w ramach jednego skryptu testowego.

# Cucumber

Stwórz dodatkowe testy dla portalu [https://hotel-testlab.coderslab.pl/en/](https://hotel-testlab.coderslab.pl/en/), które umożliwi sprawdzanie funkcjonalności dodania pierwszego adresu do utworzonego już konta użytkownika. 

Sekwencja kroków:
- logowanie do systemu
- zakładka **Accounts** (rozwiń nazwę użytkownika)
- przycisk **My addresses**
- przycisk **Add new address**
- wypełnienie i zapisanie formularza.

