package pl.coderslab.exceptions;


public class Main01 {
    /**
     * Zadanie 1 - rozwiązywane z wykładowcą
     * W pliku Main01.java została umieszczona metoda o sygnaturze: public static int factorial(int number)
     * zwracająca silnię liczby naturalnej przekazanej w parametrze.
     * zmodyfikuj kod tak, aby metoda zwracała wyjątek IllegalArgumentException w sytuacji,
     * gdy liczba number przekazana w parametrze będzie mniejsza od zera,
     * zwróć uwagę czy jest to wyjątek kontrolowany czy niekontrolowany i dlaczego,
     * przetestuj działanie programu wywołując metodę factorial z poprawnym i z niepoprawnym parametrem,
     * przy wywołaniu metody factorial dodaj obsługę wyjątku IllegalArgumentException,
     * przetestuj ponownie działanie programu.
     **/

    public static void main(String[] args) {
//        System.out.println(factorial(5)); //kod i tak się uruchomi bez obsłużenia
//        System.out.println(factorial(-1));

        try { //wyjątek dodany do obsłużenia
            System.out.println(factorial(5));
            System.out.println(factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Run always");
        }
    }

    static int factorial(int number) {
        if (number < 0) { //wyjątek niekontrolowany - kompilator nie sprawdza tego błędu - nie trzeba dopisywać
            throw new IllegalArgumentException("Number has to be greater or equal to zero");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
