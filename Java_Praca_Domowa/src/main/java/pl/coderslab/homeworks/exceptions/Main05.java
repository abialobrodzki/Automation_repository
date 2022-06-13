package pl.coderslab.homeworks.exceptions;


import java.util.NoSuchElementException;

public class Main05 {
    /**
     * ## Zadanie 5
     * W pakiecie `pl.coderslab.homeworks.exceptions`, w pliku `Main05.java` umieść metodę o sygnaturze:
     * `public static int indexOf(int[] elements, int value)`.
     * 1. uzupełnij ciało metody tak, aby zwracała index elementu `value` zawartego w tablicy `elements`,
     * 2. jeśli tablica nie posiada podanego elementu zwróć wyjątek `NoSuchElementException`,
     * 3. przetestuj działanie programu wywołując metodę `indexOf` z elementem, który występuje w tablicy i z takim,
     * który w niej nie występuje,
     * 4. przy wywołaniu metody `indexOf` dodaj obsługę wyjątku `NoSuchElementException`.
     * 5. przetestuj ponownie działanie programu.
     **/

    public static void main(String[] args) {
        int elements[] = {1, 2, 4, 5, 0, 3, 5};
        try {
            indexOf(elements, 5);
            indexOf(elements, 1);
            indexOf(elements, 0);
            indexOf(elements, -1);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage()); //zwróci wartość null
        }
    }

    public static int indexOf(int[] elements, int value) {
        int indexRepeat = 0;
            for (int i = 0; i < elements.length; i++) {
                if (value == elements[i]) {
                    int index = i;
                    System.out.println("index for " + value + " = " + index + " ");
                    indexRepeat++;
                }
            }
            if (indexRepeat == 0) {
                throw new NoSuchElementException();
            }
        return 0;
    }
}
