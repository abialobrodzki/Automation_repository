package pl.coderslab.homeworks.oop.second;

public class SoundBook extends Book {
    /**
     * ## Zadanie 2
     * Stwórz klasę `SoundBook`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * `duration` - atrybut ten powinien przechowywać długość nagrań,
     * `numberOfCarriers` - atrybut określający liczbę nośników (płyt CD, kaset),
     * które są zawarte w ramach jednej książki.
     * 2. Zdefiniuj odpowiednie dziedziczenie między klasą `SoundBook` a klasą `Book`.
     **/
    private double duration;
    private int numberOfCarriers;

    public SoundBook(int id, String title, boolean available, double duration, int numberOfCarriers) {
        super(id, title, available);
        this.duration = duration;
        this.numberOfCarriers = numberOfCarriers;
    }

    public String getSoundBook() {
        return super.getBook() + " |duration(min): " + duration + " |number of carriers: " + numberOfCarriers;
    } ////zwraca informacje o soundbooku
}
