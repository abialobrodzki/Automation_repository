package pl.coderslab.homeworks.exceptions;


public class Main02 {
    /**
     * ## Zadanie 2
     * W pakiecie `pl.coderslab.homeworks.exceptions`, w pliku `Main02.java` umieść metodę o sygnaturze:
     * `public static String safeGet(String[] strTab, int index)`.
     * 1. uzupełnij ciało metody tak, aby zwracała element tablicy `strTab` zawarty pod indeksem `index`,
     * 2. dodaj obsługę odpowiedniego wyjątku,
     * 3. przetestuj działanie programu.
     */

    public static void main(String[] args) {
        String strTab[] = {"0", "1.50", "1,34", "007", "Dom"};
        for (int index = 0; index < 7; index++) {
            System.out.println(safeGet(strTab, index));
        }
    }

    public static String safeGet(String[] strTab, int index) {
        String getElement;
        try {
            getElement = strTab[index];
            return getElement;
        } catch (ArrayIndexOutOfBoundsException e) {
            getElement = "Element is not existing...";
        }
        return getElement;
    }
}
