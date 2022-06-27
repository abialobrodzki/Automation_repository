package pl.coderslab.homeworks.oop.second;

public class Person {
    /**
     * ## Zadanie 1
     * Praca domowa opiera się na modyfikacji zadań z dnia poprzedniego,
     * poprzednie rozwiązania nie powinny być modyfikowane, zawartość klas możesz skopiować.
     * Stwórz klasę `Person`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
     * * `firstName` - atrybut określający imię autora,
     * * `lastName` - atrybut określający nazwisko autora,
     * 2. Zdefiniuj odpowiednie dziedziczenie między klasą `Author` a klasą `Person`.
     * 3. Zdefiniuj odpowiednie dziedziczenie między klasą `User` a klasą `Person`.
     * 4. Usuń nadmiarowe parametry oraz metody.
     **/
    private int id; //numer identyfikacyjny autora
    private String firstName; //atrybut imię autora
    private String lastName; //atrybut nazwisko autora

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getPerson() {
        return id + " " + firstName + " " + lastName;
    } //zwraca informacje o osobie
}
