package pl.coderslab.oop.attributes;

import pl.coderslab.oop.methods.Car;
import pl.coderslab.oop.methods.Person;

public class Main02 {
    /**
     * Zadanie 2
     * W pliku Main02.java, w metodzie main, utwórz obiekt klasy AccessModifier o nazwie testAttribute,
     * a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia.
     **/

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.protectedAttribute = "xyz"; //string
        testAttribute.publicAttribute = 101; //int
        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);

        // dodanie zadania z methods: Main02, Main03, Main04, Main05
        pl.coderslab.oop.methods.Person person = new Person();
        person.setName("Werner");
        System.out.println(person.getName());
        person.setSurname("Heisenberg");
        System.out.println(person.getSurname());
        person.setAge(121);
        System.out.println(person.getAge());
        person.setGender('M');
        System.out.println(person.getGender());

        System.out.println(person.getFullName());

        System.out.println(person.increaseAge());

        Car car = new Car();
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car); //zadanie 5. metoda toString marka i cena w jednej linii
    }
}
