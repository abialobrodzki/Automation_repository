package pl.coderslab.exceptions;

public class Main02 {
    /**
     * Zadanie 2
     * W pliku Main02.java umieszczony został program powodujący rzucenie wyjątku.
     * uruchom program i zaobserwuj jaki wyjątek został rzucony,
     * dodaj do kodu obsługę odpowiedniego wyjątku i uruchom ponownie program,
     * zwróć uwagę czy jest to wyjątek kontrolowany, czy niekontrolowany i dlaczego.
     **/

    public static void main(String[] args) {
//        int[] tab = {5, 1, 6, 7, 8};
//        System.out.println(tab[21]);

        int[] tab = {5, 1, 6, 7, 8};
        try { //wyjątek kontrolowany - kompilator zgłasza błąd, teraz dodano jego obsługę
            System.out.println(tab[21]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
