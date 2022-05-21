package pl.coderslab.exceptions;


public class Main04 {

    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);

        } catch (Exception ex) {
            System.out.println("Exception");

        }
//        catch (ArithmeticException ex) {
//            System.out.println("Arithmetic Exception: You can't divide by 0");
//        }

    }


}
