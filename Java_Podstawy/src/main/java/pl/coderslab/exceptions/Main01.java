package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {

    }

    static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
