package pl.coderslab.debug;

public class Main03 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        for (int i = 1000; i >= 0; i--) {
            b = i < 9995 ? a / i : a * i;
        }
        System.out.println(b);

    }
}