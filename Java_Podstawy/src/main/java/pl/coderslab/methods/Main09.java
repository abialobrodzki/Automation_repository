package pl.coderslab.methods;

public class Main09 {
    /**
     * Zadanie 9
     * W pliku Main09.java napisz publiczną metodę factorial, która przyjmie jako parametr liczbę naturalną n.
     * Metoda ma zwrócić wartość n!,czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.
     **/

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }

    public static int factorial(int n) { //silnia
        int silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }
        return silnia;
    }
}
