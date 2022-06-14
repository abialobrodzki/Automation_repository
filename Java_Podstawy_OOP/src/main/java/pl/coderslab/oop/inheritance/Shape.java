package pl.coderslab.oop.inheritance;

public class Shape {
    /**
     * ## Zadanie 2
     * Stwórz klasę `Shape`, która będzie posiadała:
     * 1. prywatne atrybuty `x` i `y` (określające środek tego kształtu) oraz `color`,
     * 2. konstruktor, przyjmujący zmienne określające wartości `x`, `y` i `color`,
     * 3. metodę o nazwie `getDescription()`, wypisującą informacje o tym kształcie, zwracającą wartość typu `String`,
     * 4. metodę o nazwie `getDistance(Shape shape)`, zwracającą odległość od środka innego kształtu, wynik ma być typu `double`.
     * Sprawdź, co się dzieje, kiedy zmieniasz dostęp do poszczególnych funkcji z publicznego na prywatny.*
     */

    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return "x=" + x + ", y=" + y + ", color=" + color;
    }

    public double getDistance(Shape shape) {
        return Math.sqrt(Math.pow(shape.x - x, 2) + Math.pow(shape.y - y, 2));
    }

}
