Pamiętaj, aby rozwiązania do zadań umieszczać w odpowiednich plikach `java`, przygotowanych do zadań.  

## Zadanie 1

1. W pliku `Main01.java` stwórz dwie zmienne, o nazwach `nr1` i `nr2`, przechowujące liczby całkowite o wartościach `3` i `7`.
2. Następnie za pomocą instrukcji warunkowej ```if ... else ```, wypisz w konsoli, która z nich jest większa.
3. Tekst wypisz wg wzoru: `Większa liczba to 7`


## Zadanie 2

1. W pliku `Main02.java` stwórz trzy zmienne, o nazwach `nr1, nr2, nr3` , przechowujące liczby całkowite o wartościach 3, 7, 11.
2. Następnie za pomocą instrukcji warunkowej `if ... else if ... else`, wypisz na stronie, która z nich jest największa.
3. Tekst wypisz wg wzoru: `Największa z liczb to 11`.


## Zadanie 3

1. W pliku `Main03.java` stwórz pętlę, która 3 razy wypisze w konsoli tekst **Java**.
2. Napisz zarówno pętlę `for` jak i `while`.
3. W sumie napis będzie widoczny 6 razy.
Oczekiwany wynik:
````
Java
Java
Java
Java
Java
Java
````


## Zadanie 4

1. W pliku `Main04.java` stwórz pętlę, która wypisze w konsoli, w jednej linii, liczby od 1 do 10.
2. Napisz zarówno pętlę `for` jak i `while`.
3. W sumie zostanie wypisanych 20 liczb.
Oczekiwany wynik:
````
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
````


## Zadanie 5

1. W pliku `Main05.java` stwórz zmienne `resultFor` oraz `resultWhile` i przypisz do nich liczbę `0`.
2. Następnie stwórz pętlę, która doda do siebie liczby od 1 do 10 i zapisze do zmiennej `resultFor` lub `resultWhile`.
3. Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej `resultFor` lub `resultWhile` kolejną liczbę z podanego zakresu.
4. Napisz zarówno pętlę `for` jak i `while`.
5. Wypisz w konsoli w oddzielnych liniach zmienne: `resultFor` i `resultWhile`.
Oczekiwany wynik:
````
55
55
````


## Zadanie 6

1. W pliku `Main06.java` napisz kod, który na podstawie wartości zmiennej `n` ( `int n = 6;`),
 wypisuje wszystkie liczby od zera do **n**.
Przy każdej liczbie wypisz, czy jest parzysta, czy nie.  
Wzór:
```
0 – parzysta
1 – nieparzysta
2 – parzysta
3 – nieparzysta
...
```
Napisz zarówno pętlę `for` jak i pętlę `while`.
*Podpowiedź: Jak sprawdzić, czy liczba jest parzysta lub nieparzysta?
 Wystarczy obliczyć jej resztę z dzielenia przez `2`,
 jeżeli wynik to 0, wtedy liczba jest parzysta, w przeciwnym przypadku jest nieparzysta.*
Oczekiwany wynik:
````
0 - even
1 - odd
2 - even
3 - odd
4 - even
5 - odd
6 - even
0 - even
1 - odd
2 - even
3 - odd
4 - even
5 - odd
6 - even
````


## Zadanie 7 

1. W pliku `Main07.java` stwórz dwie pętle niezależne i wypisz wartości ich liczników
 w każdej iteracji dla `i < 3` oraz `j < 3`.
2. Wykorzystaj: ```System.out.println("i = " + i + " j = " + j);```
3. Zadanie rozwiąż używając dwóch pętli `for`.
*Podpowiedź: Zasada tworzenia pętli zagnieżdżonych (zależnych i niezależnych) została omówiona w prezentacji
 **Podstawy programowania**. 
 Jeśli masz wątpliwości, zajrzyj do sekcji **Pętle: for, for zagnieżdżony oraz while** w tej prezentacji.*
  Oczekiwany wynik:
```
i= 0 j= 0
i= 0 j= 1
i= 0 j= 2
i= 1 j= 0
i= 1 j= 1
i= 1 j= 2
i= 2 j= 0
i= 2 j= 1
i= 2 j= 2
```


## Zadanie 8

W pliku `Main08Sample`, jest program, który wypisuje w konsoli
schemat z `n` gwiazdek, taki jak poniżej.  
Przeanalizuj go bardzo dokładnie.
Przykład dla  ```n = 5```:
```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```
Używamy do tego zadania pętli zagnieżdżonych! 
W pliku `Main08.java` napisz program rysujący, na podstawie wartości zmiennej `n`, poniższy schemat,
dla zawartego w metodzie main `int n = 5;`
```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
```
Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, 
dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli. 


## Zadanie 9

W pliku `Main09.java` napisz program rysujący na podstawie wartości zmiennej `n`poniższy schemat,
 dla zawartego w metodzie main `int n = 5;`
```
*
* *
* * *
* * * *
* * * * *
```
Możesz to zadanie rozwiązać na dwa sposoby:
1. używając pętli zależnych,
2. używając pętli niezależnych i instrukcji warunkowej `if`.
*Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.*


## Zadanie 10

W pliku `Main10.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat (tutaj dla ```n = 5```):
```
* 2 3 4 5
* * 3 4 5
* * * 4 5
* * * * 5
* * * * *
* * * * *
* * * * 5
* * * 4 5
* * 3 4 5
* 2 3 4 5
```
Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`, 
dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli. 
