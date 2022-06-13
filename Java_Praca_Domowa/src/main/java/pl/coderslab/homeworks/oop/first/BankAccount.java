package pl.coderslab.homeworks.oop.first;

public class BankAccount {
    /**
     * ## Zadanie 4
     * Stwórz klasę `BankAccount`, która ma spełniać następujące wymogi:
     * 1. Mieć prywatne atrybuty:
     * * `number` - atrybut ten powinien trzymać numer identyfikacyjny konta
     * (dla uproszczenia możemy założyć, że numerem konta może być dowolna liczba całkowita)
     * * `cash` - atrybut określający ilość pieniędzy na koncie. Ma to być liczba zmiennoprzecinkowa.
     * Atrybut `cash` powinien być zawsze nastawiany na 0 dla nowo tworzonego konta.
     * 2. Posiadać gettery do atrybutów `number` i `cash`,
     * ale NIE posiadać do nich setterów
     * (nie chcemy, żeby raz stworzone konto mogło zmienić swój numer,
     * a do atrybutu `cash` dodamy specjalne funkcje modyfikujące jego wartość).
     * 3. Posiadać metodę `void depositCash(amount)`
     * której rolą będzie zwiększenie wartości atrybutu `cash` o podaną wartość.
     * Pamiętaj o sprawdzeniu, czy podana wartość jest:
     * * Większa od 0
     * 4. Posiadać metodę `double withdrawCash(amount)`
     * której rolą będzie zmniejszenie wartości atrybutu `cash` o podaną wartość.
     * Metoda ta powinna zwracać ilość wypłaconych pieniędzy.
     * Dla uproszczenia zakładamy, że ilość pieniędzy na koncie nie może zejść poniżej 0, np.
     * jeżeli z konta, na którym jest 300 zł, próbujemy wypłacić 500 zł, to metoda zwróci nam tylko 300 zł.
     * Pamiętaj o sprawdzeniu, czy podana wartość jest:
     * * Większa od 0
     * 5. Posiadać metodę `String toString()` nieprzyjmującą żadnych parametrów.
     * Metoda ta ma zwracać informację o numerze konta i jego stanie.
     **/

    private static final long number = 1000000000000000001L;
    private static double cash = 0.0;
    final static String waluta = " zł";

    public static long getNumber() {
        return number;
    }

    public static double getCash() {
        return cash;
    }

    public static void depositCash(double amount) {
        if (amount > 0) {
            cash = cash + amount;
        } else {
            System.out.print("Saldo można zwiększyć o kwotę ponad 0 zł -- \n");
        }
    }

    public static double withdrawCash(double amount) {
        if (amount > 0 && amount <= cash) {
            cash = cash - amount;
        } else if (amount > 0 && amount > cash) {
            cash = cash - cash;
        } else {
            System.out.print("Saldo można zmniejszyć o kwotę ponad 0 zł -- \n");
        }
        return cash;
    }

    @Override
    public String toString() {
        return "numer konta: " + number + " -- saldo: " + cash + " " + waluta;
    }

    public static void main(String[] args) {
        BankAccount operacja = new BankAccount();
        System.out.println(operacja);
//        System.out.println("saldo: " + cash + waluta);
        depositCash(1000);
//        System.out.println("saldo: " + cash + waluta);
        depositCash(0);
//        System.out.println("saldo: " + cash + waluta);
        withdrawCash(500);
//        System.out.println("saldo: " + cash + waluta);
        withdrawCash(0);
//        System.out.println("saldo: " + cash + waluta);
        withdrawCash(600);
        depositCash(69);
        System.out.println(operacja);
        // implementacja metody toString():
        // https://www.educative.io/edpresso/how-to-use-the-tostring-in-java
        // https://4programmers.net/Forum/Java/111482-Metoda_toString
    }
}
