package pl.coderslab.homeworks.exceptions;


public class Main01 {
    /**
     * ## Zadanie 1
     * W pakiecie `pl.coderslab.homeworks.exceptions`, w pliku `Main01.java` umieść metodę o sygnaturze:
     * `public static void average(String a, String b)`.
     * 1. uzupełnij ciało metody tak, aby dokonała konwersji zmiennych `a` i `b` na typ liczbowy `int`
     * i wykonała dzielenie zmiennej `a` przez zmienną `b`,
     * 2. zabezpiecz program przed możliwymi błędami,
     * 3. dodaj sekcję, która wykona się zawsze niezależnie od tego, czy wystąpi błąd, czy nie,
     * 4. pamiętaj o błędzie `ArithmeticException`,
     * 5. zmień typ zmiennych `a` i `b` na `double` i sprawdź jakie otrzymasz wyniki w przypadku dzielenia przez `0`.
     * Zapoznaj się z artykułami:
     * https://www.geeksforgeeks.org/g-fact-33-infinity-or-exception/
     * https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.17.2
     **/

    public static void main(String[] args) {
        average("10", "10");
        average("10", "-1");
        average("10", "0");
        average("10", "2");
    }

    public static void average(String a, String b) {
//        int x = Integer.parseInt(a);
//        int y = Integer.parseInt(b);
        double x = Integer.parseInt(a);
        double y = Integer.parseInt(b); //w przypadku zmiany typu zmiennych na double dzielenie przez 0 to Infinity
        try {
            double average = x / y; // a / b
            System.out.println(average);
        } catch (ArithmeticException e) {
            System.out.print("cannot be divided by 0");
            System.out.print(" and division result for type Double is Infinity\n");
        }
    }
}
