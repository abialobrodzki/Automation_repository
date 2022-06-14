package pl.coderslab.oop.constructor;

public class Person {
    /**
     * ## Zadanie 3
     * Utwórz klasę `Person`, dodaj w niej atrybuty:
     * - name
     * - surname
     * - age
     * - gender
     * Wszystkie atrybuty mają być prywatne.
     * 1. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`.
     * 2. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `age`.
     * 3. Utwórz konstruktor, który przyjmie i ustawi parametry `name`, `surname`, `age`, `gender`.
     **/

    private String name;
    private String surname;
    private int age;
    private char gender;

    //konstruktor poznaje metody po ilościach i typach parametrów
    public Person(String name, String surname) {
        this.name = name; // z przypisaniem wartości do pól
        this.surname = surname;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, int age, char gender) {
//        this.name = name;
//        this.surname = surname;
        this(name, surname); //wywołanie konstruktora
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
