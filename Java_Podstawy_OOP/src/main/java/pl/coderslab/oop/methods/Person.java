package pl.coderslab.oop.methods;

public class Person {
    /**
     * ## Zadanie 2
     * Utwórz klasę `Person`, dodaj w niej atrybuty:
     * - name,
     * - surname,
     * - age,
     * - gender.
     * Wszystkie atrybuty mają być prywatne i mają mieć ustawione wartości domyślne.
     * Dodaj metody:
     * - `setName`,
     * - `setSurname`,
     * - `setAge`,
     * - `setGender`,
     * które ustawią atrybuty klasy zgodnie z nazwą, na którą wskazują.
     * Np. `setName` – ustawia atrybut `name`.
     * W pliku `Main02.java` umieść w metodzie `main` kod, który utworzy obiekt klasy `Person` o nazwie `person`,
     * a następnie ustawi za pomocą wcześniej utworzonych metod wszystkie atrybuty klasy.
     **/
    //settery i gettery dobrze opisane :) https://www.w3schools.com/java/java_encapsulation.asp

    private String name = "Nikola";
    private String surname = "Tesla";
    private int age = 166;
    private char gender = 'M'; //'M'-male 'F'-female

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    /**
     * ## Zadanie 3
     * Do klasy `Person` dopisz metodę `getFullName`, która zwróci imię i nazwisko połączone znakiem spacji.
     **/

    public String getFullName() {
        return name + " " + surname;
    }

    /**
     * ## Zadanie 4
     * W klasie `Person` napisz metodę `increaseAge`, która inkrementuje zmienną `age` o 1.
     **/

    public int increaseAge() {
        return age += 1;
    }
}
