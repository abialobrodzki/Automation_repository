package TaskCheckConfig.Konfiguracja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main02 {
    /**
     * # Nawigacja pomiędzy stronami
     * Przygotuj skrypt, który będzie przechodził pomiędzy kolejnymi stronami (nie klikamy żadnych elementów na tych stronach):
     * -  https://coderslab.pl/pl
     * -  https://mystore-testlab.coderslab.pl/index.php
     * -  https://hotel-testlab.coderslab.pl/en/
     **/

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //inicjalizacja

        //przechodzenie pomiędzy zakładkami - stronami
        driver.get("https://coderslab.pl/pl");
        Thread.sleep(2000); //wait na 2000ms dodany wyjątek "throws InterruptedException"
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        Thread.sleep(2000); //wait na 2000ms dodany wyjątek "throws InterruptedException"
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        Thread.sleep(2000); //wait na 2000ms dodany wyjątek "throws InterruptedException"
        driver.quit();
    }
}
