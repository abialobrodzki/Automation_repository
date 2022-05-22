package pl.coderslab.debug;

public class Main05 {
    /**
     * Zadanie 5
     * W pliku Main05 znajduje się metoda, która ma obliczyć średnią elementów podanych jako argument.
     * zdebuguj, a następnie popraw program tak by zwracał poprany wynik.
     **/

    public static void main(String[] args) {
        double avg = calculateAvg(new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97});
        System.out.println("AVG " + avg);
    }

    private static double calculateAvg(int[] input) {
        double result = 0;
        for (int element : input) {
            result += element; //program sumuje poszczegolne wartosci w tablicy
        }
//        return result; //wypisywana suma
        return result = result / input.length; //poprawiono: wypisywana suma/ilość elementów w tablicy
    }
}
