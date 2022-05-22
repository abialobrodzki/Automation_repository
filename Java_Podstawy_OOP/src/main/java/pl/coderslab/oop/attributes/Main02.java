package pl.coderslab.oop.attributes;

public class Main02 {
    /**
     * Zadanie 2
     * W pliku Main02.java, w metodzie main, utwórz obiekt klasy AccessModifier o nazwie testAttribute,
     * a następnie ustaw i wyświetl wszystkie wartości, które są możliwe do ustawienia.
     **/

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.protectedAttribute = "xyz";
        testAttribute.publicAttribute = "abc";
        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);

    }
}
