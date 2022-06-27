package pl.coderslab.homeworks.oop.second;

import java.util.Arrays;

public class Book {
    /**
     * ## Zadanie 2 - wcześniejsze, praca domowa dzień 1 & 2
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
    //help: https://www.javatpoint.com/how-to-create-array-of-objects-in-java

    /**
     * ## Zadanie 3
     * Zmodyfikuj klasę `Book`:
     * 1. Dodaj prywatny atrybut `popularity` który będzie przechowywał ilość wypożyczeń,
     * ilość ta powinna się zwiększać o 1 z każdym wypożyczeniem.
     * 2. Zdefiniuj metodę `equals(Book book)`, która na podstawie atrybutu `id` zwróci informacje
     * czy obiekty są równe.
     **/
    // pomoc: https://www.samouczekprogramisty.pl/porownywanie-obiektow-metody-equals-i-hashcode-w-jezyku-java/
    //        https://kursjava.com/klasy/equals-i-porownywanie-obiektow/

    private int id; //numer identyfikacyjny książki
    private String title; //tytuł książki
    private boolean available = true; //dostępność książki: true-dostępną, false-niedostępna
    private int popularity = 0;
    /**
     * jak dodać tablicę obiektów klasy Author ?
     */
    private Author author; //atrybut typu `Author`
    private Author[] additionalAuthors; //tablica obiektów klasy Author

    public Book(int id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }

    public String getBook() {
        return " |id: " + id + " |title: " + title + " |available: " + available;
    } //zwraca informacje o książce

    public int getPopularity() {
        if (available == false) {
            popularity++;
        }
        return popularity;
    } //zwraca liczbę wypożyczeń

    public boolean equals(Book book) {
        if (this == book) {
            return true;
        }
        if (book == null || this.getClass() != book.getClass()) {
            return false;
        }
        Book otherBook = (Book) book;

        if ((this.title == null && otherBook.title != null) ||
                (this.title != null && !this.title.equals(otherBook.title))) {
            return false;
        }
        return this.id == otherBook.id;
    } // zwraca czy dane książki po id są takie same
}
