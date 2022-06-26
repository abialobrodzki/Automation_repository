package pl.coderslab;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    private WebDriver driver;

    /** dodanie definicji kroków Given, When, Then, And */
    @Given("an open browser with google.com") //przypadki testowe są oznaczane (CTRL + LPM)
    public void openGoogleSearch() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        // Uruchom nowy egzemplarz przeglądarki Chrome
        driver = new ChromeDriver();
        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("http://www.google.com");}

    //dodanie na początku ^ i na końcu $ powoduje oznaczenie parametru - wyrażenia regularne(regex)
    @When("^a keyword (.*) is entered in input field$") //metoda ma parametr String (.*) - wpisanie dowolnego słowa
    public void enterKeyword(String keyword) {
        //kliknięcie zgód RODO
        driver.findElement(By.id("L2AGLb")).click();
        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement element = driver.findElement(By.name("q"));
        // Wyczyść tekst zapisany w elemencie
        element.clear();
        // Wpisz informacje do wyszukania
        element.sendKeys(keyword);
        // Prześlij formularz
        element.submit();}

    @Then("^the first one should contain (.*)$") //wyświetli tekst na konsoli
    public void theFirstOneShouldContainKeyword(String expectedText) {
        System.out.println(expectedText);}

    @And("close browser") //zamknięcie przeglądarki
    public void closeBrowser(){
        driver.quit();
    }
}
