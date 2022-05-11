package pl.coderslab.bvariablesandoperators;

public class Main04 {
/** ## Zadanie 4
 * W pliku `Main04.java` w metodzie `main` stwórz trzy zmienne:
 * - `str2`, typu `String` o wartości `Course`,
 * - `str1`, typu `String` o wartości `Java`,
 * - `joinedStrings`, typu `String`, przechowującą połączone napisy, rozdzielone spacją.
 * 1. Wartości mają być nadawane w jednej linii, razem z deklaracją, czyli:
 * type variableName = variableValue;
 * 2. Do połączenia napisów użyj znaku konkatenacji (`+`) oraz dodatkowej spacji w postaci:
 * " "
 * 3. Wypisz wartość zmiennej `joinedStrings` na konsoli.
 * Oczekiwany wynik: Java Course
 **/

	public static void main(String[] args) {
	String str1 = "Java";
	String str2 = "Course";
	String joinedStrings = str1 + " " + str2;
	System.out.println(joinedStrings);

	}

}
