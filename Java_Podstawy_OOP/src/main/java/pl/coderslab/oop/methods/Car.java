package pl.coderslab.oop.methods;

public class Car {
    /**
     * ## Zadanie 5
     * Stwórz klasę `Car`, posiadającą następujące atrybuty:
     * - brand
     * - model
     * - price
     * Stwórz metody dostępowe do ww. atrybutów, tzw. gettery i settery.
     * Dopisz metodę `toString`, wyświetlającą markę oraz cenę w jednej linii.
     **/

    private String brand = "Kia";
    private String model = "Picanto";
    private int price = 62900;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return brand + " " + price;
    }
}
