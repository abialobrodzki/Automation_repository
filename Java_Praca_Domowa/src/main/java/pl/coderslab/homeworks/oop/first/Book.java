package pl.coderslab.homeworks.oop.first;

import java.util.Arrays;

public class Book {
    /**
     * ## Zadanie 2
     * Stwórz klasę `Book`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut typu `int` ten powinien trzymać numer identyfikacyjny książki,
     * * `title` - atrybut typu `String` określający tytuł książki,
     * * `available` - atrybut typu `boolean` określający czy książka jest możliwa do wypożyczenia,
     * z domyślną wartością ustawioną na `true`, książka może być wypożyczona,
     * lub np. w renowacji - ma wtedy atrybut określony na **false**.
     * * `author` - atrybut typu `Author`,
     * * `additionalAuthors`  - tablica obiektów klasy `Author`.
     * 2. Posiadać gettery do wszystkich pól.
     * 3. Posiadać settery do wszystkich pól.
     **/
    private int id; //numer identyfikacyjny książki
    private String title; //tytuł książki
    private boolean available = true; //dostępność książki: true-dostępną, false-niedostępna
    private Author author = new Author(); //atrybut typu Author
    private Author[] additionalAuthors; //tablica obiektów klasy Author
    //help: https://www.javatpoint.com/how-to-create-array-of-objects-in-java

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean getAvailable() {
        return available;
    }

    public String getFullBook() {
        return getId() + " " + getTitle() + " " + getAvailable();
    } //zwraca informacje o książce

    public static void main(String[] args) {
        Author author = new Author();
        author.setId(1);
        author.setFirstName("Adam");
        author.setLastName("Mickiewicz");
        author.setPseudonim("Wieszcz");
        System.out.println(author.getFullAuthor());
        System.out.println("-------------");

        Author[] additionalAuthors = new Author[2];
        Arrays.fill(additionalAuthors, new Author());
        additionalAuthors[0].setId(1);
        additionalAuthors[0].setFirstName("Adam");
        additionalAuthors[0].setLastName("Mickiewicz");
        additionalAuthors[0].setPseudonim("Wieszcz");
        System.out.println(additionalAuthors[0].getFullAuthor());
        additionalAuthors[1].setId(2);
        additionalAuthors[1].setFirstName("Henryk");
        additionalAuthors[1].setLastName("Sienkiewicz");
        additionalAuthors[1].setPseudonim("Pokrzepiacz");
        System.out.println(additionalAuthors[1].getFullAuthor());
    }
}
