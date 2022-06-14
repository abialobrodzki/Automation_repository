package pl.coderslab.oop.constructor;

public class Main03 {
    public static void main(String[] arg) {
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Johny", 15);
        Person p3 = new Person("John", "Doe", 25, 'M');

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
