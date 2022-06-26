package pl.coderslab.hotel;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * # Cucumber - Zadanie 4
 * Stwórz dodatkowe testy dla portalu https://hotel-testlab.coderslab.pl/en/,
 * które umożliwi sprawdzanie funkcjonalności dodania pierwszego adresu do utworzonego już konta użytkownika.
 * Sekwencja kroków:
 * - logowanie do systemu
 * - zakładka **Accounts** (rozwiń nazwę użytkownika)
 * - przycisk **My addresses**
 * - przycisk **Add new address**
 * - wypełnienie i zapisanie formularza.
 */

// zastosowanie Page Object Pattern

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/hotel-account-edit.feature", plugin = {"pretty", "html:HotelUserEditTest.html"}, tags = "not @create")
public class HotelPageObjectTest {
    /**
     * pakiet potrzebny do uruchomienia testów - klasa HotelPageObjectSteps.java && cucumber: hotel-account-edit.feature
     */
    //tu nie potrzebujemy pisać testów, cucumber poszuka sam
}
