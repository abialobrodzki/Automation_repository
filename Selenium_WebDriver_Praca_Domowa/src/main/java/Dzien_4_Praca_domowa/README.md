![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


# Nawigacja
Na stronie [https://mystore-testlab.coderslab.pl/index.php](https://mystore-testlab.coderslab.pl/index.php) wykonaj następującą sekwencję kroków:

1. Wejdź na stronę główną.
2. Przejdź do opcji 'Sign in'
3. Wybierz opcję 'No account? Create one here'
4. Za pomocą metod nawigacyjnych przejdź do strony głównej.



# Inna przeglądrka
Ściągnij inny sterownik przeglądarki i spróbuj uruchomić dowolny test na innej przeglądarce.


# Wyszukiwanie elementów - formularz

Pod linkiem [https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html](https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html) dostępny jest formularz, którego wypełnianie i wysyłanie należy zautomatyzować.

Wypełnij dane w formularzu:

    First name: Karol
    Last name: Kowalski
    Gender: Male
    Date of birth: 05/22/2010
    Address: Prosta 51

    Email: karol.kowalski@mailinator.com
    Password: Pass123
    Company: Coders Lab
    Comment: To jest mój pierwszy automat testowy

Zatwierdź formularz - **SUBMIT**
<br><br><br>

💁‍♂️ **Wskazówki:**

- Pamiętaj o odpowiednich komentarzach. Tak, aby móc w przyszłości wrócić do tego skryptu. 
- Pamiętaj, aby każdy element był poprawnie i jednoznacznie zlokalizowany.
- Staraj się pracować krok po kroku. Zlokalizuj pierwszy element, sprawdź, czy skrypt poprawnie go rozpoznaje, następnie kolejny i kolejny.



# Ćwiczenia z wyszukiwania xPath

Na portalu sklepu internetowego [https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1](https://mystore-testlab.coderslab.pl//index.php?controller=authentication&create_account=1) wyszukaj następujące elementy:

- social title
- First name
- Last name
- Email
- Password
- Show
- Birthdate

# Ćwiczenia z wyszukiwania xPath

Ćwiczeń z xPath nigdy za dużo dlatego warto wykonać zadania na stronie [https://topswagcode.com/xpath/](https://topswagcode.com/xpath/). Jest z nimi trochę zabawy. 

# Rejestracja użytkownika

Ważną funkcjonalnością sklepu jest możliwość zarejestrowania nowego użytkownika. W tym celu przygotuj skrypt, który będzie miał możliwość tworzenie dowolnej liczby użytkowników
w sklepie [https://mystore-testlab.coderslab.pl/index.php](https://mystore-testlab.coderslab.pl/index.php).

Po stworzeniu użytkownika uzupełnij również jego dane adresowe (Your Account / Addresses). Postaraj się, aby dane były w jak największym stopniu losowe.


💁‍♂️ **Wskazówki:**

- Skrypt powinien mieć możliwość zdefiniowania dowolnej liczby użytkowników, którą chcemy utworzyć.
- Zwróć uwagę na komunikat: *"The email is already used, please choose another one or sign in."*
- Stwórz kilka tablic, które będą zawierały poszczególne dane wymagane do wypełnienia adresu, a następnie dla każdego z użytkowników losuj dowolny element z danej tablicy.
- Wykorzystaj losowanie liczb i dodawaj losowe liczby do adresów e-mail.




# Filtrowanie produktów

Sprawdź funkcjonalność filtrowania produktów w sklepie  [https://mystore-testlab.coderslab.pl//index.php](https://mystore-testlab.coderslab.pl//index.php). Przygotuj skrypt, który zweryfikuje czy po wyborze odpowiedniego filtra wyświetlają się tylko i wyłącznie produkty spełniające jego warunki np. czy wyświetlają się tylko produkty w danym przedziale cenowym.

💁‍♂️ **Wskazówki:**

- Pamiętaj, aby sprawdzić parametry każdego z wyświetlonych produktów, nie tylko pierwszego wyświetlonego.
- Do porównywania skorzystaj z instrukcji warunkowych if ... (jeżeli cena jest ok -> wyświetl odpowiedni komunikat).




# Filtrowanie produktów

Sprawdź funkcjonalność zakupu produktów w sklepie [https://mystore-testlab.coderslab.pl//index.php](https://mystore-testlab.coderslab.pl/index.php). Dokonaj zamówienia dowolnych produktów. W koszyku powinny być minimum 2 produkty z różnych kategorii.

💁‍♂️ **Wskazówki:**

- Zwróć uwagę, że wielokrotne zakupy mogą spowodować brak towaru w naszym sklepie. Przygotuj skrypt również na taką sytuację.


