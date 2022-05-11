package pl.coderslab.darrays;

public class Main05 {
/** ## Zadanie 5
 * W pliku `Main05.java`:
 * 1. Stwórz tablicę z liczbami (4, 643, 112, 9999, -69), tablicę nazwij `numbers`.
 * 2. Stwórz zmienną  ```min``` i przypisz do niej `0`.
 * 3. Za pomocą pętli ```for``` znajdź liczbę, która jest najmniejsza, przypisz ją do zmiennej ```min``` i wypisz na konsoli.
 * 4. Aby to zrobić przeiteruj tablicę i sprawdź, czy dany element jest mniejszy od aktualnej wartości `min` – jeśli tak, zaktualizuj zmienną `min`.
 * Oczekiwany wynik:
 * MIN: -69
 **/

	public static void main(String[] args) {
	int[] numbers = {4,643,112,9999,-69};
	int min = 0;
	for (int i=0; i<numbers.length; i++) {
		if (min>numbers[i]) {
			min = numbers[i];
		}
		}
	System.out.println("MIN: " + min);
	}

}
