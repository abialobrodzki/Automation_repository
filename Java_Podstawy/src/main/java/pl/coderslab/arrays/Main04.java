package pl.coderslab.arrays;

import java.util.Random;

public class Main04 {
    /**
     * ## Zadanie 4
     * W pliku `Main04.java`:
     * 1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
     * 2. stwórz zmienną tablicową `reverse` i umieść w niej elementy tablicy `numbers` w odwrotnej kolejności,
     * 3. wypisz na konsoli elementy z tablicy `reverse`.
     * Dla tablicy o elementach:
     * ```
     * 3, 5, 7, 2, 1
     * ```
     * otrzymamy wynik:
     * ```
     * 1, 2, 7, 5, 3
     * ```
     **/

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] reverse = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); //konieczny import klasy java.util.Random;
            System.out.print(numbers[i] + ", ");
        }

        System.out.print("\n");

        for (int i = (numbers.length - 1); i >= 0; i--) {
            reverse[i] = numbers[i];
            System.out.print(reverse[i] + ", ");
        }

    }
}
