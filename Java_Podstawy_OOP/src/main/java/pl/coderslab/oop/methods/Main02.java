package pl.coderslab.oop.methods;

public class Main02 {
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

    /**
     * ## Zadanie 3
     * Do klasy `Person` dopisz metodę `getFullName`, która zwróci imię i nazwisko połączone znakiem spacji.
     **/

    /**
     * ## Zadanie 4
     * W klasie `Person` napisz metodę `increaseAge`, która inkrementuje zmienną `age` o 1.
     **/

    /**
     * ## Zadanie 5
     * Stwórz klasę `Car`, posiadającą następujące atrybuty:
     * - brand
     * - model
     * - price
     * Stwórz metody dostępowe do ww. atrybutów, tzw. gettery i settery.
     * Dopisz metodę `toString`, wyświetlającą markę oraz cenę w jednej linii.
     **/

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Werner");
        System.out.println(person.getName());
        person.setSurname("Heisenberg");
        System.out.println(person.getSurname());
        person.setAge(121);
        System.out.println(person.getAge());
        person.setGender('M');
        System.out.println(person.getGender());

        System.out.println(person.getFullName()); //zadanie 3. metoda zwracają imię i nazwisko

        System.out.println(person.increaseAge()); //zadanie 4. metoda zwiększająca age o 1

        Car car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car); //zadanie 5. metoda toString marka i cena w jednej linii
    }
}
