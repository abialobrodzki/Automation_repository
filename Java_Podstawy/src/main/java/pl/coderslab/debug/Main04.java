package pl.coderslab.debug;

public class Main04 {
    /**
     * Zadanie 4
     * W pliku Main04 znajduje się metoda, która ma obliczyć sumę elementów podanych jako argument.
     * zdebuguj, a następnie popraw program tak by zwracał poprany wynik.
     **/

    public static void main(String[] args) {
        double sum = calculateSum(new String[]{"0", "1", "1", "2", "3", "5", "8"});
        System.out.println("Sum " + sum);
    }

    private static double calculateSum(String[] input) {
        double result = 0;
//        for (int i = 1; i < input.length; i++) {
        for (int i = 0; i < input.length; i++) { //poprawiono i=1 na i=0
//            result = Integer.parseInt(input[i]); //wartości nie są dodawane
            result += Integer.parseInt(input[i]); //poprawiono = na +=
        }
        return result;
    }
}
