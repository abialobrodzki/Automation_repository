package pl.coderslab.methods;

public class Main06 {
    /**
     * Zadanie 6
     * W pliku Main06.java napisz publiczną metodę checkMaturity, która:
     * przyjmie parametr liczbowy age oznaczający wiek użytkownika,
     * sprawdzi, czy użytkownik jest pełnoletni,
     * zwróci wartość true – jeśli jest pełnoletni,
     * zwróci wartość false – jeśli nie jest.
     **/

    public static void main(String[] args) {
        System.out.println(checkMaturity(29));
    }

    public static final int AGE = 18; //wiek pełnoletności

    public static String checkMaturity(int age) {
        if (age >= AGE) {
            String maturity = "true";
            return maturity;
        } else {
            String maturity = "false";
            return maturity;
        }
    }
}
