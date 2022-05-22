package pl.coderslab.debug;

public class Main03 {
    /**
     * Zadanie 3
     * W pliku Main03 znajduje się kod programu.
     * ustaw breakpoint w linii:
     * b = i < 9995 ? a / i : a * i;
     * następnie uruchom program w trybie debugowania.
     * wznawiaj program kilka razy, a następnie go zatrzymaj,
     * zmodyfikuj breakpoint nadając mu warunek i<3,
     * debuguj ponownie program, do momentu wystąpienia wyjątku,
     * pozostaw program z błędem.
     **/

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        for (int i = 1000; i >= 0; i--) { //trzeba poprawić na i>0
            b = i < 9995 ? a / i : a * i; //następuje dzielenie przez 0 dla i=0
        }
        System.out.println(b);

    }
}
