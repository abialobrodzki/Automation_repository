package pl.coderslab.oop.constructor;

public class Main02 {
    public static void main(String[] arg) {
        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.printOperations();
        c1.add(2, 4);
        c1.divide(3, 2);
        c1.printOperations();

        System.out.println("------------------");

        c2.printOperations();
        c2.multiply(4, 5);
        c2.subtract(10, 6);
        c2.printOperations();

        System.out.println("------------------");
        c2.clearOperations();
        c2.printOperations();
        c1.printOperations();
    }
}
