package TaskCheckConfig.Funkcje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainGetTagName {
    // Funkcja getTagName() zwraca nazwę znacznika podanego elementu.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pl.wikipedia.org/");
        String tag = driver.findElement(By.id("main-page-content")).getTagName();
        System.out.println(tag);
        driver.quit();
    }
}
