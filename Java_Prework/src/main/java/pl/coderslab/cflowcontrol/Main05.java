package pl.coderslab.cflowcontrol;

public class Main05 {
/** ## Zadanie 5
 * 1. W pliku `Main05.java` stwórz zmienne `resultFor` oraz `resultWhile` i przypisz do nich liczbę `0`.
 * 2. Następnie stwórz pętlę, która doda do siebie liczby od 1 do 10 i zapisze do zmiennej `resultFor` lub `resultWhile`.
 * 3. Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej `resultFor` lub `resultWhile` kolejną liczbę z podanego zakresu.
 * 4. Napisz zarówno pętlę `for` jak i `while`.
 * 5. Wypisz w konsoli w oddzielnych liniach zmienne: `resultFor` i `resultWhile`.
 * Oczekiwany wynik:
 * 55
 * 55
 **/

	public static void main(String[] args) {
	int resultFor = 0;
	int resultWhile = 0;
	int j = 1;
	for (int i=1; i<=10; i++) {
		resultFor = resultFor + i;
	}
	while (j<=10) {
		resultWhile = resultWhile + j;
		j++;
	}
		System.out.println(resultFor);
		System.out.println(resultWhile);
	}

}
