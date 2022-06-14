package pl.coderslab.oop.inheritance;

public class Main04 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Bill", "Gates", 15);

        System.out.println(e1.wage);
        System.out.println(e1.raiseWage(10));
        System.out.println(e1.wage);
        System.out.println(e1.raiseWage(-10));
    }
}
