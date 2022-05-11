![Coders-Lab-1920px-no-background](https://user-images.githubusercontent.com/152855/73064373-5ed69780-3ea1-11ea-8a71-3d370a5e7dd8.png)

# Prework Java
> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki.

## Jak zacząć?

1. Stwórz [*fork*](https://guides.github.com/activities/forking/) repozytorium z zadaniami.
2. Sklonuj repozytorium na swój komputer. Użyj do tego komendy `git clone adres_repozytorium`.

Adres repozytorium możesz znaleźć na stronie repozytorium po naciśnięciu w guzik "Clone or download".

Zwróć uwagę, żeby użyć adresu własnego forka, powinien wyglądać zgodnie ze schematem:
`https://github.com/twoj-login/adres_repozytorium`

3. Zaimportuj projekt jako projekt `Maven`, wg poniższych wskazówek:

	* W `IntelliJ` wybieramy: `File –> New –> Project from Existing Sources...`
	* Wskazujemy lokalizację katalogu ze sklonowanym projektem i zatwierdzamy.
	* Następnie w nowym oknie wybieramy: `Import project from external model` i wskazujemy `Maven`
	* Wybieramy opcję: ` Finish`, (w `IntelliJ` przed 2020: `Next –> Next –> Next –> Finish`)

4. Rozwiąż zadania i zakomituj zmiany do swojego repozytorium. Użyj do tego komend `git add nazwa_pliku`.
Jeżeli chcesz dodać wszystkie zmienione pliki użyj `git add .` 
Pamiętaj że kropka na końcu jest ważna!
Następnie zakomituj zmiany komendą `git commit -m "nazwa_commita"`
5. Wypchnij zmiany do swojego repozytorium na GitHubie.  Użyj do tego komendy `git push origin master`.
W repozytoriach utworzonych po 1 października 2020 `git push origin main`.
6. Stwórz [*pull request*](https://help.github.com/articles/creating-a-pull-request) do oryginalnego repozytorium, gdy skończysz wszystkie zadania.
## Plan tego repozytorium
    
Tutaj znajdziesz zadania do zajęć. Wrzucaj je systematycznie na Githuba.

* src/main/java/pl/coderslab/afirstprogram
* src/main/java/pl/coderslab/bvariablesandoperators
* src/main/java/pl/coderslab/cflowcontrol
* src/main/java/pl/coderslab/darrays
* src/main/java/pl/coderslab/eparametrystartowe


Poszczególne zadania rozwiązuj w odpowiednich plikach.

Testy do zadań operują na wyświetlanych w metodach komunikatach. Unikaj dodatkowych wywołań, np.:
````java
System.out.println("some message");
````

**Repozytorium z ćwiczeniami zostanie usunięte 2 tygodnie po zakończeniu kursu. Spowoduje to też usunięcie wszystkich forków, które są zrobione z tego repozytorium.**

## Uwagi do zadań

Jeśli masz uwagi do zadań, możesz je zgłaszać mailowo na adres: 
 <a href="mailto:<a href='mailto:arkadiusz.jozwiak@coderslab.pl'>arkadiusz.jozwiak@coderslab.pl</a>">arkadiusz.jozwiak@coderslab.pl</a>,
 w temacie wpisując: **Uwagi do zadań**.
 
Aby można było szybko zlokalizować problem i się do niego odnieść, umieść w mailu następujące informacje:

- link do strony z zadaniem
- numer zadania (ewentualnie podpunkt)
- opis problemu
