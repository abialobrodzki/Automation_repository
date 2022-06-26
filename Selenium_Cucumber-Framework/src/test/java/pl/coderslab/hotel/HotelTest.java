package pl.coderslab.hotel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * # Cucumber - Zadanie 2
 * Z wykorzystaniem Cucumber przygotuj test, który będzie zakładał konto
 * na stronie https://hotel-testlab.coderslab.pl/.
 * Wykonana powinna być następująca sekwencja kroków:
 * - strona główna
 * - przycisk **'Sign in'**
 * - przycisk **Create an account**
 * - wypełnienie formularza
 * - przycisk **Register
 */

/**
 * # Cucumber - parametryzacja - Zadanie 3
 * Do zadania 2 należy dodać parametry w następujących polach w formularzu:
 * - first name
 * - last name
 * - email (pole e-mail wykorzystywane jest już na ekranie **'Sign in'**)
 * - password
 * Dodanie parametrów pozwoli tworzyć wielu użytkowników w ramach jednego skryptu testowego.
 */

// zastosowanie tagów - parametr 'not' pozwala ingorować testy o zadanym parametrze

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/hotel-account-creation.feature", plugin = {"pretty", "html:HotelTest.html"}, tags = "not @create")
public class HotelTest {
    /**
     * pakiet potrzebny do uruchomienia testów - klasa HotelSteps.java && cucumber: hotel-account-creation.feature
     */
    //tu nie potrzebujemy pisać testów, cucumber poszuka sam
}
