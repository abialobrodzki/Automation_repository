package pl.coderslab.arrays;

import java.util.Arrays;

public class Main03 {
    /**
     * ## Zadanie 3
     * W pliku `Main03.java`:
     * 1. stwórz 10-elementową tablicę wypełnioną pojedynczą wartością "2". Tablica powinna wyglądać następująco:
     * ````
     * [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
     * ````
     * 2. zadanie wykonaj **bez użycia pętli `for`**.
     **/

    public static void main(String[] args) {
        int[] tab = new int[10];
        Arrays.fill(tab, 2); //konieczny import klasy java.util.Arrays;
        System.out.println(Arrays.toString(tab));

    }
}
