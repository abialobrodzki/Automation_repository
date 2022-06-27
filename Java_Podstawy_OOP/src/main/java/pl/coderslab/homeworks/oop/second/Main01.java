package pl.coderslab.homeworks.oop.second;

public class Main01 {
    /**
     * ## Zadanie 1
     * Praca domowa opiera się na modyfikacji zadań z dnia poprzedniego,
     * poprzednie rozwiązania nie powinny być modyfikowane, zawartość klas możesz skopiować.
     * Stwórz klasę `Person`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `id` - atrybut ten powinien trzymać numer identyfikacyjny,
     * * `firstName` - atrybut określający imię autora,
     * * `lastName` - atrybut określający nazwisko autora,
     * 2. Zdefiniuj odpowiednie dziedziczenie między klasą `Author` a klasą `Person`.
     * 3. Zdefiniuj odpowiednie dziedziczenie między klasą `User` a klasą `Person`.
     * 4. Usuń nadmiarowe parametry oraz metody.
     **/
    public static void main(String[] arg) {
        Person p1 = new Person(1, "Jan", "Nowak");
        Person p2 = new Person(2, "Albert", "Einstein");
        System.out.println(p1.getPerson());
        System.out.println(p2.getPerson());
        System.out.println("------------------------");

        Author a1 = new Author(1, "Adam", "Mickiewicz", "Wieszcz");
        System.out.println(a1.getAuthor());
        System.out.println("------------------------");

        User u1 = new User(13, "Adrian", "X");
        System.out.println(u1.getUser());
        System.out.println("------------------------");
    }
}
