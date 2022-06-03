## Zadanie 1

Stwórz klasę `Author`, która ma spełniać następujące wymogi:

1. Mieć prywatne atrybuty:
 * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
 * `firstName` - atrybut określający imię autora,
 * `lastName` - atrybut określający nazwisko autora,
 * `pseudonim` - atrybut określający pseudonim autora,
 


## Zadanie 2

Stwórz klasę `Book`, która ma spełniać następujące wymogi:

1. Mieć prywatne atrybuty:
 * `id` - atrybut typu `int` ten powinien trzymać numer identyfikacyjny książki,
 * `title` - atrybut typu `String` określający imię pracownika,
 * `available` - atrybut typu `boolean` określający czy książka jest możliwa do wypożyczenia, z domyślną wartością ustawioną na `true`,
 książka może być wypożyczona, lub np. w renowacji - ma wtedy atrybut określony na **false**.
 * `author` - atrybut typu `Author`,
 * `additionalAuthors`  - tablica obiektów klasy `Author`.

2. Posiadać gettery do wszystkich pól.
3. Posiadać settery do wszystkich pól.


## Zadanie 3

Stwórz klasę `User`, która ma spełniać następujące wymogi:
1. Mieć prywatne atrybuty:
 * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
 * `firstName` - atrybut określający imię autora,
 * `lastName` - atrybut określający nazwisko autora,
 * `books` - tablica obiektów klasy `Book`.
 
2. Dodaj metodę `addBook(Book book)`, która doda nową książkę do tablicy książek danego użytkownika.
3. Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy.


## Zadanie 4

Stwórz klasę `BankAccount`, która ma spełniać następujące wymogi:

1. Mieć prywatne atrybuty:
 * `number` - atrybut ten powinien trzymać numer identyfikacyjny konta (dla uproszczenia możemy założyć, że numerem konta może być dowolna liczba całkowita),
 * `cash` - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa.  Atrybut `cash` powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.

2. Posiadać gettery do atrybutów `number` i `cash`, ale NIE posiadać do nich setterów (nie chcemy, żeby raz stworzone konto mogło zmienić swój numer, a do atrybutu `cash` dodamy specjalne funkcje modyfikujące jego wartość).

3. Posiadać metodę `void depositCash(amount)` której rolą będzie zwiększenie wartości atrybutu `cash` o podaną wartość. Pamiętaj o sprawdzeniu, czy podana wartość jest:
 * Większa od 0

4. Posiadać metodę `double withdrawCash(amount)` której rolą będzie zmniejszenie wartości atrybutu `cash` o podaną wartość. 
Metoda ta powinna zwracać ilość wypłaconych pieniędzy. Dla uproszczenia zakładamy, że ilość pieniędzy na koncie nie może zejść poniżej 0, np.
jeżeli z konta, na którym jest 300 zł, próbujemy wypłacić 500 zł, to metoda zwróci nam tylko 300 zł. 
Pamiętaj o sprawdzeniu, czy podana wartość jest:
 * Większa od 0

5. Posiadać metodę `String toString()` nieprzyjmującą żadnych parametrów. Metoda ta ma zwracać informację o numerze konta i jego stanie.
