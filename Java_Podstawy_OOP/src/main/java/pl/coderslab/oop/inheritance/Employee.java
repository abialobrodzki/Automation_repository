package pl.coderslab.oop.inheritance;

public class Employee {
    /**
     * ## Zadanie 4
     * Stwórz klasę `Employee`, która posiada:
     * 1. publiczne atrybuty:
     * * `id` – atrybut zawierający informację o numerze identyfikacyjnym pracownika,
     * * `firstName` – atrybut określający imię pracownika,
     * * `lastName` – atrybut określający nazwisko pracownika,
     * * `wage` – atrybut określający stawkę godzinową pracownika,
     * 2. konstruktor przyjmujący: id, imię, nazwisko i stawkę za godzinę,
     * 3. metodę `raiseWage(percent)`, której rolą będzie zwiększenie wartości atrybutu `wage` o podany procent.
     * Pamiętaj o sprawdzeniu czy podana wartość jest większa lub równa 0.
     **/

    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public double raiseWage(double percent) {
        if (percent <= 0) {
            throw new IllegalArgumentException("percent has to be greater or equal than zero");
        }
        wage *= 1 + percent / 100; //mnożenie przez 1 + wskaźnik procentowy
        return wage;
    }
}
