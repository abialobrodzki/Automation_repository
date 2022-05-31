package pl.coderslab.oop.attributes;

public class Main03 {
    /**
     * ## Zadanie 3
     * Utwórz klasę `Person`, dodaj w niej atrybuty:
     * - name,
     * - surname,
     * - age,
     * - gender (typu `char`).
     * Wszystkie atrybuty mają być publiczne i mają mieć ustawione wartości domyślne.
     * W pliku `Main03.java`, w metodzie `main`, utwórz obiekt klasy `Person` o nazwie `person`,
     * a następnie wyświetl kolejno atrybuty klasy (name, surname, age, gender).
     */


    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("name: " + person.name);
        System.out.println("surname: " + person.surname);
        System.out.println("age: " + person.age);
        System.out.println("gender: " + person.gender);
    }
}
