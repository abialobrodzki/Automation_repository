package pl.coderslab.homeworks.oop.first;

import java.util.Arrays;

public class User {
    /**
     * ## Zadanie 3
     * Stwórz klasę `User`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
     * * `firstName` - atrybut określający imię użytkownika,
     * * `lastName` - atrybut określający nazwisko użytkownika,
     * * `books` - tablica obiektów klasy `Book`.
     * 2. Dodaj metodę `addBook(Book book)`, która doda nową książkę do tablicy książek danego użytkownika.
     * 3. Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy.
     **/
    private int id; //numer identyfikacyjny użytkownika
    private String firstName; //imię użytkownika
    private String lastName; // nazwisko użytkownika
    private Book[] books; //tablica obiektów klasy Book

    public User(int liczbaKsiazek) {
        super();
        books = new Book[liczbaKsiazek];
    }

    public void setId() {
        this.id = id;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public void setBook(Book[] books) {
        this.books = books;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Book[] getBook() {
        return books;
    }

    public String getFullUser() {
        return getId() + " " + getFirstname() + " " + getLastName();
    }

    public void addBook(Book book) {
        books = Arrays.copyOf(books, books.length + 1);
        books[books.length - 1] = book;
        int rozmiar = 2;
        User[] user = new User[rozmiar];
        user[0] = new User(2);
        user[1] = new User(1);
        // nie mam zielonego pojęcia jak dodać książki do tablicy danego Usera - do przemyślenia
        // https://www.elektroda.pl/rtvforum/topic1475974.html
        // https://developeronthego.pl/java-lista-tablica-dynamiczna/
    }

    public static void main(String[] args) {
        Book[] books = new Book[2];
        Arrays.fill(books, null);
        books[0].setId(1001);
        books[0].setTitle("Historia Polski");
        books[0].setAvailable(true);
        System.out.println(books[0].getFullBook());
        books[0].setId(1002);
        books[0].setTitle("Java trudna język");
        books[0].setAvailable(true);
        System.out.println(books[1].getFullBook());
    }
}
