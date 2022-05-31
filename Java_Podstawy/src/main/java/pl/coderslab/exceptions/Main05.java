package pl.coderslab.exceptions;


public class Main05 {
    /**
     * ## Zadanie 5
     * W pliku `Main05.java` znajduje się program, który zwraca wyjątek.
     * 1. uruchom program i zaobserwuj jaki wyjątek został zwrócony,
     * 2. dodaj do kodu obsługę odpowiedniego wyjątku,
     * 3. dodaj do kodu sekcję, która wykona się niezależnie od tego, czy wyjątek zostanie rzucony, czy nie,
     * 4. przetestuj działanie programu wywołując metodę `parseInt` z poprawnym i z niepoprawnym parametrem.
     **/

    public static void main(String[] args) {

//        int num = Integer.parseInt("abc");
//        System.out.println(num);
        String s1 = "-101";
        String s2 = "-1o1";
        try {
//            int num = Integer.parseInt("abc"); //niepoprawny parametr
            int num = Integer.parseInt(s1); //poprawny parametr, String mający cyfry
            System.out.println(num);
            int num2 = Integer.parseInt(s2);
            System.out.println(num2);
        } catch (NumberFormatException e) { // wyrzucony wyjątek
            System.out.println("You need to specify an integer");
        } finally {
            // sekcja w której umieszczamy kod wykonujący się zawsze (niezależnie, czy został zgłoszony wyjątek, czy też nie)
            System.out.println("Podane parametry to:\n" + s1 + "\n" + s2 + "\n");
        }
    }
}
