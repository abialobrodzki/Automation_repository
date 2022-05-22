package pl.coderslab.oop.attributes;

public class Main01 {
    /**
     * Zadanie 1 - rozwiązywane z wykładowcą
     * Utwórz klasę AccessModifier dodaj w niej atrybuty:
     * atrybut o nazwie publicAttribute z modyfikatorem public,
     * atrybut o nazwie privateAttribute z modyfikatorem private,
     * atrybut o nazwie protectedAttribute z modyfikatorem protected.
     * W pliku Main01.java umieść w metodzie main kod, który:
     * Utworzy obiekt klasy AccessModifier i przypisze go do zmiennej testAttribute.
     * Sprawdź które z atrybutów klasy AccessModifier są dostępne.
     **/

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
    System.out.println(testAttribute.publicAttribute);
//    System.out.println(testAttribute.privateAttribute);
    System.out.println(testAttribute.protectedAttribute);
    }
}
