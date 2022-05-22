## Zadanie 1 - rozwiązywane z wykładowcą

Utwórz klasę `Burger`, dodaj w niej atrybuty:

- size,
- price.

1. Utwórz konstruktor, który przyjmie i ustawi parametry `size` i `price`.
2. Utwórz konstruktor bezargumentowy.



## Zadanie 2

Stwórz klasę ```Calculator```. Konstruktor ma nie przyjmować żadnych danych.
Każdy nowo stworzony obiekt powinien mieć tablicę String, w której będzie trzymać historię ostatnich operacji 
(stwórz ją w konstruktorze – z początkowym rozmiarem 0).
Następnie dodaj do klasy następujące metody:

1. ```add(num1, num2)``` – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added ```num1``` to ```num2``` got ```result```".
2. ```multiply(num1, num2)``` – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```".
3. ```subtract(num1, num2)``` – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```".
4. ```divide(num1, num2)``` – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można dzielić przez zero.
5. ```printOperations()``` – metoda ma wypisać wszystkie zapamiętane operacje.
6. ```clearOperations()``` – metoda ma wyczyścić wszystkie zapamiętane operacje.

Możesz dopisać metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.

Pamiętaj o używaniu ```this``` w odpowiednich miejscach.
Stwórz kilka kalkulatorów i przetestuj ich działanie.



## Zadanie 3

Utwórz klasę `Person`, dodaj w niej atrybuty:

- name
- surname
- age
- gender

Wszystkie atrybuty mają być prywatne.

1. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`.
2. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `age`.
3. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`, `age`, `gender`.

