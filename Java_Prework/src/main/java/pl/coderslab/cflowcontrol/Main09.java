package pl.coderslab.cflowcontrol;

public class Main09 {
/** ## Zadanie 9
 * W pliku `Main09.java` napisz program rysujący na podstawie wartości zmiennej `n`poniższy schemat,
 * dla zawartego w metodzie main `int n = 5;`
 *      *
 *      * *
 *      * * *
 *      * * * *
 *      * * * * *
 * Możesz to zadanie rozwiązać na dwa sposoby:
 * 1. używając pętli zależnych,
 * 2. używając pętli niezależnych i instrukcji warunkowej `if`.
 * *Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.
 **/

    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++) {
            String row = " ";
            for (int j=0; j<n; j++) {
                if ( i >= j ) {
                    row += "* ";
                }
            }
            System.out.print(row + "\n");
        }
    }
}
