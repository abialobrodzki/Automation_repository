package pl.coderslab.oop.constructor;

import java.util.Arrays;

public class Calculator {
    /**
     * ## Zadanie 2
     * Stwórz klasę ```Calculator```. Konstruktor ma nie przyjmować żadnych danych.
     * Każdy nowo stworzony obiekt powinien mieć tablicę String, w której będzie trzymać historię ostatnich operacji
     * (stwórz ją w konstruktorze – z początkowym rozmiarem 0).
     * Następnie dodaj do klasy następujące metody:
     * 1. ```add(num1, num2)``` – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "added ```num1``` to ```num2``` got ```result```".
     * 2. ```multiply(num1, num2)``` – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```".
     * 3. ```subtract(num1, num2)``` – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```".
     * 4. ```divide(num1, num2)``` – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można dzielić przez zero.
     * 5. ```printOperations()``` – metoda ma wypisać wszystkie zapamiętane operacje.
     * 6. ```clearOperations()``` – metoda ma wyczyścić wszystkie zapamiętane operacje.
     * Możesz dopisać metodę pomocniczą, która będzie dodawała wpis na liście operacji oraz zwiększała rozmiar tablicy przez kopiowanie.
     * Pamiętaj o używaniu ```this``` w odpowiednich miejscach.
     * Stwórz kilka kalkulatorów i przetestuj ich działanie.
     **/

    private String operations[]; //stworzenie tablicy operacji, na początku NULL

    public Calculator() { //konstruktor publiczny
        operations = new String[0]; // do tablicy operations dopisany rozmiar 0
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        // added num1 to num2 got result
        String operation = String.format("added %.2f to %.2f got %.2f", num1, num2, result);
//        String operation = "added " + num1 + "to " + num2 + "got " + result;
        addOperation(operation);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        // multiplied num1 with num2 got result
        addOperation(String.format("multiplied %.2f with %.2f got %.2f", num1,num2,result));
        return result;
    }

    public double subtract (double num1, double num2) {
        double result = num1 - num2;
        // subtracted num1 from num2 got result
        addOperation(String.format("subtracted %.2f from %.2f got %.2f",num1,num2,result));
        return result;
    }

    public double divide (double num1, double num2) {
     if (num2 == 0) {
         throw new ArithmeticException("division by 0");
     }
     double result = num1/num2;
     // divided num1 with num2 got result
     addOperation(String.format("divided %.2f with %.2f got %.2f",num1,num2,result));
     return result;
    }

    public void printOperations() {
        System.out.println("Operations: ");
        for (String oper : operations) { //pętla for each (typ zmiennej nazwa zmiennej:nazwa zmiennej)
            System.out.println(oper);
        }
        System.out.println("------------------");
    }

    public void clearOperations() {
        operations = new String[0];
        System.out.println("Operations cleared");
    }

    protected /*private*/ void addOperation(String operation) { //ograniczenie dostępu do metody addOperations
//        String[] newOperations = Arrays.copyOf(operations, operations.length + 1);
//        newOperations[operations.length] = operation;
//        operations = newOperations;

        operations = Arrays.copyOf(operations, operations.length + 1);
        operations[operations.length - 1] = operation;
    }
}
