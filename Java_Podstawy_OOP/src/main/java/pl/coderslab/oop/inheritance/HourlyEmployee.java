package pl.coderslab.oop.inheritance;

public class HourlyEmployee extends Employee {
    /**
     * ## Zadanie 5
     * Stwórz klasę `HourlyEmployee`, reprezentującą pracownika, któremu pracodawca płaci za godziny.
     * Klasa ma spełniać następujące wymogi:
     * 1. ma dziedziczyć po klasie `Employee`,
     * 2. posiadać dodatkową metodę `calculatePayment(hours)`,
     * która będzie zwracała kwotę do wypłacenia pracownikowi za liczbę wypracowanych godzin.
     **/

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(double hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("hours have to be greater than 0");
        }
        return hours * wage;
    }
}
