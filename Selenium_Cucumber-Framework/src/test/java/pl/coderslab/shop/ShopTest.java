package pl.coderslab.shop;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Zadanie Przykład...
 * zmiana danych użytkownika - wykorzystanie Page Object Pattern
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/shop-account-edit.feature", plugin = {"pretty", "html:ShopTest.html"}, tags = "@shop")
public class ShopTest {
    /** pakiet potrzebny do uruchomienia testów klasa: ChangeUserInfoSteps.java oraz cucumber: shop-account-edit.feature */
    //tu nie potrzebujemy pisać testów, cucumber poszuka sam
}
