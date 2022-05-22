package pl.coderslab.oop.methods;

public class Product {
    /**
     * Zadanie 1 - rozwiązywane z wykładowcą
     * Utwórz klasę Product, dodaj w niej atrybut name.
     * Dodaj metody setName (ustawiającą name) oraz getName (zwracającą name).
     **/

    private String name;

    public void setName(String name) { //setter
        this.name = name;
    }

    public String getName() { //getter
        return name;
    }
}
