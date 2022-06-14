package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;
//import pl.coderslab.oop.constructor.Person; // test

public class Main01 {
    public static void main(String[] arg) {
        AdvancedCalculator advCalc = new AdvancedCalculator();
        System.out.println(advCalc.getClass()); //pobieranie info o klasie
        System.out.println(advCalc instanceof Calculator);
        advCalc.root(3, 5);
        advCalc.pow(4, 6);
        advCalc.add(5, 6);
        advCalc.subtract(10, 9);
        advCalc.printOperations(); //CTRL + LPM - przeniesie do kodu metody; CTRL + B - podgląd metod

        //tworzenie referencji innego typu
        Calculator calc = advCalc; //kastrowanie kalkulatora do funkcji rodzica - rzutowanie w górę
        System.out.println(calc.getClass());
        System.out.println(calc instanceof AdvancedCalculator);

        //nie robić tak
//        System.out.println((Object) calc instanceof Person);
//        Person person = (Person) ((Object) calc);

        calc.multiply(4, 5);
        calc.printOperations();

//        AdvancedCalculator adv = calc; //rzutowanie w dół
        AdvancedCalculator adv = (AdvancedCalculator) calc;
    }
}
