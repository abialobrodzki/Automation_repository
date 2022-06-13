package pl.coderslab.homeworks.arrays;


public class Main03 {
    /**
     * ## Zadanie 3
     * W pakiecie `pl.coderslab.homeworks.arrays`, w pliku `Main03.java` umieść metodę o sygnaturze:
     * `public static boolean contains(int[] arr, int element)`.
     * 1. uzupełnij ciało metody tak, by sprawdzała, czy w tablicy `arr` istnieje `element`,
     * 2. jeżeli tak ma zwracać `true`,
     * 3. jeżeli nie ma zwracać `false`.
     **/

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 0};
        contains(arr, 0);
        contains(arr, 101);
        contains(arr, 1);
        contains(arr, 69);
    }

    public static boolean contains(int[] arr, int element) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }
}
