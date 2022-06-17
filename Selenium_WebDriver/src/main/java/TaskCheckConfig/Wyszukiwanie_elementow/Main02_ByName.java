package TaskCheckConfig.Wyszukiwanie_elementow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main02_ByName {
    /**
     * # Wyszukaj elementy przy pomocy lokalizatora By.name
     * Na stronie https://hotel-testlab.coderslab.pl/en/ zidentyfikuj
     * następująca pola/przyciski za pomocą lokalizatora ```By.name```:
     * - (pole tekstowe) Hotel Location
     * - (przycisk) Search Now
     * - (pole tekstowe) Enter your e-mail (pole na dole stron)
     * - (przycisk) Subscribe
     * Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
     * - Hotel Location - Warsaw
     * - Enter your e-mail - test@test.com
     * Dodatkowo kliknij przycisk Serach Now, używając metody `Submit` np.
     * findElement(By.name("q")).submit();
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.name("hotel_location")).sendKeys("Warsaw");
        WebElement searchNowBtn = driver.findElement(By.name("search_room_submit"));
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        WebElement subscribeBtn = driver.findElement(By.name("submitNewsletter"));

        searchNowBtn.submit();
//        searchNowBtn.click(); //różnica pomiędzy click (klik-użytkownik) a submit (wyślij na serwer)
        driver.quit();
    }
}
