package pl.coderslab.exceptions;

public class Main03 {
    /**
     * Zadanie 3
     * W pliku Main03.java umieszczony został program powodujący rzucenie wyjątku.
     * uruchom program i zaobserwuj jaki wyjątek został rzucony,
     * zmodyfikuj kod tak, aby zabezpieczyć go przed rzuceniem wyjątku,
     * (zmodyfikuj kod tak, by w tym miejscu ten wyjątek nie był rzucany).
     **/

    public static void main(String[] args) {
        showLength(null); //parametr s nie może przyjmować wartości null
        showLength("abc");
        showLength("123124sdaf");
    }

    static void showLength(String s) {
//        if (s != null) { // można zabezpieczyć również tak
//            System.out.println(s.length());
//        }

        if (s == null) {
            System.out.println("null value is not allowed");
        } else {
            System.out.println(s.length());
        }
    }
}
