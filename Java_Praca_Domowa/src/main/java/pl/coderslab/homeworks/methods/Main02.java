package pl.coderslab.homeworks.methods;


public class Main02 {
    /**
     * ## Zadanie 2
     * W pakiecie `pl.coderslab.homeworks.methods`,
     * w pliku `Main02.java` umieść metodę o sygnaturze `public static boolean divisibleBy(int a, int b )`:
     * 1. Uzupełnij ciało metody tak, aby zwracała `true` bądź `false`
     * w zależności czy zmienna `a` jest podzielna przez `b`.
     **/
    //boolean pomoc https://www.w3schools.com/java/java_booleans.asp

    private static boolean divisibleBy;

    public static boolean divisibleBy(int a, int b) {
        if (a % b != 0) {
            boolean divisibleBy = false;
            System.out.println(divisibleBy);
        } else {
            boolean divisibleBy = true;
            System.out.println(divisibleBy);
        }
        return divisibleBy;
    }

    public static void main(String[] args) {
        divisibleBy(1, 3);
        divisibleBy(4, 2);
        divisibleBy(0, 10);
        divisibleBy(6, 9);
        try {
            divisibleBy(0, 0);
        } catch (ArithmeticException e) {
            System.out.println("b nie może być 0");
        }
    }
}
