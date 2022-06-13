package pl.coderslab.homeworks.exceptions;


public class Main03 {
    /**
     * ## Zadanie 3
     * W pakiecie `pl.coderslab.homeworks.exceptions`, w pliku `Main03.java` umieść metodę o sygnaturze:
     * `public static int getLength(String str)`.
     * 1. uzupełnij ciało metody tak, aby zwracała długość napisu `str`,
     * 2. przetestuj działanie metody przekazując do niej parametr o wartości `null`,
     * 3. zabezpiecz program przed wystąpieniem wyjątku `NullPointerException`.
     **/
    //pomoc: https://stormit.pl/string-metody/

    public static void main(String[] args) {
        getLength("Adrian");
        getLength("Martynka");
        getLength(null);
        getLength("Strong");
        getLength("");
        getLength(" ");
    }

    public static int getLength(String str) {
        try {
            int stringLength = str.length();
            System.out.println("Długość stringa " + str + " to: " + stringLength);
            return stringLength;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }
}
