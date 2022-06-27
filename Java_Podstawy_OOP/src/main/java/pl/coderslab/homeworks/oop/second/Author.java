package pl.coderslab.homeworks.oop.second;

public class Author extends Person {
    /**
     * ## Zadanie 1 - wcześniejsze, praca domowa dzień 1 & 2
     * Stwórz klasę `Author`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
     * * `firstName` - atrybut określający imię autora,
     * * `lastName` - atrybut określający nazwisko autora,
     * * `pseudonim` - atrybut określający pseudonim autora,
     **/
    private String pseudonim; //pseudonim autora

    public Author(int id, String firstName, String lastName, String pseudonim) {
        super(id, firstName, lastName);
        this.pseudonim = pseudonim;
    }

    public String getAuthor() {
        return super.getPerson() + " " + pseudonim;
    } //zwraca informacje o autorze
}
