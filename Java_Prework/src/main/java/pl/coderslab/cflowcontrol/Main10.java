package pl.coderslab.cflowcontrol;

public class Main10 {
/** ## Zadanie 10
 * W pliku `Main10.java` napisz program rysujący, na podstawie wartości zmiennej `n`, następujący schemat (tutaj dla ```n = 5```):
 *      * 2 3 4 5
 *      * * 3 4 5
 *      * * * 4 5
 *      * * * * 5
 *      * * * * *
 *      * * * * *
 *      * * * * 5
 *      * * * 4 5
 *      * * 3 4 5
 *      * 2 3 4 5
 * Do stworzenia takiego zapisu, w środku zagnieżdżonej pętli, użyj wyrażenia warunkowego `if`,
 * dzięki któremu zdecydujesz czy wypisać gwiazdkę, czy licznik z zagnieżdżonej pętli.
 **/

    public static void main(String[] args) {
        int n = 5;
        for (int i=0; i<n; i++) {
            String row = " ";
            for (int j=0; j<n; j++) {
                if ( i >= j ) {
                    row += "* " ;
                } else {
                    row += j+1+" ";
                }
            }
            System.out.print(row + "\n");
        }
        for (int i=5; i>0; i--) {
            String row = " ";
            for (int j=0; j<n; j++) {
                 if ( i <= j ) {
                     row += j+1+" ";
                 } else {
                     row += "* ";
                 }
            }
            System.out.print(row + "\n");
        }
    }

}
