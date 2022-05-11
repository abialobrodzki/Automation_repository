package pl.coderslab.cflowcontrol;

public class Main08 {
/** ## Zadanie 8
 * W pliku `Main08Sample`, jest program, który wypisuje w konsoli schemat z `n` gwiazdek, taki jak poniżej. Przeanalizuj go bardzo dokładnie.
 * Przykład dla n = 5:
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *  * * * * *
 *  Używamy do tego zadania pętli zagnieżdżonych!
 *  W pliku `Main08.java` napisz program rysujący, na podstawie wartości zmiennej `n`, poniższy schemat, dla zawartego w metodzie main `int n = 5;
 *  * 2 3 4 5
 *  * * 3 4 5
 *  * * * 4 5
 *  * * * * 5
 *  * * * * *
 *  Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`,
 *  dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.
 **/

    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++) {
            String row = " ";
            for (int j=0; j<n; j++) {
                if ( i >= j ) {
                    row += "* ";
                } else {
                   row += j+1+" ";
                }
            }
            System.out.print(row + "\n");
        }
    }
}
