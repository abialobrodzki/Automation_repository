package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    /**
     * Zadanie 2
     * W pliku Main02.java:
     * przy użyciu pętli for stwórz tablicę o nazwie randNumbers, zawierającą 20 losowych liczb z zakresu 0-100
     * (do otrzymania losowej wartości użyj sposobu opisanego w snippetach),
     * wypisz w konsoli minimalną wartość z tablicy.
     **/

    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random rand = new Random();

        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = rand.nextInt(101);
        }

        int min = randNumbers[0];

        for (int i = 1; i < randNumbers.length; i++) {
            if (min > randNumbers[i]) {
                min = randNumbers[i];
            }
        }
        System.out.println(min);
        System.out.println(Arrays.toString(randNumbers));
    }
}
