package pl.coderslab.oop.constructor;

public class Burger {
    /**
     * ## Zadanie 1 - rozwiązywane z wykładowcą
     * Utwórz klasę `Burger`, dodaj w niej atrybuty:
     * - size,
     * - price.
     * 1. Utwórz konstruktor, który przyjmie i ustawi parametry `size` i `price`.
     * 2. Utwórz konstruktor bezargumentowy.
     **/

    private String size; //klasa hamburgera
    private double price;

    //pierwszy konstruktor o dwóch parametrach
    public Burger(String size, double price) {
        this.size = size; //this. bo wartość ustawiana w polu
        this.price = price;
    }

    //drugi konstruktor ustawiający wartości domyślne
    public Burger() {
        size = "L";
        price = 30;
    }

    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
