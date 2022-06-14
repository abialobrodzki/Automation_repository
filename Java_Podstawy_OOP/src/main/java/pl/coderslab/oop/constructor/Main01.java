package pl.coderslab.oop.constructor;

public class Main01 {
    public static void main(String[] arg) {
        Burger b1 = new Burger();
        Burger b2 = new Burger("M", 21);

        System.out.println("B1: " + b1.getSize() + " " + b1.getPrice());
        System.out.println("B2: " + b2.getSize() + " " + b2.getPrice());
    }
}
