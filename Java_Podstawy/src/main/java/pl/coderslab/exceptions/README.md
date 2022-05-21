## Zadanie 1 - rozwiązywane z wykładowcą

W pliku `Main01.java` została umieszczona metoda o sygnaturze:
 `public static int factorial(int number)`
 
zwracająca silnię liczby naturalnej przekazanej w parametrze.
1. zmodyfikuj kod tak, aby metoda zwracała wyjątek `IllegalArgumentException` 
w sytuacji, gdy liczba `number` przekazana w parametrze będzie mniejsza od zera,
2. zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego,
3. przetestuj działanie programu wywołując metodę `factorial` z poprawnym i z niepoprawnym parametrem,
4. przy wywołaniu metody `factorial` dodaj obsługę wyjątku `IllegalArgumentException`,
5. przetestuj ponownie działanie programu.


## Zadanie 2

W pliku `Main02.java` umieszczony został program powodujący rzucenie wyjątku.
1. uruchom program i zaobserwuj jaki wyjątek został rzucony,
2. dodaj do kodu obsługę odpowiedniego wyjątku i uruchom ponownie program,
3. zwróć uwagę czy jest to wyjątek kontrolowany, czy niekontrolowany i dlaczego.


## Zadanie 3

W pliku `Main03.java` umieszczony został program powodujący rzucenie wyjątku.
1. uruchom program i zaobserwuj jaki wyjątek został rzucony,
2. zmodyfikuj kod tak, aby zabezpieczyć go przed rzuceniem wyjątku,
 (zmodyfikuj kod tak, by w tym miejscu ten wyjątek nie był rzucany).



## Zadanie 4

W pliku `Main04.java` znajduje się program z obsługą dwóch wyjątków.

1. uruchom program i zaobserwuj jaki wyjątek został zwrócony,
2. usuń komentarz i popraw kod tak, aby dodatkowy wyjątek z komentarza był poprawnie obsługiwany,
1. uruchom ponownie program i zaobserwuj jaki wyjątek został zwrócony?


## Zadanie 5

W pliku `Main05.java` znajduje się program, który zwraca wyjątek.

1. uruchom program i zaobserwuj jaki wyjątek został zwrócony,
2. dodaj do kodu obsługę odpowiedniego wyjątku,
3. dodaj do kodu sekcję, która wykona się niezależnie od tego, czy wyjątek zostanie rzucony, czy nie,
4. przetestuj działanie programu wywołując metodę `parseInt` z poprawnym i z niepoprawnym parametrem.


## Zadanie 6

W pliku `Main06.java` została umieszczona metoda o sygnaturze:
 
 `public static int divide (int a, int b)`.

1. uzupełnij ciało metody tak, aby wykonała dzielenie parametru `a` przez `b` i zwróciła całkowitą cześć wyniku dzielenia,
2. wywołaj metodę `divide` przekazując parametr `b` o wartość `0` i zaobserwuj jaki wyjątek zostanie zwrócony po uruchomieniu programu,
3. zmodyfikuj kod tak, aby metoda `divide` zwracała wyjątek `IllegalArgumentException` w sytuacji gdy parametr `b` będzie równy `0`,
4. uruchom ponownie program i zaobserwuj jaki wyjątek zostanie zwrócony,
5. w metodzie `main` dodaj obsługę wyjątku `IllegalArgumentException`,
6. przetestuj działanie programu przekazując do metody `divide` poprawny i niepoprawny parametr `b`.
