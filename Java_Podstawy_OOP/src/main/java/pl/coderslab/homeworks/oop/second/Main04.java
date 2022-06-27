package pl.coderslab.homeworks.oop.second;

public class Main04 {
    /**
     * ## Zadanie 4
     * Zmodyfikuj klasę `User`:
     * 1. Dodaj metodę `returnBook(Book book)` przyjmującą obiekt klasy `Book`,
     * która oznaczy książką jako dostępną do wypożyczenia,
     * przez zmianę atrybutu `available` na wartość `true`, usunie z tablicy `books` obiektu `User` obiekt `Book`.
     * 2. Dodaj metodę `returnAllBooks()`, która dokona zwrotu wszystkich posiadanych książek.
     **/

    public static void main(String[] arg) {
        Book b1 = new Book(1, "Władca czasu", true);
        Book b2 = new Book(101, "Division 101", true);
        Book b3 = new Book(666, "Albert Einstein - history", true);
        System.out.println(b1.getBook() + " |popularity: " + b1.getPopularity());
        System.out.println("------------------------");

        //koniecznie uzupełnienie metod
//        User.returnBook();
//        User.returnAllBooks();
    }
}
