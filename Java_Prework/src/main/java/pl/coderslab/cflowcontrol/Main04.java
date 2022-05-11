package pl.coderslab.cflowcontrol;

public class Main04 {
/** ## Zadanie 4
 * 1. W pliku `Main04.java` stwórz pętlę, która wypisze w konsoli, w jednej linii, liczby od 1 do 10.
 * 2. Napisz zarówno pętlę `for` jak i `while`.
 * 3. W sumie zostanie wypisanych 20 liczb.
 * Oczekiwany wynik:
 * 1 2 3 4 5 6 7 8 9 10
 * 1 2 3 4 5 6 7 8 9 10
 **/

	public static void main(String[] args) {
	int j = 1;
	for (int i=1; i<=10; i++) {
		System.out.print(i + " ");
	}
		System.out.println("");
	while (j<=10) {
		System.out.print(j + " ");
		j++;
	}
	}

}
