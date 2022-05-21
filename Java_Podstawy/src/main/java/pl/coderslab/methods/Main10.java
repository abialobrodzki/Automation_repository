package pl.coderslab.methods;

public class Main10 {
    /**
     * Zadanie 10* (Dodatkowe)
     * Gdy klub piłkarski A gra dwumecz z klubem piłkarskim B,
     * oznacza to, że grają jeden mecz na boisku drużyny A i jeden na boisku drużyny B.
     * Wygrywa ta drużyna, która zdobędzie więcej goli w obu meczach.
     * W przypadku, gdy drużyny zdobyły tyle samo bramek,
     * gole zdobyte na wyjeździe liczą się jako "trochę ważniejsze" i wygrywa ta drużyna, która zdobyła więcej bramek na wyjeździe.
     * Remis w dwumeczu wypada wtedy, gdy obie drużyny zdobyły tyle samo bramek i mają tyle samo bramek na wyjeździe.
     * Na przykład:
     * W Pucharze Polski grają dwa zespoły: Grom i Błyskawica. Zespoły rozegrały następujące mecze:
     * Gospodarz: Grom.
     * Grom 0:2 Błyskawica
     * Gospodarz: Błyskawica.
     * Błyskawica 1:3 Grom
     * Sumaryczny wynik dwumeczu wynosi 3:3. Jednak Grom na wyjeździe zdobył 3 bramki, a Błyskawica tylko 2. Zatem wygrywa Grom.
     * Napisz metodę, footballWin, która przyjmie następujące parametry:
     * gole zdobyte przez zespół A w pierwszym meczu (na boisku zepołu A),
     * gole zdobyte przez zespół B w pierwszym meczu (na boisku zepołu A),
     * gole zdobyte przez zespół A w drugim meczu (na boisku zespołu B),
     * gole zdobyte przez zespół B w drugim meczu (na boisku zespołu B),
     * po czym zwróci 1, jeśli dwumecz wygrał zespół A, 2 – jeśli B.
     * W przypadku remisu, zwróć X. Wynik ma być łańcuchem tekstowym, a nie liczbą!
     **/

    public static void main(String[] args) {
        System.out.println(footballWin(0, 2, 3, 1));
    }

    public static String footballWin(int GoalsHomeA, int GoalsAwayB, int GoalsAwayA, int GoalsHomeB) {
        int GoalsA = GoalsHomeA + GoalsAwayA;
        int GoalsB = GoalsHomeB + GoalsAwayB;
        if ((GoalsA > GoalsB) || ((GoalsA == GoalsB) && (GoalsAwayA > GoalsAwayB))) {
            String winA = "1";
            return winA;
        } else if ((GoalsA < GoalsB) || ((GoalsA == GoalsB) && (GoalsAwayA < GoalsAwayB))) {
            String winB = "2";
            return winB;
        } else {
            String draw = "X";
            return draw;
        }
    }
}
