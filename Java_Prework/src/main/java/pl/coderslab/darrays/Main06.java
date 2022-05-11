package pl.coderslab.darrays;

public class Main06 {
/** ## Zadanie 6
 * W pliku `Main06.java`
 * 1. Stwórz tablicę z liczbami (4, 643, 112, 9999, -69), tablicę nazwij `numbers`.
 * 2. Wypisz elementy tablicy od końca, używając pętli ```for``` – każdy element w nowej linii.
 * Oczekiwany wynik:
 * 		-69
 * 		9999
 * 		112
 * 		643
 * 		4
 **/

	public static void main(String[] args) {
	int[] numbers = {4,643,112,9999,-69};
	for (int i=(numbers.length-1); i>=0; i--) {
		System.out.println(numbers[i]);
	}
	}

}
