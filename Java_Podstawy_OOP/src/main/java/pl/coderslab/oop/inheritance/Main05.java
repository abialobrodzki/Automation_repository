package pl.coderslab.oop.inheritance;

public class Main05 {
    public static void main(String[] args) {
        HourlyEmployee he1 = new HourlyEmployee(123,"Elon","Musk",100);
        System.out.println(he1.calculatePayment(12.5));
        System.out.println(he1.calculatePayment(-13.5));
    }
}
