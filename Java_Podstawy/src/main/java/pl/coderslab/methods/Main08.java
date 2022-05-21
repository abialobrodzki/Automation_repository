package pl.coderslab.methods;

public class Main08 {
    /**
     * Zadanie 8
     * W pliku Main08.java napisz publiczną metodę maxOfThree,
     * która przyjmie trzy parametry liczbowe. Metoda ma zwrócić największą liczbę.
     **/

    public static void main(String[] args) {
        System.out.println(maxOfThree(6, 6, 9));
    }

    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            int max = a;
            return max;
        } else if (b > a && b > c) {
            int max = b;
            return max;
        } else {
            int max = c;
            return max;
        }
    }
}
