package pl.coderslab.exceptions;


public class Main06 {
    /**
     * ## Zadanie 6
     * W pliku `Main06.java` została umieszczona metoda o sygnaturze:
     * `public static int divide (int a, int b)`.
     * 1. uzupełnij ciało metody tak, aby wykonała dzielenie parametru `a` przez `b` i zwróciła całkowitą cześć wyniku dzielenia,
     * 2. wywołaj metodę `divide` przekazując parametr `b` o wartość `0` i zaobserwuj jaki wyjątek zostanie zwrócony po uruchomieniu programu,
     * 3. zmodyfikuj kod tak, aby metoda `divide` zwracała wyjątek `IllegalArgumentException` w sytuacji gdy parametr `b` będzie równy `0`,
     * 4. uruchom ponownie program i zaobserwuj jaki wyjątek zostanie zwrócony,
     * 5. w metodzie `main` dodaj obsługę wyjątku `IllegalArgumentException`,
     * 6. przetestuj działanie programu przekazując do metody `divide` poprawny i niepoprawny parametr `b`.
     **/

    public static void main(String[] args) {
        try {
            System.out.println(divide(1, 3));
            System.out.println(divide(4, 2));
            System.out.println(divide(1, 0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec metody divide");
        }
    }

    //    static int divide(int a, int b) {
//        return 1;
//    } // wersja początkowa metody
    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Parameter b equal to 0, division by 0.");
        }
        int result; //tylko całkowite
        result = a / b;
        return result;
    }

}
