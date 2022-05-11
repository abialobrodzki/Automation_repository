Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  

## Zadanie 1

W pliku `Main01.java`
1. Stwórz tablicę z **trzema** elementami typu **int**. Tablicę nazwij `threeElements`.
2. Umieść w niej trzy liczby: 3, 4 i 5.
4. Następnie wypisz na konsoli po kolei elementy tej tablicy, rozdzielając je spacją.
5. Nie korzystaj w tym zadaniu z pętli.
Oczekiwany wynik:
```3 4 5```


## Zadanie 2

W pliku `Main02.java` stwórz tablicę z listą owoców. Tablicę nazwij `fruits`.  
Następnie:
1. Umieść w niej trzy wartości: "apple", "banana", "berry".
2. wypisz w konsoli **pierwszy** owoc.
3. wypisz w kolejnej lini w konsoli **ostatni** (skorzystaj z `length`).
4. w pętli wypisz wszystkie owoce – **każdy w nowej linii** (skorzystaj z `length`).
Oczekiwany wynik:
```
apple
berry
apple 
banana 
berry 
```


## Zadanie 3

W pliku `Main03.java`
1. Stwórz tablicę typu `int` z wartościami (4, 643, 112, 9999, 69 ), tablicę nazwij `numbers`.
2. Stwórz zmienną  ```sum``` i przypisz do niej liczbę `0`.
3. Za pomocą pętli ```for``` oblicz sumę liczb z tablicy.
4. Wypisz sumę na konsoli, wg wzoru: `SUMA: 10827.`.


## Zadanie 4

W pliku `Main04.java`
1. Stwórz tablicę z liczbami (4, 643, 112, 9999, 69), tablicę nazwij `numbers`.
2. W pętli ```for``` sprawdź, które są parzyste i wypisz je w konsoli **jedna pod drugą**.
3. Utwórz dodatkową zmienną `sumOdd` o wartości `0`.
4. Zmodyfikuj pętlę z pkt. 2 w ten sposób, aby **dodatkowo** sumowała liczby nieparzyste.
5. Wyświetl w konsoli dodatkowy komunikat, wg wzoru: `SUMA: 10711.`.
Oczekiwany wynik:
````
4
112
SUMA: 10711.
````


## Zadanie 5

W pliku `Main05.java`:
1. Stwórz tablicę z liczbami (4, 643, 112, 9999, -69), tablicę nazwij `numbers`.
2. Stwórz zmienną  ```min``` i przypisz do niej `0`.
3. Za pomocą pętli ```for``` znajdź liczbę, która jest najmniejsza, przypisz ją do zmiennej ```min``` i wypisz na konsoli.
4. Aby to zrobić przeiteruj tablicę i sprawdź, czy dany element jest mniejszy od aktualnej wartości `min` – jeśli tak, zaktualizuj zmienną `min`.
Oczekiwany wynik:
````
MIN: -69
````


## Zadanie 6

W pliku `Main06.java`
1. Stwórz tablicę z liczbami (4, 643, 112, 9999, -69), tablicę nazwij `numbers`.
2. Wypisz elementy tablicy od końca, używając pętli ```for``` – każdy element w nowej linii.
Oczekiwany wynik:
````
-69
9999
112
643
4
````


## Zadanie 7

W pliku `Main07.java` znajduje się tablica z temperaturami.
1. Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamień ją na stopnie Fahrenheita.  
   Przelicznik jest następujący: `tempCelc * 1,8 + 32`.
2. Aby to zrobić przeiteruj tablicę i nadpisz daną temperaturę nową, obliczoną wartością.
3. Oblicz średnią temperaturę z nowo wyliczonych wartości i przypisz do zmiennej `avg`.
4. Wypisz ją w konsoli wg wzoru: `ŚREDNIA: 3,95` – zaokrąglij liczbę do dwóch miejsc po przecinku.  
Możesz użyć metody: 
 ```java 
 String.format( "%.2f", variableToFormat );
 ```
