package pl.coderslab.darrays;

public class Main07 {
/** ## Zadanie 7
 * W pliku `Main07.java` znajduje się tablica z temperaturami.
 * 1. Temperatura w tablicy zapisana jest w stopniach Celsjusza, zamień ją na stopnie Fahrenheita.
 * Przelicznik jest następujący: `tempCelc * 1,8 + 32`.
 * 2. Aby to zrobić przeiteruj tablicę i nadpisz daną temperaturę nową, obliczoną wartością.
 * 3. Oblicz średnią temperaturę z nowo wyliczonych wartości i przypisz do zmiennej `avg`.
 * 4. Wypisz ją w konsoli wg wzoru: `ŚREDNIA: 3,95` – zaokrąglij liczbę do dwóch miejsc po przecinku.
 * Możesz użyć metody:
 * String.format( "%.2f", variableToFormat );
 **/

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		float avg = 0;
		for (int i=0; i<temps.length; i++) {
			temps[i] = temps[i]*1.8+32;
			avg += temps[i];
		}
		avg = avg/temps.length;
		System.out.println("ŚREDNIA: " + String.format("%.2f",avg));
	}

}
