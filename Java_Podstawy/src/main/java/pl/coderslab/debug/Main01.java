package pl.coderslab.debug;

public class Main01 {
    /**
     * Zadanie 1 - rozwiązywane z wykładowcą
     * W pliku Main01 znajduje się kod programu.
     * ustaw breakpoint w miejscu instrukcji int x = 33 * 55; a następnie uruchom program w trybie debugowania,
     * zrób krok do przodu i zobacz zmienną x,
     * zrób krok do przodu i zobacz ponownie zmienną text,
     * zrób krok do przodu i przejdź do metody bar z klasy Foo przy pomocy przycisku Step into,
     * wróć do metody main klasy Main01 przy pomocy przycisku Step out,
     * puść program do końca przy pomocy przycisku Resume.
     **/

    public static void main(String[] args) {
        int x = 33 * 55;
        String text = "abcd" + " " + x;
        Foo.bar();
        boolean isTrue = !false;

        char c = 'x';

    }
}
