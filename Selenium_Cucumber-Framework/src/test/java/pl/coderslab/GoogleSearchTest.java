package pl.coderslab;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//definiowanie klasy
@RunWith(Cucumber.class)
//definiowanie features oraz plugin "html:nazwa raportu"
@CucumberOptions(features = "src/Cucumber/Features/google-text-search.feature", plugin = {"pretty","html:GooogleTest.html"}, tags = "@google")
public class GoogleSearchTest {
    /** pakiet potrzebny do uruchomienia testów */
    //tu nie potrzebujemy pisać testów, cucumber poszuka sam
}
