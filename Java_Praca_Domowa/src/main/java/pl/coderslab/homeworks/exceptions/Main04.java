package pl.coderslab.homeworks.exceptions;


public class Main04 {
    /**
     * ## Zadanie 4
     * W pakiecie `pl.coderslab.homeworks.exceptions`, w pliku `Main04.java` umieść metodę o sygnaturze:
     * `public static int toInt(String str)`.
     * 1. uzupełnij ciało metody tak, aby zwracała napis `str` zamieniony na typ `int`,
     * 2. obsłuż możliwe wyjątki.
     **/

    public static void main(String[] args) {
        toInt("1");
        toInt("0.0");
        toInt("-1");
        toInt(null);
        toInt("Martyna");
        toInt("@#$%@!");
    }

    public static int toInt(String str) {
        try {
            int exchange = Integer.parseInt(str);
            System.out.println(str + " exchanged to " + exchange);
            return exchange;
        }catch (NumberFormatException e){
            System.out.println("format is not convertible to int type, digit required");
        }
        return 0;
    }
}
