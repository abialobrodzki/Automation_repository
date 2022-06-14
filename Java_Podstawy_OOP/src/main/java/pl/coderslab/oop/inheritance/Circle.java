package pl.coderslab.oop.inheritance;

public class Circle extends Shape {
    /**
     * ## Zadanie 3
     * Stwórz klasę `Circle`, która spełnia następujące wymogi:
     * 1. dziedziczy po klasie definiującej kształt (`Shape`),
     * 2. ma dodatkowy atrybut `radius`,
     * 3. posiada konstruktor, przyjmujący zmienne określające wartości `x`, `y`, `color` i `radius`,
     * 4. nadpisuje metodę kształtu – `getDescription()`,
     * 5. ma metodę o nazwie `getArea()`, zwracającą pole powierzchni typu `double`,
     * 6. posiada metodę o nazwie `getCircuit()`, zwracającą obwód typu `double`.
     * Przetestuj metodę `getDistance(Shape shape)` na obiektach typu `Circle`.
     **/
    private double radius;

    public Circle(int x, int y, String color, double radius) {
        super(x, y, color); //odwoływanie się do konstruktora super
        this.radius = radius;
    }

    @Override //metoda getDescription() automatycznie jest przeciążana
    public String getDescription() {
        return super.getDescription() + ", radius=" + radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircuit() {
        return 2 * Math.PI * radius;
    }
}
