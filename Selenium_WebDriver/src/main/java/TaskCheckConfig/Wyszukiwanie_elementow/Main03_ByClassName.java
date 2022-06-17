package TaskCheckConfig.Wyszukiwanie_elementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main03_ByClassName {
    /**
     * # Wyszukaj elementy przy pomocy lokalizatora By.className
     * Na stronie https://hotel-testlab.coderslab.pl//en/ zidentyfikuj
     * następująca pola/przyciski za pomocą lokalizatora ```By.className```:
     * - (przycisk) Sign In
     * - (pole tekstowe) Email address
     * Po zidentyfikowaniu elementów kliknij przycisk **Sign In**
     * i wpisz dowolny adres e-mail w pole **Email address**.
     * Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia
     * przycisku **Create an account** (nie musi być z wykorzystaniem lokalizatora ``By.className``)
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.className("user_login")).click();
        WebElement accountInput = driver.findElement(By.className("account_input"));
        accountInput.sendKeys(generateEmail()); //generowanie adresu
        driver.findElement(By.id("SubmitCreate")).click();
        driver.quit();
    }

    public static String generateEmail() {
        return "ab" + System.currentTimeMillis() + "@test.com"; //od daty powstania systemu Unix
    }
}
