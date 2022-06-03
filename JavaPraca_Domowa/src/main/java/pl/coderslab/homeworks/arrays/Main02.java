package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main02 {
    /**
     * ## Zadanie 2
     * W pakiecie `pl.coderslab.homeworks.arrays`, w pliku `Main02.java` umieść metodę o sygnaturze:
     * `public static int[] append(int[] arr)`.
     * 1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana
     * do tymczasowej tablicy, której rozmiar ma być 2-krotnie większy od tablicy podanej.
     * 2. Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
     * 3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
     * Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};
     **/
    //pomoc https://docs.oracle.com/javase/6/docs/api/java/lang/System.html#arraycopy%28java.lang.Object,%20int,%20java.lang.Object,%20int,%20int%29

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        append(arr);
    }

    public static int[] append(int[] arr) {
        System.out.print(Arrays.toString(arr) + "\n");
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        System.out.print(Arrays.toString(arr2) + "\n");
        int[] arr3 = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.arraycopy(arr2, 0, arr3, arr.length, arr2.length);
        System.out.print(Arrays.toString(arr3) + "\n");
        return arr;
    }
}
