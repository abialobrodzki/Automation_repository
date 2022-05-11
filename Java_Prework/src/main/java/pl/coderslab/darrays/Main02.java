package pl.coderslab.darrays;

public class Main02 {
/** ## Zadanie 2
 * W pliku `Main02.java` stwórz tablicę z listą owoców. Tablicę nazwij `fruits`.
 * Następnie:
 * 1. Umieść w niej trzy wartości: "apple", "banana", "berry".
 * 2. wypisz w konsoli **pierwszy** owoc.
 * 3. wypisz w kolejnej lini w konsoli **ostatni** (skorzystaj z `length`).
 * 4. w pętli wypisz wszystkie owoce – **każdy w nowej linii** (skorzystaj z `length`).
 * Oczekiwany wynik:
 * apple
 * berry
 * apple
 * banana
 * berry
 **/

	public static void main(String[] args) {
	String[] fruits = {"apple", "banana", "berry"};
	System.out.println(fruits[0]);
	System.out.println(fruits[(fruits.length)-1]);
	for (int i=0; i<fruits.length; i++) {
		System.out.println(fruits[i]);
		}
	}

}
