package pl.coderslab.cflowcontrol;

public class Main06 {
/** ## Zadanie 6
 * 1. W pliku `Main06.java` napisz kod, który na podstawie wartości zmiennej `n` ( `int n = 6;`), wypisuje wszystkie liczby od zera do **n**.
 * Przy każdej liczbie wypisz, czy jest parzysta, czy nie. Wzór:
 * 0 – parzysta
 * 1 – nieparzysta
 * 2 – parzysta
 * 3 – nieparzysta
 * Napisz zarówno pętlę `for` jak i pętlę `while`.
 * Podpowiedź: Jak sprawdzić, czy liczba jest parzysta lub nieparzysta?
 * Wystarczy obliczyć jej resztę z dzielenia przez `2`, jeżeli wynik to 0, wtedy liczba jest parzysta, w przeciwnym przypadku jest nieparzysta.
 * Oczekiwany wynik:
 * 0 - even
 * 1 - odd
 * 2 - even
 * 3 - odd
 * 4 - even
 * 5 - odd
 * 6 - even
 * 0 - even
 * 1 - odd
 * 2 - even
 * 3 - odd
 * 4 - even
 * 5 - odd
 * 6 - even
 **/

	public static void main(String[] args) {
		int n = 6;
		int j = 0;
		for (int i=0; i<=n; i++) {
			if (i%2 != 0) {
				System.out.println(i + " - odd");
			} else {
				System.out.println(i + " - even");
			}
		}
		while (j<=6) {
			if (j%2 != 0) {
				System.out.println(j + " - odd");
			} else {
				System.out.println(j + " - even");
			}
			j++;
		}
	}

}
