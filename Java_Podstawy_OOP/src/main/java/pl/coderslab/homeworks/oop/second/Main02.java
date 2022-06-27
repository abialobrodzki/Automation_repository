package pl.coderslab.homeworks.oop.second;

public class Main02 {
    /**
     * ## Zadanie 2
     * Stwórz klasę `SoundBook`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * `duration` - atrybut ten powinien przechowywać długość nagrań,
     * `numberOfCarriers` - atrybut określający liczbę nośników (płyt CD, kaset),
     * które są zawarte w ramach jednej książki.
     * 2. Zdefiniuj odpowiednie dziedziczenie między klasą `SoundBook` a klasą `Book`.
     **/
    public static void main(String[] arg) {
        Book b1 = new Book(69, "Java trudna", true);
        System.out.println(b1.getBook());
        System.out.println("------------------------");

        SoundBook s1 = new SoundBook(69, "Java w podróży", true, 120.5, 2);
        System.out.println(s1.getSoundBook());
        System.out.println("------------------------");
    }
}
