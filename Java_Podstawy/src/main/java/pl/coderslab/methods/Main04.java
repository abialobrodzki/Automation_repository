package pl.coderslab.methods;

public class Main04 {
    /**
     * Zadanie 4
     * W pliku Main04.java napisz publiczną metodę createName, która przyjmie następujące parametry:
     * name: imię,
     * surname: nazwisko,
     * nickname: pseudonim.
     * Metoda ma zwrócić łańcuch tekstowy z połączonymi parametrami, w postaci: "imię pseudonim nazwisko".
     **/

    public static void main(String[] args) {
        System.out.println(createName("imię", "nazwisko", "pseudonim"));
    }

    public static String createName(String name, String surname, String nickname) {
//        return name + " " + nickname + " " + surname;
        return String.join(" ", name, nickname, surname); // użycie String.join
    }
}
