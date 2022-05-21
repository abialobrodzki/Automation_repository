package pl.coderslab.exceptions;

public class Main03 {

    public static void main(String[] args) {
        showLength(null);
    }

    static void showLength(String s) {
        System.out.println(s.length());
    }

}
