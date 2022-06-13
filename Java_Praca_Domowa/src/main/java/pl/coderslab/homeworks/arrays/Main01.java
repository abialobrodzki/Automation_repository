package pl.coderslab.homeworks.arrays;


import java.util.Arrays;

public class Main01 {
    /**
     * ## Zadanie 1
     * W pakiecie `pl.coderslab.homeworks.arrays`, w pliku `Main01.java` umieść metodę o sygnaturze:
     * `public static int[] returnUnique(int[] arr)`.
     * Uzupełnij ciało metody w taki sposób by z tablicy `arr` wybrała tylko unikalne wartości,
     * które następnie mają być zwrócone z metody.
     * Przykład dla tablicy [1,1,2,3,3,4], powinniśmy otrzymać [1,2,3,4].
     **/
    // pomoc sortowanie unikalnych elementów https://www.javatpoint.com/find-unique-elements-in-array-java
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 3, 1, 5, 1, 8, 2, 2, 3, 8, 9};
        returnUnique(arr);
    }

    public static int[] returnUnique(int[] arr) {
        System.out.print(Arrays.toString(arr) + "\n");
        // sortowanie tablicy z duplikatami
        Arrays.sort(arr);
        // długość posortowanej tablicy
        int[] arr2 = new int[10];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            while (i < (arr.length - 1) && arr[i] == arr[i + 1])
                i++;
            arr2[index] = arr[i];
            index++;
        }
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(arr2[i] + ", ");
        }
        System.out.print("]");
        System.out.print("\n" + Arrays.toString(arr2));

        // druga metoda - wykorzystanie try-catch niedozwolone^^
        int j = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                j++;
            }
        }
        int[] arr3 = new int[j];
        for (j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                try {
                    while (arr[i + 1] == arr[i])
                        i++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    arr3[j] = arr[i];
                    break;
                }
                try {
                    arr3[j] = arr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    break;
                }
                j++;
            }
        }
        System.out.print("\n" + Arrays.toString(arr3));
        return arr;
    }
}
