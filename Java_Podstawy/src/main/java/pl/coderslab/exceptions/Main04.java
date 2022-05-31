package pl.coderslab.exceptions;


public class Main04 {
    /**
     * ## Zadanie 4
     * W pliku `Main04.java` znajduje się program z obsługą dwóch wyjątków.
     * 1. uruchom program i zaobserwuj jaki wyjątek został zwrócony,
     * 2. usuń komentarz i popraw kod tak, aby dodatkowy wyjątek z komentarza był poprawnie obsługiwany,
     * 1. uruchom ponownie program i zaobserwuj jaki wyjątek został zwrócony?
     **/

    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);

        } catch (ArithmeticException ex) { // dodanie obsługi wyjątku - od najbardziej szczegółowych do ogólnych
            System.out.println("Arithmetic Exception: You can't divide by 0");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
//        catch (ArithmeticException ex) {
//            System.out.println("Arithmetic Exception: You can't divide by 0");
//        }
    }
}
