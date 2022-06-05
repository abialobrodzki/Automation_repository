package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainById {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        //driver.findElement(By.id("hotel_location"));
        //zlokalizowanie i wpisanie
        WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
        hotelLocation.sendKeys("Warsaw");

        driver.findElement(By.id("search_room_submit"));

        // skrócona wersja lokalizowania i wpisywania
        driver.findElement(By.id("newsletter-input")).sendKeys("test@test.com");

        driver.quit();
    }
}
