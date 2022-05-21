package pl.coderslab.methods;

public class Main03 {
    /**
     * Zadanie 3
     * W pliku Main03.java napisz publiczną metodę convertToUsd, która przyjmuje parametr PLN, czyli kwotę w złotówkach.
     * Metoda ma zwrócić podaną kwotę w dolarach amerykańskich.
     * Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.*
     **/

    public static void main(String[] args) {
        double USD = convertToUSD(6666);
        System.out.println(USD);
        System.out.println(convertToUSD(6666)); //krócej zapisane
        System.out.printf("%.2f \n", convertToUSD(25.50)); //zaookrąglanie %.2f + przejście do następnej linii \n
        System.out.printf("%.2f \n", convertToUSD(1000.00)); //zaookrąglanie %.2f + przejście do następnej linii \n
    }

    public static final double EXCHANGE_RATE = 4.04; //przypisanie kursu jako stałej

    public static double convertToUSD(double PLN) {
        double USD = PLN / EXCHANGE_RATE;
        return USD;
    }
}
