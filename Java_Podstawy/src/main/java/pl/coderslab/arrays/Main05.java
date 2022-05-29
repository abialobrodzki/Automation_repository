package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main05 {
    /**
     * # Zadanie 5
     * W pliku `Main05.java`:
     * 1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
     * 2. posortuj rosnąco tablicę wykorzystując metody klasy `Arrays`,
     * 3. wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy `Arrays`.
     */

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100); //konieczny import klasy java.util.Random;
            System.out.print(numbers[i] + ", ");
        }
        System.out.print("\n");
        Arrays.sort(numbers); //konieczny import klasy java.util.Arrays;
        System.out.println(Arrays.toString(numbers));
    }
}
