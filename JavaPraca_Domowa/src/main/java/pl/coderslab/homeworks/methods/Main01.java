package pl.coderslab.homeworks.methods;


public class Main01 {
    /**
     * ## Zadanie 1
     * W pakiecie `pl.coderslab.homeworks.methods`,
     * w pliku `Main01.java` umieść metodę o sygnaturze `public static double dogAge(double dogAge)`,
     * która przeliczy wiek psa w psich latach.
     * funkcja powinna przyjmować wiek psa jako parametr,
     * dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
     * powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
     * funkcja powinna zwrócić wiek psa.
     * Przykład:
     * dogAge(1.5)  # spodziewany wynik: 1.5 * 10.5 = 15.75
     * dogAge(5)  # spodziewany wynik: 2 * 10.5 + 3 * 4 = 33
     **/
    // pomoc metody https://www.w3schools.com/java/java_methods.asp

    public static double dogAge(double dogAge) {
        if (dogAge <= 2) {
            dogAge = dogAge * 10.5;
            System.out.println(dogAge);
        } else {
            dogAge = (2 * 10.5) + ((dogAge - 2) * 4);
            System.out.println(dogAge);
        }
        return dogAge; //zwracamy wiek psa w ludzkich latach
    }

    public static void main(String[] args) {
        dogAge(1.5); // tu podać wiek psa
        dogAge(2.0);
        dogAge(2.5); //poowyżej 2 lat 0,5roku-psa to 2lata-człowieka
        dogAge(5);
    }
}
