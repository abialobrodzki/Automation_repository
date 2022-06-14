package pl.coderslab.oop.inheritance;

public class Main06 {
    public static void main(String[] args) {
        SalariedEmployee se1 = new SalariedEmployee(99, "Bill", "Doe", 130);
        System.out.println(SalariedEmployee.NO_OF_HOURS);
        System.out.println(se1.calculatePayment());
    }
}
