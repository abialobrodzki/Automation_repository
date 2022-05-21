## Zadanie 1 - rozwiązywane z wykładowcą

W pliku `Main01.java`:

1. stwórz 50-elementową tablicę o nazwie `mainTab` z kolejnymi liczbami całkowitymi od 0 do 49,
2. wypisz na konsoli po kolei elementy tej tablicy, po dziesięć w każdym wierszu,
3. liczby jednocyfrowe uzupełnij dodatkowym zerem na początku (np. 03).

```
00, 01, 02, 03, 04, 05, 06, 07, 08, 09,
10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
```


## Zadanie 2

W pliku `Main02.java`:

1. przy użyciu pętli `for` stwórz tablicę o nazwie `randNumbers`, zawierającą 20 losowych liczb z zakresu `0-100` (do otrzymania losowej wartości użyj sposobu opisanego w snippetach),
2. wypisz w konsoli minimalną wartość z tablicy.


## Zadanie 3

W pliku `Main03.java`:

1. stwórz 10-elementową tablicę wypełnioną pojedynczą wartością "2". Tablica powinna wyglądać następująco:
    ````
    [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
    ````
2. zadanie wykonaj **bez użycia pętli `for`**.


## Zadanie 4

W pliku `Main04.java`:

1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
2. stwórz zmienną tablicową `reverse` i umieść w niej elementy tablicy `numbers` w odwrotnej kolejności,
3. wypisz na konsoli elementy z tablicy `reverse`.

Dla tablicy o elementach:
```
3, 5, 7, 2, 1
```
otrzymamy wynik:
```
1, 2, 7, 5, 3
```


## Zadanie 5

W pliku `Main05.java`:

1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
2. posortuj rosnąco tablicę wykorzystując metody klasy `Arrays`,
3. wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy `Arrays`.


## Zadanie 6

W pliku `Main06.java`:

1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
2. stwórz drugą tablicę, nazwij ją `secondNumbers`, wypełnij 10 dowolnymi liczbami,
3. stwórz trzecią tablicę zawierającą sumy elementów, które mają w tablicach pozycję o tym samym indeksie.

Dla przykładowych tablic:
```java
int[] numbers = {2, 3};
int[] secondNumbers = {3, 4};
```
wynikiem będzie tablica o elementach `5 i 7`.
