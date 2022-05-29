package pl.coderslab.arrays;

import java.util.Random;

public class Main06 {
    /**
     * ## Zadanie 6
     * W pliku `Main06.java`:
     * 1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
     * 2. stwórz drugą tablicę, nazwij ją `secondNumbers`, wypełnij 10 dowolnymi liczbami,
     * 3. stwórz trzecią tablicę zawierającą sumy elementów, które mają w tablicach pozycję o tym samym indeksie.
     * Dla przykładowych tablic:
     * int[] numbers = {2, 3};
     * int[] secondNumbers = {3, 4};
     * wynikiem będzie tablica o elementach `5 i 7`.
     **/

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] secondNumbers = new int[10];
        int[] sumNumbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(5); //konieczny import klasy java.util.Random;
            System.out.print(numbers[i] + ", ");
        }

        System.out.print("\n");

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = rand.nextInt(6); //konieczny import klasy java.util.Random;
            System.out.print(secondNumbers[i] + ", ");
        }

        System.out.print("\n");

        for (int i = 0; i < sumNumbers.length; i++) {
            sumNumbers[i] = numbers[i] + secondNumbers[i];
            System.out.print(sumNumbers[i] + ", ");
        }
    }
}
