package pl.coderslab.methods;

public class Main02 {
    /**
     * Zadanie 2
     * W pliku Main02.java napisz metodę o sygnaturze:
     * public static int square(int num),
     * która zwróci wartość num podniesioną do kwadratu.
     **/

    public static void main(String[] args) {
        int result = square(9);
        System.out.println(result);
    }

    public static int square(int num) {
        int result = num * num;
        return result;
    }
}
