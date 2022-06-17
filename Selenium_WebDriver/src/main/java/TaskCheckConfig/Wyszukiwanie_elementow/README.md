![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/30623667/104709394-2cabee80-571f-11eb-9518-ea6a794e558e.png)


# Wyszukaj elementy przy pomocy lokalizatora By.id

Na stronie [https://hotel-testlab.coderslab.pl/en/](https://hotel-testlab.coderslab.pl/en/) zidentyfikuj następująca pola/przyciski za pomocą lokalizatora ```By.id```:<br><br>
- (pole tekstowe) Hotel Location
- (przycisk) Search Now
- (pole tekstowe) Enter your e-mail (pole na dole stron)

Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
- Hotel Location - Warsaw
- Enter your e-mail - test@test.com

Użyj metody `sendKeys` np. <br><br>
```       
findElement(By.id("q")).sendKeys("Coderslab");
```


# Wyszukaj elementy przy pomocy lokalizatora By.name

Na stronie [https://hotel-testlab.coderslab.pl/en/](https://hotel-testlab.coderslab.pl/en/) zidentyfikuj następująca pola/przyciski za pomocą lokalizatora ```By.name```:<br><br>
- (pole tekstowe) Hotel Location
- (przycisk) Search Now
- (pole tekstowe) Enter your e-mail (pole na dole stron)
- (przycisk) Subscribe 

Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
- Hotel Location - Warsaw
- Enter your e-mail - test@test.com

Dodatkowo kliknij przycisk Serach Now, używając metody `Submit` np. 
```
findElement(By.name("q")).submit();
```


# Wyszukaj elementy przy pomocy lokalizatora By.className

Na stronie [https://hotel-testlab.coderslab.pl//en/](https://hotel-testlab.coderslab.pl//en/) zidentyfikuj następująca pola/przyciski za pomocą lokalizatora ```By.className```:<br><br>
- (przycisk) Sign In
- (pole tekstowe) Email address

Po zidentyfikowaniu elementów kliknij przycisk **Sign In** i wpisz dowolny adres e-mail w pole **Email address**.

Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku **Create an account** (nie musi być z wykorzystaniem lokalizatora ``By.className``)


# Wyszukaj elementy przy pomocy lokalizatora By.xpath

Będąc na stronie rejestracji nowego użytkownika (patrz zadanie 3), wyszukaj za pomocą lokalizatorów **xpath** wszystkie wymagane pola tekstowe oraz wypełnij je dowolnymi danymi:

- First Name
- Last Name 
- Email
- Password

Kliknij przycisk **Register**, który również wyszukaj przy pomocy lokalizatora `By.xpath`.

# Wyszukaj elementy przy pomocy lokalizatora By.cssSelector 

Po utworzeniu konta na stronie [https://hotel-testlab.coderslab.pl/en](https://hotel-testlab.coderslab.pl/en) zidentyfikuj następujące pola korzystając z lokalizatora `By.cssSelector`:

- MY PERSONAL INFORMATION
- MY ADDRESSES