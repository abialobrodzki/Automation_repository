![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


# Wyszukajmy coś innego

Wykorzystując kod z zajęć, przygotuj test, który wyszuka inną frazę w wyszukiwarce Google.

# Nawigacja pomiędzy stronami

Przygotuj skrypt, który będzie przechodził pomiędzy kolejnymi stronami (nie klikamy żadnych elementów na tych stronach):
-  https://coderslab.pl/pl
-  https://mystore-testlab.coderslab.pl/index.php
-  https://hotel-testlab.coderslab.pl/en/


# Metody nawigacyjne

W tym zadaniu nauczymy się poruszać po stronach. Wykorzystamy do tego metody nawigacyjne:

⬅️ ```navigate.back()```<br>
➡️```navigate.forward()``` <br>
🔄 ```navigate.refresh()```

[Pełna lista metod dostępna jest pod linkiem](https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.Navigation.html)

Przykład kod do użycia w zadaniu:

```
   driver.get("https://www.google.com");
   driver.get("https://coderslab.pl/pl");
   driver.navigate().back();
   driver.navigate().forward();
   ```

Przygotuj następującą sekwencję poruszania się po stronach z wykorzystaniem powyższych metod:
1. Wejdź na stronę: https://www.google.com 
2. Wejdź na stronę: https://coderslab.pl/pl
3. Cofnij się do strony: https://www.google.com
4. Wejdź na stronę: https://mystore-testlab.coderslab.pl/index.php
5. Cofnij się do strony: https://www.google.com
6. Powróć do strony: https://mystore-testlab.coderslab.pl/index.php
7. Odśwież stronę: https://mystore-testlab.coderslab.pl/index.php