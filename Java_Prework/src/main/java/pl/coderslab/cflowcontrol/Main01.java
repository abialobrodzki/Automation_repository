package pl.coderslab.cflowcontrol;

public class Main01 {
/** ## Zadanie 1
 * 1. W pliku `Main01.java` stwórz dwie zmienne, o nazwach `nr1` i `nr2`, przechowujące liczby całkowite o wartościach `3` i `7`.
 * 2. Następnie za pomocą instrukcji warunkowej ```if ... else ```, wypisz w konsoli, która z nich jest większa.
 * 3. Tekst wypisz wg wzoru: `Większa liczba to 7`
 **/

    public static void main(String[] args) {
    int nr1 = 3;
    int nr2 = 7;
    if (nr1>nr2) {
        System.out.println("Większa liczba to 3");
    } else {
        System.out.println("Większa liczba to 7");
    }
    }

}
