package pl.coderslab.homeworks.oop.second;

public class Main03 {
    /**
     * ## Zadanie 3
     * Zmodyfikuj klasę `Book`:
     * 1. Dodaj prywatny atrybut `popularity` który będzie przechowywał ilość wypożyczeń,
     * ilość ta powinna się zwiększać o 1 z każdym wypożyczeniem.
     * 2. Zdefiniuj metodę `equals(Book book)`, która na podstawie atrybutu `id` zwróci informacje
     * czy obiekty są równe.
     **/

    public static void main(String[] arg) {
        SoundBook s1 = new SoundBook(69, "Java w podróży", false, 120.5, 2);
        System.out.println(s1.getSoundBook());
        System.out.println(s1.getPopularity());
        SoundBook s2 = new SoundBook(13, "Władca pierścieni", true, 320, 6);
        System.out.println(s2.getSoundBook());
        System.out.println(s2.getPopularity());
        SoundBook s3 = new SoundBook(13, "Władca pierścieni", true, 320, 6);
        SoundBook s4 = new SoundBook(10, "Władca pierścieni", true, 320, 6);
        System.out.println("------------------------");

        System.out.println("Czy s1 równe s2? " + s1.equals(s2));
        System.out.println("Czy s2 równe s1? " + s2.equals(s1));
        System.out.println("Czy s2 równe s3? " + s2.equals(s3)); // powinno być równe (porównanie po id)
        System.out.println("Czy s3 równe s4? " + s3.equals(s4));
    }
}
