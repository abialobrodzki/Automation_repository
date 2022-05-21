package pl.coderslab.methods;

public class Main05 {
    /**
     * Zadanie 5
     * W pliku Main05.java napisz publiczną metodę calculateNetto, która przyjmie argumenty:
     * gross: kwotę brutto ceny zakupu,
     * vat: wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 – 1.
     * Metoda ma zwrócić wartość netto ceny. Napisz w komentarzu, jakie obliczenia musisz wykonać.
     **/

    public static void main(String[] args) {
        System.out.printf("%.2f \n", calculateNetto(999.99, 0.23));
    }

    public static double calculateNetto(double gross, double vat) {
        double netto = gross - (gross * vat); //odjęcie od ceny brutto podatku vat (iloczyn ceny brutto i stawki vat)
        return netto;
    }
}
