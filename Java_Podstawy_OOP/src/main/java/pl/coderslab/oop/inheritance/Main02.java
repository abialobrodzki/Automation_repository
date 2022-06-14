package pl.coderslab.oop.inheritance;

public class Main02 {
    public static void main(String[] arg) {
        Shape s1 = new Shape(2, 3, "red");
        Shape s2 = new Shape(10, 5, "blue");

        System.out.println(s1.getDescription());
        System.out.println(s2.getDescription());

        System.out.println(s1.getDistance(s2));
        System.out.println(s2.getDistance(s1));
    }
}
