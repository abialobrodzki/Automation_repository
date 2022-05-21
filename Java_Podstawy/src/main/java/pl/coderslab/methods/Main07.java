package pl.coderslab.methods;

public class Main07 {
    /**
     * Zadanie 7
     * W pliku Main07.java napisz publiczną metodę checkEvenOdd, która:
     * przyjmie parametr liczbowy number,
     * będzie zwracać wartość typu String,
     * zwróci wynik "even", jeśli liczba jest parzysta,
     * zwróci wynik "odd", jeśli liczba jest nieparzysta.
     **/

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(11));
    }

    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            String evenodd = "even"; //parzysta
            return evenodd;
        } else {
            String evenodd = "odd"; //nieparzysta
            return evenodd;
        }
    }
}
