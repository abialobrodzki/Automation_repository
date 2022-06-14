package pl.coderslab.oop.inheritance;

public class Main03 {
    public static void main(String[] args) {
        Shape s1 = new Shape(2, 5, "rad");
        Circle c1 = new Circle(5, 7, "green", 7);

        System.out.println(s1.getDescription());
        System.out.println(c1.getDescription());

        System.out.println(c1.getArea());
        System.out.println(c1.getCircuit());

        //każde koło jest kształtem,a nie każdy kształt jest kołem
        System.out.println(s1.getDistance(c1));
        System.out.println(c1.getDistance(s1));
    }
}
