package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

public class AdvancedCalculator extends Calculator {
    /**
     * ## Zadanie 1 - rozwiązywane z wykładowcą
     * Stwórz klasę ```AdvancedCalculator```, która dziedziczy po klasie ```Calculator```.
     * Klasa powinna implementować następujące metody:
     * 1. ```pow(num1, num2)``` &ndash; metoda ma zwracać ```num1``` do potęgi ```num2```.
     * Dodatkowo w tablicy operacji ma zapamiętać napis: "```num1```^```num2``` equals ```result```".
     * 2. ```root(num1, num2)``` &ndash; metoda ma wyliczyć pierwiastek ```num2``` stopnia z ```num1```.
     * Dodatkowo w tablicy operacji ma zapamiętać napis: "```num2``` root of ```num1``` equals ```result```".
     */

    //konstruktor nie musi być tworzony - jest w rodzicu
    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        // num1^num2 equals result
        addOperation(String.format("%.2f^%.2f equals %.2f", num1, num2, result));
        return result;
    }

    // CTRL + F12
    public double root(double num1, double num2) {
        double result = Math.pow(num1, 1 / num2);
        //num2 root of num1 equals result
        addOperation(String.format("%.2f root of %.2f equals %.2f", num1, num2, result));
        return result;
    }
}
