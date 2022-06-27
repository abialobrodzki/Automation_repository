package pl.coderslab.homeworks.oop.second;

public class User extends Person {
    /**
     * ## Zadanie 3 - wcześniejsze, praca domowa dzień 1 & 2
     * Stwórz klasę `User`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
     * * `firstName` - atrybut określający imię użytkownika,
     * * `lastName` - atrybut określający nazwisko użytkownika,
     * * `books` - tablica obiektów klasy `Book`.
     * 2. Dodaj metodę `addBook(Book book)`, która doda nową książkę do tablicy książek danego użytkownika.
     * 3. Zaimplementuj możliwość dynamicznej zmiany rozmiaru tablicy.
     **/
    // nie mam zielonego pojęcia jak dodać książki do tablicy danego Usera - do przemyślenia
    // https://www.elektroda.pl/rtvforum/topic1475974.html
    // https://developeronthego.pl/java-lista-tablica-dynamiczna/
    // https://kursjava.com/odpowiedzi-na-pytania-i-zadania-rozdzialy-7-9/#rozdzial9ZadaniaDoReferencjiDoObiektow

    /**
     * ## Zadanie 4
     * Zmodyfikuj klasę `User`:
     * 1. Dodaj metodę `returnBook(Book book)` przyjmującą obiekt klasy `Book`,
     * która oznaczy książką jako dostępną do wypożyczenia,
     * przez zmianę atrybutu `available` na wartość `true`, usunie z tablicy `books` obiektu `User` obiekt `Book`.
     * 2. Dodaj metodę `returnAllBooks()`, która dokona zwrotu wszystkich posiadanych książek.
     **/

    public User(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public String getUser() {
        return super.getPerson();
    } //zwraca informacje o userze

    /**
     * jak dodać tablicę obiektów klasy Book ?
     */
    private Book[] books; //tablica obiektów klasy Book

    /**
     * jak dodać metodę addBook ?
     */
    public void addBook(Book book) {
        this.books = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            this.books[i] = books[i];
        }
    } //dodanie książki

    public Book[] getBook() {
        Book[] book = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            book[i] = books[i];
        }
        return book;
    } //getter książki

    public void returnBook(Book book) {

    }

    public void returnAllBooks() {
    }
}

//    public static void main(String[] arg) {
//        Book b1 = new Book(1, "Władca czasu", true);
//        Book b2 = new Book(101, "Division 101", true);
//        Book b3 = new Book(666, "Albert Einstein - history", true);
//        System.out.println(b1.getBook());
//        System.out.println(b1.getPopularity());
//        System.out.println("------------------------");
//
//        Book[] book = {
//                new Book(1, "Władca czasu", true),
//                new Book(101, "Division 101", true),
//                new Book(666, "Albert Einstein - history", true),
//        };
//        User user1 = new User(book);
//        for (Book books : user1.addBook()) {
//            System.out.println(books);
//        }
//    }
//}
