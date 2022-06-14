package pl.coderslab.oop.inheritance;

public class SalariedEmployee extends Employee {
    /**
     * ## Zadanie 6
     * Stwórz klasę `SalariedEmployee` reprezentującą pracownika, z którym pracodawca ma umowę miesięczną.
     * Klasa powinna:
     * 1. dziedziczyć po klasie `Employee`,
     * 2. mieć dodatkową metodę `calculatePayment()`,
     * która będzie zwracała kwotę do wypłacenia pracownikowi za miesiąc
     * (dla uproszczenia możemy założyć, że w każdym miesiącu jest 190 godzin pracujących – użyj `final static`).
     **/

    public static final double NO_OF_HOURS = 190; //godziny pracujące w miesiącu

    public SalariedEmployee(int id, String name, String surname, double wage) {
        super(id, name, surname, wage);
    }

    public double calculatePayment() { //mamy stałą liczbę godzin
        return wage * NO_OF_HOURS;
    }
}
