package TaskCheckConfig.Funkcje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainGetAttribute {
    // Funkcja getAttribute() zwraca wartość podanego atrybutu elementu.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://pl.wikipedia.org/");
        String atrybut = driver.findElement(By.id("main-page-content")).getAttribute("class");
        System.out.println(atrybut);
        driver.quit();
    }
}
