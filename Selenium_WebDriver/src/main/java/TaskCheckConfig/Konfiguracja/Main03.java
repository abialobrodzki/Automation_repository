package TaskCheckConfig.Konfiguracja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main03 {
    /**
     * # Metody nawigacyjne
     * W tym zadaniu nauczymy się poruszać po stronach. Wykorzystamy do tego metody nawigacyjne:
     * ⬅️ ```navigate.back()```<br>
     * ➡️```navigate.forward()``` <br>
     * 🔄 ```navigate.refresh()```
     * https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/WebDriver.Navigation.html
     * Przykład kod do użycia w zadaniu:
     * driver.get("https://www.google.com");
     * driver.get("https://coderslab.pl/pl");
     * driver.navigate().back();
     * driver.navigate().forward();
     * Przygotuj następującą sekwencję poruszania się po stronach z wykorzystaniem powyższych metod:
     * 1. Wejdź na stronę: https://www.google.com
     * 2. Wejdź na stronę: https://coderslab.pl/pl
     * 3. Cofnij się do strony: https://www.google.com
     * 4. Wejdź na stronę: https://mystore-testlab.coderslab.pl/index.php
     * 5. Cofnij się do strony: https://www.google.com
     * 6. Powróć do strony: https://mystore-testlab.coderslab.pl/index.php
     * 7. Odśwież stronę: https://mystore-testlab.coderslab.pl/index.php
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        driver.get("https://coderslab.pl/pl");
        driver.navigate().back();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
    }
}
