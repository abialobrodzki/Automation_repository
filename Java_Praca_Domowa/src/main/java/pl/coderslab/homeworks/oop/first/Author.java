package pl.coderslab.homeworks.oop.first;

public class Author {
    /**
     * ## Zadanie 1
     * Stwórz klasę `Author`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
     * * `firstName` - atrybut określający imię autora,
     * * `lastName` - atrybut określający nazwisko autora,
     * * `pseudonim` - atrybut określający pseudonim autora,
     **/
    private int id; //numer identyfikacyjny autora
    private String firstName; //imię autora
    private String lastName; //nazwisko autora
    private String pseudonim; //pseudonim autora

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPseudonim() {
        return pseudonim;
    }

    public String getFullAuthor() {
        return getId() + " " + getFirstName() + " " + getLastName() + " " + getPseudonim();
    } //zwraca informacje o autorze
}
