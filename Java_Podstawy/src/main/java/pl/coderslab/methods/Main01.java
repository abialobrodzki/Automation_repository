package pl.coderslab.methods;

public class Main01 {
    /**
     * Zadanie 1 - rozwiązywane z wykładowcą
     * W pliku Main01.java napisz metodę o sygnaturze:
     * public static int multiply(int multipler, int index),
     * która zwróci wartość zmiennej multipler pomnożonej przez wartość argumentu index.
     **/

    public static void main(String[] args) {
        int result = multiply(5, 4);
        System.out.println(result); //wynik działania metody
        System.out.println(multiply(5, 4)); //wynik działania metody zapisanej w princie
    }

    public static int multiply(int multipler, int index) {
        int result = multipler * index;
        return result;
//        return = multipler * index; //można krócej
    }
}
