package pl.coderslab.cflowcontrol;

public class Main03 {
/** ## Zadanie 3
 * 1. W pliku `Main03.java` stwórz pętlę, która 3 razy wypisze w konsoli tekst **Java**.
 * 2. Napisz zarówno pętlę `for` jak i `while`.
 * 3. W sumie napis będzie widoczny 6 razy.
 * Oczekiwany wynik:
 * Java
 * Java
 * Java
 * Java
 * Java
 * Java
 **/

	public static void main(String[] args) {
	int j = 1;
	for (int i=1; i<=3; i++) {
		System.out.println("Java");
	}
	while (j<=3) {
		System.out.println("Java");
		j++;
	}
	}

}
